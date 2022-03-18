package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class GetShareInfoResponse implements Serializable {
    @SerializedName("share_info_list")
    List<ShareInfo> mShareInfoList;
    @SerializedName("err_no")
    private int mStatus;
    @SerializedName("err_tips")
    private String mTips;

    public List<ShareInfo> getShareInfoList() {
        return this.mShareInfoList;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getTips() {
        return this.mTips;
    }

    public void setShareInfoList(List<ShareInfo> list) {
        this.mShareInfoList = list;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setTips(String str) {
        this.mTips = str;
    }
}
