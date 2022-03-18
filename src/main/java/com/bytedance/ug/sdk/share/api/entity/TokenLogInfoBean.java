package com.bytedance.ug.sdk.share.api.entity;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TokenLogInfoBean implements Serializable {
    @SerializedName("group_id")
    private String mGroupId;
    @SerializedName("group_type")
    private String mGroupType;
    @SerializedName("item_id")
    private String mItemId;
    @SerializedName("log_pb")
    private JsonObject mLogPb;
    @SerializedName("share_user_id")
    private String mShareUserId;
    @SerializedName("tma_share")
    private String mTmaShare;
    @SerializedName("user_id")
    private String mUserId;

    public String getGroupId() {
        return this.mGroupId;
    }

    public String getGroupType() {
        return this.mGroupType;
    }

    public String getItemId() {
        return this.mItemId;
    }

    public JsonObject getLogPb() {
        return this.mLogPb;
    }

    public String getShareUserId() {
        return this.mShareUserId;
    }

    public String getTmaShare() {
        return this.mTmaShare;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public void setGroupId(String str) {
        this.mGroupId = str;
    }

    public void setGroupType(String str) {
        this.mGroupType = str;
    }

    public void setItemId(String str) {
        this.mItemId = str;
    }

    public void setLogPb(JsonObject jsonObject) {
        this.mLogPb = jsonObject;
    }

    public void setShareUserId(String str) {
        this.mShareUserId = str;
    }

    public void setTmaShare(String str) {
        this.mTmaShare = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }
}
