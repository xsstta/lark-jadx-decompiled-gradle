package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class Language implements BaseJSModel {
    private String name;

    public Language() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Language(String str) {
        this.name = str;
    }
}
