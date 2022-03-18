package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.TimeZone;

public class CalendarSetting implements Serializable {
    private static final long serialVersionUID = 1;
    private String accountInviteEmail = "";
    private AlternateCalendar alternateCalendar;
    private boolean bindGoogleCalendar;
    private CalendarSettingConfig calendarSettingConfig;
    private boolean declineInvitationReminder;
    private int defaultAllDayReminder = -480;
    private int defaultEventDuration = 60;
    private int defaultNoneAllDayReminder = 5;
    private String googleAccount = "";
    private Boolean hasEnableEmail = false;
    private boolean isShowOtherTimeZone;
    private String mobileNormalViewTimezone = "";
    private boolean onlyAcceptReminder;
    private boolean showPastEventsMask = true;
    private boolean showPastEventsMaskIOS = true;
    private boolean showPastEventsMaskPC = true;
    private boolean showRejectSchedule = true;
    private CalendarSkinColorTool.SkinType skinType = CalendarSkinColorTool.SkinType.LIGHT;
    private CalendarSkinColorTool.SkinType skinTypeIOS = CalendarSkinColorTool.SkinType.LIGHT;
    private CalendarSkinColorTool.SkinType skinTypePC = CalendarSkinColorTool.SkinType.LIGHT;
    private boolean useSystemMobileNormalViewTimezone = false;
    private DayOfWeek weekStartDay = DayOfWeek.SUNDAY;
    private CalendarWorkHourSetting workHourSetting = new CalendarWorkHourSetting(false, new HashMap(), false);

    public enum AlternateCalendar {
        NONE_CALENDAR(0),
        CHINESE_LUNAR_CALENDAR(1);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static AlternateCalendar valueOf(int i) {
            return forNumber(i);
        }

        public static AlternateCalendar forNumber(int i) {
            if (i == 0) {
                return NONE_CALENDAR;
            }
            if (i != 1) {
                return null;
            }
            return CHINESE_LUNAR_CALENDAR;
        }

        private AlternateCalendar(int i) {
            this.value = i;
        }
    }

    public enum DayOfWeek {
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static DayOfWeek valueOf(int i) {
            return forNumber(i);
        }

        public static DayOfWeek forNumber(int i) {
            switch (i) {
                case 0:
                    return SUNDAY;
                case 1:
                    return MONDAY;
                case 2:
                    return TUESDAY;
                case 3:
                    return WEDNESDAY;
                case 4:
                    return THURSDAY;
                case 5:
                    return FRIDAY;
                case 6:
                    return SATURDAY;
                default:
                    return null;
            }
        }

        private DayOfWeek(int i) {
            this.value = i;
        }
    }

    public AlternateCalendar getAlternateCalendar() {
        return this.alternateCalendar;
    }

    public CalendarSettingConfig getCalendarSettingConfig() {
        return this.calendarSettingConfig;
    }

    public int getDefaultAllDayReminder() {
        return this.defaultAllDayReminder;
    }

    public int getDefaultEventDuration() {
        return this.defaultEventDuration;
    }

    public int getDefaultNoneAllDayReminder() {
        return this.defaultNoneAllDayReminder;
    }

    public String getGoogleAccount() {
        return this.googleAccount;
    }

    public String getMobileNormalViewTimezone() {
        return this.mobileNormalViewTimezone;
    }

    public CalendarSkinColorTool.SkinType getSkinType() {
        return this.skinType;
    }

    public CalendarSkinColorTool.SkinType getSkinTypeIOS() {
        return this.skinTypeIOS;
    }

    public CalendarSkinColorTool.SkinType getSkinTypePC() {
        return this.skinTypePC;
    }

    public boolean getUseSystemMobileNormalViewTimezone() {
        return this.useSystemMobileNormalViewTimezone;
    }

    public DayOfWeek getWeekStartDay() {
        return this.weekStartDay;
    }

    public CalendarWorkHourSetting getWorkHourSetting() {
        return this.workHourSetting;
    }

    public boolean isBindGoogleCalendar() {
        return this.bindGoogleCalendar;
    }

    public boolean isDeclineInvitationReminder() {
        return this.declineInvitationReminder;
    }

    public boolean isOnlyAcceptReminder() {
        return this.onlyAcceptReminder;
    }

    public boolean isShowOtherTimeZone() {
        return this.isShowOtherTimeZone;
    }

    public boolean isShowPastEventsMask() {
        return this.showPastEventsMask;
    }

    public boolean isShowPastEventsMaskIOS() {
        return this.showPastEventsMaskIOS;
    }

    public boolean isShowPastEventsMaskPC() {
        return this.showPastEventsMaskPC;
    }

    public boolean isShowRejectSchedule() {
        return this.showRejectSchedule;
    }

    public boolean isShowLunarCalendar() {
        if (getDisplayAlternateCalendar() == AlternateCalendar.CHINESE_LUNAR_CALENDAR) {
            return true;
        }
        return false;
    }

