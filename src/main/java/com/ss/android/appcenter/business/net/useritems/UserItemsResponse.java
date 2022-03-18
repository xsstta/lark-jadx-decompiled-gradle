package com.ss.android.appcenter.business.net.useritems;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UserItemsResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private UserItemsData data;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public UserItemsData getData() {
        return this.data;
    }
}
