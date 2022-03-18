package com.bytedance.ee.larkbrand.menu;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WorkplaceConfigResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    WorkplaceConfigData mData;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public WorkplaceConfigData getData() {
        return this.mData;
    }

    public String getMsg() {
        return this.msg;
    }
}
