package com.ss.android.lark.contact.impl.contacts_selector.subordinate;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SubordinateView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SubordinateView f92499a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SubordinateView subordinateView = this.f92499a;
        if (subordinateView != null) {
            this.f92499a = null;
            subordinateView.mTenantInfo = null;
            subordinateView.mTenantAvatar = null;
            subordinateView.mManageEntry = null;
            subordinateView.mTenantName = null;
            subordinateView.mHeader = null;
            subordinateView.mSubordinateContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SubordinateView_ViewBinding(SubordinateView subordinateView, View view) {
        this.f92499a = subordinateView;
        subordinateView.mTenantInfo = Utils.findRequiredView(view, R.id.contacts_tenant_info, "field 'mTenantInfo'");
        subordinateView.mTenantAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.contacts_tenant_avatar_iv, "field 'mTenantAvatar'", ImageView.class);
        subordinateView.mManageEntry = (TextView) Utils.findRequiredViewAsType(view, R.id.contacts_tenant_manage_entry, "field 'mManageEntry'", TextView.class);
        subordinateView.mTenantName = (TextView) Utils.findRequiredViewAsType(view, R.id.contacts_tenant_name_tv, "field 'mTenantName'", TextView.class);
        subordinateView.mHeader = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.department_header, "field 'mHeader'", RelativeLayout.class);
        subordinateView.mSubordinateContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.subordinate_container, "field 'mSubordinateContainer'", LinearLayout.class);
    }
}
