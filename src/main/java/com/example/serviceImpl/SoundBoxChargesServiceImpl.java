package com.example.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.controller.ResponseMessage;
import com.example.entity.SoundBoxCharges;
import com.example.repo.SoundBoxChargesRepository;
import com.example.request.SoundBoxChargesRequest;
import com.example.service.SoundBoxChargesService;

@Service
public class SoundBoxChargesServiceImpl implements SoundBoxChargesService {

	@Autowired
	private SoundBoxChargesRepository repository;

	@Override
	public Map<String, Object> getAllSoundboxCharges() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<SoundBoxCharges> list = repository.findAll();
			if (!list.isEmpty()) {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, list);
			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data Not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Something went wrong");

		}
		return map;
	}

	@Override
	public Map<String, Object> getAllSoundboxChargesById(long id) {

		Map<String, Object> map = new HashMap<String, Object>();
		try {

			if (repository.existsById(id)) {

				SoundBoxCharges data = repository.findById(id).get();

				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, data);

			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Something went wrong");

		}
		return map;
	}

	@Override
	public Map<String, Object> createSoundboxCharges(SoundBoxChargesRequest subscription) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			SoundBoxCharges boxSubscription = new SoundBoxCharges();
//			boxSubscription.setSoundBoxChargesId(Long.parseLong("1"));
			boxSubscription.setAmount(subscription.getAmount());
			boxSubscription.setStartDate(subscription.getStartDate());
			boxSubscription.setEndDate(subscription.getEndDate());
			boxSubscription.setMerchantId(Long.parseLong(subscription.getMerchantId()));
			boxSubscription.setSubMerchantId(subscription.getSubMerchantId());
			boxSubscription.setIsPaymentReceived(subscription.getIsPaymentReceived());
			boxSubscription.setIsActive("1");

			repository.save(boxSubscription);

			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
			map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
			map.put(ResponseMessage.DESCRIPTION, "successfully");

		} catch (Exception e) {
			e.printStackTrace();
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Something went wrong");

		}
		return map;
	}

	@Override
	public Map<String, Object> updateSoundboxCharges(long id, SoundBoxChargesRequest subscription) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (repository.existsById(id)) {

				SoundBoxCharges boxSubscription = repository.findById(id).get();

				boxSubscription.setAmount(subscription.getAmount());
				boxSubscription.setStartDate(subscription.getStartDate());
				boxSubscription.setEndDate(subscription.getEndDate());
				boxSubscription.setMerchantId(Long.parseLong(subscription.getMerchantId()));
				boxSubscription.setSubMerchantId(subscription.getSubMerchantId());
				boxSubscription.setIsPaymentReceived(subscription.getIsPaymentReceived());
				boxSubscription.setIsActive("1");

				repository.save(boxSubscription);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "Updated Successfully");

			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data not found");

			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Something went wrong");

		}
		return map;
	}

	@Override
	public Map<String, Object> deactivatSoundboxCharges(long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (repository.existsById(id)) {

				SoundBoxCharges boxSubscription = repository.findById(id).get();

				boxSubscription.setIsActive("0");
				repository.save(boxSubscription);
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_SUCCESS);
				map.put(ResponseMessage.CODE, ResponseMessage.SUCCESS);
				map.put(ResponseMessage.DESCRIPTION, "deactivated Successfully");

			} else {
				map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
				map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
				map.put(ResponseMessage.DESCRIPTION, "Data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put(ResponseMessage.STATUS, ResponseMessage.API_STATUS_FAILED);
			map.put(ResponseMessage.CODE, ResponseMessage.FAILED);
			map.put(ResponseMessage.DESCRIPTION, "Something went wrong");
		}
		return map;
	}

}
