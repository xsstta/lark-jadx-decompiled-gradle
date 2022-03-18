package com.tt.miniapp.settings.configs;

import java.util.List;

public class SnapshotConfig {
    List<SnapshotAppConfig> appList;
    List<SnapshotAppConfig> appListV2;
    private boolean createInSeparate;
    private boolean createNewVersion;
    List<String> whiteList;

    public List<SnapshotAppConfig> getAppList() {
        return this.appList;
    }

    public List<SnapshotAppConfig> getAppListV2() {
        return this.appListV2;
    }

    public List<String> getWhiteList() {
        return this.whiteList;
    }

    public boolean isCreateInSeparate() {
        return this.createInSeparate;
    }

    public boolean isCreateNewVersion() {
        return this.createNewVersion;
    }

    public void setAppList(List<SnapshotAppConfig> list) {
        this.appList = list;
    }

    public void setAppListV2(List<SnapshotAppConfig> list) {
        this.appListV2 = list;
    }

    public void setCreateInSeparate(boolean z) {
        this.createInSeparate = z;
    }

    public void setCreateNewVersion(boolean z) {
        this.createNewVersion = z;
    }

    public void setWhiteList(List<String> list) {
        this.whiteList = list;
    }
}
