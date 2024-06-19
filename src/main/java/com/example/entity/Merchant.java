package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MERCHANTS_DETAILS")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MERCHANT_ID")
	private long merchantId;

	@Column(name = "GOVT_ID", nullable = false)
	private long govtId;

	@Column(name = "MERCHANT_CREATIONDATE")
	private Timestamp merchantCreationDate;
	
	@Column(name = "MERCHANT_BUSSINESS_NAME", nullable = false, length = 200)
	private String merchantBussinessName;
	
	@Column(name = "MERCHANT_MCC_CODE", nullable = false, length = 200)
	private String merchantMccCode;

	@Column(name = "MERCHANT_EMAIL", nullable = false, length = 200)
	private String merchantEmail;

	@Column(name = "MERCHANT_MOBILE", nullable = false, length = 200)
	private String merchantMobile;

	@Column(name = "MERCHANT_ADDRESS", nullable = false, length = 200)
	private String merchantAddress;

	@Column(name = "MERCHANT_CITY", nullable = false, length = 200)
	private String merchantCity;

	@Column(name = "MERCHANT_STATE", nullable = false, length = 200)
	private String merchantState;
	
	@Column(name = "MERCHANT_PINCODE", nullable = false, length = 200)
	private String merchantPincode;

	@Column(name = "ADDITIONAL_INFO1", length = 200)
	private String additionalInfo1;

	@Column(name = "ADDITIONAL_INFO2",  length = 200)
	private String additionalInfo2;

	@Column(name = "MERCHNAT_IS_ACTIVE")
	private char merchnatIsActive;

	public Merchant() {
	}

	public String getMerchantBussinessName() {
		return merchantBussinessName;
	}

	public void setMerchantBussinessName(String merchantBussinessName) {
		this.merchantBussinessName = merchantBussinessName;
	}

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

	public Timestamp getMerchantCreationDate() {
		return merchantCreationDate;
	}

	public void setMerchantCreationDate(Timestamp merchantCreationDate) {
		this.merchantCreationDate = merchantCreationDate;
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

	public char getMerchnatIsActive() {
		return merchnatIsActive;
	}

	public void setMerchnatIsActive(char merchnatIsActive) {
		this.merchnatIsActive = merchnatIsActive;
	}

	public String getMerchantMobile() {
		return merchantMobile;
	}

	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}

}
