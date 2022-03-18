package com.ss.android.lark.browser.impl.translate.jsb.params;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class ChangeBannerJSParams implements BaseJSModel {
    private boolean isShow;

    public boolean isShow() {
        return this.isShow;
    }

    public String toString() {
        return "ChangeBannerJSParams{isShow=" + this.isShow + '}';
    }

    public void setShow(boolean z) {
        this.isShow = z;
    }
}
