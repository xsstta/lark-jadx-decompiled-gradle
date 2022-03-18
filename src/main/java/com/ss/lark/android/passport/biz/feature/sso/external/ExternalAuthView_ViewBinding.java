package com.ss.lark.android.passport.biz.feature.sso.external;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class ExternalAuthView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ExternalAuthView f163792a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ExternalAuthView externalAuthView = this.f163792a;
        if (externalAuthView != null) {
            this.f163792a = null;
            externalAuthView.mTenantIcon = null;
            externalAuthView.mUerAvatarUrl = null;
            externalAuthView.mLarkAvatarUrl = null;
            externalAuthView.mIdentityTitle = null;
            externalAuthView.mTenantName = null;
            externalAuthView.mUserName = null;
            externalAuthView.mTitle = null;
            externalAuthView.mAuthTitle = null;
            externalAuthView.mPermissionLayout = null;
            externalAuthView.mConfirmBtn = null;
            externalAuthView.mTvPermissionTitle = null;
            externalAuthView.mIvCancel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ExternalAuthView_ViewBinding(ExternalAuthView externalAuthView, View view) {
        this.f163792a = externalAuthView;
        externalAuthView.mTenantIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_user_tenant_icon, "field 'mTenantIcon'", ImageView.class);
        externalAuthView.mUerAvatarUrl = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_user_avatar_url, "field 'mUerAvatarUrl'", ImageView.class);
        externalAuthView.mLarkAvatarUrl = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_lark_avatar_url, "field 'mLarkAvatarUrl'", ImageView.class);
        externalAuthView.mIdentityTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_info_login, "field 'mIdentityTitle'", TextView.class);
        externalAuthView.mTenantName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_tenant_name, "field 'mTenantName'", TextView.class);
        externalAuthView.mUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_name, "field 'mUserName'", TextView.class);
        externalAuthView.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'mTitle'", TextView.class);
        externalAuthView.mAuthTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_auth_title, "field 'mAuthTitle'", TextView.class);
        externalAuthView.mPermissionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_permission_layout, "field 'mPermissionLayout'", LinearLayout.class);
        externalAuthView.mConfirmBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.btn_confirm, "field 'mConfirmBtn'", TextView.class);
        externalAuthView.mTvPermissionTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_permission_title, "field 'mTvPermissionTitle'", TextView.class);
        externalAuthView.mIvCancel = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_cancel, "field 'mIvCancel'", ImageView.class);
    }
}
