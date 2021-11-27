package com.demo.anger.exception.httpType;


/**
 * @description: 自定义返回值
 * @author: minyi
 * @date: 2021/4/19 21:47
 * @version: v1.0
 */
public class BeanResponse  {

    /**
    响应代码
    */
    private  String code;

    /**
     * 响应消息
    */
    private String message;

    /**
     * 响应结果
    */
    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
