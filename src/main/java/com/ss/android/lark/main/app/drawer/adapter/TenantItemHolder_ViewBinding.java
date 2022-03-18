package com.ss.android.lark.main.app.drawer.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;

public class TenantItemHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TenantItemHolder f112184a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TenantItemHolder tenantItemHolder = this.f112184a;
        if (tenantItemHolder != null) {
            this.f112184a = null;
            tenantItemHolder.mAvatar = null;
            tenantItemHolder.mCurrentUserIndicator = null;
            tenantItemHolder.mTenantAvatarBadge = null;
            tenantItemHolder.unvalidTipView = null;
            tenantItemHolder.mTenantName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TenantItemHolder_ViewBinding(TenantItemHolder tenantItemHolder, View view) {
        this.f112184a = tenantItemHolder;
        tenantItemHolder.mAvatar = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatar'", SelectableRoundedImageView.class);
        tenantItemHolder.mCurrentUserIndicator = Utils.findRequiredView(view, R.id.indicator, "field 'mCurrentUserIndicator'");
        tenantItemHolder.mTenantAvatarBadge = (LKUIBadgeView) Utils.findRequiredViewAsType(view, R.id.tenant_avatar_badge, "field 'mTenantAvatarBadge'", LKUIBadgeView.class);
        tenantItemHolder.unvalidTipView = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_unvalid_tip, "field 'unvalidTipView'", ImageView.class);
        tenantItemHolder.mTenantName = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_tenant_name, "field 'mTenantName'", TextView.class);
    }
}
