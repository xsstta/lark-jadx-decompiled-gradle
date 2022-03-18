package com.ss.android.lark.calendar.impl.features.settings;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.BaseViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import java.util.List;
import java.util.Map;

public class CalendarSettingViewData extends BaseViewData {
    private static final long serialVersionUID = 1;
    private String mAccountInviteEmail;
    private String mAllDayReminder;
    private boolean mBindGoogleCalendar;
    private boolean mChooseAllDayReminder;
    private boolean mChooseAlternateCalendar;
    private boolean mChooseDeclineInvitationReminder;
    private boolean mChooseDefaultDuration;
    private boolean mChooseFirstDay;
    private int mChooseIndex;
    private boolean mChooseOnlyAcceptReminder;
    private boolean mChooseReminder;
    private boolean mChooseShowPastEventsMask;
    private boolean mChooseShowRejectEvents;
    private boolean mChooseSkinType;
    private boolean mChooseWorkHour;
    private boolean mDeclineInvitationReminder;
    private String mDetailTitleText;
    private CalendarSetting.AlternateCalendar mDisplayAlternateCalendar = CalendarSetting.AlternateCalendar.NONE_CALENDAR;
    private String mEventDuration;
    private String mFirstDayOfWeek;
    private Boolean mHasEnableEmail;
    private String mIsEnableWorkHourStr;
    private Map<String, Boolean> mLocalCalAccSetting;
    private boolean mOnlyAcceptReminder;
    private String mReminder;
    private List<String> mSettingItems;
    private boolean mShowPastEventsMask;
    private boolean mShowRejectEvent;
    private CalendarSkinColorTool.SkinType mSkinType = CalendarSkinColorTool.SkinType.LIGHT;
    private String mTimeZone;
    private CalendarWorkHourSetting mWorkHourData;

    public String getAllDayReminder() {
        return this.mAllDayReminder;
    }

    public int getChooseIndex() {
        return this.mChooseIndex;
    }

    public CalendarSetting.AlternateCalendar getDisplayAlternateCalendar() {
        return this.mDisplayAlternateCalendar;
    }

    public String getEnableWorkHourStr() {
        return this.mIsEnableWorkHourStr;
    }

    public String getEventDuration() {
        return this.mEventDuration;
    }

    public String getFirstDayOfWeek() {
        return this.mFirstDayOfWeek;
    }

    public Map<String, Boolean> getLocalCalAccSetting() {
        return this.mLocalCalAccSetting;
    }

    public String getReminder() {
        return this.mReminder;
    }

    public List<String> getSettingItems() {
        return this.mSettingItems;
    }

    public CalendarSkinColorTool.SkinType getSkinType() {
        return this.mSkinType;
    }

    public String getTimeZone() {
        return this.mTimeZone;
    }

    public String getTitleText() {
        return this.mDetailTitleText;
    }

    public CalendarWorkHourSetting getWorkHourData() {
        return this.mWorkHourData;
    }

    public boolean isBindGoogleCalendar() {
        return this.mBindGoogleCalendar;
    }

    public boolean isChooseAllDayReminder() {
        return this.mChooseAllDayReminder;
    }

    public boolean isChooseAlternateCalendar() {
        return this.mChooseAlternateCalendar;
    }

    public boolean isChooseDeclineInvitationReminder() {
        return this.mChooseDeclineInvitationReminder;
    }

    public boolean isChooseDefaultDuration() {
        return this.mChooseDefaultDuration;
    }

    public boolean isChooseFirstDay() {
        return this.mChooseFirstDay;
    }

    public boolean isChooseOnlyAcceptReminder() {
        return this.mChooseOnlyAcceptReminder;
    }

    public boolean isChooseReminder() {
        return this.mChooseReminder;
    }

    public boolean isChooseShowPastEventsMask() {
        return this.mChooseShowPastEventsMask;
    }

    public boolean isChooseShowRejectEvents() {
        return this.mChooseShowRejectEvents;
    }

