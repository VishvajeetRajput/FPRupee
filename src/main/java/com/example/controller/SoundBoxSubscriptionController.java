package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.SoundBoxSubscriptionRequest;
import com.example.service.SoundBoxSubscriptionService;

@RestController
public class SoundBoxSubscriptionController {

	@Autowired
	private SoundBoxSubscriptionService service;

	@PostMapping("/getAllSubscriptions")
	public Map<String, Object> getAllSubscriptions() {
		return service.getAllSubscriptions();
	}

	@PostMapping("/getSubscriptionById/{id}")
	public Map<String, Object> getSubscriptionById(@PathVariable long id) {
		return service.getSubscriptionById(id);

	}

	@PostMapping("/createSubscription")
	public Map<String, Object> createSubscription(@RequestBody SoundBoxSubscriptionRequest subscription) {
		return service.createSubscription(subscription);
	}

	@PostMapping("/updateSubscription/{id}")
	public Map<String, Object> updateSubscription(@PathVariable long id,
			@RequestBody SoundBoxSubscriptionRequest subscription) {
		return service.updateSubscription(id, subscription);

	}

	@PostMapping("/deactivatSubscription/{id}")
	public Map<String, Object> deactivatSubscription(@PathVariable long id) {
		return service.deactivatSubscription(id);

	}

}