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
import com.example.repo.BenificieryDetailsRepository;
import com.example.request.BenificieryRequest;
import com.example.request.BenificieryUpdateRequest;
import com.example.request.Pagination;
import com.example.service.BenificieryDetailsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/benificiery")
public class BenificieryDetailsController {

	@Autowired
	private BenificieryDetailsService benificieryDetailsService;

	@Autowired
	private BenificieryDetailsRepository benificieryDetailsRepository;

	@PostMapping("/addBenificiery")
	public Map<String, Object> addBenificiery(@Valid @RequestBody BenificieryRequest benificieryRequest)
			throws Exception {

		System.out.println(benificieryRequest.getBenificieryEmail());

		return benificieryDetailsService.addBenificiery(benificieryRequest);
	}

	@PutMapping("/updateBenificiery")
	public Map<String, Object> updateBenificiery(@Valid @RequestBody BenificieryUpdateRequest benificieryUpdateRequest)
			throws Exception {
		Map<String, Object> map = new HashedMap<>();

		if (!benificieryDetailsRepository.existsByBenificieryId(benificieryUpdateRequest.getBenificieryId())) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery does not exist");
			return map;
		}
		if (benificieryDetailsRepository
				.existsByBenificieryMobileNo(Encryption.encString(benificieryUpdateRequest.getBenificieryMobileNo()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery mobile number already registered");
			return map;
		}
		if (benificieryDetailsRepository
				.existsByBenificieryEmail(Encryption.encString(benificieryUpdateRequest.getBenificieryEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery email already registered");
			return map;
		}
		if (benificieryDetailsRepository.existsByBenificieryMobileNoAndBenificieryEmail(
				Encryption.encString(benificieryUpdateRequest.getBenificieryMobileNo()),
				Encryption.encString(benificieryUpdateRequest.getBenificieryEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery mobile number and email already registered");
			return map;
		}

		return benificieryDetailsService.updateBenificiery(benificieryUpdateRequest);
	}

	@PostMapping("/benificieryList")
	public Map<String, Object> benificieryList(@Valid @RequestBody Pagination pagination) throws Exception {
		return benificieryDetailsService.benificieryList(pagination);
	}

	@GetMapping("/benificieryDetailsByBenificieryId")
	public Map<String, Object> benificieryDetailsByBenificieryId(
			 ) {
		
		System.out.println("hey");
			return Map.of();
		
	}

	@GetMapping("/benificieryIsActive")
	public Map<String, Object> benificieryIsActive(@Valid @RequestParam("benificieryId") Long benificieryId,
			@RequestParam("isActive") char isActive) throws Exception {
		Map<String, Object> map = new HashedMap<>();
		if (!benificieryDetailsRepository.existsByBenificieryId(benificieryId)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery does not exist");
			return map;
		}
		return benificieryDetailsService.benificieryIsActive(benificieryId, isActive);
	}

}
