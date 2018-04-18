package com.rubix.webservices.gadmin.master.schoolgroups.dto.in;

// TODO: Auto-generated Javadoc
/**
 * The Class AcademicYearDTO.
 */
public class AcademicYearDTO {

	/** The id. */
	private Long id;

	/** The display name. */
	private String displayName;

	/** The start date str. */
	private String startDateStr;

	/** The end date str. */
	private String endDateStr;

	/** The created by. */
	private Long createdBy;

	/** The school group id. */
	private Long schoolGroupId;

	/**
	 * Gets the created by.
	 *
	 * @return the createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * @return the schoolGroupId
	 */
	public Long getSchoolGroupId() {
		return schoolGroupId;
	}

	/**
	 * @param schoolGroupId
	 *            the schoolGroupId to set
	 */
	public void setSchoolGroupId(Long schoolGroupId) {
		this.schoolGroupId = schoolGroupId;
	}

	/**
	 * Sets the created by.
	 *
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	 * Gets the display name.
	 *
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 *
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the start date str.
	 *
	 * @return the startDateStr
	 */
	public String getStartDateStr() {
		return startDateStr;
	}

	/**
	 * Sets the start date str.
	 *
	 * @param startDateStr
	 *            the startDateStr to set
	 */
	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	/**
	 * Gets the end date str.
	 *
	 * @return the endDateStr
	 */
	public String getEndDateStr() {
		return endDateStr;
	}

	/**
	 * Sets the end date str.
	 *
	 * @param endDateStr
	 *            the endDateStr to set
	 */
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

}
