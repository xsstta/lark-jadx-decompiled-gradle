package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class TenantItemHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TenantItemHolder f112812a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TenantItemHolder tenantItemHolder = this.f112812a;
        if (tenantItemHolder != null) {
            this.f112812a = null;
            tenantItemHolder.mAvatar = null;
            tenantItemHolder.mCurrentUserIndicator = null;
            tenantItemHolder.mMaskView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TenantItemHolder_ViewBinding(TenantItemHolder tenantItemHolder, View view) {
        this.f112812a = tenantItemHolder;
        tenantItemHolder.mAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatar'", LKUIRoundedImageView.class);
        tenantItemHolder.mCurrentUserIndicator = Utils.findRequiredView(view, R.id.indicator, "field 'mCurrentUserIndicator'");
        tenantItemHolder.mMaskView = Utils.findRequiredView(view, R.id.maskView, "field 'mMaskView'");
    }
}
