package com.ss.android.lark.browser.biz.dybrid.model;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class CheckJSApiEntity implements BaseJSModel {
    private String api;

    public String getApi() {
        return this.api;
    }

    public String toString() {
        return "CheckJSApiEntity{api='" + this.api + '\'' + '}';
    }

    public void setApi(String str) {
        this.api = str;
    }
}
