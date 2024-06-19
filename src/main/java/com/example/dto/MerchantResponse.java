package com.example.dto;

public class MerchantResponse {

	private long govtId;

	private long merchantId;

	private String merchantMccCode;

	private String merchantEmail;

	private String merchantBussinessName;

	private String merchantMobileNo;

	private String merchantAddress;

	private String merchantCity;

	private String merchantState;

	private String merchantPincode;

	private String additionalInfo1;

	public long getMerchantId() {
		return merchantId;
	}

	public String getMerchantBussinessName() {
		return merchantBussinessName;
	}

	public void setMerchantBussinessName(String merchantBussinessName) {
		this.merchantBussinessName = merchantBussinessName;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	private String additionalInfo2;

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
