package com.example.controller;

import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.encryption.Encryption;
import com.example.request.MerchantUpdateRequest;
import com.example.request.MerchantsRequest;
import com.example.request.Pagination;
import com.example.service.MerchantServices;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	private MerchantServices merchantServices;

	@PostMapping("/saveMerchant")
	public Map<String, Object> saveMerchant(@Valid @RequestBody MerchantsRequest merchantsRequest) {
		Map<String, Object> map = new HashedMap<>();
		if (merchantServices.existsBymerchantEmail(Encryption.encString(merchantsRequest.getMerchantEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_EMAIL);
			return map;
		}
		if (merchantServices.existsBymerchantPhone(Encryption.encString(merchantsRequest.getMerchantMobileNo()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_Phone);
			return map;
		}
		if (merchantServices.existsBymerchantEmailAndPhone(Encryption.encString(merchantsRequest.getMerchantMobileNo()),
				Encryption.encString(merchantsRequest.getMerchantEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_Phone_EMAIL);
			return map;
		}

		return merchantServices.addMerchant(merchantsRequest);
	}

	@PostMapping("/findAllMerchant")
	public Map<String, Object> findAllMerchant(@Valid @RequestBody Pagination pagination) {
		return merchantServices.findAll(pagination);
	}

	@GetMapping("/findMerchantById/{id}")
	public Map<String, Object> findMerchantById(@PathVariable Long id) {
		Map<String, Object> map = new HashedMap<>();

		if (!merchantServices.MerchantExist(id)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_NOT_FOUND);
			return map;
		}
		return merchantServices.findByMerchantId(id);
	}

	@PostMapping("/updateMerchantById")
	public Map<String, Object> updateById(@RequestBody @Valid MerchantUpdateRequest merchantsRequest) {
		Map<String, Object> map = new HashedMap<>();
		if (merchantServices.existsBymerchantEmail(Encryption.encString(merchantsRequest.getMerchantEmail()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_EMAIL);
			return map;
		}
		if (merchantServices.existsBymerchantPhone(Encryption.encString(merchantsRequest.getMerchantMobileNo()))) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_Phone);
			return map;
		}
		if (!merchantServices.MerchantExist(merchantsRequest.getMerchantId())) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_NOT_FOUND);
			return map;
		}

		return merchantServices.updateMerchantById(merchantsRequest);
	}
	
	@GetMapping("/merchantIsActive/{id}")
	public Map<String, Object> merchantIsActive(@PathVariable Long id,@RequestParam("isActive") char isActive) {
		
		
		Map<String, Object> map = new HashedMap<>();
		if (!merchantServices.MerchantExist(id)) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery does not exist");
			return map;
		}
		return merchantServices.MerchantIsActive(id, isActive);
	}
	
		
}
