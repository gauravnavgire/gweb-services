package com.rubix.webservices.gadmin.master.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "School Group Can't be saved")
public class SchoolGroupSaveException extends RuntimeException {

	public SchoolGroupSaveException(Exception e) {
		// TODO Auto-generated constructor stub
		super(e);
	}
}
