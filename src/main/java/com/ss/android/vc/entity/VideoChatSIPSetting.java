package com.ss.android.vc.entity;

import java.io.Serializable;

public class VideoChatSIPSetting implements Serializable {
    private String domain;

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }
}
