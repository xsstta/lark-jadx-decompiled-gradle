package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class PanelInfo implements Serializable {
    @SerializedName("channel_list")
    private List<String> mChannelList;
    @SerializedName("filtered_channel_list")
    private List<String> mFilteredChannelList;
    @SerializedName("panel_id")
    private String mPanelId;

    public List<String> getChannelList() {
        return this.mChannelList;
    }

    public List<String> getFilteredChannelList() {
        return this.mFilteredChannelList;
    }

    public String getPanelId() {
        return this.mPanelId;
    }

    public void setChannelList(List<String> list) {
        this.mChannelList = list;
    }

    public void setFilteredChannelList(List<String> list) {
        this.mFilteredChannelList = list;
    }

    public void setPanelId(String str) {
        this.mPanelId = str;
    }
}
