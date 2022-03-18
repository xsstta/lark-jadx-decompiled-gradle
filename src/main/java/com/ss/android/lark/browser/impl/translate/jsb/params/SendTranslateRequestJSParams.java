package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.Arrays;

public class SendTranslateRequestJSParams implements BaseJSModel {
    private String originLang;
    private String targetLang;
    private String[] words;

    public String getOriginLang() {
        return this.originLang;
    }

    public String getTargetLang() {
        return this.targetLang;
    }

    public String[] getWords() {
        return this.words;
    }

    public String toString() {
        return "SendTranslateRequestJSParams{originLang='" + this.originLang + '\'' + ", targetLang='" + this.targetLang + '\'' + ", words=" + Arrays.toString(this.words) + '}';
    }

    public void setOriginLang(String str) {
        this.originLang = str;
    }

    public void setTargetLang(String str) {
        this.targetLang = str;
    }

    public void setWords(String[] strArr) {
        this.words = strArr;
    }
}
