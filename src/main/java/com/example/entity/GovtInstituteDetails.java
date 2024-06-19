package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GOVT_INSTITUTE_DETAILS")
public class GovtInstituteDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "GOVT_INSTITUTE_ID")
	private Long govtInstituteId;

	@Column(name = "DEAPARTMENT_NAME", length = 200)
	private String deapartmentName;

	@Column(name = "DEPARTMENT_EMAIL",length = 200)
	private String deapartmentEmail;

	@Column(name = "DEPARTMENT_CONTACT_NO",length = 200)
	private String deapartmentContactNo;

	@Column(name = "DEPARTMENT_PASSWORD",length = 200)
	private String deapartmentPassword;

	@Column(name = "CREATION_DATE")
	private Timestamp creationDate;

	@Column(name = "DEPARTMENT_ADDRESS",length = 200)
	private String departmentAddress;

	@Column(name = "DEPARTMENT_CITY",length = 200)
	private String departmentCity;

	@Column(name = "DEPARTMENT_STATE",length = 200)
	private String departmentState;

	@Column(name = "DEPARTMENT_PINCODE",length = 200)
	private String departmentPincode;
	
	@Column(name = "GOVT_INSTITUTE_IS_ACTIVE")
	private char govtInstituteIsActive;
	
	public GovtInstituteDetails() {

	}

	public Long getGovtInstituteId() {
		return govtInstituteId;
	}

	public void setGovtInstituteId(Long govtInstituteId) {
		this.govtInstituteId = govtInstituteId;
	}

	public String getDeapartmentName() {
		return deapartmentName;
	}

	public void setDeapartmentName(String deapartmentName) {
		this.deapartmentName = deapartmentName;
	}

	public String getDeapartmentEmail() {
		return deapartmentEmail;
	}

	public void setDeapartmentEmail(String deapartmentEmail) {
		this.deapartmentEmail = deapartmentEmail;
	}

	public String getDeapartmentContactNo() {
		return deapartmentContactNo;
	}

	public void setDeapartmentContactNo(String deapartmentContactNo) {
		this.deapartmentContactNo = deapartmentContactNo;
	}

	public String getDeapartmentPassword() {
		return deapartmentPassword;
	}

	public void setDeapartmentPassword(String deapartmentPassword) {
		this.deapartmentPassword = deapartmentPassword;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCity() {
		return departmentCity;
	}

	public void setDepartmentCity(String departmentCity) {
		this.departmentCity = departmentCity;
	}

	public String getDepartmentState() {
		return departmentState;
	}

	public void setDepartmentState(String departmentState) {
		this.departmentState = departmentState;
	}

	public String getDepartmentPincode() {
		return departmentPincode;
	}

	public void setDepartmentPincode(String departmentPincode) {
		this.departmentPincode = departmentPincode;
	}

	public char getGovtInstituteIsActive() {
		return govtInstituteIsActive;
	}

	public void setGovtInstituteIsActive(char govtInstituteIsActive) {
		this.govtInstituteIsActive = govtInstituteIsActive;
	}
	

}
