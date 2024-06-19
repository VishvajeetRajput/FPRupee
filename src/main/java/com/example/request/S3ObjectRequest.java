package com.example.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class S3ObjectRequest {

	@NotBlank(message = "bucketName cannot be empty")
	@Size(max = 100,min=1		)
	private String bucketName;

	@Size(max = 100,min=1)
	@NotBlank(message = "objectKey cannot be empty")
	private String objectKey;
	
	@Size(max = 100,min=1)
	@NotBlank(message = "objectUrl cannot be empty")
	private String objectUrl;

	private long merchantId;

	
	public S3ObjectRequest() {
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getObjectKey() {
		return objectKey;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
	}

	public String getObjectUrl() {
		return objectUrl;
	}

	public void setObjectUrl(String objectUrl) {
		this.objectUrl = objectUrl;
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

}
