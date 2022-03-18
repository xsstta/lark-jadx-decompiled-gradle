package com.tt.refer.common.meta.base;

import android.text.TextUtils;

public abstract class AbsMetaLoadEntity {
    protected String appId;
    protected String identifier;
    protected String versionType = "current";

    public String getAppId() {
        return this.appId;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getVersionType() {
        return this.versionType;
    }

    public boolean isLocalTest() {
        if (TextUtils.isEmpty(this.versionType) || "current".equals(this.versionType)) {
            return false;
        }
        return true;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setVersionType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.versionType = str;
        }
    }
}
