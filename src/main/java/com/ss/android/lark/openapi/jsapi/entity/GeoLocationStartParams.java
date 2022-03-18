package com.ss.android.lark.openapi.jsapi.entity;

public class GeoLocationStartParams implements BaseJSModel {
    long interval;
    String responseId;
    String sceneId;
    boolean useCache;

    public long getInterval() {
        return this.interval;
    }

    public String getResponseId() {
        return this.responseId;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public boolean isUseCache() {
        return this.useCache;
    }

    public void setInterval(long j) {
        this.interval = j;
    }

    public void setResponseId(String str) {
        this.responseId = str;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public void setUseCache(boolean z) {
        this.useCache = z;
    }
}
