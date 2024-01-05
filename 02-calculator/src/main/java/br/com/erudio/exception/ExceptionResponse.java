package br.com.erudio.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String Message;
	private String details;
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		Message = message;
		this.details = details;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return Message;
	}
	public String getDetails() {
		return details;
	}
	
	
}
