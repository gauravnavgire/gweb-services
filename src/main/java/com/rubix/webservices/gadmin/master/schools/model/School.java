package com.rubix.webservices.gadmin.master.schools.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rubix.webservices.gadmin.master.schoolgroups.model.SchoolGroup;

// TODO: Auto-generated Javadoc
/**
 * The Class School.
 */
@Entity
@Table(name = "sm_schools")
public class School {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SCHOOL_ID")
	private Long id;

	/** The group. */
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private SchoolGroup group;

	/** The school promoter. */
	@Column(name = "SCHOOL_PROMOTER")
	private String schoolPromoter;

	/** The school registration number. */
	@Column(name = "SCHOOL_REG_NO")
	private String schoolRegistrationNumber;

	/** The school name. */
	@Column(name = "SCHOOL_NAME")
	private String schoolName;

	/** The school type. */
	@Column(name = "SCHOOL_TYPE")
	private String schoolType;

	/** The school address1. */
	@Column(name = "SCHOOL_ADDRESS1")
	private String schoolAddress1;

	/** The school address2. */
	@Column(name = "SCHOOL_ADDRESS2")
	private String schoolAddress2;

	/** The school address3. */
	@Column(name = "SCHOOL_ADDRESS3")
	private String schoolAddress3;

	/** The city. */
	@Column(name = "CITY")
	private String city;

	/** The state. */
	@Column(name = "STATE")
	private String state;

	/** The country. */
	@Column(name = "COUNTRY")
	private String country;

	/** The pincode. */
	@Column(name = "PINCODE")
	private String pincode;

	/** The email. */
	@Column(name = "EMAIL_ID")
	private String email;

	/** The fax. */
	@Column(name = "FAX")
	private String fax;

	/** The contact number1. */
	@Column(name = "CONTACT_NO1")
	private String contactNumber1;

	/** The contact number2. */
	@Column(name = "CONTACT_NO2")
	private String contactNumber2;

	/** The school inception date. */
	@Column(name = "SCHOOL_INCEPTION_DATE")
	private Date schoolInceptionDate;

	/** The valid upto. */
	@Column(name = "VALID_UPTO")
	private Date validUpto;

	/** The status. */
	@Column(name = "STATUS")
	private String status;

	/** The remark. */
	@Column(name = "REMARK")
	private String remark;

	/** The created by. */
	@Column(name = "CREATED_BY")
	private Long createdBy;

	/** The created date. */
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	/** The updated by. */
	@Column(name = "UPDATED_BY")
	private Long updatedBy;

	/** The updated date. */
	@Column(name = "UPDATED_DATE")
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
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the group.
	 *
	 * @return the group
	 */
	public SchoolGroup getGroup() {
		return group;
	}

	/**
	 * Sets the group.
	 *
	 * @param group
	 *            the group to set
	 */
	public void setGroup(SchoolGroup group) {
		this.group = group;
	}

	/**
	 * Gets the school promoter.
	 *
	 * @return the schoolPromoter
	 */
	public String getSchoolPromoter() {
		return schoolPromoter;
	}

	/**
	 * Sets the school promoter.
	 *
	 * @param schoolPromoter
	 *            the schoolPromoter to set
	 */
	public void setSchoolPromoter(String schoolPromoter) {
		this.schoolPromoter = schoolPromoter;
	}

	/**
	 * Gets the school registration number.
	 *
	 * @return the schoolRegistrationNumber
	 */
	public String getSchoolRegistrationNumber() {
		return schoolRegistrationNumber;
	}

	/**
	 * Sets the school registration number.
	 *
	 * @param schoolRegistrationNumber
	 *            the schoolRegistrationNumber to set
	 */
	public void setSchoolRegistrationNumber(String schoolRegistrationNumber) {
		this.schoolRegistrationNumber = schoolRegistrationNumber;
	}

	/**
	 * Gets the school name.
	 *
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * Sets the school name.
	 *
	 * @param schoolName
	 *            the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * Gets the school type.
	 *
	 * @return the schoolType
	 */
	public String getSchoolType() {
		return schoolType;
	}

	/**
	 * Sets the school type.
	 *
	 * @param schoolType
	 *            the schoolType to set
	 */
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	/**
	 * Gets the school address1.
	 *
	 * @return the schoolAddress1
	 */
	public String getSchoolAddress1() {
		return schoolAddress1;
	}

	/**
	 * Sets the school address1.
	 *
	 * @param schoolAddress1
	 *            the schoolAddress1 to set
	 */
	public void setSchoolAddress1(String schoolAddress1) {
		this.schoolAddress1 = schoolAddress1;
	}

	/**
	 * Gets the school address2.
	 *
	 * @return the schoolAddress2
	 */
	public String getSchoolAddress2() {
		return schoolAddress2;
	}

	/**
	 * Sets the school address2.
	 *
	 * @param schoolAddress2
	 *            the schoolAddress2 to set
	 */
	public void setSchoolAddress2(String schoolAddress2) {
		this.schoolAddress2 = schoolAddress2;
	}

	/**
	 * Gets the school address3.
	 *
	 * @return the schoolAddress3
	 */
	public String getSchoolAddress3() {
		return schoolAddress3;
	}

	/**
	 * Sets the school address3.
	 *
	 * @param schoolAddress3
	 *            the schoolAddress3 to set
	 */
	public void setSchoolAddress3(String schoolAddress3) {
		this.schoolAddress3 = schoolAddress3;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the pincode.
	 *
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * Sets the pincode.
	 *
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the fax.
	 *
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the fax.
	 *
	 * @param fax
	 *            the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Gets the contact number1.
	 *
	 * @return the contactNumber1
	 */
	public String getContactNumber1() {
		return contactNumber1;
	}

	/**
	 * Sets the contact number1.
	 *
	 * @param contactNumber1
	 *            the contactNumber1 to set
	 */
	public void setContactNumber1(String contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	/**
	 * Gets the contact number2.
	 *
	 * @return the contactNumber2
	 */
	public String getContactNumber2() {
		return contactNumber2;
	}

	/**
	 * Sets the contact number2.
	 *
	 * @param contactNumber2
	 *            the contactNumber2 to set
	 */
	public void setContactNumber2(String contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}

	/**
	 * Gets the school inception date.
	 *
	 * @return the schoolInceptionDate
	 */
	public Date getSchoolInceptionDate() {
		return schoolInceptionDate;
	}

	/**
	 * Sets the school inception date.
	 *
	 * @param schoolInceptionDate
	 *            the schoolInceptionDate to set
	 */
	public void setSchoolInceptionDate(Date schoolInceptionDate) {
		this.schoolInceptionDate = schoolInceptionDate;
	}

	/**
	 * Gets the valid upto.
	 *
	 * @return the validUpto
	 */
	public Date getValidUpto() {
		return validUpto;
	}

	/**
	 * Sets the valid upto.
	 *
	 * @param validUpto
	 *            the validUpto to set
	 */
	public void setValidUpto(Date validUpto) {
		this.validUpto = validUpto;
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
	 * Gets the remark.
	 *
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the remark.
	 *
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
	 * @param createdBy
	 *            the createdBy to set
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
	 * @param createdDate
	 *            the createdDate to set
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
	 * @param updatedBy
	 *            the updatedBy to set
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
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
