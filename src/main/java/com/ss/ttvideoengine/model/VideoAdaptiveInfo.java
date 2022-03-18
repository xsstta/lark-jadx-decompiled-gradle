package com.ss.ttvideoengine.model;

import org.json.JSONObject;

public class VideoAdaptiveInfo {
    private String mAdaptiveType;
    private String mBackupPlayUrl;
    private String mMainPlayUrl;

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mAdaptiveType = jSONObject.optString("AdaptiveType");
            this.mMainPlayUrl = jSONObject.optString("MainPlayUrl");
            this.mBackupPlayUrl = jSONObject.optString("BackupPlayUrl");
        }
    }

    public String getValueStr(int i) {
        if (i == 108) {
            return this.mMainPlayUrl;
        }
        if (i == 109) {
            return this.mBackupPlayUrl;
        }
        if (i != 215) {
            return "";
        }
        return this.mAdaptiveType;
    }
}
