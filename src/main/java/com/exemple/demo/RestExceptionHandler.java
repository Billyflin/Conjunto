package com.exemple.demo;

import com.exemple.demo.exceptions.ZeroDivisionException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ZeroDivisionException.class})
    public ResponseEntity<Object> conflictManagment(ZeroDivisionException e, WebRequest webRequest){
        var cuerpo=e.getMessage();
        return handleExceptionInternal(e,cuerpo,new HttpHeaders(), HttpStatus.CONFLICT,webRequest);
    }

}
