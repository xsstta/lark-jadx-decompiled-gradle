package com.ss.android.lark.contact.impl.contacts_email.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public final class BusinessCardsView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BusinessCardsView f91981a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BusinessCardsView businessCardsView = this.f91981a;
        if (businessCardsView != null) {
            this.f91981a = null;
            businessCardsView.titleBar = null;
            businessCardsView.breadcrumbView = null;
            businessCardsView.ptrLayout = null;
            businessCardsView.businessCardsRV = null;
            businessCardsView.emptyLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BusinessCardsView_ViewBinding(BusinessCardsView businessCardsView, View view) {
        this.f91981a = businessCardsView;
        businessCardsView.titleBar = (CommonTitleBar) Utils.findOptionalViewAsType(view, R.id.bussiness_card_titlebar, "field 'titleBar'", CommonTitleBar.class);
        businessCardsView.breadcrumbView = (UDBreadcrumb) Utils.findOptionalViewAsType(view, R.id.breadcrumbs_view, "field 'breadcrumbView'", UDBreadcrumb.class);
        businessCardsView.ptrLayout = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.business_card_ptr_layout, "field 'ptrLayout'", LKUIPtrClassicFrameLayout.class);
        businessCardsView.businessCardsRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.business_card_rv, "field 'businessCardsRV'", CommonRecyclerView.class);
        businessCardsView.emptyLayout = (UDEmptyState) Utils.findRequiredViewAsType(view, R.id.ll_empty, "field 'emptyLayout'", UDEmptyState.class);
    }
}
