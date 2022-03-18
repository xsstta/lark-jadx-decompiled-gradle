package com.ss.lark.android.passport.biz.feature.set.mvp;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class SetNewPasswordView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SetNewPasswordView f163715a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SetNewPasswordView setNewPasswordView = this.f163715a;
        if (setNewPasswordView != null) {
            this.f163715a = null;
            setNewPasswordView.mTitle = null;
            setNewPasswordView.mPwdEditText = null;
            setNewPasswordView.mPwdEditTextAgain = null;
            setNewPasswordView.tvPwdErrorTip = null;
            setNewPasswordView.tvPwdAgainErrorTip = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SetNewPasswordView_ViewBinding(SetNewPasswordView setNewPasswordView, View view) {
        this.f163715a = setNewPasswordView;
        setNewPasswordView.mTitle = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.signin_sdk_widget_title_bar, "field 'mTitle'", CommonTitleBar.class);
        setNewPasswordView.mPwdEditText = (PasswordEditText) Utils.findRequiredViewAsType(view, R.id.pwd_edit, "field 'mPwdEditText'", PasswordEditText.class);
        setNewPasswordView.mPwdEditTextAgain = (PasswordEditText) Utils.findRequiredViewAsType(view, R.id.pwd_edit_again, "field 'mPwdEditTextAgain'", PasswordEditText.class);
        setNewPasswordView.tvPwdErrorTip = (TextView) Utils.findRequiredViewAsType(view, R.id.tvPwdErrorTip, "field 'tvPwdErrorTip'", TextView.class);
        setNewPasswordView.tvPwdAgainErrorTip = (TextView) Utils.findRequiredViewAsType(view, R.id.tvPwdAgainErrorTip, "field 'tvPwdAgainErrorTip'", TextView.class);
    }
}
