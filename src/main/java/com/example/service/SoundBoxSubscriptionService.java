package com.example.service;

import java.util.Map;

import com.example.request.SoundBoxSubscriptionRequest;

public interface SoundBoxSubscriptionService {

	Map<String, Object> getAllSubscriptions();

	Map<String, Object> getSubscriptionById(long id);

	Map<String, Object>  createSubscription(SoundBoxSubscriptionRequest subscription);

	Map<String, Object> updateSubscription(long id, SoundBoxSubscriptionRequest subscription);

	Map<String, Object> deactivatSubscription(long id);

}
