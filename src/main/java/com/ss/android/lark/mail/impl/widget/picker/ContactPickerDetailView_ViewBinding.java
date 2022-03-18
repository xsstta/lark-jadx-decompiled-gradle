package com.ss.android.lark.mail.impl.widget.picker;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class ContactPickerDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactPickerDetailView f111825a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ContactPickerDetailView contactPickerDetailView = this.f111825a;
        if (contactPickerDetailView != null) {
            this.f111825a = null;
            contactPickerDetailView.mTitleBar = null;
            contactPickerDetailView.mPicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactPickerDetailView_ViewBinding(ContactPickerDetailView contactPickerDetailView, View view) {
        this.f111825a = contactPickerDetailView;
        contactPickerDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        contactPickerDetailView.mPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.mail_contact_picker, "field 'mPicker'", ChatterPicker.class);
    }
}
