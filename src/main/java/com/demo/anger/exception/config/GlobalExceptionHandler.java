package com.demo.anger.exception.config;

import com.demo.anger.exception.httpCode.BaseCode;
import com.demo.anger.exception.httpCode.UserEorrCode;
import com.demo.anger.exception.httpType.BeanResponse;
import com.demo.anger.exception.httpType.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public  BeanResponse failCatch(BaseException baseException){
        return ResponseData.fail(baseException.getErrorCode(),baseException.errorMsg);
    }

//    @ExceptionHandler(RuntimeException.class)
//    public  BeanResponse failT(UserEorrCode baseCod){
//        BeanResponse beanResponse = new BeanResponse();
//        beanResponse.setCode(ResultCode.UnknownError.getCode());
//        beanResponse.setMessage(ResultCode.UnknownError.getMsg());
//        return ResponseData.fail(baseCod);
//    }
}
