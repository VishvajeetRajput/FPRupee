package com.example.service;

import java.util.Map;

import javax.validation.Valid;

import com.example.request.BenificieryRequest;
import com.example.request.BenificieryUpdateRequest;
import com.example.request.Pagination;

public interface BenificieryDetailsService {

	Map<String, Object> addBenificiery(@Valid BenificieryRequest benificieryRequest);

	Map<String, Object> updateBenificiery(@Valid BenificieryUpdateRequest benificieryUpdateRequest);

	Map<String, Object> benificieryList(@Valid Pagination pagination);

	Map<String, Object> benificieryDetailsByBenificieryId(@Valid Long benificieryId);

	Map<String, Object> benificieryIsActive(@Valid Long benificieryId, char isActive);

}
