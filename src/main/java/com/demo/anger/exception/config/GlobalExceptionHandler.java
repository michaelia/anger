package com.demo.anger.exception.config;

import com.demo.anger.exception.httpType.BeanResponse;
import com.demo.anger.exception.httpType.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.OK)
    public  BeanResponse success(Object data) {
        BeanResponse beanResponse = new BeanResponse();
        beanResponse.setCode(ResultCode.SUCCESS.getCode());
        beanResponse.setMessage(ResultCode.SUCCESS.getMsg());
        beanResponse.setResult(data);
        return beanResponse;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public  BeanResponse fail(ResultCode resultCode){
        BeanResponse beanResponse = new BeanResponse();
        beanResponse.setCode(resultCode.getCode());
        beanResponse.setMessage(resultCode.getMsg());
        return beanResponse;
    }

    @ExceptionHandler(RuntimeException.class)
    public  BeanResponse failT(ResultCode resultCode){
        BeanResponse beanResponse = new BeanResponse();
        beanResponse.setCode(ResultCode.UnknownError.getCode());
        beanResponse.setMessage(ResultCode.UnknownError.getMsg());
        return beanResponse;
    }
}
