package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class NotificationDetail implements Serializable {
    private boolean isNotificationOn = true;
    private boolean isSoundOn = true;
    private boolean isVibrateOn = true;

    public boolean isNotificationOn() {
        return this.isNotificationOn;
    }

    public boolean isSoundOn() {
        return this.isSoundOn;
    }

    public boolean isVibrateOn() {
        return this.isVibrateOn;
    }

    public void setNotificationOn(boolean z) {
        this.isNotificationOn = z;
    }

    public void setSoundOn(boolean z) {
        this.isSoundOn = z;
    }

    public void setVibrateOn(boolean z) {
        this.isVibrateOn = z;
    }
}
