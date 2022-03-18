package com.ss.android.lark.browser.impl.translate.jsb.result;

public class GetDetectSettingJSResult implements BaseJSResult {
    private int maxContentLen;

    public int getMaxContentLen() {
        return this.maxContentLen;
    }

    public String toString() {
        return "GetDetectSettingJSResult{maxContentLen=" + this.maxContentLen + '}';
    }

    public void setMaxContentLen(int i) {
        this.maxContentLen = i;
    }

    public GetDetectSettingJSResult(int i) {
        this.maxContentLen = i;
    }
}
