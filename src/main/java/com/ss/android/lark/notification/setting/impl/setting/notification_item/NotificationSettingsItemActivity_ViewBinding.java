package com.ss.android.lark.notification.setting.impl.setting.notification_item;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;

public class NotificationSettingsItemActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotificationSettingsItemActivity f122320a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotificationSettingsItemActivity notificationSettingsItemActivity = this.f122320a;
        if (notificationSettingsItemActivity != null) {
            this.f122320a = null;
            notificationSettingsItemActivity.mSettingZone = null;
            notificationSettingsItemActivity.mSettingSoundSwitch = null;
            notificationSettingsItemActivity.mSettingVibrateSwitch = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotificationSettingsItemActivity_ViewBinding(NotificationSettingsItemActivity notificationSettingsItemActivity, View view) {
        this.f122320a = notificationSettingsItemActivity;
        notificationSettingsItemActivity.mSettingZone = Utils.findRequiredView(view, R.id.settings_zone, "field 'mSettingZone'");
        notificationSettingsItemActivity.mSettingSoundSwitch = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.mine_setting_sound, "field 'mSettingSoundSwitch'", LKUISwitchButton.class);
        notificationSettingsItemActivity.mSettingVibrateSwitch = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.mine_setting_vibrate, "field 'mSettingVibrateSwitch'", LKUISwitchButton.class);
    }
}
