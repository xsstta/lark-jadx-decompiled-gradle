package com.bytedance.geckox.model;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;

public class Response<T> {
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    public T data;
    @SerializedName("message")
    public String msg;
    @SerializedName(UpdateKey.STATUS)
    public int status;
}
