package com.ss.android.lark.notification.setting.impl.setting.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class NotifyDetailSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotifyDetailSettingView f122335a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotifyDetailSettingView notifyDetailSettingView = this.f122335a;
        if (notifyDetailSettingView != null) {
            this.f122335a = null;
            notifyDetailSettingView.mSwitcher = null;
            notifyDetailSettingView.mNotifyDetailContainer = null;
            notifyDetailSettingView.mNotifyDetailLabel = null;
            notifyDetailSettingView.mTipText = null;
            notifyDetailSettingView.mTipImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotifyDetailSettingView_ViewBinding(NotifyDetailSettingView notifyDetailSettingView, View view) {
        this.f122335a = notifyDetailSettingView;
        notifyDetailSettingView.mSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.notify_detail_switcher, "field 'mSwitcher'", SwitchButtonWithLoading.class);
        notifyDetailSettingView.mNotifyDetailContainer = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.notify_detail_text, "field 'mNotifyDetailContainer'", ConstraintLayout.class);
        notifyDetailSettingView.mNotifyDetailLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.notify_detail_label, "field 'mNotifyDetailLabel'", TextView.class);
        notifyDetailSettingView.mTipText = (TextView) Utils.findRequiredViewAsType(view, R.id.notify_detail_tip, "field 'mTipText'", TextView.class);
        notifyDetailSettingView.mTipImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.notify_detail_tip_image, "field 'mTipImage'", ImageView.class);
    }
}
