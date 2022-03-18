package com.ss.android.lark.mm.net;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.statistics.hitpoint.C47088k;
import java.io.Serializable;

public class HttpMmResponse<Data> implements Serializable {
    public int code;
    public Data data;
    private boolean error;
    private boolean exception;
    public boolean isApiResp = true;
    public String msg;
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

    public static HttpMmResponse parse(String str) {
        JSONObject a = C47088k.m186459a(str);
        if (a == null) {
            return null;
        }
        HttpMmResponse httpMmResponse = new HttpMmResponse();
        httpMmResponse.code = a.getIntValue("code");
        httpMmResponse.data = (Data) a.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return httpMmResponse;
    }

    public static HttpMmResponse encode(String str) {
        if (TextUtils.isEmpty(str)) {
            HttpMmResponse httpMmResponse = new HttpMmResponse();
            httpMmResponse.exception = true;
            return httpMmResponse;
        }
        HttpMmResponse httpMmResponse2 = (HttpMmResponse) JSON.parseObject(str, HttpMmResponse.class);
        if (httpMmResponse2 == null) {
            HttpMmResponse httpMmResponse3 = new HttpMmResponse();
            httpMmResponse3.exception = true;
            return httpMmResponse3;
        }
        if (httpMmResponse2.code == 0) {
            httpMmResponse2.success = true;
        } else {
            httpMmResponse2.error = true;
        }
        return httpMmResponse2;
    }
}
