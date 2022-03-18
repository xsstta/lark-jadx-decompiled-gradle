package com.ss.lark.android.passport.biz.feature.input_pwd.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class InputPwdView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InputPwdView f163374a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InputPwdView inputPwdView = this.f163374a;
        if (inputPwdView != null) {
            this.f163374a = null;
            inputPwdView.viewChangePage = null;
            inputPwdView.mPwdEditText = null;
            inputPwdView.llResetPwd = null;
            inputPwdView.tvResetPwd = null;
            inputPwdView.tvResetPwdClick = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InputPwdView_ViewBinding(InputPwdView inputPwdView, View view) {
        this.f163374a = inputPwdView;
        inputPwdView.viewChangePage = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeCodeWay, "field 'viewChangePage'", TextView.class);
        inputPwdView.mPwdEditText = (PasswordEditText) Utils.findRequiredViewAsType(view, R.id.etPasspord, "field 'mPwdEditText'", PasswordEditText.class);
        inputPwdView.llResetPwd = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.llResetPwd, "field 'llResetPwd'", ViewGroup.class);
        inputPwdView.tvResetPwd = (TextView) Utils.findRequiredViewAsType(view, R.id.tvResetPwd, "field 'tvResetPwd'", TextView.class);
        inputPwdView.tvResetPwdClick = (TextView) Utils.findRequiredViewAsType(view, R.id.tvResetPwdClicked, "field 'tvResetPwdClick'", TextView.class);
    }
}
