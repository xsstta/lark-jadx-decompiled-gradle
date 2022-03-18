package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class MailNotificationSettingData implements Serializable {
    private boolean enableMailNotification;

    public boolean isEnableMailNotification() {
        return this.enableMailNotification;
    }

    public void setEnableMailNotification(boolean z) {
        this.enableMailNotification = z;
    }

    public MailNotificationSettingData(boolean z) {
        this.enableMailNotification = z;
    }
}
