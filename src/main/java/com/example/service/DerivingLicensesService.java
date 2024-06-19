package com.example.service;

import java.util.Map;

import com.example.request.DrivingLicenceRequest;

public interface DerivingLicensesService {

	Map<Object,Object> dlDetails(DrivingLicenceRequest DrivingLicenceRequest);
	
}
