package com.ss.android.lark.notification.dto;

import java.io.Serializable;

public class DriveNotificationSetting implements Serializable {
    private boolean enableDriveNotification;

    public boolean isEnableDriveNotification() {
        return this.enableDriveNotification;
    }

    public void setEnableDriveNotification(boolean z) {
        this.enableDriveNotification = z;
    }

    public DriveNotificationSetting(boolean z) {
        this.enableDriveNotification = z;
    }
}
