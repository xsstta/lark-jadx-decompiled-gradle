package com.ss.lark.android.passport.biz.compat.input_pwd.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.password.PasswordEditText;

public class InputPwdView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InputPwdView f162659a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InputPwdView inputPwdView = this.f162659a;
        if (inputPwdView != null) {
            this.f162659a = null;
            inputPwdView.viewChangePage = null;
            inputPwdView.mPwdEditText = null;
            inputPwdView.tvTitle = null;
            inputPwdView.tvSubtitle = null;
            inputPwdView.tvResetPwd = null;
            inputPwdView.titlebarInputPwd = null;
            inputPwdView.mLlNextStep = null;
            inputPwdView.llContainer = null;
            inputPwdView.clTranslationContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InputPwdView_ViewBinding(InputPwdView inputPwdView, View view) {
        this.f162659a = inputPwdView;
        inputPwdView.viewChangePage = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeCodeWay, "field 'viewChangePage'", TextView.class);
        inputPwdView.mPwdEditText = (PasswordEditText) Utils.findRequiredViewAsType(view, R.id.etPasspord, "field 'mPwdEditText'", PasswordEditText.class);
        inputPwdView.tvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tvInputCode, "field 'tvTitle'", TextView.class);
        inputPwdView.tvSubtitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tvInputCodeSubtitle, "field 'tvSubtitle'", TextView.class);
        inputPwdView.tvResetPwd = (TextView) Utils.findRequiredViewAsType(view, R.id.tvResetPwd, "field 'tvResetPwd'", TextView.class);
        inputPwdView.titlebarInputPwd = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'titlebarInputPwd'", ImageView.class);
        inputPwdView.mLlNextStep = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.llNextStep, "field 'mLlNextStep'", LinearLayout.class);
        inputPwdView.llContainer = Utils.findRequiredView(view, R.id.ll_container, "field 'llContainer'");
        inputPwdView.clTranslationContainer = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.clTranslationContainer, "field 'clTranslationContainer'", ConstraintLayout.class);
    }
}
