package com.ss.android.vc.entity;

import java.io.Serializable;

public class VcEnterprisePhoneLinkConfig implements Serializable {
    private String controlLink = "";

    public String getControlLink() {
        return this.controlLink;
    }

    public String toString() {
        return "VcEnterprisePhoneLinkConfig{controlLink='" + this.controlLink + '\'' + '}';
    }

    public void setControlLink(String str) {
        this.controlLink = str;
    }
}
