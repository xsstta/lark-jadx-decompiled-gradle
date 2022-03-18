package com.bytedance.geckox.model;

import com.bytedance.geckox.policy.loop.model.GlobalConfig;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ComponentModel {
    @SerializedName("global_config")
    private GlobalConfig globalConfig = new GlobalConfig();
    @SerializedName("packages")
    private Map<String, List<UpdatePackage>> packages;
    @SerializedName("universal_strategies")
    private Map<String, C14294a> universalStrategies;

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, C14294a> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
