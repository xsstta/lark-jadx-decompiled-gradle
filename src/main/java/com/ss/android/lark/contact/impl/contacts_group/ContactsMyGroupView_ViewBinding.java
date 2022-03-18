package com.ss.android.lark.contact.impl.contacts_group;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.ui.CommonTitleBar;

public class ContactsMyGroupView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactsMyGroupView f92055a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ContactsMyGroupView contactsMyGroupView = this.f92055a;
        if (contactsMyGroupView != null) {
            this.f92055a = null;
            contactsMyGroupView.mTitleBar = null;
            contactsMyGroupView.mDesktopTitle = null;
            contactsMyGroupView.mMyGroupVP = null;
            contactsMyGroupView.mIndicator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactsMyGroupView_ViewBinding(ContactsMyGroupView contactsMyGroupView, View view) {
        this.f92055a = contactsMyGroupView;
        contactsMyGroupView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        contactsMyGroupView.mDesktopTitle = (DesktopContactsTitle) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitle'", DesktopContactsTitle.class);
        contactsMyGroupView.mMyGroupVP = (ViewPager) Utils.findRequiredViewAsType(view, R.id.group_vp, "field 'mMyGroupVP'", ViewPager.class);
        contactsMyGroupView.mIndicator = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.indicator, "field 'mIndicator'", UDTabLayout.class);
    }
}
