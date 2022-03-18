package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class UpdateBarStatusJSPrams implements BaseJSModel {
    private TranslateLanguage originLang;
    private TranslateLanguage targetLang;
    private String translateStatus;

    public TranslateLanguage getOriginLang() {
        return this.originLang;
    }

    public TranslateLanguage getTargetLang() {
        return this.targetLang;
    }

    public String getTranslateStatus() {
        return this.translateStatus;
    }

    public String toString() {
        return "UpdateBarStatusJSPrams{translateStatus='" + this.translateStatus + '\'' + ", originLang=" + this.originLang + ", targetLang=" + this.targetLang + '}';
    }

    public void setOriginLang(TranslateLanguage translateLanguage) {
        this.originLang = translateLanguage;
    }

    public void setTargetLang(TranslateLanguage translateLanguage) {
        this.targetLang = translateLanguage;
    }

    public void setTranslateStatus(String str) {
        this.translateStatus = str;
    }
}
