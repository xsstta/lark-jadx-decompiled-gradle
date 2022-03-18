package com.tt.miniapp.settings.configs;

public class SnapshotAppConfig {
    String appId;
    boolean enableSnapshot;
    private boolean enableStandardSnapshot;
    boolean isForceSnapshot;
    public String minClientVersionCode;
    public String minJsSdkVersionCode;
    public String minMiniAppVersionCode;
    public boolean snapshotHomePage;
    public String tenantId;

    public String getAppId() {
        return this.appId;
    }

    public String getClientVersion() {
        return this.minClientVersionCode;
    }

    public String getMinJsSdkVersionCode() {
        return this.minJsSdkVersionCode;
    }

    public String getMinMiniAppVersionCode() {
        return this.minMiniAppVersionCode;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public boolean isEnableSnapshot() {
        return this.enableSnapshot;
    }

    public boolean isEnableStandardSnapshot() {
        return this.enableStandardSnapshot;
    }

    public boolean isForceSnapshot() {
        return this.isForceSnapshot;
    }

    public boolean isSnapshotHomePage() {
        return this.snapshotHomePage;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setClientVersion(String str) {
        this.minClientVersionCode = str;
    }

    public void setEnableSnapshot(boolean z) {
        this.enableSnapshot = z;
    }

    public void setEnableStandardSnapshot(boolean z) {
        this.enableStandardSnapshot = z;
    }

    public void setForceSnapshot(boolean z) {
        this.isForceSnapshot = z;
    }

    public void setMinJsSdkVersionCode(String str) {
        this.minJsSdkVersionCode = str;
    }

    public void setMinMiniAppVersionCode(String str) {
        this.minMiniAppVersionCode = str;
    }

    public void setSnapshotHomePage(boolean z) {
        this.snapshotHomePage = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }
}
