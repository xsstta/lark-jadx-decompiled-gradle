package com.tt.miniapp.settings.configs;

public class PreRenderAppConfig {
    String appId;
    boolean cacheRender;

    public String getAppId() {
        return this.appId;
    }

    public boolean isCacheRender() {
        return this.cacheRender;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCacheRender(boolean z) {
        this.cacheRender = z;
    }
}
