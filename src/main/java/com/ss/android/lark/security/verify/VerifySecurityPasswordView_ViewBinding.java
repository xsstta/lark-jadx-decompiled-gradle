package com.ss.android.lark.security.verify;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.security.widget.SecurityVerifyEditText;

public class VerifySecurityPasswordView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VerifySecurityPasswordView f133905a;

    @Override // butterknife.Unbinder
    public void unbind() {
        VerifySecurityPasswordView verifySecurityPasswordView = this.f133905a;
        if (verifySecurityPasswordView != null) {
            this.f133905a = null;
            verifySecurityPasswordView.mPwdLayout = null;
            verifySecurityPasswordView.mCloseIv = null;
            verifySecurityPasswordView.mVerifyCodeEditText = null;
            verifySecurityPasswordView.mTvForgetPwd = null;
            verifySecurityPasswordView.mAnimationLoadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerifySecurityPasswordView_ViewBinding(VerifySecurityPasswordView verifySecurityPasswordView, View view) {
        this.f133905a = verifySecurityPasswordView;
        verifySecurityPasswordView.mPwdLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.pwd_layout, "field 'mPwdLayout'", RelativeLayout.class);
        verifySecurityPasswordView.mCloseIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.close_iv, "field 'mCloseIv'", ImageView.class);
        verifySecurityPasswordView.mVerifyCodeEditText = (SecurityVerifyEditText) Utils.findRequiredViewAsType(view, R.id.vc_et, "field 'mVerifyCodeEditText'", SecurityVerifyEditText.class);
        verifySecurityPasswordView.mTvForgetPwd = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_forget_pwd, "field 'mTvForgetPwd'", TextView.class);
        verifySecurityPasswordView.mAnimationLoadingView = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.lav_loading, "field 'mAnimationLoadingView'", LKUILottieAnimationView.class);
    }
}