    public TimeZone getSafeMobileNormalViewTimezone() {
        if (TextUtils.isEmpty(this.mobileNormalViewTimezone) || this.useSystemMobileNormalViewTimezone) {
            return TimeZone.getDefault();
        }
        return TimeZone.getTimeZone(this.mobileNormalViewTimezone);
    }

    public AlternateCalendar getDisplayAlternateCalendar() {
        String str;
        AlternateCalendar alternateCalendar2 = this.alternateCalendar;
        if (alternateCalendar2 != null) {
            return alternateCalendar2;
        }
        CalendarSettingConfig calendarSettingConfig2 = this.calendarSettingConfig;
        if (calendarSettingConfig2 == null || CollectionUtils.isEmpty(calendarSettingConfig2.getLangAlternateCalendarMap())) {
            return AlternateCalendar.NONE_CALENDAR;
        }
        if (C30022a.f74882a.languageDependency().mo108249b()) {
            str = "Chinese";
        } else {
            str = "";
        }
        AlternateCalendar alternateCalendar3 = this.calendarSettingConfig.getLangAlternateCalendarMap().get(str);
        if (alternateCalendar3 == null) {
            return AlternateCalendar.NONE_CALENDAR;
        }
        return alternateCalendar3;
    }

    public String toString() {
        return "bindGoogleCalendar=" + this.bindGoogleCalendar + ",defaultAllDayReminder=" + this.defaultAllDayReminder + ",defaultNoneAllDayReminder=" + this.defaultNoneAllDayReminder + ",defaultNoneAllDayReminder=" + this.showRejectSchedule + ",defaultEventDuration=" + this.defaultEventDuration + ",onlyAcceptReminder=" + this.onlyAcceptReminder + ",declineInvitationReminder=" + this.declineInvitationReminder + ",showPastEventsMask=" + this.showPastEventsMask + ",skinType=" + this.skinType.getNumber() + ",showPastEventsMaskPC=" + this.showPastEventsMaskPC + ",skinTypePC=" + this.skinTypePC.getNumber() + ",showPastEventsMaskIOS=" + this.showPastEventsMaskIOS + ",skinTypeIOS=" + this.skinTypeIOS.getNumber() + ",weekStartDay=" + this.weekStartDay.getNumber() + ",googleCalendar=" + this.googleAccount + ",accountInviteEmail=" + this.accountInviteEmail + ",hasEnableEmail=" + this.hasEnableEmail + ",mobileNormalViewTimezone" + this.mobileNormalViewTimezone;
    }

    public void setAlternateCalendar(AlternateCalendar alternateCalendar2) {
        this.alternateCalendar = alternateCalendar2;
    }

    public void setBindGoogleCalendar(boolean z) {
        this.bindGoogleCalendar = z;
    }

    public void setCalendarSettingConfig(CalendarSettingConfig calendarSettingConfig2) {
        this.calendarSettingConfig = calendarSettingConfig2;
    }

    public void setDeclineInvitationReminder(boolean z) {
        this.declineInvitationReminder = z;
    }

    public void setDefaultAllDayReminder(int i) {
        this.defaultAllDayReminder = i;
    }

    public void setDefaultEventDuration(int i) {
        this.defaultEventDuration = i;
    }

    public void setDefaultNoneAllDayReminder(int i) {
        this.defaultNoneAllDayReminder = i;
    }

    public void setGoogleAccount(String str) {
        this.googleAccount = str;
    }

    public void setOnlyAcceptReminder(boolean z) {
        this.onlyAcceptReminder = z;
    }

    public void setShowOtherTimeZone(boolean z) {
        this.isShowOtherTimeZone = z;
    }

    public void setShowPastEventsMask(boolean z) {
        this.showPastEventsMask = z;
    }

    public void setShowPastEventsMaskIOS(boolean z) {
        this.showPastEventsMaskIOS = z;
    }

    public void setShowPastEventsMaskPC(boolean z) {
        this.showPastEventsMaskPC = z;
    }

    public void setShowRejectSchedule(boolean z) {
        this.showRejectSchedule = z;
    }

    public void setSkinType(CalendarSkinColorTool.SkinType skinType2) {
        this.skinType = skinType2;
    }

    public void setSkinTypeIOS(CalendarSkinColorTool.SkinType skinType2) {
        this.skinTypeIOS = skinType2;
    }

    public void setSkinTypePC(CalendarSkinColorTool.SkinType skinType2) {
        this.skinTypePC = skinType2;
    }

    public void setUseSystemMobileNormalViewTimezone(boolean z) {
        this.useSystemMobileNormalViewTimezone = z;
    }

    public void setWeekStartDay(DayOfWeek dayOfWeek) {
        this.weekStartDay = dayOfWeek;
    }

    public void setWorkHourSetting(CalendarWorkHourSetting calendarWorkHourSetting) {
        this.workHourSetting = calendarWorkHourSetting;
    }

    public void setMobileNormalViewTimezone(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mobileNormalViewTimezone = "";
        } else {
            this.mobileNormalViewTimezone = str;
        }
    }
}
