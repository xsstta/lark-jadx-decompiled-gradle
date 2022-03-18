package com.ss.android.lark.browser.impl.translate.jsb.result;

import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;

public class GetTranslateSettingJSResult implements BaseJSResult {
    private TranslateLanguage targetLang;
    private String type;

    public TranslateLanguage getTargetLang() {
        return this.targetLang;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "GetTranslateSettingJSResult{type='" + this.type + '\'' + ", targetLang=" + this.targetLang + '}';
    }

    public void setTargetLang(TranslateLanguage translateLanguage) {
        this.targetLang = translateLanguage;
    }

    public void setType(String str) {
        this.type = str;
    }
}
