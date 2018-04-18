package com.rubix.webservices.gadmin.master.schoolgroups.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sm_school_groups")
public class SchoolGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GROUP_ID")
	private Long id;

	@Column(name = "GROUP_CODE")
	private String groupCode;

	@Column(name = "SCHOOL_GROUP_NAME")
	private String schoolGroupName;

	@Column(name = "SCHOOL_GROUP_PROMOTER")
	private String schoolGroupPromoter;

	@Column(name = "SCHOOL_GROUP_LOGO")
	private String schoolGroupLogo;

	@Column(name = "SMS_PROVIDER_URL")
	private String smsProviderURL;

	@Column(name = "SMS_PROVIDER_NAME")
	private String smsProviderName;

	@Column(name = "SMS_USERNAME")
	private String smsUserName;

	@Column(name = "SMS_PASSWORD")
	private String smsPassword;

	@Column(name = "SMS_SENDER_ID")
	private String smsSenderId;

	@Column(name = "SEND_SMS")
	private Boolean sendSMS;

	@Column(name = "SMS_COUNT")
	private Long smsCount;

	@Column(name = "WATERMARK_LOGO")
	private String waterMarkLogo;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "CREATED_BY")
	private Long createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_BY")
	private Long updatedBy;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the groupCode
	 */
	public String getGroupCode() {
		return groupCode;
	}

	/**
	 * @param groupCode
	 *            the groupCode to set
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	/**
	 * @return the schoolGroupName
	 */
	public String getSchoolGroupName() {
		return schoolGroupName;
	}

	/**
	 * @param schoolGroupName
	 *            the schoolGroupName to set
	 */
	public void setSchoolGroupName(String schoolGroupName) {
		this.schoolGroupName = schoolGroupName;
	}

	/**
	 * @return the schoolGroupPromoter
	 */
	public String getSchoolGroupPromoter() {
		return schoolGroupPromoter;
	}

	/**
	 * @param schoolGroupPromoter
	 *            the schoolGroupPromoter to set
	 */
	public void setSchoolGroupPromoter(String schoolGroupPromoter) {
		this.schoolGroupPromoter = schoolGroupPromoter;
	}

	/**
	 * @return the schoolGroupLogo
	 */
	public String getSchoolGroupLogo() {
		return schoolGroupLogo;
	}

	/**
	 * @param schoolGroupLogo
	 *            the schoolGroupLogo to set
	 */
	public void setSchoolGroupLogo(String schoolGroupLogo) {
		this.schoolGroupLogo = schoolGroupLogo;
	}

	/**
	 * @return the smsProviderURL
	 */
	public String getSmsProviderURL() {
		return smsProviderURL;
	}

	/**
	 * @param smsProviderURL
	 *            the smsProviderURL to set
	 */
	public void setSmsProviderURL(String smsProviderURL) {
		this.smsProviderURL = smsProviderURL;
	}

	/**
	 * @return the smsProviderName
	 */
	public String getSmsProviderName() {
		return smsProviderName;
	}

	/**
	 * @param smsProviderName
	 *            the smsProviderName to set
	 */
	public void setSmsProviderName(String smsProviderName) {
		this.smsProviderName = smsProviderName;
	}

	/**
	 * @return the smsUserName
	 */
	public String getSmsUserName() {
		return smsUserName;
	}

	/**
	 * @param smsUserName
	 *            the smsUserName to set
	 */
	public void setSmsUserName(String smsUserName) {
		this.smsUserName = smsUserName;
	}

	/**
	 * @return the smsPassword
	 */
	public String getSmsPassword() {
		return smsPassword;
	}

	/**
	 * @param smsPassword
	 *            the smsPassword to set
	 */
	public void setSmsPassword(String smsPassword) {
		this.smsPassword = smsPassword;
	}

	/**
	 * @return the smsSenderId
	 */
	public String getSmsSenderId() {
		return smsSenderId;
	}

	/**
	 * @param smsSenderId
	 *            the smsSenderId to set
	 */
	public void setSmsSenderId(String smsSenderId) {
		this.smsSenderId = smsSenderId;
	}

	/**
	 * @return the sendSMS
	 */
	public Boolean getSendSMS() {
		return sendSMS;
	}

	/**
	 * @param sendSMS
	 *            the sendSMS to set
	 */
	public void setSendSMS(Boolean sendSMS) {
		this.sendSMS = sendSMS;
	}

	/**
	 * @return the smsCount
	 */
	public Long getSmsCount() {
		return smsCount;
	}

	/**
	 * @param smsCount
	 *            the smsCount to set
	 */
	public void setSmsCount(Long smsCount) {
		this.smsCount = smsCount;
	}

	/**
	 * @return the waterMarkLogo
	 */
	public String getWaterMarkLogo() {
		return waterMarkLogo;
	}

	/**
	 * @param waterMarkLogo
	 *            the waterMarkLogo to set
	 */
	public void setWaterMarkLogo(String waterMarkLogo) {
		this.waterMarkLogo = waterMarkLogo;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
