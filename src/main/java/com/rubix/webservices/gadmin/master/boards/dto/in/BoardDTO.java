package com.rubix.webservices.gadmin.master.boards.dto.in;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardDTO.
 */
public class BoardDTO {

	/** The id. */
	private Long id;

	/** The board name. */
	private String boardName;

	/** The school group id. */
	private Long schoolGroupId;

	/** The board description. */
	private String boardDescription;

	/** The status. */
	private String status;

	/** The created by. */
	private Long createdBy;

	/** The created date. */
	private Date createdDate;

	/** The updated by. */
	private Long updatedBy;

	/** The updated date. */
	private Date updatedDate;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the board name.
	 *
	 * @return the boardName
	 */
	public String getBoardName() {
		return boardName;
	}

	/**
	 * Sets the board name.
	 *
	 * @param boardName
	 *            the boardName to set
	 */
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	/**
	 * Gets the school group id.
	 *
	 * @return the schoolGroupId
	 */
	public Long getSchoolGroupId() {
		return schoolGroupId;
	}

	/**
	 * Sets the school group id.
	 *
	 * @param schoolGroupId
	 *            the schoolGroupId to set
	 */
	public void setSchoolGroupId(Long schoolGroupId) {
		this.schoolGroupId = schoolGroupId;
	}

	/**
	 * Gets the board description.
	 *
	 * @return the boardDescription
	 */
	public String getBoardDescription() {
		return boardDescription;
	}

	/**
	 * Sets the board description.
	 *
	 * @param boardDescription
	 *            the boardDescription to set
	 */
	public void setBoardDescription(String boardDescription) {
		this.boardDescription = boardDescription;
	}

	/**
	 * @return the createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedBy
	 */
	public Long getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the updatedBy to set
	 */
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
