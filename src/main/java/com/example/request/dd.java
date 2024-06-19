package com.example.request;


import java.sql.Timestamp;

public class dd {

	private long bucketId;

	private String bucketName;

	private String objectKey;

	private String objectUrl;

	private String merchantId;
	
	private Timestamp creationDate;

	public dd() {
	}

	public long getBucketId() {
		return bucketId;
	}

	public void setBucketId(long bucketId) {
		this.bucketId = bucketId;
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

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

}
