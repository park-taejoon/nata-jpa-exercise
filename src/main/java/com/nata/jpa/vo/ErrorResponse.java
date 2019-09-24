package com.nata.jpa.vo;


import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	private int status;
    private String message;
    public ErrorResponse(HttpStatus http) {
    	this.status = http.value();
    	this.message = http.getReasonPhrase();
    }
}
