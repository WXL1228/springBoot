package com.example.springboot.common;

import lombok.Data;

@Data
public class Result {
//    private static final String SUCCESS_CODE = "200";
//    private static final String ERROR_CODE = "500";
    private String code;
    private String msg;
    private Object data;

    public  static Result success() {
        Result result = new Result();
        result.setCode("200");
        result.setMsg("成功");
        return result;
    }

    public  static Result success(Object data) {
        Result result = new Result();
        result.setCode("200");
        result.setData(data);
        result.setMsg("成功");
        return result;
    }

    public  static Result success(String msg,Object data) {
        Result result = new Result();
        result.setCode("200");
        result.setData(data);
        result.setMsg(msg);
        return result;
    }
    public  static Result error(String msg) {
        Result result = new Result();
        result.setCode("500");
        result.setMsg(msg);
        return result;
    }
    public  static Result error(String msg, Object data) {
        Result result = new Result();
        result.setCode("500");
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
    public  static Result error(String code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }



//    public String getCode() {
//        return code;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }

}
