package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class Session implements BaseJSModel {
    private String session;

    public Session() {
    }

    public String getSession() {
        return this.session;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public Session(String str) {
        this.session = str;
    }
}
