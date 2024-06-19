package com.example.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.controller.ResponseMessage;
import com.example.dto.MerchantResponse;
import com.example.encryption.Encryption;
import com.example.entity.Merchant;
import com.example.repo.MerchantRepository;
import com.example.request.MerchantUpdateRequest;
import com.example.request.MerchantsRequest;
import com.example.request.Pagination;
import com.example.service.MerchantServices;
import com.example.utils.ex.DateAndTime;

@Service
public class MerchantServicesImpl implements MerchantServices {

	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public Map<String, Object> addMerchant(MerchantsRequest merchantRequest) {
		Map<String, Object> map = new HashMap<>();

		try {
			
			Timestamp timestamp = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());
			Merchant merchant = new Merchant();
			merchant.setGovtId(merchantRequest.getGovtId());
			merchant.setMerchantMccCode(Encryption.encString(merchantRequest.getMerchantMccCode()));
			merchant.setMerchantEmail(Encryption.encString(merchantRequest.getMerchantEmail()));
			merchant.setMerchantMobile(Encryption.encString(merchantRequest.getMerchantMobileNo()));
			merchant.setMerchantAddress(Encryption.encString(merchantRequest.getMerchantAddress()));
			merchant.setMerchantBussinessName(Encryption.encString(merchantRequest.getMerchantBussinessName()));
			merchant.setMerchantCity(Encryption.encString(merchantRequest.getMerchantCity()));
			merchant.setMerchantState(Encryption.encString(merchantRequest.getMerchantState()));
			merchant.setMerchantPincode(Encryption.encString(merchantRequest.getMerchantPincode()));
			merchant.setMerchantPincode(Encryption.encString(merchantRequest.getMerchantPincode()));
			merchant.setAdditionalInfo1(Encryption.encString(merchantRequest.getAdditionalInfo1()));
			merchant.setAdditionalInfo2(Encryption.encString(merchantRequest.getAdditionalInfo2()));
			merchant.setMerchnatIsActive('Y');
			merchant.setMerchantCreationDate(timestamp);

			merchantRepository.save(merchant);
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_CREATED);

