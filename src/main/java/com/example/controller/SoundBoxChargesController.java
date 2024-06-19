package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.SoundBoxChargesRequest;
import com.example.service.SoundBoxChargesService;

@RestController
public class SoundBoxChargesController {

	@Autowired
	private SoundBoxChargesService service;

	@PostMapping("/getAllSoundboxCharges")
	public Map<String, Object> getAllSoundboxCharges() {
		return service.getAllSoundboxCharges();
	}

	@PostMapping("/getAllSoundboxChargesById/{id}")
	public Map<String, Object> getAllSoundboxChargesById(@PathVariable long id) {
		return service.getAllSoundboxChargesById(id);
	}

	@PostMapping("/createSoundboxCharges")
	public Map<String, Object> createSoundboxCharges(@RequestBody SoundBoxChargesRequest subscription) {
		return service.createSoundboxCharges(subscription);
	}

	@PostMapping("/updateSoundboxCharges/{id}")
	public Map<String, Object> updateSoundboxCharges(@PathVariable long id,
			@RequestBody SoundBoxChargesRequest subscription) {
		return service.updateSoundboxCharges(id, subscription);
	}

	@PostMapping("/deactivatSoundboxCharges/{id}")
	public Map<String, Object> deactivatSoundboxCharges(@PathVariable long id) {
		return service.deactivatSoundboxCharges(id);
	}

}