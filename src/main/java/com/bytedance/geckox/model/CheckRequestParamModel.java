package com.bytedance.geckox.model;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CheckRequestParamModel {
    @SerializedName("group_name")
    private String group;
    @SerializedName("target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    public String getGroup() {
        return this.group;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public CheckRequestParamModel(String str) {
        this.group = str;
    }

    public CheckRequestParamModel(String str, List<CheckRequestBodyModel.TargetChannel> list) {
        this.group = str;
        this.targetChannels = list;
    }
}