			return map;
		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
			return map;
		}
	}

	@Override
	public Boolean existsBymerchantEmail(String email) {

		return merchantRepository.existsByMerchantEmail(email);
	}

	@Override
	public Boolean existsBymerchantPhone(String phone) {

		return merchantRepository.existsByMerchantMobile(phone);
	}

	@Override
	public Boolean existsBymerchantEmailAndPhone(String merchantPhone, String merchantEmail) {

		return merchantRepository.existsByMerchantMobileAndMerchantEmail(merchantPhone, merchantEmail);
	}

	@Override
	public Map<String, Object> findAll(Pagination pagination) {

		List<Merchant> list = null;

		Map<String, Object> map = new HashMap<>();

		try {
			if (merchantRepository.findAll().stream().count() != 0) {

				Pageable pageable = PageRequest.of(pagination.getPageNo(), pagination.getPageSize());
				list = merchantRepository.findAllMerchant(pageable);

				List<MerchantResponse> listResponse = new ArrayList<>();

				for (Merchant merchant : list) {
					MerchantResponse merchantResponse = new MerchantResponse();
					merchantResponse.setMerchantId(merchant.getMerchantId());

					merchantResponse.setAdditionalInfo1(Encryption.decString(merchant.getAdditionalInfo1()));
					merchantResponse.setAdditionalInfo2(Encryption.decString(merchant.getAdditionalInfo2()));
					merchantResponse.setGovtId(merchant.getGovtId());
					merchantResponse.setMerchantBussinessName(Encryption.decString(merchant.getMerchantBussinessName()));
					merchantResponse.setMerchantEmail(Encryption.decString(merchant.getMerchantEmail()));
					merchantResponse.setMerchantMobileNo(Encryption.decString(merchant.getMerchantMobile()));
					merchantResponse.setMerchantMccCode(Encryption.decString(merchant.getMerchantMccCode()));
					merchantResponse.setMerchantAddress(Encryption.decString(merchant.getMerchantAddress()));
					merchantResponse.setMerchantCity(Encryption.decString(merchant.getMerchantCity()));
					merchantResponse.setMerchantState(Encryption.decString(merchant.getMerchantState()));
					merchantResponse.setMerchantPincode(Encryption.decString(merchant.getMerchantPincode()));
					listResponse.add(merchantResponse);
				}
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "merchants");
				map.put("merchantList", listResponse);
				map.put("totalRecords", merchantRepository.findAll().stream().count());
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.DATA_NOT_FOUND);
			}

		} catch (

		Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}

		return map;
	}

	@Override
	public Map<String, Object> findByMerchantId(Long id) {

		Optional<Merchant> merchant = merchantRepository.findById(id);
		Map<String, Object> map = new HashMap<>();
		MerchantResponse merchantResponse = new MerchantResponse();
		merchant.stream().forEach(p -> {
			merchantResponse.setMerchantId(p.getMerchantId());
			merchantResponse.setAdditionalInfo1(Encryption.decString(p.getAdditionalInfo1()));
			merchantResponse.setAdditionalInfo2(Encryption.decString(p.getAdditionalInfo2()));
			merchantResponse.setGovtId(p.getGovtId());
			merchantResponse.setMerchantBussinessName(Encryption.decString(p.getMerchantBussinessName()));
			merchantResponse.setMerchantEmail(Encryption.decString(p.getMerchantEmail()));
			merchantResponse.setMerchantMobileNo(Encryption.decString(p.getMerchantMobile()));
			merchantResponse.setMerchantMccCode(Encryption.decString(p.getMerchantMccCode()));
			merchantResponse.setMerchantAddress(Encryption.decString(p.getMerchantAddress()));
			merchantResponse.setMerchantCity(Encryption.decString(p.getMerchantCity()));
			merchantResponse.setMerchantState(Encryption.decString(p.getMerchantState()));
			merchantResponse.setMerchantPincode(Encryption.decString(p.getMerchantPincode()));
		});

		map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
		map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
		map.put(ResponseMessage.DESCRIPTION, "Merchant");
		map.put("merchantList", merchantResponse);

		return map;
	}

	@Override
	public Map<String, Object> updateMerchantById(MerchantUpdateRequest merchantsRequest) {

		Optional<Merchant> merchant = merchantRepository.findById(merchantsRequest.getMerchantId());

		merchant.stream().forEach(p -> {
			p.setMerchantId(p.getMerchantId());
			p.setAdditionalInfo1(Encryption.encString(merchantsRequest.getAdditionalInfo1()));
			p.setAdditionalInfo2(Encryption.encString(merchantsRequest.getAdditionalInfo2()));
			p.setGovtId(merchantsRequest.getGovtId());
			p.setMerchantEmail(Encryption.encString(merchantsRequest.getMerchantEmail()));
			p.setMerchantMobile(Encryption.encString(merchantsRequest.getMerchantMobileNo()));
			p.setMerchantMccCode(Encryption.encString(merchantsRequest.getMerchantMccCode()));
			p.setMerchantBussinessName(Encryption.encString(merchantsRequest.getMerchantBussinessName()));
			p.setMerchantAddress(Encryption.encString(merchantsRequest.getMerchantAddress()));
			p.setMerchantCity(Encryption.encString(merchantsRequest.getMerchantCity()));
			p.setMerchantState(Encryption.encString(merchantsRequest.getMerchantState()));
			p.setMerchantPincode(Encryption.encString(merchantsRequest.getMerchantPincode()));
			
			merchantRepository.save(p);
		});

		Map<String, Object> map = new HashMap<>();
		map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
		map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
		map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_UPDATED);
		return map;
	}

	@Override
	public Boolean MerchantExist(Long id) {
		return merchantRepository.existsByMerchantId(id);

	}

	@Override
	public Map<String, Object> MerchantIsActive(Long id, char isActive) {

		Map<String, Object> map = new HashMap<>();
		try {
			Merchant merchantDetails = merchantRepository.findById(id).get();

			if (isActive == 'Y') {
				merchantDetails.setMerchnatIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_ACTIVATED);
			} else if (isActive == 'N') {
				merchantDetails.setMerchnatIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.MERCHANT_DEACTIVATED);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.ACTIVE_DEACTVIE_ELSE);
			}

			merchantRepository.save(merchantDetails);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage().toString());
		}
		return map;

	}

}
