package com.bytedance.geckox.policy.v4.model;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class V4DeploymentModel {
    @SerializedName("group_name")
    private List<Object> groupName;
    @SerializedName("target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    public List<Object> getGroupName() {
        return this.groupName;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public V4DeploymentModel() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public V4DeploymentModel(List<Object> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
