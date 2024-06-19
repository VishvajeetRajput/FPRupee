package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOUND_BOX_CHARGES")
public class SoundBoxCharges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOUND_BOX_CHARGES_ID")
	private Long soundBoxChargesId;

	@Column(name = "SUB_MERCHANT_ID")
	private String subMerchantId;

	@Column(name = "MERCHANT_ID")
	private Long merchantId;

	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "END_DATE")
	private String endDate;

	@Column(name = "AMOUNT")
	private String amount;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "IS_PAYMENT_RECEIVED")
	private String isPaymentReceived;

	public Long getSoundBoxChargesId() {
		return soundBoxChargesId;
	}

	public void setSoundBoxChargesId(Long soundBoxChargesId) {
		this.soundBoxChargesId = soundBoxChargesId;
	}

	public String getSubMerchantId() {
		return subMerchantId;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsPaymentReceived() {
		return isPaymentReceived;
	}

	public void setIsPaymentReceived(String isPaymentReceived) {
		this.isPaymentReceived = isPaymentReceived;
	}

}