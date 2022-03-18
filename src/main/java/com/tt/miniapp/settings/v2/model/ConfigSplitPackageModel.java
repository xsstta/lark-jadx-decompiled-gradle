package com.tt.miniapp.settings.v2.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class ConfigSplitPackageModel implements Serializable {
    @SerializedName("disabledAppIdList")
    public List<String> disabledAppIdList;
    @SerializedName("enabled")
    public boolean enabled;
    @SerializedName("enabledAppIdList")
    public List<String> enabledAppIdList;
}
