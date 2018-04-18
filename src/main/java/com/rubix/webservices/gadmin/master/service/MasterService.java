package com.rubix.webservices.gadmin.master.service;

import com.rubix.webservices.gadmin.master.boards.dto.in.BoardDTO;
import com.rubix.webservices.gadmin.master.boards.dto.out.BoardViewDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.AcademicYearDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.SchoolGroupDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface MasterService.
 */
public interface MasterService {

	/**
	 * Save school group.
	 *
	 * @param dto
	 *            the dto
	 * @return the boolean
	 */
	public Boolean saveSchoolGroup(SchoolGroupDTO dto);

	/**
	 * Delete school group.
	 *
	 * @param userId
	 *            the user id
	 * @param schoolGroupId
	 *            the school group id
	 * @return the boolean
	 */
	public Boolean deleteSchoolGroup(Long userId, Long schoolGroupId);

	/**
	 * Gets the school group by id.
	 *
	 * @param userId
	 *            the user id
	 * @param schoolGroupId
	 *            the school group id
	 * @return the school group by id
	 */
	public SchoolGroupDTO getSchoolGroupById(Long userId, Long schoolGroupId);

	/**
	 * Save board.
	 *
	 * @param dto
	 *            the dto
	 * @return the board view dto
	 */
	public BoardViewDTO saveBoard(BoardDTO dto);

	/**
	 * Gets the board by id.
	 *
	 * @param boardId
	 *            the board id
	 * @return the board by id
	 */
	public BoardViewDTO getBoardById(Long boardId);

	/**
	 * Delete board by id.
	 *
	 * @param boardId
	 *            the board id
	 * @return the boolean
	 */
	public Boolean deleteBoardById(Long boardId);

	public AcademicYearDTO saveAcademicYear(AcademicYearDTO dto);

	public Boolean deleteAcademicYear(Long yearId);

}
