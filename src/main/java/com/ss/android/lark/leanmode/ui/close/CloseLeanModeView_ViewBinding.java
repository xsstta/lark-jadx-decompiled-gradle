package com.ss.android.lark.leanmode.ui.close;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class CloseLeanModeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CloseLeanModeView f105074a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CloseLeanModeView closeLeanModeView = this.f105074a;
        if (closeLeanModeView != null) {
            this.f105074a = null;
            closeLeanModeView.mTitleBar = null;
            closeLeanModeView.mIvUserAvatar = null;
            closeLeanModeView.mTvUserName = null;
            closeLeanModeView.mBtnSecurityVerify = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CloseLeanModeView_ViewBinding(CloseLeanModeView closeLeanModeView, View view) {
        this.f105074a = closeLeanModeView;
        closeLeanModeView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.lean_mode_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        closeLeanModeView.mIvUserAvatar = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.lean_mode_user_avatar, "field 'mIvUserAvatar'", SelectableRoundedImageView.class);
        closeLeanModeView.mTvUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.lean_mode_user_name, "field 'mTvUserName'", TextView.class);
        closeLeanModeView.mBtnSecurityVerify = (LKUIButton) Utils.findRequiredViewAsType(view, R.id.lean_mode_goto_security_verify, "field 'mBtnSecurityVerify'", LKUIButton.class);
    }
}
