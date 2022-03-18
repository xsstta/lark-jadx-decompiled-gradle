package com.ss.android.lark.calendar.impl.features.settings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class CalendarSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarSettingView f82964a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarSettingView calendarSettingView = this.f82964a;
        if (calendarSettingView != null) {
            this.f82964a = null;
            calendarSettingView.mTitleBar = null;
            calendarSettingView.mReminderContainer = null;
            calendarSettingView.mTvReminderTime = null;
            calendarSettingView.mAllDayReminderContainer = null;
            calendarSettingView.mTvAllDayReminderTime = null;
            calendarSettingView.mEventDuration = null;
            calendarSettingView.mTvEventDuration = null;
            calendarSettingView.mFirstDayOfWeek = null;
            calendarSettingView.mWorkHourSetting = null;
            calendarSettingView.mTvEnableWorkHour = null;
            calendarSettingView.mTvFirstDayOfWeek = null;
            calendarSettingView.mEventColorMode = null;
            calendarSettingView.mTvEventColorMode = null;
            calendarSettingView.mNormalAlertTv = null;
            calendarSettingView.mAllDayAlertTv = null;
            calendarSettingView.mDefaultDurationTv = null;
            calendarSettingView.mFirstDayTv = null;
            calendarSettingView.mWorkHourTv = null;
            calendarSettingView.mEventColorTv = null;
            calendarSettingView.mAlternateCalendarTv = null;
            calendarSettingView.mSwitchViewShowPastMask = null;
            calendarSettingView.mSwitchViewShowRejectEvents = null;
            calendarSettingView.mSwitchViewOnlyAcceptReminder = null;
            calendarSettingView.mSwitchDeclineInvitationReminder = null;
            calendarSettingView.mFragmentContainer = null;
            calendarSettingView.mTvTimeZone = null;
            calendarSettingView.mTvGoSettingPage = null;
            calendarSettingView.mAccountManager = null;
            calendarSettingView.mTvAccountManager = null;
            calendarSettingView.mAlternateCalendarContainer = null;
            calendarSettingView.mAlternateCalendarTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarSettingView_ViewBinding(CalendarSettingView calendarSettingView, View view) {
        this.f82964a = calendarSettingView;
        calendarSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        calendarSettingView.mReminderContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_event_reminder, "field 'mReminderContainer'", ViewGroup.class);
        calendarSettingView.mTvReminderTime = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_reminder_time, "field 'mTvReminderTime'", TextView.class);
        calendarSettingView.mAllDayReminderContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_all_day_event_reminder, "field 'mAllDayReminderContainer'", ViewGroup.class);
        calendarSettingView.mTvAllDayReminderTime = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_all_day_event_reminder_time, "field 'mTvAllDayReminderTime'", TextView.class);
        calendarSettingView.mEventDuration = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_event_duration, "field 'mEventDuration'", ViewGroup.class);
        calendarSettingView.mTvEventDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_duration, "field 'mTvEventDuration'", TextView.class);
        calendarSettingView.mFirstDayOfWeek = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_first_day_of_week, "field 'mFirstDayOfWeek'", ViewGroup.class);
        calendarSettingView.mWorkHourSetting = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_work_hour_setting, "field 'mWorkHourSetting'", ViewGroup.class);
        calendarSettingView.mTvEnableWorkHour = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_enable_work_hour, "field 'mTvEnableWorkHour'", TextView.class);
        calendarSettingView.mTvFirstDayOfWeek = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_first_day_of_week, "field 'mTvFirstDayOfWeek'", TextView.class);
        calendarSettingView.mEventColorMode = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_event_color_mode, "field 'mEventColorMode'", ViewGroup.class);
        calendarSettingView.mTvEventColorMode = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_color_mode, "field 'mTvEventColorMode'", TextView.class);
        calendarSettingView.mNormalAlertTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_setting_events, "field 'mNormalAlertTv'", TextView.class);
        calendarSettingView.mAllDayAlertTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_all_day_reminder, "field 'mAllDayAlertTv'", TextView.class);
        calendarSettingView.mDefaultDurationTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_default_duration, "field 'mDefaultDurationTv'", TextView.class);
        calendarSettingView.mFirstDayTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_first_day_hint, "field 'mFirstDayTv'", TextView.class);
        calendarSettingView.mWorkHourTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_work_hour, "field 'mWorkHourTv'", TextView.class);
        calendarSettingView.mEventColorTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_color_hint, "field 'mEventColorTv'", TextView.class);
        calendarSettingView.mAlternateCalendarTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_alternate_calendar, "field 'mAlternateCalendarTv'", TextView.class);
        calendarSettingView.mSwitchViewShowPastMask = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.switch_view_show_past_mask, "field 'mSwitchViewShowPastMask'", UDSwitch.class);
        calendarSettingView.mSwitchViewShowRejectEvents = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.switch_view_show_reject, "field 'mSwitchViewShowRejectEvents'", UDSwitch.class);
        calendarSettingView.mSwitchViewOnlyAcceptReminder = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.switch_view_accept_reminder, "field 'mSwitchViewOnlyAcceptReminder'", UDSwitch.class);
        calendarSettingView.mSwitchDeclineInvitationReminder = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.switch_decline_invitation_reminder, "field 'mSwitchDeclineInvitationReminder'", UDSwitch.class);
        calendarSettingView.mFragmentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.setting_fragment_container, "field 'mFragmentContainer'", FrameLayout.class);
        calendarSettingView.mTvTimeZone = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_current_time_zone, "field 'mTvTimeZone'", TextView.class);
        calendarSettingView.mTvGoSettingPage = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_go_system_setting_page, "field 'mTvGoSettingPage'", TextView.class);
        calendarSettingView.mAccountManager = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_account_manager, "field 'mAccountManager'", ViewGroup.class);
        calendarSettingView.mTvAccountManager = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_account_manager, "field 'mTvAccountManager'", TextView.class);
        calendarSettingView.mAlternateCalendarContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.alternate_calendar_container, "field 'mAlternateCalendarContainer'", LinearLayout.class);
        calendarSettingView.mAlternateCalendarTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_alternate_calendar_mode, "field 'mAlternateCalendarTV'", TextView.class);
    }
}
