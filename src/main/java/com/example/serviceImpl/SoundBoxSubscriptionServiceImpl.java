package com.example.serviceImpl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.ResponseMessage;
import com.example.entity.SoundBoxSubscription;
import com.example.repo.SoundBoxSubscriptionRepository;
import com.example.request.SoundBoxSubscriptionRequest;
import com.example.service.SoundBoxSubscriptionService;
import com.example.utils.ex.DateAndTime;

@Service
public class SoundBoxSubscriptionServiceImpl implements SoundBoxSubscriptionService {

	@Autowired
	private SoundBoxSubscriptionRepository repository;

	public Map<String, Object> getAllSubscriptions() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<SoundBoxSubscription> list = repository.findAll();
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

	public Map<String, Object> getSubscriptionById(long id) {

		Map<String, Object> map = new HashMap<String, Object>();
		try {

			if (repository.existsById(id)) {

				SoundBoxSubscription data = repository.findById(id).get();

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

	public Map<String, Object> createSubscription(SoundBoxSubscriptionRequest subscription) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Timestamp trxnDate = Timestamp.valueOf(DateAndTime.getCurrentTimeInIST());

			SoundBoxSubscription boxSubscription = new SoundBoxSubscription();
			boxSubscription.setAmount(subscription.getAmount());
			boxSubscription.setCurrentDate(trxnDate);
			boxSubscription.setFrequency(subscription.getFrequency());
			boxSubscription.setIsActive("1");
			boxSubscription.setMerchantId(Long.parseLong(subscription.getMerchantId()));
			boxSubscription.setOtc(subscription.getOtc());
			boxSubscription.setPaymentMode(subscription.getPaymentMode());
			boxSubscription.setSubMerchantId(subscription.getSubMerchantId());

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

	public Map<String, Object> updateSubscription(long id, SoundBoxSubscriptionRequest subscription) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (repository.existsById(id)) {

				SoundBoxSubscription boxSubscription = repository.findById(id).get();

				boxSubscription.setAmount(subscription.getAmount());
				boxSubscription.setFrequency(subscription.getFrequency());
				boxSubscription.setIsActive("1");
				boxSubscription.setMerchantId(Long.parseLong(subscription.getMerchantId()));
				boxSubscription.setOtc(subscription.getOtc());
				boxSubscription.setPaymentMode(subscription.getPaymentMode());
				boxSubscription.setSubMerchantId(subscription.getSubMerchantId());

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

	public Map<String, Object> deactivatSubscription(long id) {

		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (repository.existsById(id)) {

				SoundBoxSubscription boxSubscription = repository.findById(id).get();

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
