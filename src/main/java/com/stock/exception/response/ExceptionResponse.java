package com.stock.exception.response;

public class ExceptionResponse {

	private String timestamp;

	/** HTTP Status Code */
	private int status;

	/** HTTP Reason phrase */
	private String error;

	/** A message that describe the error thrown when calling the downstream API */
	private String message;
}
