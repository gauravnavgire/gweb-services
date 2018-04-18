package com.rubix.webservices.gadmin.master.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rubix.webservices.gadmin.master.boards.dto.in.BoardDTO;
import com.rubix.webservices.gadmin.master.boards.dto.out.BoardViewDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.AcademicYearDTO;
import com.rubix.webservices.gadmin.master.schoolgroups.dto.in.SchoolGroupDTO;
import com.rubix.webservices.gadmin.master.service.MasterService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

// TODO: Auto-generated Javadoc
/**
 * The Class MasterController.
 */
@RestController
@RequestMapping("/api/v1/masterconfig/{userId}")
@Api(value = "MasterConfigration APIs", tags = "MasterConfigs")
public class MasterController {

	/** The master service. */
	@Autowired
	private MasterService masterService;

	/**
	 * Save school group.
	 *
	 * @param userId
	 *            the user id
	 * @param dto
	 *            the dto
	 * @return the boolean
	 */
	@ApiOperation(nickname = "SchoolGroup", value = "Create School Group", notes = "Save School Group", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't create School Group") })
	@RequestMapping(value = "SchoolGroup", method = RequestMethod.POST, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public Boolean saveSchoolGroup(@PathVariable("userId") Long userId, @RequestBody SchoolGroupDTO dto) {

		dto.setCreatedBy(userId);
		dto.setUpdatedBy(userId);
		dto.setCreatedDate(new Date());
		dto.setUpdatedDate(new Date());
		return masterService.saveSchoolGroup(dto);
	}

	/**
	 * Save school group.
	 *
	 * @param userId
	 *            the user id
	 * @param schoolGroupId
	 *            the school group id
	 * @return the boolean
	 */
	@ApiOperation(nickname = "SchoolGroup", value = "Delete School Group", notes = "Save School Group", httpMethod = "DELETE")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't Delete School Group") })
	@RequestMapping(value = "SchoolGroup/{schoolGroupId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public Boolean saveSchoolGroup(@PathVariable("userId") Long userId,
			@PathVariable("schoolGroupId") Long schoolGroupId) {

		return masterService.deleteSchoolGroup(userId, schoolGroupId);
	}

	/**
	 * Gets the school group.
	 *
	 * @param userId
	 *            the user id
	 * @param schoolGroupId
	 *            the school group id
	 * @return the school group
	 */
	@ApiOperation(nickname = "SchoolGroup", value = "GET School Group", notes = "Get School Group", httpMethod = "GET")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't Get School Group") })
	@RequestMapping(value = "SchoolGroup/{schoolGroupId}", method = RequestMethod.GET, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public SchoolGroupDTO getSchoolGroup(@PathVariable("userId") Long userId,
			@PathVariable("schoolGroupId") Long schoolGroupId) {

		return masterService.getSchoolGroupById(userId, schoolGroupId);
	}

	/**
	 * Save board.
	 *
	 * @param userId
	 *            the user id
	 * @param dto
	 *            the dto
	 * @return the board view dto
	 */
	@ApiOperation(nickname = "Board", value = "Create Board", notes = "Save Board", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't create Board") })
	@RequestMapping(value = "Board", method = RequestMethod.POST, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public BoardViewDTO saveBoard(@PathVariable("userId") Long userId, @RequestBody BoardDTO dto) {

		dto.setCreatedBy(userId);
		dto.setUpdatedBy(userId);
		dto.setCreatedDate(new Date());
		dto.setUpdatedDate(new Date());
		return masterService.saveBoard(dto);
	}

	/**
	 * Gets the board.
	 *
	 * @param userId
	 *            the user id
	 * @param boardId
	 *            the board id
	 * @return the board
	 */
	@ApiOperation(nickname = "Board/{boardId}", value = "Get Board", notes = "Get Board", httpMethod = "GET")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't get Board") })
	@RequestMapping(value = "Board/{boardId}", method = RequestMethod.GET, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public BoardViewDTO getBoard(@PathVariable("userId") Long userId, @PathVariable("boardId") Long boardId) {

		return masterService.getBoardById(boardId);
	}

	/**
	 * Delete board.
	 *
	 * @param userId
	 *            the user id
	 * @param boardId
	 *            the board id
	 * @return the boolean
	 */
	@ApiOperation(nickname = "Board/{boardId}", value = "Delete Board", notes = "Save Board", httpMethod = "DELETE")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't Delete Board") })
	@RequestMapping(value = "Board/{boardId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public Boolean deleteBoard(@PathVariable("userId") Long userId, @PathVariable("boardId") Long boardId) {

		return masterService.deleteBoardById(boardId);
	}

	@ApiOperation(nickname = "AcademicYear", value = "Save Academic Year", notes = "Save Board", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't get Board") })
	@RequestMapping(value = "AcademicYear", method = RequestMethod.POST, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public AcademicYearDTO saveAcademicYear(@PathVariable("userId") Long userId, @RequestBody AcademicYearDTO dto) {
		dto.setCreatedBy(userId);
		return masterService.saveAcademicYear(dto);
	}

	@ApiOperation(nickname = "AcademicYear/{yearId}", value = "Save Academic Year", notes = "Save Board", httpMethod = "DELETE")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Couldn't delete Academic Board") })
	@RequestMapping(value = "AcademicYear/{yearId}", method = RequestMethod.POST, headers = "Accept=application/json")
	// @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_CUSTOMERSUPPORT',
	// 'ROLE_ANALYST') or (hasAnyRole('ROLE_ACCOUNTOWNER', 'ROLE_MANAGER') and
	// @security.isUserPartOfOrganization(#organizationId))")
	public Boolean deleteAcademicYear(@PathVariable("userId") Long userId, @PathVariable("yearId") Long yearId) {

		return masterService.deleteAcademicYear(yearId);
	}

}
