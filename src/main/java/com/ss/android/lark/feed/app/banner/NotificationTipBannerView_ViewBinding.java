package com.ss.android.lark.feed.app.banner;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class NotificationTipBannerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NotificationTipBannerView f95809a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NotificationTipBannerView notificationTipBannerView = this.f95809a;
        if (notificationTipBannerView != null) {
            this.f95809a = null;
            notificationTipBannerView.mOpenSettingBT = null;
            notificationTipBannerView.mCloseBT = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NotificationTipBannerView_ViewBinding(NotificationTipBannerView notificationTipBannerView, View view) {
        this.f95809a = notificationTipBannerView;
        notificationTipBannerView.mOpenSettingBT = Utils.findRequiredView(view, R.id.open_setting_button, "field 'mOpenSettingBT'");
        notificationTipBannerView.mCloseBT = (ImageView) Utils.findRequiredViewAsType(view, R.id.close, "field 'mCloseBT'", ImageView.class);
    }
}
