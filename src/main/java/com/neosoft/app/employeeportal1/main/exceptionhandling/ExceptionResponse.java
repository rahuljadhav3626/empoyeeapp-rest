package com.neosoft.app.employeeportal1.main.exceptionhandling;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class ExceptionResponse {
 
	private String message ;
	private int statusCode;
	private String description;
	private String stringStatusCode;
}
