package com.ss.android.lark.setting.service.usersetting.base;

import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.dto.SmsPhoneUrgentSetting;
import java.io.Serializable;

public class UserSetting implements Serializable, Comparable<UserSetting> {
    private boolean autoAudioToText;
    private boolean autoUpdateWorkStatus = true;
    private BadgeStyle badgeStyle;
    private long doNotDisturbEndTime;
    private boolean isMessageNotificationsOff;
    private NotificationSetting notificationSetting;
    private NotificationSettingV2 notificationSettingV2;
    private boolean showNavMuteBadge;
    private SmsPhoneUrgentSetting smsPhoneUrgentSetting;
    private TimeFormatSetting timeFormatSetting;
    private long updateTime;

    public BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public long getDoNotDisturbEndTime() {
        return this.doNotDisturbEndTime;
    }

    public boolean getIsMessageNotificationsOff() {
        return this.isMessageNotificationsOff;
    }

    public NotificationSetting getNotificationSetting() {
        return this.notificationSetting;
    }

    public NotificationSettingV2 getNotificationSettingV2() {
        return this.notificationSettingV2;
    }

    public SmsPhoneUrgentSetting getSmsPhoneUrgentSetting() {
        return this.smsPhoneUrgentSetting;
    }

    public TimeFormatSetting getTimeFormatSetting() {
        return this.timeFormatSetting;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isAutoAudioToText() {
        return this.autoAudioToText;
    }

    public boolean isAutoUpdateWorkStatus() {
        return this.autoUpdateWorkStatus;
    }

    public boolean isShowNavMuteBadge() {
        return this.showNavMuteBadge;
    }

    public void setShowNavMuteBadge(boolean z) {
        this.showNavMuteBadge = z;
    }

    public int compareTo(UserSetting userSetting) {
        return Long.compare(this.updateTime, userSetting.updateTime);
    }

    public UserSetting(boolean z, BadgeStyle badgeStyle2, boolean z2, NotificationSetting notificationSetting2, TimeFormatSetting timeFormatSetting2, boolean z3, long j, SmsPhoneUrgentSetting smsPhoneUrgentSetting2, NotificationSettingV2 notificationSettingV22, long j2, boolean z4) {
        this.autoUpdateWorkStatus = z;
        this.badgeStyle = badgeStyle2;
        this.showNavMuteBadge = z2;
        this.notificationSetting = notificationSetting2;
        this.timeFormatSetting = timeFormatSetting2;
        this.autoAudioToText = z3;
        this.doNotDisturbEndTime = j;
        this.smsPhoneUrgentSetting = smsPhoneUrgentSetting2;
        this.notificationSettingV2 = notificationSettingV22;
        this.updateTime = j2;
        this.isMessageNotificationsOff = z4;
    }
}
