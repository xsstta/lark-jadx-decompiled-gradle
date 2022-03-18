package com.ss.android.lark.main.app.widgets.desktop.avatar;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class MainAvatarView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainAvatarView f112761a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MainAvatarView mainAvatarView = this.f112761a;
        if (mainAvatarView != null) {
            this.f112761a = null;
            mainAvatarView.mAvatar = null;
            mainAvatarView.mUpdateTipView = null;
            mainAvatarView.mZenModeTipView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainAvatarView_ViewBinding(MainAvatarView mainAvatarView, View view) {
        this.f112761a = mainAvatarView;
        mainAvatarView.mAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatar'", LKUIRoundedImageView.class);
        mainAvatarView.mUpdateTipView = Utils.findRequiredView(view, R.id.update_tip, "field 'mUpdateTipView'");
        mainAvatarView.mZenModeTipView = Utils.findRequiredView(view, R.id.bottom_tip, "field 'mZenModeTipView'");
    }
}
