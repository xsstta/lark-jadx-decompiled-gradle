package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;

public class FetchTokenResponse implements Serializable {
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private JsonObject data;
    @SerializedName(UpdateKey.STATUS)
    private int status;

    public JsonObject getData() {
        return this.data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
