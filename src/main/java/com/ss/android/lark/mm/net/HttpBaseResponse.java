package com.ss.android.lark.mm.net;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.statistics.hitpoint.C47088k;
import java.io.Serializable;

public class HttpBaseResponse implements Serializable {
    public int code;
    public String data;
    private boolean error;
    private boolean exception;
    public boolean isApiResp = true;
    public String msg;
    public String newMsg;
    private boolean success;

    public boolean isException() {
        return this.exception;
    }

    public boolean isError() {
        if (this.exception || this.error) {
            return true;
        }
        return false;
    }

    public boolean isSuc() {
        if (this.exception || this.error || !this.success) {
            return false;
        }
        return true;
    }

    public static HttpBaseResponse encode(String str) {
        if (TextUtils.isEmpty(str)) {
            HttpBaseResponse httpBaseResponse = new HttpBaseResponse();
            httpBaseResponse.exception = true;
            return httpBaseResponse;
        }
        HttpBaseResponse httpBaseResponse2 = (HttpBaseResponse) JSON.parseObject(str, HttpBaseResponse.class);
        if (httpBaseResponse2 == null) {
            HttpBaseResponse httpBaseResponse3 = new HttpBaseResponse();
            httpBaseResponse3.exception = true;
            return httpBaseResponse3;
        }
        if (httpBaseResponse2.code == 0) {
            httpBaseResponse2.success = true;
        } else {
            httpBaseResponse2.error = true;
        }
        return httpBaseResponse2;
    }

    public static HttpBaseResponse parse(String str) {
        JSONObject a = C47088k.m186459a(str);
        if (a == null) {
            return null;
        }
        HttpBaseResponse httpBaseResponse = new HttpBaseResponse();
        httpBaseResponse.code = a.getIntValue("code");
        httpBaseResponse.data = a.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        httpBaseResponse.msg = a.getString("msg");
        httpBaseResponse.newMsg = a.getString("newMsg");
        return httpBaseResponse;
    }
}
