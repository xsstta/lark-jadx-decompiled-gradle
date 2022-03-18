package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SSOSdkAuthView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SSOSdkAuthView f163847a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SSOSdkAuthView sSOSdkAuthView = this.f163847a;
        if (sSOSdkAuthView != null) {
            this.f163847a = null;
            sSOSdkAuthView.mTitle = null;
            sSOSdkAuthView.mTenantIcon = null;
            sSOSdkAuthView.mUerAvatarUrl = null;
            sSOSdkAuthView.mLarkAvatarUrl = null;
            sSOSdkAuthView.mIdentityTitle = null;
            sSOSdkAuthView.mTenantName = null;
            sSOSdkAuthView.mUserName = null;
            sSOSdkAuthView.mAuthTitle = null;
            sSOSdkAuthView.mPermissionLayout = null;
            sSOSdkAuthView.mConfirmBtn = null;
            sSOSdkAuthView.mTvPermissionTitle = null;
            sSOSdkAuthView.mIvCancel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SSOSdkAuthView_ViewBinding(SSOSdkAuthView sSOSdkAuthView, View view) {
        this.f163847a = sSOSdkAuthView;
        sSOSdkAuthView.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'mTitle'", TextView.class);
        sSOSdkAuthView.mTenantIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_user_tenant_icon, "field 'mTenantIcon'", ImageView.class);
        sSOSdkAuthView.mUerAvatarUrl = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_user_avatar_url, "field 'mUerAvatarUrl'", ImageView.class);
        sSOSdkAuthView.mLarkAvatarUrl = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_lark_avatar_url, "field 'mLarkAvatarUrl'", ImageView.class);
        sSOSdkAuthView.mIdentityTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_info_login, "field 'mIdentityTitle'", TextView.class);
        sSOSdkAuthView.mTenantName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_tenant_name, "field 'mTenantName'", TextView.class);
        sSOSdkAuthView.mUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_name, "field 'mUserName'", TextView.class);
        sSOSdkAuthView.mAuthTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_auth_title, "field 'mAuthTitle'", TextView.class);
        sSOSdkAuthView.mPermissionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_permission_layout, "field 'mPermissionLayout'", LinearLayout.class);
        sSOSdkAuthView.mConfirmBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.btn_confirm, "field 'mConfirmBtn'", TextView.class);
        sSOSdkAuthView.mTvPermissionTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_permission_title, "field 'mTvPermissionTitle'", TextView.class);
        sSOSdkAuthView.mIvCancel = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_cancel, "field 'mIvCancel'", ImageView.class);
    }
}
