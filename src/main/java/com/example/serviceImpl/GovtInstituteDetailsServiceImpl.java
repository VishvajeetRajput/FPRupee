package com.example.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dto.GovtInstituteResponse;
import com.example.encryption.Encryption;
import com.example.entity.GovtInstituteDetails;
import com.example.repo.GovtInstituteDetailsRepository;
import com.example.request.GovtInstituteRequest;
import com.example.request.GovtInstituteUpdateRequest;
import com.example.request.Pagination;
import com.example.service.GovtInstituteDetailsService;
import com.example.utils.ex.DateAndTime;
import com.example.controller.*;

@Service
public class GovtInstituteDetailsServiceImpl implements GovtInstituteDetailsService {

	@Autowired
	private GovtInstituteDetailsRepository govtInstituteDetailsRepository;

	@Override
	public Map<String, Object> addGovtInstitute(GovtInstituteRequest GovtInstituteRequest) {

		Map<String, Object> map = new HashMap<>();
		try {

			Timestamp timestamp = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());
			GovtInstituteDetails govtInstituteDetails = new GovtInstituteDetails();

			govtInstituteDetails.setDeapartmentName(Encryption.encString(GovtInstituteRequest.getDeapartmentName()));
			govtInstituteDetails.setDeapartmentEmail(Encryption.encString(GovtInstituteRequest.getDeapartmentEmail()));
			govtInstituteDetails
					.setDeapartmentContactNo(Encryption.encString(GovtInstituteRequest.getDeapartmentContactNo()));
			govtInstituteDetails
					.setDeapartmentPassword(Encryption.encString(GovtInstituteRequest.getDeapartmentPassword()));
			govtInstituteDetails.setCreationDate(timestamp);
			govtInstituteDetails
					.setDepartmentAddress(Encryption.encString(GovtInstituteRequest.getDepartmentAddress()));
			govtInstituteDetails.setDepartmentCity(Encryption.encString(GovtInstituteRequest.getDepartmentCity()));
			govtInstituteDetails.setDepartmentState(Encryption.encString(GovtInstituteRequest.getDepartmentState()));
			govtInstituteDetails
					.setDepartmentPincode(Encryption.encString(GovtInstituteRequest.getDepartmentPincode()));
			govtInstituteDetails.setGovtInstituteIsActive('Y');

			govtInstituteDetailsRepository.save(govtInstituteDetails);
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, ResponseMessage.GOVTINSTITUTEDETAILS);

