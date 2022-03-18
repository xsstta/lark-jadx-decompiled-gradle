package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class NotificationSettingWrapper implements Serializable {
    private NotificationSetting notificationSetting;
    private NotificationSettingV2 notificationSettingV2;

    public NotificationSetting getNotificationSetting() {
        return this.notificationSetting;
    }

    public NotificationSettingV2 getNotificationSettingV2() {
        return this.notificationSettingV2;
    }

    public void setNotificationSetting(NotificationSetting notificationSetting2) {
        this.notificationSetting = notificationSetting2;
    }

    public void setNotificationSettingV2(NotificationSettingV2 notificationSettingV22) {
        this.notificationSettingV2 = notificationSettingV22;
    }

    public NotificationSettingWrapper(NotificationSetting notificationSetting2, NotificationSettingV2 notificationSettingV22) {
        this.notificationSetting = notificationSetting2;
        this.notificationSettingV2 = notificationSettingV22;
    }
}
