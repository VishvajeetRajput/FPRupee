package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BENIFICIERY_DETAILS")
public class BenificieryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BENIFICIERY_ID")
	private long benificieryId;
	
	@Column(name = "BENIFICIERY_NAME", nullable = false, length = 200)
	private String benificieryName;
	
	@Column(name = "BENIFICIERY_MOBILE_NO", nullable = false, length = 200)
	private String benificieryMobileNo;
	
	@Column(name = "BENIFICIERY_EMAIL", nullable = false, length = 200)
	private String benificieryEmail;
	
	@Column(name = "BENIFICIERY_ADDRESS", nullable = false, length = 200)
	private String benificieryAddress;
	
	@Column(name = "BENIFICIERY_CITY", nullable = false, length = 200)
	private String benificieryCity;
	
	@Column(name = "BENIFICIERY_STATE", nullable = false, length = 200)
	private String benificieryState;
	
	@Column(name = "BENIFICIERY_PINCODE", nullable = false, length = 200)
	private String benificieryPincode;
	
	@Column(name = "CREATION_DATE", nullable = false)
	private Timestamp creationDate;
	
	@Column(name = "BENIFICIERY_IS_ACTIVE", nullable = false, length = 200)
	private Character benificieryIsActive;
	
	@Column(name = "ADDITION_INFO1", nullable = false, length = 200)
	private String additionInfo1="NA";
	
	@Column(name = "ADDITION_INFO2", nullable = false, length = 200)
	private String additionInfo2="NA";

	public long getBenificieryId() {
		return benificieryId;
	}

	public void setBenificieryId(long benificieryId) {
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

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Character getBenificieryIsActive() {
		return benificieryIsActive;
	}

	public void setBenificieryIsActive(Character benificieryIsActive) {
		this.benificieryIsActive = benificieryIsActive;
	}

	
	

}