			return map;

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
			return map;
		}
	}

	@Override
	public Boolean existsByDeapartmentEmail(String deapartmentEmail) {
		return govtInstituteDetailsRepository.existsByDeapartmentEmail(deapartmentEmail);
	}

	@Override
	public Boolean existsByDeapartmentContactNo(String deapartmentContactNo) {
		return govtInstituteDetailsRepository.existsByDeapartmentContactNo(deapartmentContactNo);
	}

	@Override
	public Boolean existsByDeapartmentEmailAndDeapartmentContactNo(String deapartmentContactNo,
			String deapartmentEmail) {

		Object dd = govtInstituteDetailsRepository.findAll().stream().filter(
				p -> p.getDeapartmentEmail() == deapartmentEmail && p.getDeapartmentContactNo() == deapartmentContactNo).count();

		System.out.println("dddddddddd   " + dd);

		return govtInstituteDetailsRepository.existsByDeapartmentContactNoAndDeapartmentEmail(deapartmentContactNo,
				deapartmentEmail);

	}
	
	@Override
	public Map<String, Object> findAllGovtInstitute(Pagination pagination) {

		List<GovtInstituteDetails> list = null;

		Map<String, Object> map = new HashMap<>();

		try {
			if (govtInstituteDetailsRepository.findAll().stream().count() != 0) {

				Pageable pageable = PageRequest.of(pagination.getPageNo(), pagination.getPageSize());
				list = govtInstituteDetailsRepository.findAllInstitute(pageable);

				List<GovtInstituteResponse> listResponse = new ArrayList<>();

				for (GovtInstituteDetails govtInstitute : list) {
					GovtInstituteResponse govtInstituteDetails = new GovtInstituteResponse();
					govtInstituteDetails.setGovtInstituteId(govtInstitute.getGovtInstituteId());
					govtInstituteDetails.setDeapartmentName(Encryption.decString(govtInstitute.getDeapartmentName()));
					govtInstituteDetails.setDeapartmentEmail(Encryption.decString(govtInstitute.getDeapartmentEmail()));
					govtInstituteDetails
							.setDeapartmentContactNo(Encryption.decString(govtInstitute.getDeapartmentContactNo()));
					govtInstituteDetails
							.setDeapartmentPassword(Encryption.decString(govtInstitute.getDeapartmentPassword()));
					govtInstituteDetails.setCreationDate(govtInstitute.getCreationDate());
					govtInstituteDetails
							.setDepartmentAddress(Encryption.decString(govtInstitute.getDepartmentAddress()));
					govtInstituteDetails.setDepartmentCity(Encryption.decString(govtInstitute.getDepartmentCity()));
					govtInstituteDetails.setDepartmentState(Encryption.decString(govtInstitute.getDepartmentState()));
					govtInstituteDetails
							.setDepartmentPincode(Encryption.decString(govtInstitute.getDepartmentPincode()));

					listResponse.add(govtInstituteDetails);
				}
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "govtInstituteDetails");
				map.put("merchantList", listResponse);
				map.put("totalRecords", govtInstituteDetailsRepository.findAll().stream().count());
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data not available");
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
	public Map<String, Object> findByGovtInstituteId(Long id) {

		Optional<GovtInstituteDetails> govtInstituteDetails = govtInstituteDetailsRepository.findById(id);
		Map<String, Object> map = new HashMap<>();

		GovtInstituteResponse govtInstituteResponse = new GovtInstituteResponse();

		govtInstituteDetails.stream().forEach(p -> {
			govtInstituteResponse.setGovtInstituteId(p.getGovtInstituteId());
			govtInstituteResponse.setDeapartmentName(Encryption.decString(p.getDeapartmentName()));
			govtInstituteResponse.setDeapartmentEmail(Encryption.decString(p.getDeapartmentEmail()));
			govtInstituteResponse.setDeapartmentContactNo(Encryption.decString(p.getDeapartmentContactNo()));
			govtInstituteResponse.setDeapartmentPassword(Encryption.decString(p.getDeapartmentPassword()));
			govtInstituteResponse.setCreationDate(p.getCreationDate());
			govtInstituteResponse.setDepartmentAddress(Encryption.decString(p.getDepartmentAddress()));
			govtInstituteResponse.setDepartmentCity(Encryption.decString(p.getDepartmentCity()));
			govtInstituteResponse.setDepartmentState(Encryption.decString(p.getDepartmentState()));
			govtInstituteResponse.setDepartmentPincode(Encryption.decString(p.getDepartmentPincode()));

		});
		map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
		map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
		map.put(ResponseMessage.DESCRIPTION, "Merchant");
		map.put("merchantList", govtInstituteResponse);
		return map;
	}

	@Override
	public Map<String, Object> updateGovtInstituteById(GovtInstituteUpdateRequest govtInstituteRequest) {

		Optional<GovtInstituteDetails> govtInstituteDetail = govtInstituteDetailsRepository
				.findById(govtInstituteRequest.getGovtInstituteId());
		Map<String, Object> map = new HashMap<>();

		govtInstituteDetail.stream().forEach(p -> {
			p.setDeapartmentName(Encryption.encString(govtInstituteRequest.getDeapartmentName()));
			p.setDeapartmentEmail(Encryption.encString(govtInstituteRequest.getDeapartmentEmail()));
			p.setDeapartmentContactNo(Encryption.encString(govtInstituteRequest.getDeapartmentContactNo()));
			p.setDeapartmentPassword(Encryption.encString(govtInstituteRequest.getDeapartmentPassword()));
			p.setDepartmentAddress(Encryption.encString(govtInstituteRequest.getDepartmentAddress()));
			p.setDepartmentCity(Encryption.encString(govtInstituteRequest.getDepartmentCity()));
			p.setDepartmentState(Encryption.encString(govtInstituteRequest.getDepartmentState()));
			p.setDepartmentPincode(Encryption.encString(govtInstituteRequest.getDepartmentPincode()));

			govtInstituteDetailsRepository.save(p);

		});

		map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
		map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
		map.put(ResponseMessage.DESCRIPTION, ResponseMessage.GOVTINSTITUTEDETAILS_UPDATED);
		return map;

	}

	@Override
	public Boolean govtInstituteExist(Long id) {

		return govtInstituteDetailsRepository.existsByGovtInstituteId(id);
	}

	@Override
	public Map<String, Object> govtInstituteIsActive(Long id, char isActive) {
		Map<String, Object> map = new HashMap<>();
		try {
			GovtInstituteDetails GovtInstituteDetails = govtInstituteDetailsRepository.findById(id).get();

			if (isActive == 'Y') {
				GovtInstituteDetails.setGovtInstituteIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_ACTIVATED);
			} else if (isActive == 'N') {
				GovtInstituteDetails.setGovtInstituteIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_DEACTIVATED);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.ACTIVE_DEACTVIE_ELSE);
			}

			govtInstituteDetailsRepository.save(GovtInstituteDetails);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage().toString());
		}
		return map;
	}

}
