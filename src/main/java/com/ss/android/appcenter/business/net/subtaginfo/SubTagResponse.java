package com.ss.android.appcenter.business.net.subtaginfo;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SubTagResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private SubTagData data;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public SubTagData getData() {
        return this.data;
    }
}
