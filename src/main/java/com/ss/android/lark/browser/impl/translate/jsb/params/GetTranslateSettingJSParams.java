package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class GetTranslateSettingJSParams implements BaseJSModel {
    private String originLan;

    public String getOriginLan() {
        return this.originLan;
    }

    public String toString() {
        return "GetTranslateSettingJSParams{originLan='" + this.originLan + '\'' + '}';
    }

    public void setOriginLan(String str) {
        this.originLan = str;
    }
}
