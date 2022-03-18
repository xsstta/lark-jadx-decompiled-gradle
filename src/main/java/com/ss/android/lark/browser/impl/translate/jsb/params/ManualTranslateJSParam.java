package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class ManualTranslateJSParam implements BaseJSModel {
    private TranslateLanguage originLang;
    private TranslateLanguage targetLang;
    private String translateType;

    public TranslateLanguage getOriginLang() {
        return this.originLang;
    }

    public TranslateLanguage getTargetLang() {
        return this.targetLang;
    }

    public String getTranslateType() {
        return this.translateType;
    }

    public String toString() {
        return "ManualTranslateJSParam{translateType='" + this.translateType + '\'' + ", originLang=" + this.originLang + ", targetLang=" + this.targetLang + '}';
    }

    public void setOriginLang(TranslateLanguage translateLanguage) {
        this.originLang = translateLanguage;
    }

    public void setTargetLang(TranslateLanguage translateLanguage) {
        this.targetLang = translateLanguage;
    }

    public void setTranslateType(String str) {
        this.translateType = str;
    }
}
