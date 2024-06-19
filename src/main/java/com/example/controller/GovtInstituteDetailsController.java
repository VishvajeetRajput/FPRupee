package com.example.controller;

import java.util.Map;

import javax.validation.Valid;
import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.encryption.Encryption;
import com.example.request.GovtInstituteRequest;
import com.example.request.GovtInstituteUpdateRequest;
import com.example.request.MerchantCallbackRequest;
import com.example.request.Pagination;
import com.example.service.GovtInstituteDetailsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/govt")
public class GovtInstituteDetailsController {

	@Autowired
	private GovtInstituteDetailsService govtInstituteDetailsService;
	
	@PostMapping("/addGovtInstituteDetails")
	public Map<String, Object> addGovtInstituteDetails(@Valid @RequestBody GovtInstituteRequest govtInstituteRequest) {
		Map<String, Object> map = new HashedMap<>();
		
		if (govtInstituteDetailsService.existsByDeapartmentEmailAndDeapartmentContactNo(
				Encryption.encString(govtInstituteRequest.getDeapartmentContactNo()),
				Encryption.encString(govtInstituteRequest.getDeapartmentEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_Phone_EMAIL);
			return map;
		}

		return govtInstituteDetailsService.addGovtInstitute(govtInstituteRequest);
	}

	@PostMapping("/findAllGovtInstituteDetail")
	public Map<String, Object> findAllGovtInstituteDetail(@Valid @RequestBody Pagination pagination) {
		return govtInstituteDetailsService.findAllGovtInstitute(pagination);
	}

	@GetMapping("/findGovtInstituteDetailById/{id}")
	public Map<String, Object> findGovtInstituteDetailById(@PathVariable Long id) {
		Map<String, Object> map = new HashedMap<>();

		if (!govtInstituteDetailsService.govtInstituteExist(id)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.GOVTINSTITUTEDETAILS_NOT_FOUND);
			return map;
		}
		return govtInstituteDetailsService.findByGovtInstituteId(id);
	}

	@PostMapping("/updateGovtInstituteDetailByIdById")
	public Map<String, Object> updateGovtInstituteDetailByIdById(
			@RequestBody @Valid GovtInstituteUpdateRequest govtInstituteRequest) {
		Map<String, Object> map = new HashedMap<>();
		if (govtInstituteDetailsService
				.existsByDeapartmentEmail(Encryption.encString(govtInstituteRequest.getDeapartmentEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.DEPARTMANT_EMAIL);
			return map;
		}
		if (govtInstituteDetailsService
				.existsByDeapartmentContactNo(Encryption.encString(govtInstituteRequest.getDeapartmentContactNo()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.DEPARTMANT_CONTACT);
			return map;
		}
		if (!govtInstituteDetailsService.govtInstituteExist(govtInstituteRequest.getGovtInstituteId())) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.GOVTINSTITUTEDETAILS_NOT_FOUND);
			return map;
		}

		return govtInstituteDetailsService.updateGovtInstituteById(govtInstituteRequest);
	}

	@GetMapping("/govtInstituteIsActive/{id}")
	public Map<String, Object> govtInstituteIsActive(@PathVariable Long id, @RequestParam("isActive") char isActive) {

		Map<String, Object> map = new HashedMap<>();
		if (!govtInstituteDetailsService.govtInstituteExist(id)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.GOVTINSTITUTEDETAILS_NOT_FOUND);
			return map;
		}
		return govtInstituteDetailsService.govtInstituteIsActive(id, isActive);
	}
		

	
	
}
