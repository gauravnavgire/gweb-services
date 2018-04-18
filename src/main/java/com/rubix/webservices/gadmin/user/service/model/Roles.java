package com.rubix.webservices.gadmin.user.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Roles.
 */
@Entity
@Table(name = "sm_roles")
public class Roles {

	/** The role id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ROLE_ID")
	private Long roleId;
	
	/** The role display name. */
	@Column(name="ROLE_DISPLAY_NAME")
	private String roleDisplayName;
	

	/** The created by. */
	@Column(name="CREATED_BY")
	private Long createdBy;

	/** The created date. */
	@Column(name="CREATED_DATE")
	private Date createdDate;
	

	/** The updated by. */
	@Column(name="UPDATED_BY")
	private Long updatedBy;
	

	/** The updated date. */
	@Column(name="UPDATED_DATE")
	private Date updatedDate;


	/**
	 * Gets the role id.
	 *
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}


	/**
	 * Sets the role id.
	 *
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	/**
	 * Gets the role display name.
	 *
	 * @return the roleDisplayName
	 */
	public String getRoleDisplayName() {
		return roleDisplayName;
	}


	/**
	 * Sets the role display name.
	 *
	 * @param roleDisplayName the roleDisplayName to set
	 */
	public void setRoleDisplayName(String roleDisplayName) {
		this.roleDisplayName = roleDisplayName;
	}


	/**
	 * Gets the created by.
	 *
	 * @return the createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
	}


	/**
	 * Sets the created by.
	 *
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}


	/**
	 * Gets the created date.
	 *
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}


	/**
	 * Sets the created date.
	 *
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	/**
	 * Gets the updated by.
	 *
	 * @return the updatedBy
	 */
	public Long getUpdatedBy() {
		return updatedBy;
	}


	/**
	 * Sets the updated by.
	 *
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}


	/**
	 * Gets the updated date.
	 *
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}


	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}
