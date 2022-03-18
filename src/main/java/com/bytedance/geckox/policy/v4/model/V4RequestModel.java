package com.bytedance.geckox.policy.v4.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class V4RequestModel {
    @SerializedName("custom")
    private Map<String, Object> custom;
    private V4DeploymentModel deployment;

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public V4DeploymentModel getDeployment() {
        return this.deployment;
    }

    public void setCustom(Map<String, Object> map) {
        this.custom = map;
    }

    public void setDeployment(V4DeploymentModel v4DeploymentModel) {
        this.deployment = v4DeploymentModel;
    }

    public V4RequestModel(Map<String, Object> map, V4DeploymentModel v4DeploymentModel) {
        this.custom = map;
        this.deployment = v4DeploymentModel;
    }
}
