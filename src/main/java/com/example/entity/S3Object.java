package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "S3_OBJECT")
public class S3Object {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BUCKET_ID")
	private long bucketId;

	@Column(name = "BUCKET_NAME",length=200)
	private String bucketName;

	@Column(name = "OBJECT_KEY",length=200)
	private String objectKey;

	@Column(name = "OBJECT_URL",length=200)
	private String objectUrl;

	@Column(name = "MERCHANT_ID")
	private long merchantId;
	
	@Column(name = "CREATION_DATE")
	private Timestamp creationDate;

	public S3Object() {
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

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

}
