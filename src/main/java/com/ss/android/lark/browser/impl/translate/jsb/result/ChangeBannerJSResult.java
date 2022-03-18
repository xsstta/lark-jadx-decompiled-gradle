package com.ss.android.lark.browser.impl.translate.jsb.result;

public class ChangeBannerJSResult implements BaseJSResult {
    private boolean isClose;

    public boolean isClose() {
        return this.isClose;
    }

    public String toString() {
        return "ChangeBannerJSResult{isClose=" + this.isClose + '}';
    }

    public void setClose(boolean z) {
        this.isClose = z;
    }
}
