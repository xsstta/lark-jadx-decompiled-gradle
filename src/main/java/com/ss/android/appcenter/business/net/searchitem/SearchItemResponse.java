package com.ss.android.appcenter.business.net.searchitem;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SearchItemResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    SearchItemData mData;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public SearchItemData getData() {
        return this.mData;
    }

    public String getMsg() {
        return this.msg;
    }
}
