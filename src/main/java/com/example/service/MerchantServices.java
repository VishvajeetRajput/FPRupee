package com.example.service;

import java.util.Map;

import com.example.request.MerchantUpdateRequest;
import com.example.request.MerchantsRequest;
import com.example.request.Pagination;

public interface MerchantServices {

	Map<String, Object> addMerchant( MerchantsRequest merchantRequest);

	Boolean existsBymerchantEmail(String merchantEmail);

	Boolean existsBymerchantPhone(String merchantPhone);

	Boolean existsBymerchantEmailAndPhone(String merchantPhone, String merchantEmail);

	Map<String, Object> findAll(Pagination pagination);

	Map<String, Object> findByMerchantId(Long id);

	Map<String ,Object> updateMerchantById(MerchantUpdateRequest MerchantsRequest);

	Boolean MerchantExist(Long id);
	
	 Map<String, Object> MerchantIsActive( Long id,char isActive) ;
}
