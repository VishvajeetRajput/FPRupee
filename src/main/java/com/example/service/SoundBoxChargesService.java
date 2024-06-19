package com.example.service;

import java.util.Map;

import com.example.request.SoundBoxChargesRequest;

public interface SoundBoxChargesService {

	Map<String, Object> getAllSoundboxCharges();

	Map<String, Object> getAllSoundboxChargesById(long id);

	Map<String, Object> createSoundboxCharges(SoundBoxChargesRequest subscription);

	Map<String, Object> updateSoundboxCharges(long id, SoundBoxChargesRequest subscription);

	Map<String, Object> deactivatSoundboxCharges(long id);

}
