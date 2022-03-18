package com.ss.android.lark.notification.setting.impl.setting.view;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class NotificationEntranceView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotificationEntranceView f122331a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotificationEntranceView notificationEntranceView = this.f122331a;
        if (notificationEntranceView != null) {
            this.f122331a = null;
            notificationEntranceView.mNotificationCloseTipView = null;
            notificationEntranceView.mStatusView = null;
            notificationEntranceView.mDescView = null;
            notificationEntranceView.mNextDivider = null;
            notificationEntranceView.mSettingEntranceView = null;
            notificationEntranceView.mNotifyTipEntranceView = null;
            notificationEntranceView.mNotificationTipText = null;
            notificationEntranceView.mEntranceText = null;
            notificationEntranceView.mTopDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotificationEntranceView_ViewBinding(NotificationEntranceView notificationEntranceView, View view) {
        this.f122331a = notificationEntranceView;
        notificationEntranceView.mNotificationCloseTipView = Utils.findRequiredView(view, R.id.system_notification_close_tip, "field 'mNotificationCloseTipView'");
        notificationEntranceView.mStatusView = (TextView) Utils.findRequiredViewAsType(view, R.id.status, "field 'mStatusView'", TextView.class);
        notificationEntranceView.mDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.system_close_tip, "field 'mDescView'", TextView.class);
        notificationEntranceView.mNextDivider = Utils.findRequiredView(view, R.id.next_divider, "field 'mNextDivider'");
        notificationEntranceView.mSettingEntranceView = Utils.findRequiredView(view, R.id.setting_entrance, "field 'mSettingEntranceView'");
        notificationEntranceView.mNotifyTipEntranceView = Utils.findRequiredView(view, R.id.notify_tip_entrance, "field 'mNotifyTipEntranceView'");
        notificationEntranceView.mNotificationTipText = (TextView) Utils.findRequiredViewAsType(view, R.id.tip_text, "field 'mNotificationTipText'", TextView.class);
        notificationEntranceView.mEntranceText = (TextView) Utils.findRequiredViewAsType(view, R.id.entrance_text, "field 'mEntranceText'", TextView.class);
        notificationEntranceView.mTopDivider = Utils.findRequiredView(view, R.id.top_divider, "field 'mTopDivider'");
    }
}
