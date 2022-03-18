package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class InitShareResponse implements Serializable {
    @SerializedName("ak_share")
    private String mAppKey;
    @SerializedName("settings")
    private InitShareSettings mInitSettings;
    @SerializedName("panel_list")
    private List<PanelInfo> mPanelList;
    @SerializedName("token_reg")
    private String mTokenRegex;

    public String getAppKey() {
        return this.mAppKey;
    }

    public InitShareSettings getInitSettings() {
        return this.mInitSettings;
    }

    public List<PanelInfo> getPanelList() {
        return this.mPanelList;
    }

    public String getTokenRegex() {
        return this.mTokenRegex;
    }

    public void setAppKey(String str) {
        this.mAppKey = str;
    }

    public void setInitSettings(InitShareSettings initShareSettings) {
        this.mInitSettings = initShareSettings;
    }

    public void setPanelList(List<PanelInfo> list) {
        this.mPanelList = list;
    }

    public void setTokenRegex(String str) {
        this.mTokenRegex = str;
    }
}
