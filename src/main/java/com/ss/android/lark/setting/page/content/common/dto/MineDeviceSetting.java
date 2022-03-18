package com.ss.android.lark.setting.page.content.common.dto;

import java.io.Serializable;

public class MineDeviceSetting implements Serializable {
    private String localeIdentifier;

    public String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public void setLocaleIdentifier(String str) {
        this.localeIdentifier = str;
    }
}
