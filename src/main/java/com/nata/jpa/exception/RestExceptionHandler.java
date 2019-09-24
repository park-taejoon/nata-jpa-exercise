package com.nata.jpa.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nata.jpa.vo.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {
	//rest 500에러는 안됨.
	private HttpStatus forbidden = HttpStatus.FORBIDDEN;
	
	@ExceptionHandler(value = { NoSuchElementException.class})
	public ErrorResponse noSuchElementException(Exception e) {
	    return new ErrorResponse(forbidden);
	}
}
