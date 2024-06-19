package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOUND_BOX_SUBSCRIPTION")
public class SoundBoxSubscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SOUND_BOX_SUBSCRIPTION_ID")
	private Long soundBoxSubscriptionId;
	
	@Column(name="SUB_MERCHANT_ID")
	private String subMerchantId;
	
	@Column(name="MERCHANT_ID")
	private Long merchantId;
	
	@Column(name="CREATION_DATE")
	private Timestamp currentDate;
	
	@Column(name="IS_ACTIVE")
	private String isActive;
	
	@Column(name="AMOUNT")
	private String amount;
	
	@Column(name="FREQUENCY")
	private String frequency;
	
	
	@Column(name="OTC")
	private String otc;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	public Long getSoundBoxSubscriptionId() {
		return soundBoxSubscriptionId;
	}

	public void setSoundBoxSubscriptionId(Long soundBoxSubscriptionId) {
		this.soundBoxSubscriptionId = soundBoxSubscriptionId;
	}

	public String getSubMerchantId() {
		return subMerchantId;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public Timestamp getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Timestamp currentDate) {
		this.currentDate = currentDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getOtc() {
		return otc;
	}

	public void setOtc(String otc) {
		this.otc = otc;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	
}