package com.ss.android.lark.contact.impl.contacts_home;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class ContactsHomeItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactsHomeItemViewHolder f92176a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ContactsHomeItemViewHolder contactsHomeItemViewHolder = this.f92176a;
        if (contactsHomeItemViewHolder != null) {
            this.f92176a = null;
            contactsHomeItemViewHolder.userInfoLayoutWrapper = null;
            contactsHomeItemViewHolder.contactLayout = null;
            contactsHomeItemViewHolder.contactAvatar = null;
            contactsHomeItemViewHolder.contactNameTV = null;
            contactsHomeItemViewHolder.contactTenantTV = null;
            contactsHomeItemViewHolder.contactUserStatus = null;
            contactsHomeItemViewHolder.checkBox = null;
            contactsHomeItemViewHolder.btnLayout = null;
            contactsHomeItemViewHolder.deleteBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactsHomeItemViewHolder_ViewBinding(ContactsHomeItemViewHolder contactsHomeItemViewHolder, View view) {
        this.f92176a = contactsHomeItemViewHolder;
        contactsHomeItemViewHolder.userInfoLayoutWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.layout_user_info, "field 'userInfoLayoutWrapper'", LinearLayout.class);
        contactsHomeItemViewHolder.contactLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.contact_item_layout, "field 'contactLayout'", RelativeLayout.class);
        contactsHomeItemViewHolder.contactAvatar = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.contact_avatar, "field 'contactAvatar'", LKUIRoundedImageView2.class);
        contactsHomeItemViewHolder.contactNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_name, "field 'contactNameTV'", TextView.class);
        contactsHomeItemViewHolder.contactTenantTV = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_tenant, "field 'contactTenantTV'", TextView.class);
        contactsHomeItemViewHolder.contactUserStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.contact_user_status, "field 'contactUserStatus'", UserStatusLinearLayout.class);
        contactsHomeItemViewHolder.checkBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.select_box, "field 'checkBox'", UDCheckBox.class);
        contactsHomeItemViewHolder.btnLayout = Utils.findRequiredView(view, R.id.btn_layout, "field 'btnLayout'");
        contactsHomeItemViewHolder.deleteBtn = Utils.findRequiredView(view, R.id.delete_btn, "field 'deleteBtn'");
    }
}
