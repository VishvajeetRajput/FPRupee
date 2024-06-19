package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.wrapper.BaseResponse;

@RestControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<String> errors = new ArrayList<String>();

		for (FieldError error : ex.getBindingResult().getFieldErrors()) {
			errors.add(error.getField() + " -> " + error.getDefaultMessage());
		}

		for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
			errors.add(error.getObjectName() + " -> " + error.getDefaultMessage());
		}

		BaseResponse apiError = new BaseResponse();
		apiError.setCode(ResponseMessage.BAD_REQUEST);
		apiError.setDescription(errors);
		apiError.setStatus(HttpStatus.BAD_REQUEST);

		return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
	}

	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		BaseResponse apiError = new BaseResponse();
		apiError.setCode(ResponseMessage.BAD_REQUEST);
		apiError.setDescription(ResponseMessage.INVALID_JSON_FORMATE);
		apiError.setStatus(HttpStatus.BAD_REQUEST);

		return handleExceptionInternal(ex, apiError, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		BaseResponse apiError = new BaseResponse();
		apiError.setCode(ResponseMessage.BAD_REQUEST);
		apiError.setDescription(ResponseMessage.HEADERS_MISSING);
		apiError.setStatus(HttpStatus.BAD_REQUEST);

		return handleExceptionInternal(ex, apiError, headers, status, request);
	}

}
