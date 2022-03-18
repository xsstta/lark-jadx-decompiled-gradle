package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.Arrays;

public class DetectSourceLanguageJSParams implements BaseJSModel {
    String[] textList;

    public String[] getTextList() {
        return this.textList;
    }

    public String toString() {
        return "DetectSourceLanguageJSParams{textList=" + Arrays.toString(this.textList) + '}';
    }

    public void setTextList(String[] strArr) {
        this.textList = strArr;
    }
}
