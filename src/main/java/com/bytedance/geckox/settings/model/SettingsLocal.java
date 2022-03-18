package com.bytedance.geckox.settings.model;

import com.google.gson.annotations.SerializedName;

public class SettingsLocal {
    @SerializedName("app_version")
    private String appVersion;
    @SerializedName("env")
    private String env;

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getEnv() {
        return this.env;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setEnv(String str) {
        this.env = str;
    }

    public SettingsLocal(String str, String str2) {
        this.env = str;
        this.appVersion = str2;
    }
}
