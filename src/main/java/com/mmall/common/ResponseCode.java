package com.mmall.common;

/**
 * Created by wang on 2017/9/3.
 */
public enum ResponseCode {
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final  int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return this.code;
    }

    public String getDesc(){
        return this.desc;
    }

    public static void main(String[] args) {
        for (ResponseCode rc : values()) {
            System.out.println(rc);
        }
    }
}
