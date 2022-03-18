package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText;

public class VerifyCodeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VerifyCodeView f164054a;

    @Override // butterknife.Unbinder
    public void unbind() {
        VerifyCodeView verifyCodeView = this.f164054a;
        if (verifyCodeView != null) {
            this.f164054a = null;
            verifyCodeView.mVerifyCodeEditText = null;
            verifyCodeView.mCountdownTv = null;
            verifyCodeView.viewChange = null;
            verifyCodeView.viewOtp = null;
            verifyCodeView.viewBackupPhone = null;
            verifyCodeView.viewChangeCode = null;
            verifyCodeView.tvTips = null;
            verifyCodeView.mLlFindAccount = null;
            verifyCodeView.mTvFindAccount = null;
            verifyCodeView.mTvFindAccountClick = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerifyCodeView_ViewBinding(VerifyCodeView verifyCodeView, View view) {
        this.f164054a = verifyCodeView;
        verifyCodeView.mVerifyCodeEditText = (VerifyCodeEditText) Utils.findRequiredViewAsType(view, R.id.vc_et, "field 'mVerifyCodeEditText'", VerifyCodeEditText.class);
        verifyCodeView.mCountdownTv = (TextView) Utils.findRequiredViewAsType(view, R.id.countdown_tv, "field 'mCountdownTv'", TextView.class);
        verifyCodeView.viewChange = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangePWdWay, "field 'viewChange'", TextView.class);
        verifyCodeView.viewOtp = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeOtpWay, "field 'viewOtp'", TextView.class);
        verifyCodeView.viewBackupPhone = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeBackUpPhoneWay, "field 'viewBackupPhone'", TextView.class);
        verifyCodeView.viewChangeCode = (TextView) Utils.findRequiredViewAsType(view, R.id.tvChangeCodeWay, "field 'viewChangeCode'", TextView.class);
        verifyCodeView.tvTips = (TextView) Utils.findRequiredViewAsType(view, R.id.tvTips, "field 'tvTips'", TextView.class);
        verifyCodeView.mLlFindAccount = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_find_account, "field 'mLlFindAccount'", LinearLayout.class);
        verifyCodeView.mTvFindAccount = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_find_account, "field 'mTvFindAccount'", TextView.class);
        verifyCodeView.mTvFindAccountClick = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_find_account_click, "field 'mTvFindAccountClick'", TextView.class);
    }
}
