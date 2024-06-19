package com.example.service;

import java.util.Map;

import javax.validation.Valid;

import com.example.request.IssuerRequest;
import com.example.request.IssuerUpdateRequest;
import com.example.request.Pagination;

public interface IssuerDetailsService {

	Map<String, Object> addIssuer(@Valid IssuerRequest issuerRequest);

	Map<String, Object> issuerDetailsByIssuerId(@Valid Long issuerId);

	Map<String, Object> issuerUpdate(@Valid IssuerUpdateRequest issuerUpdateRequest);

	Map<String, Object> issuerIsActive(@Valid Long issuerId, char isActive);

	Map<String, Object> issuerList(@Valid Pagination pagination);

    Map<String, Object> issuerDATAWithDate(String from ,String to );
}
