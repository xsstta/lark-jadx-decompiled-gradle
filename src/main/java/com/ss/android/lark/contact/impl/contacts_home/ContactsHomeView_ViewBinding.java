package com.ss.android.lark.contact.impl.contacts_home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class ContactsHomeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactsHomeView f92233a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ContactsHomeView contactsHomeView = this.f92233a;
        if (contactsHomeView != null) {
            this.f92233a = null;
            contactsHomeView.mTitleTvContainer = null;
            contactsHomeView.mTitleBar = null;
            contactsHomeView.mTitleTV = null;
            contactsHomeView.mDepartmentListRV = null;
            contactsHomeView.mQuickSideBarTipView = null;
            contactsHomeView.mQuickSideBarView = null;
            contactsHomeView.mQuickSideBarCover = null;
            contactsHomeView.mInviterNewMember = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactsHomeView_ViewBinding(ContactsHomeView contactsHomeView, View view) {
        this.f92233a = contactsHomeView;
        contactsHomeView.mTitleTvContainer = Utils.findRequiredView(view, R.id.preTitleBar, "field 'mTitleTvContainer'");
        contactsHomeView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        contactsHomeView.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.title_tv, "field 'mTitleTV'", TextView.class);
        contactsHomeView.mDepartmentListRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.recyclerView, "field 'mDepartmentListRV'", CommonRecyclerView.class);
        contactsHomeView.mQuickSideBarTipView = (QuickSideBarTipsView) Utils.findRequiredViewAsType(view, R.id.quickSideBarTipsView, "field 'mQuickSideBarTipView'", QuickSideBarTipsView.class);
        contactsHomeView.mQuickSideBarView = (QuickSideBarView) Utils.findRequiredViewAsType(view, R.id.quickSideBarView, "field 'mQuickSideBarView'", QuickSideBarView.class);
        contactsHomeView.mQuickSideBarCover = Utils.findRequiredView(view, R.id.quickSideBarViewCover, "field 'mQuickSideBarCover'");
        contactsHomeView.mInviterNewMember = (ImageView) Utils.findRequiredViewAsType(view, R.id.inviterNewMember, "field 'mInviterNewMember'", ImageView.class);
    }
}
