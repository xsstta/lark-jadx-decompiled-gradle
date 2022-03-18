package com.ss.android.lark.biz.core.api;

import java.io.Serializable;

public class NotificationSettingDetail implements Serializable {
    private boolean isEnable;
    private boolean isSoundOn;
    private boolean isVibrationOn;

    public boolean isEnable() {
        return this.isEnable;
    }

    public boolean isSoundOn() {
        return this.isSoundOn;
    }

    public boolean isVibrationOn() {
        return this.isVibrationOn;
    }

    public String toString() {
        return "NotificationSettingDetail{isEnable = " + this.isEnable + ", isVibrationOn = " + this.isVibrationOn + ", isSoundOn = " + this.isSoundOn + '}';
    }

    public NotificationSettingDetail(boolean z, boolean z2, boolean z3) {
        this.isEnable = z;
        this.isVibrationOn = z2;
        this.isSoundOn = z3;
    }
}
