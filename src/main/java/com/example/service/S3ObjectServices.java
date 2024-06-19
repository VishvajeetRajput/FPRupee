package com.example.service;

import java.util.Map;

import javax.validation.Valid;

import com.example.request.S3ObjectRequest;

public interface S3ObjectServices {

	Map<String, Object> saveS3Object(@Valid S3ObjectRequest s3ObjectRequest);
	Map<String, Object> findByBucketId(long Id);
	
}
