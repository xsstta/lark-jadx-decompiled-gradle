package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class NotificationSetting implements Serializable {
    public int settingType;
    public int specificType;

    public @interface SettingType {
    }

    public @interface Specific {
    }

    public static NotificationSetting allInstance() {
        return new NotificationSetting(0, 0);
    }

    public static NotificationSetting buzzAndMentionInstance() {
        return new NotificationSetting(1, 3);
    }

    public static NotificationSetting buzzInstance() {
        return new NotificationSetting(1, 2);
    }

    public static NotificationSetting mentionInstance() {
        return new NotificationSetting(1, 1);
    }

    public static NotificationSetting noneInstance() {
        return new NotificationSetting(2, 0);
    }

    public boolean isAll() {
        if (this.settingType == 0) {
            return true;
        }
        return false;
    }

    public boolean isBuzz() {
        if (this.settingType == 1 && (this.specificType & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isMention() {
        if (this.settingType == 1 && (this.specificType & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isNone() {
        if (this.settingType == 2) {
            return true;
        }
        return false;
    }

    private NotificationSetting(int i, int i2) {
        this.settingType = i;
        this.specificType = i2;
    }
}
