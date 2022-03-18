package com.ss.lark.android.passport.biz.feature.login_register_base.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.NoScrollViewPager;

public class LoginRegisterBaseView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LoginRegisterBaseView f163607a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LoginRegisterBaseView loginRegisterBaseView = this.f163607a;
        if (loginRegisterBaseView != null) {
            this.f163607a = null;
            loginRegisterBaseView.tvLoginPolicy = null;
            loginRegisterBaseView.ivBack = null;
            loginRegisterBaseView.checkBoxPolicy = null;
            loginRegisterBaseView.llRegisterPolicy = null;
            loginRegisterBaseView.tvRegister = null;
            loginRegisterBaseView.mLlChange = null;
            loginRegisterBaseView.mTvPolicy = null;
            loginRegisterBaseView.mFeishuTitleTab = null;
            loginRegisterBaseView.mLarkTitleTab = null;
            loginRegisterBaseView.mSubTitle = null;
            loginRegisterBaseView.mContainerWithoutTitle = null;
            loginRegisterBaseView.mllBottom = null;
            loginRegisterBaseView.mRegisterContentFrame = null;
            loginRegisterBaseView.tvChangeLanguage = null;
            loginRegisterBaseView.tvTitle = null;
            loginRegisterBaseView.tvSplit = null;
            loginRegisterBaseView.mLlBottomCompany = null;
            loginRegisterBaseView.mLlCompanyLogin = null;
            loginRegisterBaseView.mLlGoogleLogin = null;
            loginRegisterBaseView.mLlAppleLogin = null;
            loginRegisterBaseView.mViewPager = null;
            loginRegisterBaseView.mLlSplite = null;
            loginRegisterBaseView.mBtnNext = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LoginRegisterBaseView_ViewBinding(LoginRegisterBaseView loginRegisterBaseView, View view) {
        this.f163607a = loginRegisterBaseView;
        loginRegisterBaseView.tvLoginPolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.tvLoginPolicy, "field 'tvLoginPolicy'", TextView.class);
        loginRegisterBaseView.ivBack = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_back, "field 'ivBack'", ImageView.class);
        loginRegisterBaseView.checkBoxPolicy = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.checkBoxPolicy, "field 'checkBoxPolicy'", AppCompatCheckBox.class);
        loginRegisterBaseView.llRegisterPolicy = Utils.findRequiredView(view, R.id.ll_register_policy, "field 'llRegisterPolicy'");
        loginRegisterBaseView.tvRegister = (TextView) Utils.findRequiredViewAsType(view, R.id.tvRegister, "field 'tvRegister'", TextView.class);
        loginRegisterBaseView.mLlChange = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_change, "field 'mLlChange'", LinearLayout.class);
        loginRegisterBaseView.mTvPolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.tvPolicy, "field 'mTvPolicy'", TextView.class);
        loginRegisterBaseView.mFeishuTitleTab = Utils.findRequiredView(view, R.id.feishu_tab_view, "field 'mFeishuTitleTab'");
        loginRegisterBaseView.mLarkTitleTab = Utils.findRequiredView(view, R.id.lark_tab_view, "field 'mLarkTitleTab'");
        loginRegisterBaseView.mSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sub_title, "field 'mSubTitle'", TextView.class);
        loginRegisterBaseView.mContainerWithoutTitle = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.login_content_frame_without_title, "field 'mContainerWithoutTitle'", ViewGroup.class);
        loginRegisterBaseView.mllBottom = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.llBottom, "field 'mllBottom'", ViewGroup.class);
        loginRegisterBaseView.mRegisterContentFrame = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.register_content_frame, "field 'mRegisterContentFrame'", LinearLayout.class);
        loginRegisterBaseView.tvChangeLanguage = (AppCompatTextView) Utils.findRequiredViewAsType(view, R.id.tvChangeLanguage, "field 'tvChangeLanguage'", AppCompatTextView.class);
        loginRegisterBaseView.tvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'tvTitle'", TextView.class);
        loginRegisterBaseView.tvSplit = (TextView) Utils.findRequiredViewAsType(view, R.id.tvSplit, "field 'tvSplit'", TextView.class);
        loginRegisterBaseView.mLlBottomCompany = Utils.findRequiredView(view, R.id.llBottomCompany, "field 'mLlBottomCompany'");
        loginRegisterBaseView.mLlCompanyLogin = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.llCompanyLogin, "field 'mLlCompanyLogin'", LinearLayout.class);
        loginRegisterBaseView.mLlGoogleLogin = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.llGoogleLogin, "field 'mLlGoogleLogin'", LinearLayout.class);
        loginRegisterBaseView.mLlAppleLogin = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.llAppleLogin, "field 'mLlAppleLogin'", LinearLayout.class);
        loginRegisterBaseView.mViewPager = (NoScrollViewPager) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'mViewPager'", NoScrollViewPager.class);
        loginRegisterBaseView.mLlSplite = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_splite, "field 'mLlSplite'", LinearLayout.class);
        loginRegisterBaseView.mBtnNext = (Button) Utils.findRequiredViewAsType(view, R.id.btn_next, "field 'mBtnNext'", Button.class);
    }
}