    public boolean isChooseSkinType() {
        return this.mChooseSkinType;
    }

    public boolean isChooseWorkHour() {
        return this.mChooseWorkHour;
    }

    public boolean isDeclineInvitationReminder() {
        return this.mDeclineInvitationReminder;
    }

    public boolean isOnlyAcceptReminder() {
        return this.mOnlyAcceptReminder;
    }

    public boolean isShowPastEventsMask() {
        return this.mShowPastEventsMask;
    }

    public boolean isShowRejectEvent() {
        return this.mShowRejectEvent;
    }

    public int getSkinTypeStringId() {
        if (CalendarSkinColorTool.SkinType.DARK.equals(this.mSkinType)) {
            return R.string.Calendar_NewSettings_EventColorDarkMode;
        }
        return R.string.Calendar_NewSettings_EventColorLightMode;
    }

    public void setAllDayReminder(String str) {
        this.mAllDayReminder = str;
    }

    public void setBindGoogleCalendar(boolean z) {
        this.mBindGoogleCalendar = z;
    }

    public void setChooseAllDayReminder(boolean z) {
        this.mChooseAllDayReminder = z;
    }

    public void setChooseAlternateCalendar(boolean z) {
        this.mChooseAlternateCalendar = z;
    }

    public void setChooseDeclineInvitationReminder(boolean z) {
        this.mChooseDeclineInvitationReminder = z;
    }

    public void setChooseDefaultDuration(boolean z) {
        this.mChooseDefaultDuration = z;
    }

    public void setChooseFirstDay(boolean z) {
        this.mChooseFirstDay = z;
    }

    public void setChooseIndex(int i) {
        this.mChooseIndex = i;
    }

    public void setChooseOnlyAcceptReminder(boolean z) {
        this.mChooseOnlyAcceptReminder = z;
    }

    public void setChooseReminder(boolean z) {
        this.mChooseReminder = z;
    }

    public void setChooseShowPastEventsMask(boolean z) {
        this.mChooseShowPastEventsMask = z;
    }

    public void setChooseShowRejectEvents(boolean z) {
        this.mChooseShowRejectEvents = z;
    }

    public void setChooseSkinType(boolean z) {
        this.mChooseSkinType = z;
    }

    public void setChooseWorkHour(boolean z) {
        this.mChooseWorkHour = z;
    }

    public void setDeclineInvitationReminder(boolean z) {
        this.mDeclineInvitationReminder = z;
    }

    public void setDisplayAlternateCalendar(CalendarSetting.AlternateCalendar alternateCalendar) {
        this.mDisplayAlternateCalendar = alternateCalendar;
    }

    public void setEnableWorkHourStr(String str) {
        this.mIsEnableWorkHourStr = str;
    }

    public void setEventDuration(String str) {
        this.mEventDuration = str;
    }

    public void setFirstDayOfWeek(String str) {
        this.mFirstDayOfWeek = str;
    }

    public void setItems(List<String> list) {
        this.mSettingItems = list;
    }

    public void setLocalCalAccSetting(Map<String, Boolean> map) {
        this.mLocalCalAccSetting = map;
    }

    public void setOnlyAcceptReminder(boolean z) {
        this.mOnlyAcceptReminder = z;
    }

    public void setReminder(String str) {
        this.mReminder = str;
    }

    public void setShowPastEventsMask(boolean z) {
        this.mShowPastEventsMask = z;
    }

    public void setShowRejectEvent(boolean z) {
        this.mShowRejectEvent = z;
    }

    public void setSkinType(CalendarSkinColorTool.SkinType skinType) {
        this.mSkinType = skinType;
    }

    public void setTimeZone(String str) {
        this.mTimeZone = str;
    }

    public void setTitleText(String str) {
        this.mDetailTitleText = str;
    }

    public void setWorkHourData(CalendarWorkHourSetting calendarWorkHourSetting) {
        this.mWorkHourData = calendarWorkHourSetting;
    }
}
