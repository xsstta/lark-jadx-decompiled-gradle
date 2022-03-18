package com.tt.miniapphost.entity;

import com.tt.refer.common.base.AppType;

public class PreLoadAppEntity {
    private AppType brandAppType;
    private String mAppId;
    private int mAppType;
    private int mDownloadPriority;
    private int mOriginDownloadPriority;
    private int mPreloadMode = -1;

    public static boolean compareDownloadPriority(int i, int i2) {
        return i > i2;
    }

    public static boolean isPreloadModeValid(int i) {
        return i == 1 || i == 2;
    }

    public void downgradePriority() {
        this.mDownloadPriority = 0;
    }

    public String getAppid() {
        return this.mAppId;
    }

    public int getApptype() {
        return this.mAppType;
    }

    public AppType getBrandAppType() {
        return this.brandAppType;
    }

    public int getDownloadPriority() {
        return this.mDownloadPriority;
    }

    public int getOriginDownloadPriority() {
        return this.mOriginDownloadPriority;
    }

    public int getPreloadMode() {
        return this.mPreloadMode;
    }

    public boolean downgraded() {
        int i = this.mDownloadPriority;
        if (i != 0 || i == this.mOriginDownloadPriority) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "mAppId: " + this.mAppId + " mAppType: " + this.mAppType + " mDownloadPriority: " + this.mDownloadPriority + " mOriginDownloadPriority: " + this.mOriginDownloadPriority;
    }

    public void setAppid(String str) {
        this.mAppId = str;
    }

    public void setApptype(int i) {
        this.mAppType = i;
    }

    public void setBrandAppType(AppType appType) {
        this.brandAppType = appType;
    }

    public void setPreloadMode(int i) {
        this.mPreloadMode = i;
    }

    public void setDownloadPriority(int i) {
        if (!(i == 1 || i == 2 || i == 0)) {
            i = 0;
        }
        this.mDownloadPriority = i;
        this.mOriginDownloadPriority = i;
        if (i == 2 && !isPreloadModeValid(this.mPreloadMode)) {
            this.mPreloadMode = 2;
        }
    }
}
