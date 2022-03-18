package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public class NotificationView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotificationView f110493a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotificationView notificationView = this.f110493a;
        if (notificationView != null) {
            this.f110493a = null;
            notificationView.mPushRadio = null;
            notificationView.mBotRadio = null;
            notificationView.mPushLayout = null;
            notificationView.mBotLayout = null;
            notificationView.mNotificationSettingListView = null;
            notificationView.mNotificationAllSwitchView = null;
            notificationView.mNotificationSettingListLayout = null;
            notificationView.mNotificationChannelLayout = null;
            notificationView.mPushTv = null;
            notificationView.mBotTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotificationView_ViewBinding(NotificationView notificationView, View view) {
        this.f110493a = notificationView;
        notificationView.mPushRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_notification_channel_push_radio, "field 'mPushRadio'", UDCheckBox.class);
        notificationView.mBotRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_notification_channel_bot_radio, "field 'mBotRadio'", UDCheckBox.class);
        notificationView.mPushLayout = Utils.findRequiredView(view, R.id.mail_notification_channel_push_layout, "field 'mPushLayout'");
        notificationView.mBotLayout = Utils.findRequiredView(view, R.id.mail_notification_channel_bot_layout, "field 'mBotLayout'");
        notificationView.mNotificationSettingListView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.mail_notification_setting_list, "field 'mNotificationSettingListView'", LinearLayout.class);
        notificationView.mNotificationAllSwitchView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.mail_notification_all_switch, "field 'mNotificationAllSwitchView'", LinearLayout.class);
        notificationView.mNotificationSettingListLayout = Utils.findRequiredView(view, R.id.mail_notification_setting_list_layout, "field 'mNotificationSettingListLayout'");
        notificationView.mNotificationChannelLayout = Utils.findRequiredView(view, R.id.mail_notification_channel_layout, "field 'mNotificationChannelLayout'");
        notificationView.mPushTv = (TextView) Utils.findRequiredViewAsType(view, R.id.channel_push_example_text, "field 'mPushTv'", TextView.class);
        notificationView.mBotTv = (TextView) Utils.findRequiredViewAsType(view, R.id.channel_bot_example_text, "field 'mBotTv'", TextView.class);
    }
}
