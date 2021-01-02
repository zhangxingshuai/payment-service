package com.entity;

public class CommonResult <T>{
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(int code, String message) {
        this(code, message, null);
    }
}
