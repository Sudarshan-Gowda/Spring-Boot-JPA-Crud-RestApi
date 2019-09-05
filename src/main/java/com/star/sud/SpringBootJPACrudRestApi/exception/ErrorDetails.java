package com.star.sud.SpringBootJPACrudRestApi.exception;

import java.util.Date;

public class ErrorDetails {

	// Attributes
	//////////////////
	private Date timestamp;
	private String message;
	private String details;

	// Constructors
	//////////////////
	/**
	 * @param timestamp
	 * @param message
	 * @param details
	 */
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	// Properties
	//////////////////
	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
