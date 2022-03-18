package com.bytedance.ug.sdk.share.api.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TokenUserInfoBean implements Serializable {
    @SerializedName("name")
    private String mName;
    @SerializedName("source_open_url")
    private String mSourceOpenUrl;
    @SerializedName("user_id")
    private long mUserId;

    public String getName() {
        return this.mName;
    }

    public String getSourceOpenUrl() {
        return this.mSourceOpenUrl;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSourceOpenUrl(String str) {
        this.mSourceOpenUrl = str;
    }

    public void setUserId(long j) {
        this.mUserId = j;
    }
}
