package com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig;

import com.ss.android.lark.http.model.BaseResponseModel;

public class SDKInfoResponse extends BaseResponseModel {
    private String data;
    private String msg;

    public String getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
