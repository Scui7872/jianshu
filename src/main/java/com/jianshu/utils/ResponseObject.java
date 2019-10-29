package com.jianshu.utils;/**
*@ClassName ResponseObject
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class ResponseObject {
    public Integer code ;
    public String msg;
    public Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    private ResponseObject(){

    }

    public static ResponseObject success(Integer code,String msg){
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        return ro;
    }

    public static ResponseObject success (Integer code ,String msg,Object data){
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        ro.setData(data);
        return ro;
    }
    public static ResponseObject error (Integer code ,String msg){
        ResponseObject ro = new ResponseObject();
        ro.setCode(code);
        ro.setMsg(msg);
        return ro;
    }




}
