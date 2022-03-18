package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SignatureView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SignatureView f110593a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SignatureView signatureView = this.f110593a;
        if (signatureView != null) {
            this.f110593a = null;
            signatureView.mDisableRadio = null;
            signatureView.mMobileRadio = null;
            signatureView.mPCRadio = null;
            signatureView.mDisableTv = null;
            signatureView.mMobileTv = null;
            signatureView.mPCTv = null;
            signatureView.mMobileContentLayout = null;
            signatureView.mMobileContent = null;
            signatureView.mPCContentBg = null;
            signatureView.mPCEmptyTextView = null;
            signatureView.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SignatureView_ViewBinding(SignatureView signatureView, View view) {
        this.f110593a = signatureView;
        signatureView.mDisableRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.sign_disable_radio, "field 'mDisableRadio'", UDCheckBox.class);
        signatureView.mMobileRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.sign_mobile_radio, "field 'mMobileRadio'", UDCheckBox.class);
        signatureView.mPCRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.sign_pc_radio, "field 'mPCRadio'", UDCheckBox.class);
        signatureView.mDisableTv = Utils.findRequiredView(view, R.id.tv_disable_name, "field 'mDisableTv'");
        signatureView.mMobileTv = Utils.findRequiredView(view, R.id.tv_mobile_name, "field 'mMobileTv'");
        signatureView.mPCTv = Utils.findRequiredView(view, R.id.tv_pc_name, "field 'mPCTv'");
        signatureView.mMobileContentLayout = Utils.findRequiredView(view, R.id.sign_mobile_edit_ll, "field 'mMobileContentLayout'");
        signatureView.mMobileContent = (TextView) Utils.findRequiredViewAsType(view, R.id.sign_mobile_edit_text, "field 'mMobileContent'", TextView.class);
        signatureView.mPCContentBg = (ScrollView) Utils.findRequiredViewAsType(view, R.id.sign_pc_edit_cl, "field 'mPCContentBg'", ScrollView.class);
        signatureView.mPCEmptyTextView = Utils.findRequiredView(view, R.id.sign_pc_edit_text, "field 'mPCEmptyTextView'");
        signatureView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
