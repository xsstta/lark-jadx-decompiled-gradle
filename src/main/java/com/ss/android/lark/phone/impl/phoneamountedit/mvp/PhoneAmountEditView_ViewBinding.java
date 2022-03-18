package com.ss.android.lark.phone.impl.phoneamountedit.mvp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class PhoneAmountEditView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhoneAmountEditView f127899a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PhoneAmountEditView phoneAmountEditView = this.f127899a;
        if (phoneAmountEditView != null) {
            this.f127899a = null;
            phoneAmountEditView.mTitleBar = null;
            phoneAmountEditView.mPhoneAmountTV = null;
            phoneAmountEditView.mPhoneAmountET = null;
            phoneAmountEditView.mPhoneAmountEditIV = null;
            phoneAmountEditView.mPhoneAmountClearIV = null;
            phoneAmountEditView.mPhoneAmountCheckHintTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhoneAmountEditView_ViewBinding(PhoneAmountEditView phoneAmountEditView, View view) {
        this.f127899a = phoneAmountEditView;
        phoneAmountEditView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        phoneAmountEditView.mPhoneAmountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_amount_tv, "field 'mPhoneAmountTV'", TextView.class);
        phoneAmountEditView.mPhoneAmountET = (EditText) Utils.findRequiredViewAsType(view, R.id.phone_amount_edit_et, "field 'mPhoneAmountET'", EditText.class);
        phoneAmountEditView.mPhoneAmountEditIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.phone_amount_edit_iv, "field 'mPhoneAmountEditIV'", ImageView.class);
        phoneAmountEditView.mPhoneAmountClearIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.phone_amount_clear_iv, "field 'mPhoneAmountClearIV'", ImageView.class);
        phoneAmountEditView.mPhoneAmountCheckHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_amount_edit_hint, "field 'mPhoneAmountCheckHintTV'", TextView.class);
    }
}
