package com.example.request;


public class SoundBoxChargesRequest {

	private String subMerchantId;

	private String merchantId;

	private String startDate;

	private String endDate;

	private String amount;

	private String isPaymentReceived;

	public String getSubMerchantId() {
		return subMerchantId;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
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

	
	public String getIsPaymentReceived() {
		return isPaymentReceived;
	}

	public void setIsPaymentReceived(String isPaymentReceived) {
		this.isPaymentReceived = isPaymentReceived;
	}

}