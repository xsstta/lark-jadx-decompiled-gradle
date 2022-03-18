package com.ss.android.appcenter.business.dto;

import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DefaultResponse implements Serializable {
    @SerializedName("code")
    private int mCode;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private JsonObject mData;
    @SerializedName("msg")
    private String mMsg;

    public int getCode() {
        return this.mCode;
    }

    public JsonObject getData() {
        return this.mData;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public String toString() {
        return "DefaultResponse{mCode=" + this.mCode + ", mMsg='" + this.mMsg + '\'' + ", mData=" + this.mData + '}';
    }

    public void setCode(int i) {
        this.mCode = i;
    }

    public void setData(JsonObject jsonObject) {
        this.mData = jsonObject;
    }

    public void setMsg(String str) {
        this.mMsg = str;
    }
}
