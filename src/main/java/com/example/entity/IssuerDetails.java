package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ISSUER_DETAILS")
public class IssuerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ISSUER_ID")
	private long issuerId;

	@Column(name = "CREATION_DATE")
	private Timestamp creationDate;

	@Column(name = "ISSUER_NAME")
	private String issuerName;

	@Column(name = "ISSUER_EMAIL")
	private String issuerEmail;

	@Column(name = "ISSUER_PHONE")
	private String issuerPhone;

	@Column(name = "ISSUER_ADDRESS")
	private String issuerAddress;

	@Column(name = "ISSUER_STATE")
	private String issuerState;

	@Column(name = "ISSUER_CITY")
	private String issuerCity;

	@Column(name = "ISSUER_PINCODE")
	private String issuerPincode;
	
	@Column(name="ISSUER_BUSINESS_NAME")
	private String issuerBusinessName;

	@Column(name = "ISSUER_IS_ACTIVE")
	private char issuerIsActive;

	public IssuerDetails() {
		super();
	}

	public long getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(long issuerId) {
		this.issuerId = issuerId;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
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

	public String getIssuerState() {
		return issuerState;
	}

	public void setIssuerState(String issuerState) {
		this.issuerState = issuerState;
	}

	public String getIssuerCity() {
		return issuerCity;
	}

	public void setIssuerCity(String issuerCity) {
		this.issuerCity = issuerCity;
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

	public char getIssuerIsActive() {
		return issuerIsActive;
	}

	public void setIssuerIsActive(char issuerIsActive) {
		this.issuerIsActive = issuerIsActive;
	}

	
}

