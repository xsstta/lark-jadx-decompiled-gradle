package com.ss.android.lark.contact.impl.contacts_new;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class NewContactView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NewContactView f92324a;

    @Override // butterknife.Unbinder
    public void unbind() {
        NewContactView newContactView = this.f92324a;
        if (newContactView != null) {
            this.f92324a = null;
            newContactView.mTitleBar = null;
            newContactView.mContentView = null;
            newContactView.mNewContactRV = null;
            newContactView.mPtrFrame = null;
            newContactView.mNewContactEmptyLayout = null;
            newContactView.newContactAddExtRl = null;
            newContactView.newContactAddExtTv = null;
            newContactView.newContactSubTitleTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewContactView_ViewBinding(NewContactView newContactView, View view) {
        this.f92324a = newContactView;
        newContactView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.new_contact_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        newContactView.mContentView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.content_view, "field 'mContentView'", ViewGroup.class);
        newContactView.mNewContactRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.new_contact_rv, "field 'mNewContactRV'", RecyclerView.class);
        newContactView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.new_contact_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        newContactView.mNewContactEmptyLayout = Utils.findRequiredView(view, R.id.new_contact_empty_layout, "field 'mNewContactEmptyLayout'");
        newContactView.newContactAddExtRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.newContactAddExtRl, "field 'newContactAddExtRl'", RelativeLayout.class);
        newContactView.newContactAddExtTv = (TextView) Utils.findRequiredViewAsType(view, R.id.newContactAddExtTv, "field 'newContactAddExtTv'", TextView.class);
        newContactView.newContactSubTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.newContactSubTitleTv, "field 'newContactSubTitleTv'", TextView.class);
    }
}
