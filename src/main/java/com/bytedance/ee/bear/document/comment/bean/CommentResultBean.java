package com.bytedance.ee.bear.document.comment.bean;

import java.io.Serializable;

public class CommentResultBean implements Serializable {
    private String action;
    private long code;
    private String msg;
    private String token;

    public String getAction() {
        return this.action;
    }

    public long getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getToken() {
        return this.token;
    }

    public String toString() {
        return "CommentResultBean{token='', action='" + this.action + '\'' + ", code=" + this.code + ", msg='" + this.msg + '\'' + '}';
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setCode(long j) {
        this.code = j;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
