package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BenificieryUpdateRequest {

	private Long benificieryId;

	@NotBlank(message = "benificieryName cannot be empty")
	private String benificieryName;

	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid mobile number")
	@NotBlank(message = "Mobile number cannot be empty")
	@Size(min = 10, max = 10, message = "Please enter your 10 digit mobile number")
	private String benificieryMobileNo;

	@Email(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@NotBlank(message = "Partner Email cannot be empty")
	@Size(min = 1, max = 47, message = "benificieryEmail must be between 1 to 47 words")
	private String benificieryEmail;

	
	
	@NotBlank(message = "benificieryAddress cannot be empty")
	private String benificieryAddress;

	@NotBlank(message = "benificieryCity cannot be empty")
	private String benificieryCity;

	@NotBlank(message = "benificieryState cannot be empty")
	private String benificieryState;

	@NotBlank(message = "benificieryPincode cannot be empty")
	private String benificieryPincode;

	@NotBlank(message = "additionInfo1 cannot be empty")
	private String additionInfo1;

	@NotBlank(message = "additionInfo2 cannot be empty")
	private String additionInfo2;

	public Long getBenificieryId() {
		return benificieryId;
	}

	public void setBenificieryId(Long benificieryId) {
		this.benificieryId = benificieryId;
	}

	public String getBenificieryName() {
		return benificieryName;
	}

	public void setBenificieryName(String benificieryName) {
		this.benificieryName = benificieryName;
	}

	public String getBenificieryMobileNo() {
		return benificieryMobileNo;
	}

	public void setBenificieryMobileNo(String benificieryMobileNo) {
		this.benificieryMobileNo = benificieryMobileNo;
	}

	public String getBenificieryEmail() {
		return benificieryEmail;
	}

	public void setBenificieryEmail(String benificieryEmail) {
		this.benificieryEmail = benificieryEmail;
	}

	public String getBenificieryAddress() {
		return benificieryAddress;
	}

	public void setBenificieryAddress(String benificieryAddress) {
		this.benificieryAddress = benificieryAddress;
	}

	public String getBenificieryCity() {
		return benificieryCity;
	}

	public void setBenificieryCity(String benificieryCity) {
		this.benificieryCity = benificieryCity;
	}

	public String getBenificieryState() {
		return benificieryState;
	}

	public void setBenificieryState(String benificieryState) {
		this.benificieryState = benificieryState;
	}

	public String getBenificieryPincode() {
		return benificieryPincode;
	}

	public void setBenificieryPincode(String benificieryPincode) {
		this.benificieryPincode = benificieryPincode;
	}

	public String getAdditionInfo1() {
		return additionInfo1;
	}

	public void setAdditionInfo1(String additionInfo1) {
		this.additionInfo1 = additionInfo1;
	}

	public String getAdditionInfo2() {
		return additionInfo2;
	}

	public void setAdditionInfo2(String additionInfo2) {
		this.additionInfo2 = additionInfo2;
	}

}
