package com.demo.anger.exception.config;

import com.demo.anger.exception.httpCode.ResultCode;
import com.demo.anger.exception.httpType.BeanResponse;
import com.demo.anger.exception.httpType.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.transform.Result;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserException.class)
    @ResponseStatus(HttpStatus.OK)
    public  BeanResponse failCatch(UserException baseException){
        return ResponseData.fail(baseException.getErrorCode(),baseException.errorMsg);
    }

    @ExceptionHandler(RuntimeException.class)
    public  BeanResponse failRuntimeException(){
        return ResponseData.fail(ResultCode.SERVER_BUSY.getCode(),ResultCode.SERVER_BUSY.getMsg());
    }

}
