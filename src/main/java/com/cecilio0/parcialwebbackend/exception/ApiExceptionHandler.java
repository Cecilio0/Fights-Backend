package com.cecilio0.parcialwebbackend.exception;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
	private final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
	private final HttpStatus forbidden = HttpStatus.FORBIDDEN;
	
	@ExceptionHandler(value = {NotFoundException.class})
	public ResponseEntity<Object> handleNotFoundException(NotFoundException e){
		ApiException apiException = new ApiException(
				e.getMessage(),
				badRequest
		);
		
		return new ResponseEntity<>(apiException, badRequest);
	}
	
	@ExceptionHandler(value = {ValueNotValidException.class})
	public ResponseEntity<Object> handleValueNotValidException(ValueNotValidException e){
		ApiException apiException = new ApiException(
				e.getMessage(),
				badRequest
		);
		
		return new ResponseEntity<>(apiException, badRequest);
	}
	
	// Custom handling for unrecognized properties when parsing request bodies
	@ExceptionHandler(value = {UnrecognizedPropertyException.class})
	public ResponseEntity<Object> handleUnrecognizedPropertyException(UnrecognizedPropertyException e){
		String message = "The " + e.getPropertyName() + " property is not valid for this type of request";
		
		ApiException apiException = new ApiException(
				message,
				badRequest
		);
		
		return new ResponseEntity<>(apiException, badRequest);
	}
	
	@ExceptionHandler(value = {BadCredentialsException.class})
	public ResponseEntity<Object> handleBadCredentialsException(BadCredentialsException e){
		String message = e.getMessage();
		
		ApiException apiException = new ApiException(
				message,
				forbidden
		);
		
		return new ResponseEntity<>(apiException, forbidden);
	}
	
	@ExceptionHandler(value = {ConstraintViolationException.class})
	public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException e){
		String message = e.getErrorMessage();
		
		ApiException apiException = new ApiException(
				message,
				badRequest
		);
		
		return new ResponseEntity<>(apiException, badRequest);
	}
	
	@ExceptionHandler(value = {jakarta.validation.ConstraintViolationException.class})
	public ResponseEntity<Object> handleJakartaConstraintViolationException(jakarta.validation.ConstraintViolationException e){
		String message = e.getMessage();
		
		ApiException apiException = new ApiException(
				message,
				badRequest
		);
		
		return new ResponseEntity<>(apiException, badRequest);
	}
	
	// todo add handler for jwt exceptions
	// check out https://medium.com/@mypascal2000/custom-handling-of-invalid-jwt-in-spring-boot-f66e60d59230
}
