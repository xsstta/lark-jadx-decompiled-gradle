package com.ss.android.vc.entity;

import java.io.Serializable;

public class VcBillingLinkConfig implements Serializable {
    private String upgradeLink = "";

    public String getUpgradeLink() {
        return this.upgradeLink;
    }

    public String toString() {
        return "VcBillingLinkConfig{upgradeLink='" + this.upgradeLink + '\'' + '}';
    }

    public void setUpgradeLink(String str) {
        this.upgradeLink = str;
    }
}
