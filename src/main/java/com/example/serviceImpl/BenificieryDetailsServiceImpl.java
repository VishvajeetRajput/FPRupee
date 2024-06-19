package com.example.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.controller.ResponseMessage;
import com.example.dto.BenificieryDetailsPayLoad;
import com.example.encryption.Encryption;
import com.example.entity.BenificieryDetails;
import com.example.repo.BenificieryDetailsRepository;
import com.example.request.BenificieryRequest;
import com.example.request.BenificieryUpdateRequest;
import com.example.request.Pagination;
import com.example.service.BenificieryDetailsService;
import com.example.utils.ex.DateAndTime;

@Service
public class BenificieryDetailsServiceImpl implements BenificieryDetailsService {

	@Autowired
	private BenificieryDetailsRepository benificieryDetailsRepository;

	@Override
	public Map<String, Object> addBenificiery(@Valid BenificieryRequest benificieryRequest) {
		Map<String, Object> map = new HashMap<>();
		try {

			

			Timestamp timestamp = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());

			BenificieryDetails benificieryDetails = new BenificieryDetails();
			benificieryDetails.setAdditionInfo1(Encryption.encString(benificieryRequest.getAdditionInfo1()));
			benificieryDetails.setAdditionInfo2(Encryption.encString(benificieryRequest.getAdditionInfo2()));
			benificieryDetails.setBenificieryAddress(Encryption.encString(benificieryRequest.getBenificieryAddress()));
			benificieryDetails.setBenificieryCity(Encryption.encString(benificieryRequest.getBenificieryCity()));
			benificieryDetails.setBenificieryEmail(Encryption.encString(benificieryRequest.getBenificieryEmail()));
			benificieryDetails.setBenificieryMobileNo(Encryption.encString(benificieryRequest.getBenificieryMobileNo()));
			benificieryDetails.setBenificieryName(Encryption.encString(benificieryRequest.getBenificieryName()));
			benificieryDetails.setBenificieryPincode(Encryption.encString(benificieryRequest.getBenificieryPincode()));
			benificieryDetails.setBenificieryState(Encryption.encString(benificieryRequest.getBenificieryState()));
			benificieryDetails.setCreationDate(timestamp);
			benificieryDetails.setBenificieryIsActive('1');
			benificieryDetails = benificieryDetailsRepository.save(benificieryDetails);

			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery added successfully");
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}

