package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BenificieryRequest {
	
	@NotBlank(message = "benificieryName cannot be empty")
	@Size(min = 1, max = 50, message = "benificieryName can not be more than 50 words")
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	private String benificieryName;
    
	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid mobile number")
	@NotBlank(message = "Mobile number cannot be empty")
	@Size(min = 10, max = 10, message = "Please enter your 10 digit mobile number")
	private String benificieryMobileNo;
    
	@Email(regexp = "^(?=.{1,64}@)[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[^-][a-zA-Z0-9]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,})$")
	@NotBlank(message = "Partner Email cannot be empty")
	@Size(min = 1, max = 45, message = "benificieryEmail must be between 1 to 45 words")
	private String benificieryEmail;
    
	@Pattern(regexp = "^((?:19|20)\\d\\d)[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$")
	@NotBlank(message = "Partner benificieryDate cannot be empty")
	private String benificieryDate;
		
	@NotBlank(message = "benificieryAddress cannot be empty")
	@Size(min = 1, max = 80, message = "benificieryAddress can not be more than 80 words")
	private String benificieryAddress;

	@NotBlank(message = "benificieryCity cannot be empty")
	@Size(min = 1, max = 45, message = "benificieryCity can not be more than 45 words")
	private String benificieryCity;

	@NotBlank(message = "benificieryState cannot be empty")
	@Size(min = 1, max = 45, message = "benificieryState can not be more than 45 words")
	private String benificieryState;

	@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Please enter valid benificieryPincode number")
	@NotBlank(message = "benificieryPincode cannot be empty")
	private String benificieryPincode;

	@NotBlank(message = "additionInfo1 cannot be empty")
	private String additionInfo1;

	@NotBlank(message = "additionInfo2 cannot be empty")
	private String additionInfo2;
		
	public String getBenificieryDate() {
		return benificieryDate;
	}

	public void setBenificieryDate(String benificieryDate) {
		this.benificieryDate = benificieryDate;
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
