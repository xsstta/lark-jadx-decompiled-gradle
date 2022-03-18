package com.bytedance.ee.bear.net;

public class HttpException extends Exception {
    private int code;
    private String httpStr;

    public int getCode() {
        return this.code;
    }

    public String getHttpStr() {
        return this.httpStr;
    }

    HttpException(int i, String str) {
        super("Okhttp error, code = " + i + ", body = " + str);
        this.code = i;
        this.httpStr = str;
    }
}
