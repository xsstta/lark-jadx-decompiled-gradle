package com.ss.android.lark.notification.setting.impl.setting.mvp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView;
import com.ss.android.lark.notification.setting.impl.setting.view.NotifyDetailSettingView;
import com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.switch_button.SwitchButton;

public class NotificationSettingsView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotificationSettingsView f122279a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotificationSettingsView notificationSettingsView = this.f122279a;
        if (notificationSettingsView != null) {
            this.f122279a = null;
            notificationSettingsView.mTitleBar = null;
            notificationSettingsView.mDesktopTitleBar = null;
            notificationSettingsView.mBadgeStyleView = null;
            notificationSettingsView.mMuteOptionView = null;
            notificationSettingsView.mNotifyDetailSettingView = null;
            notificationSettingsView.mSoundAndVibrationSettingView = null;
            notificationSettingsView.mNotificationSettingWrapper = null;
            notificationSettingsView.mBadgeTip = null;
            notificationSettingsView.mNotificationTip = null;
            notificationSettingsView.mUndisturbedSwitcher = null;
            notificationSettingsView.mMeetingUndisturbedView = null;
            notificationSettingsView.mGuidanceEntry = null;
            notificationSettingsView.mNotificationGuidance = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotificationSettingsView_ViewBinding(NotificationSettingsView notificationSettingsView, View view) {
        this.f122279a = notificationSettingsView;
        notificationSettingsView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        notificationSettingsView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_mine_title, "field 'mDesktopTitleBar'", TextView.class);
        notificationSettingsView.mBadgeStyleView = Utils.findRequiredView(view, R.id.badge_style_zone, "field 'mBadgeStyleView'");
        notificationSettingsView.mMuteOptionView = (MuteOnPCLoginView) Utils.findRequiredViewAsType(view, R.id.mute_option_zone, "field 'mMuteOptionView'", MuteOnPCLoginView.class);
        notificationSettingsView.mNotifyDetailSettingView = (NotifyDetailSettingView) Utils.findRequiredViewAsType(view, R.id.notify_detail, "field 'mNotifyDetailSettingView'", NotifyDetailSettingView.class);
        notificationSettingsView.mSoundAndVibrationSettingView = (SoundsAndVibrationSettingView) Utils.findRequiredViewAsType(view, R.id.notification_setting, "field 'mSoundAndVibrationSettingView'", SoundsAndVibrationSettingView.class);
        notificationSettingsView.mNotificationSettingWrapper = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.notification_setting_wrapper_fl, "field 'mNotificationSettingWrapper'", FrameLayout.class);
        notificationSettingsView.mBadgeTip = (TextView) Utils.findRequiredViewAsType(view, R.id.badge_tip, "field 'mBadgeTip'", TextView.class);
        notificationSettingsView.mNotificationTip = (TextView) Utils.findRequiredViewAsType(view, R.id.notification_tip, "field 'mNotificationTip'", TextView.class);
        notificationSettingsView.mUndisturbedSwitcher = (SwitchButton) Utils.findRequiredViewAsType(view, R.id.meeting_undisturbed_switcher, "field 'mUndisturbedSwitcher'", SwitchButton.class);
        notificationSettingsView.mMeetingUndisturbedView = Utils.findRequiredView(view, R.id.meeting_undisturbed, "field 'mMeetingUndisturbedView'");
        notificationSettingsView.mGuidanceEntry = Utils.findRequiredView(view, R.id.guidance_entry, "field 'mGuidanceEntry'");
        notificationSettingsView.mNotificationGuidance = Utils.findRequiredView(view, R.id.notification_guidance, "field 'mNotificationGuidance'");
    }
}
