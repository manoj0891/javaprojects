package com.thinkconstructive.rest.emo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {
	
	@ExceptionHandler(value= {CloudVendorNotFountException.class})
public ResponseEntity<Object> handleCloudVendornotFounrException(CloudVendorNotFountException cloudVendornotfountexception){
	
	 CloudVendorException cloudvendorException= new CloudVendorException(cloudVendornotfountexception.getMessage(),cloudVendornotfountexception.getCause(),HttpStatus.NOT_FOUND);
	return  new ResponseEntity<>(cloudvendorException, HttpStatus.NOT_FOUND);
	}

}
