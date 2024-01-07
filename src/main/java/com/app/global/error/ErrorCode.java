package com.app.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public enum ErrorCode {
    ;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message){

    }
    private HttpStatus httpStatus;
    private String errorCode;
    private String message;
}
