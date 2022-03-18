package com.ss.android.lark.contact.feat.contact_external.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class ExternalContactView2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ExternalContactView2 f91644a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ExternalContactView2 externalContactView2 = this.f91644a;
        if (externalContactView2 != null) {
            this.f91644a = null;
            externalContactView2.mExternalContactLayout = null;
            externalContactView2.mTitleBar = null;
            externalContactView2.mExternalAddLayout = null;
            externalContactView2.mExternalAddTv = null;
            externalContactView2.mExternalContactContentLayout = null;
            externalContactView2.mPtrFrame = null;
            externalContactView2.mExternalContactRV = null;
            externalContactView2.mExternalContactEmptyLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ExternalContactView2_ViewBinding(ExternalContactView2 externalContactView2, View view) {
        this.f91644a = externalContactView2;
        externalContactView2.mExternalContactLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.external_contact_layout, "field 'mExternalContactLayout'", ViewGroup.class);
        externalContactView2.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.external_contact_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        externalContactView2.mExternalAddLayout = Utils.findRequiredView(view, R.id.external_add_layout, "field 'mExternalAddLayout'");
        externalContactView2.mExternalAddTv = (TextView) Utils.findRequiredViewAsType(view, R.id.external_add_tv, "field 'mExternalAddTv'", TextView.class);
        externalContactView2.mExternalContactContentLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.external_contact_content_layout, "field 'mExternalContactContentLayout'", ViewGroup.class);
        externalContactView2.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.external_contact_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        externalContactView2.mExternalContactRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.external_contact_rv, "field 'mExternalContactRV'", RecyclerView.class);
        externalContactView2.mExternalContactEmptyLayout = Utils.findRequiredView(view, R.id.external_contact_empty_layout, "field 'mExternalContactEmptyLayout'");
    }
}
