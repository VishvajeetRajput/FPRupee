package com.example.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MerchantUpdateRequest {

	private long merchantId;
	
	private long govtId;

	@NotBlank(message = "MCC Code Cannot be Empty")
	@Size(min = 1, max = 20, message = "merchantMccCode can not be more than 20 words")
	private String merchantMccCode;

	@NotBlank(message = "Email Cannot be Empty")
	@Email(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@Size(min = 1, max = 50, message = "merchantEmail must be between 1 to 50 words")
	private String merchantEmail;

	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Please enter valid mobile number")
	@NotBlank(message = "Mobile number Can not be empty")
	@Size(min = 10, max = 10, message = "Please enter your 10 digit mobile number")
	private String merchantMobileNo;

	@NotBlank(message = "merchantAddress Can not be Empty")
	@Size(min = 1, max = 80, message = "merchantAddress can not be more than 80 words")
	private String merchantAddress;

	@NotBlank(message = "merchantCity Can not be Empty")
	@Size(min = 1, max = 45, message = "merchantAddress can not be more than 45 words")
	private String merchantCity;

	@NotBlank(message = "merchantState Can not be Empty")
	@Size(min = 1, max = 45, message = "merchantAddress can not be more than 45 words")
	private String merchantState;

	@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Please enter valid merchantPincode number")
	@NotBlank(message = "merchantPincode Can not be empty")
	private String merchantPincode;
	
	@NotBlank(message = "merchantBussinessName Can not be empty")
	@Size(min = 5, max = 40, message = "merchantBussinessName must be between 5 to 40 words")
	private String merchantBussinessName;
		
	private String additionalInfo1 = "NA";

	private String additionalInfo2 = "NA";

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public long getGovtId() {
		return govtId;
	}

	public void setGovtId(long govtId) {
		this.govtId = govtId;
	}

	public String getMerchantMccCode() {
		return merchantMccCode;
	}

	public void setMerchantMccCode(String merchantMccCode) {
		this.merchantMccCode = merchantMccCode;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getMerchantMobileNo() {
		return merchantMobileNo;
	}

	public void setMerchantMobileNo(String merchantMobileNo) {
		this.merchantMobileNo = merchantMobileNo;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantState() {
		return merchantState;
	}

	public void setMerchantState(String merchantState) {
		this.merchantState = merchantState;
	}

	public String getMerchantPincode() {
		return merchantPincode;
	}

	public void setMerchantPincode(String merchantPincode) {
		this.merchantPincode = merchantPincode;
	}

	public String getMerchantBussinessName() {
		return merchantBussinessName;
	}

	public void setMerchantBussinessName(String merchantBussinessName) {
		this.merchantBussinessName = merchantBussinessName;
	}

	public String getAdditionalInfo1() {
		return additionalInfo1;
	}

	public void setAdditionalInfo1(String additionalInfo1) {
		this.additionalInfo1 = additionalInfo1;
	}

	public String getAdditionalInfo2() {
		return additionalInfo2;
	}

	public void setAdditionalInfo2(String additionalInfo2) {
		this.additionalInfo2 = additionalInfo2;
	}
	
}