		return map;
	}

	@Override
	public Map<String, Object> updateBenificiery(@Valid BenificieryUpdateRequest benificieryUpdateRequest) {
		Map<String, Object> map = new HashMap<>();
		try {

			BenificieryDetails benificieryDetails = benificieryDetailsRepository
					.findById(benificieryUpdateRequest.getBenificieryId()).get();

			benificieryDetails.setAdditionInfo1(Encryption.encString(benificieryUpdateRequest.getAdditionInfo1()));
			benificieryDetails.setAdditionInfo2(Encryption.encString(benificieryUpdateRequest.getAdditionInfo2()));
			benificieryDetails
					.setBenificieryAddress(Encryption.encString(benificieryUpdateRequest.getBenificieryAddress()));
			benificieryDetails.setBenificieryCity(Encryption.encString(benificieryUpdateRequest.getBenificieryCity()));
			benificieryDetails
					.setBenificieryEmail(Encryption.encString(benificieryUpdateRequest.getBenificieryEmail()));
			benificieryDetails
					.setBenificieryMobileNo(Encryption.encString(benificieryUpdateRequest.getBenificieryMobileNo()));
			benificieryDetails.setBenificieryName(Encryption.encString(benificieryUpdateRequest.getBenificieryName()));
			benificieryDetails
					.setBenificieryPincode(Encryption.encString(benificieryUpdateRequest.getBenificieryPincode()));
			benificieryDetails
					.setBenificieryState(Encryption.encString(benificieryUpdateRequest.getBenificieryState()));
			benificieryDetails = benificieryDetailsRepository.save(benificieryDetails);

			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery update successfully");

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}

		return map;
	}

	@Override
	public Map<String, Object> benificieryList(@Valid Pagination pagination) {
		Map<String, Object> map = new HashMap<>();
		List<BenificieryDetailsPayLoad> benificieryList = new ArrayList<BenificieryDetailsPayLoad>();
		try {
			List<BenificieryDetails> list = null;
			int totalRecords = 0;

			Pageable pageable = PageRequest.of(pagination.getPageNo(), pagination.getPageSize());

			list = benificieryDetailsRepository.findAllBenificieries(pageable);

			if (list.size() != 0) {

				totalRecords = benificieryDetailsRepository.totalBenificieriesRecords();

				for (BenificieryDetails benificieryDetails : list) {
					BenificieryDetailsPayLoad payLoad = new BenificieryDetailsPayLoad();
					payLoad.setAdditionInfo1(Encryption.decString(benificieryDetails.getAdditionInfo1()));
					payLoad.setAdditionInfo2(Encryption.decString(benificieryDetails.getAdditionInfo2()));
					payLoad.setBenificieryAddress(Encryption.decString(benificieryDetails.getBenificieryAddress()));
					payLoad.setBenificieryCity(Encryption.decString(benificieryDetails.getBenificieryCity()));
					payLoad.setBenificieryEmail(Encryption.decString(benificieryDetails.getBenificieryEmail()));
					payLoad.setBenificieryId(benificieryDetails.getBenificieryId());
					payLoad.setBenificieryMobileNo(Encryption.decString(benificieryDetails.getBenificieryMobileNo()));
					payLoad.setBenificieryName(Encryption.decString(benificieryDetails.getBenificieryName()));
					payLoad.setBenificieryPincode(Encryption.decString(benificieryDetails.getBenificieryPincode()));
					payLoad.setBenificieryState(Encryption.decString(benificieryDetails.getBenificieryState()));
					payLoad.setCreationDate(benificieryDetails.getCreationDate().toString());
					payLoad.setBenificieryIsActive(benificieryDetails.getBenificieryIsActive());
					benificieryList.add(payLoad);
				}

				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "Benificiery list");
				map.put("benificieryList", benificieryList);
				map.put("totalRecords", totalRecords);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data not available");
			}

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}
		return map;
	}

	@Override
	public Map<String, Object> benificieryDetailsByBenificieryId(@Valid Long benificieryId) {
		Map<String, Object> map = new HashMap<>();
		try {

			BenificieryDetails benificieryDetails = benificieryDetailsRepository.findById(benificieryId).get();

			BenificieryDetailsPayLoad payLoad = new BenificieryDetailsPayLoad();
			payLoad.setAdditionInfo1(Encryption.decString(benificieryDetails.getAdditionInfo1()));
			payLoad.setAdditionInfo2(Encryption.decString(benificieryDetails.getAdditionInfo2()));
			payLoad.setBenificieryAddress(Encryption.decString(benificieryDetails.getBenificieryAddress()));
			payLoad.setBenificieryCity(Encryption.decString(benificieryDetails.getBenificieryCity()));
			payLoad.setBenificieryEmail(Encryption.decString(benificieryDetails.getBenificieryEmail()));
			payLoad.setBenificieryId(benificieryDetails.getBenificieryId());
			payLoad.setBenificieryMobileNo(Encryption.decString(benificieryDetails.getBenificieryMobileNo()));
			payLoad.setBenificieryName(Encryption.decString(benificieryDetails.getBenificieryName()));
			payLoad.setBenificieryPincode(Encryption.decString(benificieryDetails.getBenificieryPincode()));
			payLoad.setBenificieryState(Encryption.decString(benificieryDetails.getBenificieryState()));
			payLoad.setCreationDate(benificieryDetails.getCreationDate().toString());
			payLoad.setBenificieryIsActive(benificieryDetails.getBenificieryIsActive());

			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "Benificiery details");
			map.put("benificieryDetails", payLoad);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}
		return map;
	}

	@Override
	public Map<String, Object> benificieryIsActive(@Valid Long benificieryId, char isActive) {
		Map<String, Object> map = new HashMap<>();
		try {
			BenificieryDetails benificieryDetails = benificieryDetailsRepository.findById(benificieryId).get();

			if (isActive == 'Y') {
				benificieryDetails.setBenificieryIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_ACTIVATED);
			} else if (isActive == 'N') {
				benificieryDetails.setBenificieryIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_DEACTIVATED);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.ACTIVE_DEACTVIE_ELSE);
			}

			benificieryDetails = benificieryDetailsRepository.save(benificieryDetails);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage().toString());
		}
		return map;

	}

}
