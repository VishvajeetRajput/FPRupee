package com.example.service;

public interface DigioService {

	String singleDebit(String request);

	String multipleDebit(String request);

	String debitRequest(String transactionId);

	String scheduledDebit(String request);

	String transactionActionCancelOrReattempt(String request);
	
}
