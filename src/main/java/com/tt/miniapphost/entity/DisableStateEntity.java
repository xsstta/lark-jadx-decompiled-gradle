package com.tt.miniapphost.entity;

public class DisableStateEntity {
    private final String mDisableHintMessage;
    private final String mDisableHintUrl;

    public String getHintMessage() {
        return this.mDisableHintMessage;
    }

    public String getHintUrl() {
        return this.mDisableHintUrl;
    }

    public DisableStateEntity(String str, String str2) {
        this.mDisableHintMessage = str;
        this.mDisableHintUrl = str2;
    }
}
