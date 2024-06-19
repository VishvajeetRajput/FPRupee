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
import com.example.dto.IssuerDetailsPayLoad;
import com.example.encryption.Encryption;
import com.example.entity.IssuerDetails;
import com.example.repo.IssuerDetailsRepository;
import com.example.request.IssuerRequest;
import com.example.request.IssuerUpdateRequest;
import com.example.request.Pagination;
import com.example.service.IssuerDetailsService;
import com.example.utils.ex.DateAndTime;

@Service
public class IssuerDetailsServiceImpl implements IssuerDetailsService {

	@Autowired
	private IssuerDetailsRepository issuerDetailsRepository;

	@Override
	public Map<String, Object> addIssuer(@Valid IssuerRequest issuerRequest) {
		Map<String, Object> map = new HashMap<>();
		try {

			Timestamp timestamp = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());

			IssuerDetails IssuerDetails = new IssuerDetails();
			IssuerDetails.setIssuerAddress(Encryption.encString(issuerRequest.getIssuerAddress()));
			IssuerDetails.setIssuerCity(Encryption.encString(issuerRequest.getIssuerCity()));
			IssuerDetails.setIssuerEmail(Encryption.encString(issuerRequest.getIssuerEmail()));
			IssuerDetails.setIssuerPhone(Encryption.encString(issuerRequest.getIssuerPhone()));
			IssuerDetails.setIssuerName(Encryption.encString(issuerRequest.getIssuerName()));
			IssuerDetails.setIssuerPincode(Encryption.encString(issuerRequest.getIssuerPincode()));
			IssuerDetails.setIssuerState(Encryption.encString(issuerRequest.getIssuerState()));
			IssuerDetails.setIssuerBusinessName(Encryption.encString(issuerRequest.getIssuerBusinessName()));
			IssuerDetails.setCreationDate(timestamp);
			IssuerDetails.setIssuerIsActive('Y');
			issuerDetailsRepository.save(IssuerDetails);

			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "Issuer added successfully");
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}

		return map;
	}

	@Override
	public Map<String, Object> issuerDetailsByIssuerId(@Valid Long issuerId) {
		Map<String, Object> map = new HashMap<>();
		try {
			
			IssuerDetails IssuerDetails = issuerDetailsRepository.findById(issuerId).get();
			IssuerDetailsPayLoad payLoad = new IssuerDetailsPayLoad();
			payLoad.setIssuerId(IssuerDetails.getIssuerId());
			payLoad.setIssuerAddress(Encryption.decString(IssuerDetails.getIssuerAddress()));
			payLoad.setIssuerEmail(Encryption.decString(IssuerDetails.getIssuerEmail()));
			payLoad.setIssuerName(Encryption.decString(IssuerDetails.getIssuerName()));
			payLoad.setIssuerPhone(Encryption.decString(IssuerDetails.getIssuerPhone()));
			payLoad.setIssuerBusinessName(Encryption.decString(IssuerDetails.getIssuerBusinessName()));
			payLoad.setIssuerCity(Encryption.decString(IssuerDetails.getIssuerCity()));
			payLoad.setIssuerState(Encryption.decString(IssuerDetails.getIssuerState()));
			payLoad.setIssuerPincode(Encryption.decString(IssuerDetails.getIssuerPincode()));

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
	public Map<String, Object> issuerUpdate(@Valid IssuerUpdateRequest issuerUpdateRequest) {
		Map<String, Object> map = new HashMap<>();
		try {

			IssuerDetails IssuerDetails = issuerDetailsRepository.findById(issuerUpdateRequest.getIssuerId()).get();

			IssuerDetails.setIssuerAddress(Encryption.encString(issuerUpdateRequest.getIssuerAddress()));
			IssuerDetails.setIssuerCity(Encryption.encString(issuerUpdateRequest.getIssuerCity()));
			IssuerDetails.setIssuerEmail(Encryption.encString(issuerUpdateRequest.getIssuerEmail()));
			IssuerDetails.setIssuerPhone(Encryption.encString(issuerUpdateRequest.getIssuerPhone()));
			IssuerDetails.setIssuerName(Encryption.encString(issuerUpdateRequest.getIssuerName()));
			IssuerDetails.setIssuerPincode(Encryption.encString(issuerUpdateRequest.getIssuerPincode()));
			IssuerDetails.setIssuerState(Encryption.encString(issuerUpdateRequest.getIssuerState()));
			IssuerDetails.setIssuerBusinessName(Encryption.encString(issuerUpdateRequest.getIssuerBusinessName()));
			issuerDetailsRepository.save(IssuerDetails);

			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "Issuer added successfully");
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}

		return map;
	}

	@Override
	public Map<String, Object> issuerIsActive(@Valid Long issuerId, char isActive) {
		Map<String,Object> map = new HashMap<>();
		try {
			IssuerDetails IssuerDetails= issuerDetailsRepository.findById(issuerId).get();
			if (isActive == 'Y') {
				IssuerDetails.setIssuerIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_ACTIVATED);
			} else if (isActive == 'N') {
				IssuerDetails.setIssuerIsActive(isActive);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.BENIFICIERY_DEACTIVATED);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.ACTIVE_DEACTVIE_ELSE);
			}

			IssuerDetails = issuerDetailsRepository.save(IssuerDetails);

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage().toString());
		}
		
		
		return map;
	}

	@Override
	public Map<String, Object> issuerList(@Valid Pagination pagination) {
		Map<String ,Object> map = new HashMap<>();
		List<IssuerDetailsPayLoad> issuerList = new ArrayList<IssuerDetailsPayLoad>();
		try {
			List<IssuerDetails> list = null;
			int totalRecords = 0;

			Pageable pageable = PageRequest.of(pagination.getPageNo(), pagination.getPageSize());

			list = issuerDetailsRepository.findAllIssuer(pageable);

			if (list.size() != 0) {

				totalRecords = issuerDetailsRepository.totalIssueriesRecords();

				for (IssuerDetails IssuerDetails : list) {
					IssuerDetailsPayLoad payLoad = new IssuerDetailsPayLoad();
			
					payLoad.setIssuerAddress(Encryption.decString(IssuerDetails.getIssuerAddress()));
					payLoad.setIssuerCity(Encryption.decString(IssuerDetails.getIssuerCity()));
					payLoad.setIssuerEmail(Encryption.decString(IssuerDetails.getIssuerEmail()));
					payLoad.setIssuerId(IssuerDetails.getIssuerId());
					payLoad.setIssuerPhone(Encryption.decString(IssuerDetails.getIssuerPhone()));
					payLoad.setIssuerName(Encryption.decString(IssuerDetails.getIssuerName()));
					payLoad.setIssuerPincode(Encryption.decString(IssuerDetails.getIssuerPincode()));
					payLoad.setIssuerState(Encryption.decString(IssuerDetails.getIssuerState()));
					payLoad.setIssuerBusinessName(Encryption.decString(IssuerDetails.getIssuerBusinessName()));
					
					issuerList.add(payLoad);
				}

				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "issuerDetail list");
				map.put("issuerDetail", issuerList);
				map.put("totalRecords", totalRecords);
				
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, ResponseMessage.IssuerDetails_NOT_FOUND);
			}

		} catch (Exception e) {
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, e.getMessage());
		}
		return map;
	}

	@Override
	public Map<String, Object> issuerDATAWithDate(String from ,String to ){
		
	List<IssuerDetails>	 IssuerDetails= issuerDetailsRepository.issuerDATAWithDate(from,to);
	
	return Map.of("status",IssuerDetails);
	
	}
	
}
