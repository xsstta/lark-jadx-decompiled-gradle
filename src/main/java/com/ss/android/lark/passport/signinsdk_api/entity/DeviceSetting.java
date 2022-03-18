package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class DeviceSetting implements Serializable {
    private String localeIdentifier;

    public String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public void setLocaleIdentifier(String str) {
        this.localeIdentifier = str;
    }
}
