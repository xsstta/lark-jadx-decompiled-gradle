package com.ss.android.appcenter.business.net.operationconfig;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class OperationalConfigResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    OperationalConfigData mData;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public OperationalConfigData getData() {
        return this.mData;
    }

    public String getMsg() {
        return this.msg;
    }
}
