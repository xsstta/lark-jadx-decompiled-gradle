package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TokenInfo implements Serializable {
    @SerializedName("description")
    private String mDescription;
    @SerializedName("tips")
    private String mTips;
    @SerializedName("title")
    private String mTitle;

    public String getDescription() {
        return this.mDescription;
    }

    public String getTips() {
        return this.mTips;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setTips(String str) {
        this.mTips = str;
    }

    public void setmTitle(String str) {
        this.mTitle = str;
    }
}
