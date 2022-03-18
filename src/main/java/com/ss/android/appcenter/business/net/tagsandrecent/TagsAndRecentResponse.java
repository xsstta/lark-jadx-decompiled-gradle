package com.ss.android.appcenter.business.net.tagsandrecent;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TagsAndRecentResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    TagsAndRecentData mData;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public TagsAndRecentData getData() {
        return this.mData;
    }
}
