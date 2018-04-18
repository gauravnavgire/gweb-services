package com.rubix.webservices.gadmin.user.service.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rubix.webservices.gadmin.master.schoolgroups.model.SchoolGroup;

@Entity
@Table(name = "sm_resources")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESOURCE_ID")
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GROUP_ID")
	private SchoolGroup schoolGroup;

	@Column(name = "RESOURCE_TYPE")
	private String resourceType;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "BLOOD_GROUP")
	private String bloodGroup;

	@Column(name = "NATIONALITY")
	private String nationality;

	@Column(name = "RELIGION")
	private String relegion;

	@Column(name = "CASTE")
	private String caste;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "MARITAL_STATUS")
	private String maritialStatus;

	@Column(name = "FATHER_NAME")
	private String fatherName;

	@Column(name = "MOTHER_NAME")
	private String motherName;

	@Column(name = "SPOUSE_NAME")
	private String spouseName;

	@Column(name = "IS_PHYSICALLY_CHALLENGED")
	private String isPhysicallyChallanged;

	@Column(name = "PHYSICALLY_CHALLENGED_REMARK")
	private String physicalChallangeRemark;

	@Column(name = "REFERENCES_IF_ANY")
	private String references;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "SECRET_QUESTION")
	private String secrateQuestion;

	@Column(name = "SECRET_ANSWER")
	private String secrateAnswer;

	@Column(name = "CHANGE_PASSWORD_ON_LOGIN")
	private Boolean changePasswordOnLogin;

	@Column(name = "ADHHAR_NO")
	private String aadharNumber;

	@Column(name = "BATCH_BILLA")
	private String batchBilla;

	@Column(name = "DRIVING_LICENSE")
	private String drivingLicence;

	@Column(name = "PAN_NO")
	private String panNumber;

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

	@OneToMany(mappedBy = "userModel", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LinkUserRole> linkUserRoles;

	/**
	 * @return the linkUserRoles
	 */
	public List<LinkUserRole> getLinkUserRoles() {
		return linkUserRoles;
	}

	/**
	 * @param linkUserRoles
	 *            the linkUserRoles to set
	 */
	public void setLinkUserRoles(List<LinkUserRole> linkUserRoles) {
		this.linkUserRoles = linkUserRoles;
	}

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
	 * @return the schoolGroup
	 */
	public SchoolGroup getSchoolGroup() {
		return schoolGroup;
	}

	/**
	 * @param schoolGroup
	 *            the schoolGroup to set
	 */
	public void setSchoolGroup(SchoolGroup schoolGroup) {
		this.schoolGroup = schoolGroup;
	}

	/**
	 * @return the caste
	 */
	public String getCaste() {
		return caste;
	}

	/**
	 * @param caste
	 *            the caste to set
	 */
	public void setCaste(String caste) {
		this.caste = caste;
	}

	/**
	 * @return the resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * @param resourceType
	 *            the resourceType to set
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the relegion
	 */
	public String getRelegion() {
		return relegion;
	}

	/**
	 * @param relegion
	 *            the relegion to set
	 */
	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

	/**
	 * @return the cast
	 */
	public String getCast() {
		return caste;
	}

	/**
	 * @param cast
	 *            the cast to set
	 */
	public void setCast(String cast) {
		this.caste = cast;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the maritialStatus
	 */
	public String getMaritialStatus() {
		return maritialStatus;
	}

	/**
	 * @param maritialStatus
	 *            the maritialStatus to set
	 */
	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName
	 *            the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the spouseName
	 */
	public String getSpouseName() {
		return spouseName;
	}

	/**
	 * @param spouseName
	 *            the spouseName to set
	 */
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	/**
	 * @return the isPhysicallyChallanged
	 */
	public String getIsPhysicallyChallanged() {
		return isPhysicallyChallanged;
	}

	/**
	 * @param isPhysicallyChallanged
	 *            the isPhysicallyChallanged to set
	 */
	public void setIsPhysicallyChallanged(String isPhysicallyChallanged) {
		this.isPhysicallyChallanged = isPhysicallyChallanged;
	}

	/**
	 * @return the physicalChallangeRemark
	 */
	public String getPhysicalChallangeRemark() {
		return physicalChallangeRemark;
	}

	/**
	 * @param physicalChallangeRemark
	 *            the physicalChallangeRemark to set
	 */
	public void setPhysicalChallangeRemark(String physicalChallangeRemark) {
		this.physicalChallangeRemark = physicalChallangeRemark;
	}

	/**
	 * @return the references
	 */
	public String getReferences() {
		return references;
	}

	/**
	 * @param references
	 *            the references to set
	 */
	public void setReferences(String references) {
		this.references = references;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the secrateQuestion
	 */
	public String getSecrateQuestion() {
		return secrateQuestion;
	}

	/**
	 * @param secrateQuestion
	 *            the secrateQuestion to set
	 */
	public void setSecrateQuestion(String secrateQuestion) {
		this.secrateQuestion = secrateQuestion;
	}

	/**
	 * @return the secrateAnswer
	 */
	public String getSecrateAnswer() {
		return secrateAnswer;
	}

	/**
	 * @param secrateAnswer
	 *            the secrateAnswer to set
	 */
	public void setSecrateAnswer(String secrateAnswer) {
		this.secrateAnswer = secrateAnswer;
	}

	/**
	 * @return the changePasswordOnLogin
	 */
	public Boolean getChangePasswordOnLogin() {
		return changePasswordOnLogin;
	}

	/**
	 * @param changePasswordOnLogin
	 *            the changePasswordOnLogin to set
	 */
	public void setChangePasswordOnLogin(Boolean changePasswordOnLogin) {
		this.changePasswordOnLogin = changePasswordOnLogin;
	}

	/**
	 * @return the aadharNumber
	 */
	public String getAadharNumber() {
		return aadharNumber;
	}

	/**
	 * @param aadharNumber
	 *            the aadharNumber to set
	 */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	/**
	 * @return the batchBilla
	 */
	public String getBatchBilla() {
		return batchBilla;
	}

	/**
	 * @param batchBilla
	 *            the batchBilla to set
	 */
	public void setBatchBilla(String batchBilla) {
		this.batchBilla = batchBilla;
	}

	/**
	 * @return the drivingLicence
	 */
	public String getDrivingLicence() {
		return drivingLicence;
	}

	/**
	 * @param drivingLicence
	 *            the drivingLicence to set
	 */
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}

	/**
	 * @param panNumber
	 *            the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"UserModel [id=%s, groupId=%s, resourceType=%s, firstName=%s, middleName=%s, lastName=%s, gender=%s, dateOfBirth=%s, bloodGroup=%s, nationality=%s, relegion=%s, caste=%s, category=%s, maritialStatus=%s, fatherName=%s, motherName=%s, spouseName=%s, isPhysicallyChallanged=%s, physicalChallangeRemark=%s, references=%s, username=%s, password=%s, secrateQuestion=%s, secrateAnswer=%s, changePasswordOnLogin=%s, aadharNumber=%s, batchBilla=%s, drivingLicence=%s, panNumber=%s, status=%s, createdBy=%s, createdDate=%s, updatedBy=%s, updatedDate=%s]",
				id, schoolGroup, resourceType, firstName, middleName, lastName, gender, dateOfBirth, bloodGroup,
				nationality, relegion, caste, category, maritialStatus, fatherName, motherName, spouseName,
				isPhysicallyChallanged, physicalChallangeRemark, references, userName, password, secrateQuestion,
				secrateAnswer, changePasswordOnLogin, aadharNumber, batchBilla, drivingLicence, panNumber, status,
				createdBy, createdDate, updatedBy, updatedDate);
	}

}
