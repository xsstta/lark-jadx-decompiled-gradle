package com.ss.android.lark.upgrade.service.impl;

import com.ss.android.lark.upgrade.enity.UpgradePlan;
import com.ss.android.lark.upgrade.enity.VersionData;
import java.io.Serializable;

public class NewVersionResponse implements Serializable {
    private boolean hasNew;
    private String reason;
    private UpgradePlan upgradePlan;
    private VersionData versionData;

    public String getReason() {
        return this.reason;
    }

    public UpgradePlan getUpgradePlan() {
        return this.upgradePlan;
    }

    public VersionData getVersionData() {
        return this.versionData;
    }

    public boolean isHasNew() {
        return this.hasNew;
    }

    public NewVersionResponse(boolean z, VersionData versionData2, UpgradePlan upgradePlan2, String str) {
        this.hasNew = z;
        this.versionData = versionData2;
        this.upgradePlan = upgradePlan2;
        this.reason = str;
    }
}
