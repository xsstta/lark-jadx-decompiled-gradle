package com.bytedance.ee.bear.net;

import java.io.Serializable;

public class ServerResult implements Serializable {
    public int code;
    public String data;
    public String msg;

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
