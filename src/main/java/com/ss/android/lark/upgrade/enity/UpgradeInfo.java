package com.ss.android.lark.upgrade.enity;

import java.io.Serializable;

public class UpgradeInfo implements Serializable {
    private boolean apkFileReady;
    private String downloadUrl = "";
    private boolean hasNew;
    private String md5 = "";
    private String releaseNote = "";
    private boolean shouldShowUpgradeDialog;
    private boolean shouldStrongNotice;
    private UpgradePlan upgradePlan;
    private String version = "";

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getReleaseNote() {
        return this.releaseNote;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isApkFileReady() {
        return this.apkFileReady;
    }

    public boolean isHasNew() {
        return this.hasNew;
    }

    public boolean isShouldShowUpgradeDialog() {
        return this.shouldShowUpgradeDialog;
    }

    public boolean isShouldStrongNotice() {
        return this.shouldStrongNotice;
    }

    public UpgradePlan getUpgradePlan() {
        if (this.upgradePlan == null) {
            this.upgradePlan = UpgradePlan.buildDefaultPlan();
        }
        return this.upgradePlan;
    }

    public String toString() {
        return "UpgradeInfo{hasNew=" + this.hasNew + ", shouldShowUpgradeDialog=" + this.shouldShowUpgradeDialog + ", shouldStrongNotice=" + this.shouldStrongNotice + ", upgradePlan=" + this.upgradePlan + ", version='" + this.version + '\'' + ", md5='" + this.md5 + '\'' + '}';
    }

    public void setApkFileReady(boolean z) {
        this.apkFileReady = z;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setHasNew(boolean z) {
        this.hasNew = z;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setReleaseNote(String str) {
        this.releaseNote = str;
    }

    public void setShouldShowUpgradeDialog(boolean z) {
        this.shouldShowUpgradeDialog = z;
    }

    public void setShouldStrongNotice(boolean z) {
        this.shouldStrongNotice = z;
    }

    public void setUpgradePlan(UpgradePlan upgradePlan2) {
        this.upgradePlan = upgradePlan2;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
