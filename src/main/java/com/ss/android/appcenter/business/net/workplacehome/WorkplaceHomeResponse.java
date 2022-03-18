package com.ss.android.appcenter.business.net.workplacehome;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WorkplaceHomeResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private WorkplaceHomeData data;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public WorkplaceHomeData getData() {
        return this.data;
    }
}
