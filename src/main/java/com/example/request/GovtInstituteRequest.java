package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class GovtInstituteRequest {

	@NotBlank(message = "deapartmentEmail Cannot be Empty")
	@Size(min = 1, max = 40, message = "deapartmentEmail must be between 1 to 40 words")
	private String deapartmentName;

	@NotBlank(message = "deapartmentEmail Cannot be Empty")
	@Email(regexp = "(?:[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@Size(min = 1, max = 50, message = "deapartmentEmail must be between 1 to 50 words")
	private String deapartmentEmail;

	
	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid mobile number")
	@NotBlank(message = "deapartmentContactNo Can not be empty")
	@Size(min = 10, max = 10, message = "deapartmentContactNo must be 10 digits")
	private String deapartmentContactNo;
	
	
	@Pattern(regexp = "^[A-Za-z0-9]+[@#&*$]{1}+[A-Za-z0-9]*$", message = "At least one special character[@#&*$] is required.")
	@NotBlank(message = "deapartmentContactNo Can not be empty")
	@Size(min = 10, max = 30, message = "deapartmentPassword must be between 10 to 50 words")
	private String deapartmentPassword;

	
	@NotBlank(message = "departmentAddress Can not be Empty")
	@Size(min = 1, max = 80, message = "departmentAddress can not be more than 80 words")
	private String departmentAddress;
	
	
	@NotBlank(message = "departmentCity Can not be Empty")
	@Size(min = 1, max = 45, message = "departmentCity can not be more than 45 words")
	private String departmentCity;

	
	@NotBlank(message = "departmentState Can not be Empty")
	@Size(min = 1, max = 45, message = "departmentState can not be more than 45 words")
	private String departmentState;
	
	@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Please enter valid merchantPincode number")
	@NotBlank(message = "merchantPincode Can not be empty")
	private String departmentPincode;
	
	public String getDepartmentPincode() {
		return departmentPincode;
	}

	public void setDepartmentPincode(String departmentPincode) {
		this.departmentPincode = departmentPincode;
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

}
