package com.ss.android.lark.mine.dto;

import java.io.Serializable;

public class MailNotificationSetting implements Serializable {
    private boolean enableMailNotification;

    public boolean isEnableMailNotification() {
        return this.enableMailNotification;
    }

    public void setEnableMailNotification(boolean z) {
        this.enableMailNotification = z;
    }

    public MailNotificationSetting(boolean z) {
        this.enableMailNotification = z;
    }
}
