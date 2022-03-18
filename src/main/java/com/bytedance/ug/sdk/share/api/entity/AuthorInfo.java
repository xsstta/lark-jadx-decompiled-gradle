package com.bytedance.ug.sdk.share.api.entity;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class AuthorInfo implements Serializable {
    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("extra")
    private JsonObject mExtra;
    @SerializedName("name")
    private String mName;

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public JsonObject getExtra() {
        return this.mExtra;
    }

    public String getName() {
        return this.mName;
    }

    public void setAvatarUrl(String str) {
        this.mAvatarUrl = str;
    }

    public void setExtra(JsonObject jsonObject) {
        this.mExtra = jsonObject;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
