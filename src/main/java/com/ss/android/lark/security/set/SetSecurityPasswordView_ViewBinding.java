package com.ss.android.lark.security.set;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.security.widget.SecurityVerifyEditText;
import com.ss.android.lark.ui.CommonTitleBar;

public class SetSecurityPasswordView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SetSecurityPasswordView f133882a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SetSecurityPasswordView setSecurityPasswordView = this.f133882a;
        if (setSecurityPasswordView != null) {
            this.f133882a = null;
            setSecurityPasswordView.mTitleBar = null;
            setSecurityPasswordView.mVerifyCodeEditText = null;
            setSecurityPasswordView.mCountDownDesc = null;
            setSecurityPasswordView.mTvSubTitle = null;
            setSecurityPasswordView.mIvSwitch = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SetSecurityPasswordView_ViewBinding(SetSecurityPasswordView setSecurityPasswordView, View view) {
        this.f133882a = setSecurityPasswordView;
        setSecurityPasswordView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        setSecurityPasswordView.mVerifyCodeEditText = (SecurityVerifyEditText) Utils.findRequiredViewAsType(view, R.id.vc_et, "field 'mVerifyCodeEditText'", SecurityVerifyEditText.class);
        setSecurityPasswordView.mCountDownDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.countdown_desc_tv, "field 'mCountDownDesc'", TextView.class);
        setSecurityPasswordView.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sub_title, "field 'mTvSubTitle'", TextView.class);
        setSecurityPasswordView.mIvSwitch = (CheckBox) Utils.findRequiredViewAsType(view, R.id.iv_switch, "field 'mIvSwitch'", CheckBox.class);
    }
}
