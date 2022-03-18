package com.ss.android.lark.browser.impl.translate.entity;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class TranslateLanguage implements BaseJSModel {
    private String code;
    private String name;

    public TranslateLanguage() {
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "TranslateLanguage{code='" + this.code + '\'' + ", name='" + this.name + '\'' + '}';
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public TranslateLanguage(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
