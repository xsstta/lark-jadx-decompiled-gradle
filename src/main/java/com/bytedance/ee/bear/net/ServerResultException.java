package com.bytedance.ee.bear.net;

public class ServerResultException extends Exception {
    private int code;
    private String data;
    private String json;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getJson() {
        return this.json;
    }

    public String getMsg() {
        return this.msg;
    }

    public ServerResultException(int i, String str, String str2, String str3) {
        super("Server result isn't successful. code = " + i + ", msg = " + str);
        this.code = i;
        this.msg = str;
        this.data = str2;
        this.json = str3;
    }
}
