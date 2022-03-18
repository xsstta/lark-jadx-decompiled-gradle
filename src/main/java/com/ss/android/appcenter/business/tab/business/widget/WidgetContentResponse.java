package com.ss.android.appcenter.business.tab.business.widget;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WidgetContentResponse implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private WidgetContentData data;
    @SerializedName("msg")
    private String msg;

    public int getCode() {
        return this.code;
    }

    public WidgetContentData getData() {
        return this.data;
    }
}
