package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class MainTenantSwitcherView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainTenantSwitcherView f112795a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MainTenantSwitcherView mainTenantSwitcherView = this.f112795a;
        if (mainTenantSwitcherView != null) {
            this.f112795a = null;
            mainTenantSwitcherView.mTenantRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainTenantSwitcherView_ViewBinding(MainTenantSwitcherView mainTenantSwitcherView, View view) {
        this.f112795a = mainTenantSwitcherView;
        mainTenantSwitcherView.mTenantRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.tenant_list, "field 'mTenantRV'", RecyclerView.class);
    }
}
