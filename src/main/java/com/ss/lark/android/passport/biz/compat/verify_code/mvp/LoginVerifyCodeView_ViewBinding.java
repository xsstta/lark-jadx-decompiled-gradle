package com.ss.lark.android.passport.biz.compat.verify_code.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText;

public class LoginVerifyCodeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LoginVerifyCodeView f162936a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LoginVerifyCodeView loginVerifyCodeView = this.f162936a;
        if (loginVerifyCodeView != null) {
            this.f162936a = null;
            loginVerifyCodeView.tvVerifySub = null;
            loginVerifyCodeView.tvTitle = null;
            loginVerifyCodeView.mVerifyCodeEditText = null;
            loginVerifyCodeView.mCountdownTv = null;
            loginVerifyCodeView.titlbarVeryfyCode = null;
            loginVerifyCodeView.viewChange = null;
            loginVerifyCodeView.tvTips = null;
            loginVerifyCodeView.mLlFindAccount = null;
            loginVerifyCodeView.mTvFindAccountClick = null;
            loginVerifyCodeView.llContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LoginVerifyCodeView_ViewBinding(LoginVerifyCodeView loginVerifyCodeView, View view) {
        this.f162936a = loginVerifyCodeView;
        loginVerifyCodeView.tvVerifySub = (TextView) Utils.findRequiredViewAsType(view, R.id.tvVerifySub, "field 'tvVerifySub'", TextView.class);
        loginVerifyCodeView.tvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'tvTitle'", TextView.class);
        loginVerifyCodeView.mVerifyCodeEditText = (VerifyCodeEditText) Utils.findRequiredViewAsType(view, R.id.vc_et, "field 'mVerifyCodeEditText'", VerifyCodeEditText.class);
        loginVerifyCodeView.mCountdownTv = (TextView) Utils.findRequiredViewAsType(view, R.id.countdown_tv, "field 'mCountdownTv'", TextView.class);
        loginVerifyCodeView.titlbarVeryfyCode = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'titlbarVeryfyCode'", ImageView.class);
        loginVerifyCodeView.viewChange = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeCodeWay, "field 'viewChange'", TextView.class);
        loginVerifyCodeView.tvTips = (TextView) Utils.findRequiredViewAsType(view, R.id.tvTips, "field 'tvTips'", TextView.class);
        loginVerifyCodeView.mLlFindAccount = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_find_account, "field 'mLlFindAccount'", LinearLayout.class);
        loginVerifyCodeView.mTvFindAccountClick = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_find_account_click, "field 'mTvFindAccountClick'", TextView.class);
        loginVerifyCodeView.llContainer = Utils.findRequiredView(view, R.id.ll_container, "field 'llContainer'");
    }
}
