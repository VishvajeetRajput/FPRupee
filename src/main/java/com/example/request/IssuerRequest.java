package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IssuerRequest {

	@NotBlank(message = "issuerName cannot be empty")
	@Size(min = 1, max = 50, message = "issuerName can not be more than 50 words")
	private String issuerName;

	@Email(regexp = "^[a-zA-Z0-9.@]*$")
	@NotBlank(message = "Issuer Email cannot be empty")
	@Size(min = 1, max = 45, message = "issuerEmail must be between 1 to 45 words")
	private String issuerEmail;

	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid phone number")
	@NotBlank(message = "Phone number cannot be empty")
	private String issuerPhone;

	@NotBlank(message = "issuerAddress cannot be empty")
	@Size(min = 1, max = 80, message = "issuerAddress can not be more than 80 words")
	private String issuerAddress;

	@NotBlank(message = "issuerCity cannot be empty")
	@Size(min = 1, max = 45, message = "issuerCity can not be more than 45 words")
	private String issuerCity;

	@NotBlank(message = "issuerState cannot be empty")
	@Size(min = 1, max = 45, message = "issuerState can not be more than 45 words")
	private String issuerState;
	
	@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Please enter valid issuerPincode number")
	@NotBlank(message = "issuerPincode cannot be empty")
	private String issuerPincode;
	
	@NotBlank(message = "issuerBusinessName cannot be empty")
	@Size(min = 5, max = 30, message = "issuerBusinessName can not be more than 50 words")
	private String issuerBusinessName;


	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getIssuerEmail() {
		return issuerEmail;
	}

	public void setIssuerEmail(String issuerEmail) {
		this.issuerEmail = issuerEmail;
	}

	public String getIssuerPhone() {
		return issuerPhone;
	}

	public void setIssuerPhone(String issuerPhone) {
		this.issuerPhone = issuerPhone;
	}

	public String getIssuerAddress() {
		return issuerAddress;
	}

	public void setIssuerAddress(String issuerAddress) {
		this.issuerAddress = issuerAddress;
	}

	public String getIssuerCity() {
		return issuerCity;
	}

	public void setIssuerCity(String issuerCity) {
		this.issuerCity = issuerCity;
	}

	public String getIssuerState() {
		return issuerState;
	}

	public void setIssuerState(String issuerState) {
		this.issuerState = issuerState;
	}

	public String getIssuerPincode() {
		return issuerPincode;
	}

	public void setIssuerPincode(String issuerPincode) {
		this.issuerPincode = issuerPincode;
	}

	public String getIssuerBusinessName() {
		return issuerBusinessName;
	}

	public void setIssuerBusinessName(String issuerBusinessName) {
		this.issuerBusinessName = issuerBusinessName;
	}
	
}
