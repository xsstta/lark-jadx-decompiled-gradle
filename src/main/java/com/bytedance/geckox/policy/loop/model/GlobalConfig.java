package com.bytedance.geckox.policy.loop.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class GlobalConfig {
    @SerializedName("check_update")
    private Map<String, LoopInterval> checkUpdate;

    public GlobalConfig() {
    }

    public Map<String, LoopInterval> getCheckUpdate() {
        return this.checkUpdate;
    }

    public GlobalConfig(Map<String, LoopInterval> map) {
        this.checkUpdate = map;
    }
}
