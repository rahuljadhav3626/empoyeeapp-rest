package com.neosoft.app.employeeportal1.main.exceptionhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@Autowired
	ExceptionResponse response;

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ExceptionResponse customHandlerException(EmployeeNotFoundException exception) {
		System.out.println("Custom Exception Handle");
		response.setMessage(exception.getMessage());
		response.setStatusCode(HttpStatus.BAD_REQUEST.value());
		response.setDescription("Invalid Id User not exist For such id");
		response.setStringStatusCode(HttpStatus.BAD_REQUEST.toString());
		return response;
	}
}