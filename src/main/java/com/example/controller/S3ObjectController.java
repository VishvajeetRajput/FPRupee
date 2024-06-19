package com.example.controller;

import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.S3ObjectRequest;
import com.example.service.S3ObjectServices;

@RestController
public class S3ObjectController {

	@Autowired
	private S3ObjectServices objectServices;
	
	@PostMapping("/saveS3Object")
	public Map<String, Object> saveS3Object(@Valid @RequestBody S3ObjectRequest s3ObjectRequest) {
		return objectServices.saveS3Object(s3ObjectRequest);
	}
	
	@PostMapping("/findByBucketId/{id}")
	public Map<String, Object> findByBucketId(@PathVariable long id) {
		return objectServices.findByBucketId(id);
	}
	
}
