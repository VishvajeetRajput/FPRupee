package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IssuerUpdateRequest {

	private Long issuerId;

	@NotBlank(message = "issuerName cannot be empty")
	private String issuerName;

	@Email(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@NotBlank(message = "Issuer Email cannot be empty")
	@Size(min = 1, max = 45, message = "issuerEmail must be between 1 to 45 words")
	private String issuerEmail;

	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid phone number")
	@NotBlank(message = "Phone number cannot be empty")
	@Size(min = 10, max = 10, message = "Please enter your 10 digit phone number")
	private String issuerPhone;

	@NotBlank(message = "issuerAddress cannot be empty")
    private String issuerAddress;

	@NotBlank(message = "issuerCity cannot be empty")
    private String issuerCity;

	@NotBlank(message = "issuerState cannot be empty")
    private String issuerState;

	@NotBlank(message = "issuerPincode cannot be empty")
	private String issuerPincode;

	@NotBlank(message = "issuerBusinessName cannot be empty")
	@Size(min = 5, max = 30, message = "issuerBusinessName can not be more than 50 words")
	private String issuerBusinessName;
	
	public IssuerUpdateRequest() {
		super();
	}

	public Long getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(Long issuerId) {
		this.issuerId = issuerId;
	}

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
