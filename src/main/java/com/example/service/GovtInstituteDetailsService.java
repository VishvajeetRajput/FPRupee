package com.example.service;

import java.util.Map;

import com.example.request.GovtInstituteRequest;
import com.example.request.GovtInstituteUpdateRequest;
import com.example.request.Pagination;

public interface GovtInstituteDetailsService {

	
	Map<String, Object> addGovtInstitute( GovtInstituteRequest  govtInstituteRequest);

	Boolean existsByDeapartmentEmail(String deapartmentEmail);

	Boolean existsByDeapartmentContactNo(String deapartmentContactNo);

	Boolean existsByDeapartmentEmailAndDeapartmentContactNo(String deapartmentContactNo, String deapartmentEmail);

	Map<String, Object> findAllGovtInstitute(Pagination pagination);

	Map<String, Object> findByGovtInstituteId(Long id);

	Map<String ,Object> updateGovtInstituteById(GovtInstituteUpdateRequest govtInstituteRequest);

	Boolean govtInstituteExist(Long id);
	
	Map<String, Object> govtInstituteIsActive( Long id,char isActive) ;
	 	
}
