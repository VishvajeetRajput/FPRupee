package com.example.request;


public class MerchantCallbackRequest {

	private String MerchantCallBackURL;
	
	private long merchantId;
	
	private String callBackRequest;

	private String merchantTrxnRefId;

	private String callBackResponse;

	public String getMerchantCallBackURL() {
		return MerchantCallBackURL;
	}

	public void setMerchantCallBackURL(String merchantCallBackURL) {
		MerchantCallBackURL = merchantCallBackURL;
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public String getCallBackRequest() {
		return callBackRequest;
	}

	public void setCallBackRequest(String callBackRequest) {
		this.callBackRequest = callBackRequest;
	}

	public String getMerchantTrxnRefId() {
		return merchantTrxnRefId;
	}

	public void setMerchantTrxnRefId(String merchantTrxnRefId) {
		this.merchantTrxnRefId = merchantTrxnRefId;
	}

	public String getCallBackResponse() {
		return callBackResponse;
	}

	public void setCallBackResponse(String callBackResponse) {
		this.callBackResponse = callBackResponse;
	}

	
}
