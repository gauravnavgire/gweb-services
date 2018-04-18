package com.rubix.webservices.gadmin.master.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.webservices.gadmin.master.boards.dto.in.BoardDTO;
import com.rubix.webservices.gadmin.master.boards.dto.out.BoardViewDTO;
import com.rubix.webservices.gadmin.master.boards.model.Boards;
import com.rubix.webservices.gadmin.master.boards.repo.BoardRepository;
import com.rubix.webservices.gadmin.master.exception.SchoolGroupSaveException;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.AcademicYearDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.SchoolGroupDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.model.AcademicYear;
import com.rubix.webservices.gadmin.master.schoolgroups.model.SchoolGroup;
import com.rubix.webservices.gadmin.master.schoolgroups.repo.AcademicYearRepository;
import com.rubix.webservices.gadmin.master.schoolgroups.repo.SchoolGroupRepository;
import com.rubix.webservices.gadmin.master.service.MasterService;

// TODO: Auto-generated Javadoc
/**
 * The Class MasterServiceImpl.
 */
@Service
public class MasterServiceImpl implements MasterService {

	/** The school group repo. */
	@Autowired
	private SchoolGroupRepository schoolGroupRepo;

	/** The board repo. */
	@Autowired
	private BoardRepository boardRepo;

	/** The academic repo. */
	@Autowired
	private AcademicYearRepository academicRepo;

	/** The log. */
	private static Log log = LogFactory.getLog(MasterServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rubix.webservices.gadmin.master.service.MasterService#saveSchoolGroup
	 * (com.rubix.webservices.gadmin.master.schoolgroups.dto.in.SchoolGroupDTO)
	 */
	@Override
	public Boolean saveSchoolGroup(SchoolGroupDTO dto) {
		// TODO Auto-generated method stub
		try {
			SchoolGroup group = new SchoolGroup();
			BeanUtils.copyProperties(dto, group);
			schoolGroupRepo.save(group);
			return true;
		} catch (Exception e) {
			log.error(e);
			throw new SchoolGroupSaveException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rubix.webservices.gadmin.master.service.MasterService#
	 * deleteSchoolGroup(java.lang.Long, java.lang.Long)
	 */
	@Override
	public Boolean deleteSchoolGroup(Long userId, Long schoolGroupId) {

		try {
			schoolGroupRepo.delete(schoolGroupId);
			return true;
		} catch (Exception e) {
			log.error(e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rubix.webservices.gadmin.master.service.MasterService#
	 * getSchoolGroupById(java.lang.Long, java.lang.Long)
	 */
	@Override
	public SchoolGroupDTO getSchoolGroupById(Long userId, Long schoolGroupId) {
		// TODO Auto-generated method stub
		SchoolGroup group = schoolGroupRepo.findOne(schoolGroupId);
		SchoolGroupDTO dto = new SchoolGroupDTO();
		BeanUtils.copyProperties(group, dto);
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rubix.webservices.gadmin.master.service.MasterService#saveBoard(com.
	 * rubix.webservices.gadmin.master.boards.dto.in.BoardDTO)
	 */
	@Override
	public BoardViewDTO saveBoard(BoardDTO dto) {
		// TODO Auto-generated method stub
		SchoolGroup group = schoolGroupRepo.findOne(dto.getSchoolGroupId());
		Boards board = new Boards();
		BeanUtils.copyProperties(dto, board);
		board.setSchoolGroup(group);
		boardRepo.save(board);
		dto.setId(board.getId());
		BoardViewDTO viewDTO = new BoardViewDTO();
		BeanUtils.copyProperties(dto, viewDTO);
		return viewDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rubix.webservices.gadmin.master.service.MasterService#getBoardById(
	 * java.lang.Long)
	 */
	@Override
	public BoardViewDTO getBoardById(Long boardId) {
		// TODO Auto-generated method stub
		Boards board = boardRepo.getOne(boardId);
		BoardViewDTO dto = new BoardViewDTO();
		BeanUtils.copyProperties(board, dto);
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rubix.webservices.gadmin.master.service.MasterService#deleteBoardById
	 * (java.lang.Long)
	 */
	@Override
	public Boolean deleteBoardById(Long boardId) {
		// TODO Auto-generated method stub
		boardRepo.delete(boardId);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rubix.webservices.gadmin.master.service.MasterService#
	 * saveAcademicYear(com.rubix.webservices.gadmin.master.schoolgroups.dto.in.
	 * AcademicYearDTO)
	 */
	@Override
	public AcademicYearDTO saveAcademicYear(AcademicYearDTO dto) {
		// TODO Auto-generated method stub
		AcademicYear year = new AcademicYear();
		BeanUtils.copyProperties(dto, year);
		year.setUpdatedBy(dto.getCreatedBy());
		year.setCreatedDate(new Date());
		year.setUpdatedDate(new Date());
		SchoolGroup group = schoolGroupRepo.getOne(dto.getSchoolGroupId());
		year.setSchoolGroup(group);

		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		try {
			Date startDate = format.parse(dto.getStartDateStr());
			Date endDate = format.parse(dto.getEndDateStr());
			year.setStartDate(startDate);
			year.setEndDate(endDate);
		} catch (Exception e) {
			this.log.error("Invalid Start/End Date", e);
		}

		academicRepo.save(year);
		dto.setId(year.getId());
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rubix.webservices.gadmin.master.service.MasterService#
	 * deleteAcademicYear(java.lang.Long)
	 */
	@Override
	public Boolean deleteAcademicYear(Long yearId) {
		// TODO Auto-generated method stub
		academicRepo.delete(yearId);
		return true;
	}

}
