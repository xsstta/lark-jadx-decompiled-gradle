package com.bytedance.geckox.policy.loop.model;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoopRequestModel {
    @SerializedName("custom")
    private Map<String, Object> custom;
    private LoopDeploymentModel deployment;

    public static class LoopDeploymentModel {
        @SerializedName("group_name")
        private List<String> groupName;
        @SerializedName("target_channels")
        private List<CheckRequestBodyModel.TargetChannel> targetChannels;

        public List<String> getGroupName() {
            return this.groupName;
        }

        public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
            return this.targetChannels;
        }

        public LoopDeploymentModel() {
            this.groupName = new ArrayList();
            this.targetChannels = new ArrayList();
        }

        public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
            this.targetChannels = list;
        }

        public LoopDeploymentModel(List<String> list, List<CheckRequestBodyModel.TargetChannel> list2) {
            this.groupName = list;
            this.targetChannels = list2;
        }
    }

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public LoopDeploymentModel getDeployment() {
        return this.deployment;
    }

    public void setCustom(Map<String, Object> map) {
        this.custom = map;
    }

    public void setDeployment(LoopDeploymentModel loopDeploymentModel) {
        this.deployment = loopDeploymentModel;
    }

    public LoopRequestModel(Map<String, Object> map, LoopDeploymentModel loopDeploymentModel) {
        this.custom = map;
        this.deployment = loopDeploymentModel;
    }
}
