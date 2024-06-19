package com.example.controller;

import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.encryption.Encryption;
import com.example.repo.IssuerDetailsRepository;
import com.example.request.IssuerRequest;
import com.example.request.IssuerUpdateRequest;
import com.example.request.Pagination;
import com.example.service.IssuerDetailsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/issuer")
public class IssuerDetailsController {

	@Autowired
	private IssuerDetailsService issuerDetailsService;

	@Autowired
	private IssuerDetailsRepository issuerDetailsRepository;

	@PostMapping("/addIssuer")
	public Map<String, Object> addIssuer(@Valid @RequestBody IssuerRequest issuerRequest) throws Exception {
		Map<String, Object> map = new HashedMap<>();
		if (issuerDetailsRepository.existsByIssuerPhone(Encryption.encString(issuerRequest.getIssuerPhone()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.Issuer_CONTACT);
			return map;

		}
		if (issuerDetailsRepository.existsByIssuerEmail(Encryption.encString(issuerRequest.getIssuerEmail()))) {

			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.Issuer_EMAIL);
			return map;
		}
		if (issuerDetailsRepository.existsByIssuerPhoneAndIssuerEmail(
				Encryption.encString(issuerRequest.getIssuerPhone()),
				Encryption.encString(issuerRequest.getIssuerEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerD_CONTACT_EMAIL);
			return map;
		}

		return issuerDetailsService.addIssuer(issuerRequest);

	}

	@GetMapping("/issuerDetailsByIssuerId")
	public Map<String, Object> issuerDetailsByIssuerId(@Valid @RequestParam("issuerId") Long issuerId)
			throws Exception {
		Map<String, Object> map = new HashedMap<>();
		if (!issuerDetailsRepository.existsById(issuerId)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerDetails_NOT_FOUND);
			return map;
		}
		return issuerDetailsService.issuerDetailsByIssuerId(issuerId);

	}

	@PutMapping("/issuerUpdate")
	public Map<String, Object> issuerUpdate(@Valid @RequestBody IssuerUpdateRequest issuerUpdateRequest)
			throws Exception {
		Map<String, Object> map = new HashedMap<>();

		if (!issuerDetailsRepository.existsByIssuerId(issuerUpdateRequest.getIssuerId())) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerDetails_NOT_FOUND);
			return map;
		}
		if (issuerDetailsRepository.existsByIssuerPhone(Encryption.encString(issuerUpdateRequest.getIssuerPhone()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Issuer phone number already registered");
			return map;
		}
		if (issuerDetailsRepository.existsByIssuerEmail(Encryption.encString(issuerUpdateRequest.getIssuerEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Issuer email already registered");
			return map;
		}
		if (issuerDetailsRepository.existsByIssuerPhoneAndIssuerEmail(
				Encryption.encString(issuerUpdateRequest.getIssuerPhone()),
				Encryption.encString(issuerUpdateRequest.getIssuerEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerD_CONTACT_EMAIL);
			return map;
		}

		return issuerDetailsService.issuerUpdate(issuerUpdateRequest);

	}

	@GetMapping("/issuerIsActive")
	public Map<String, Object> issuerIsActive(@Valid @RequestParam("issuerId") Long issuerId,
			@RequestParam("isActive") char isActive) throws Exception {
		Map<String, Object> map = new HashedMap<>();

		if (!issuerDetailsRepository.existsById(issuerId)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerDetails_NOT_FOUND);
			return map;
		}
		return issuerDetailsService.issuerIsActive(issuerId, isActive);

	}
	
	@PostMapping("/issuerList")
	public Map<String, Object> issuerList(@Valid @RequestBody Pagination pagination) throws Exception {
		return issuerDetailsService.issuerList(pagination);
	}

	@PostMapping("/issuerDATAWithDate")
	public Map<String, Object> issuerDATAWithDate(@RequestParam(name = "from") String from ,@RequestParam(name = "to") String to ){
		return issuerDetailsService.issuerDATAWithDate(from, to); 
	}
	
}
