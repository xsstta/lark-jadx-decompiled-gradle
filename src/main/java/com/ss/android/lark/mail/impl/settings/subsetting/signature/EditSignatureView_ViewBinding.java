package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;

public class EditSignatureView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditSignatureView f110524a;

    @Override // butterknife.Unbinder
    public void unbind() {
        EditSignatureView editSignatureView = this.f110524a;
        if (editSignatureView != null) {
            this.f110524a = null;
            editSignatureView.mMobileContent = null;
            editSignatureView.mCloseView = null;
            editSignatureView.mSaveView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditSignatureView_ViewBinding(EditSignatureView editSignatureView, View view) {
        this.f110524a = editSignatureView;
        editSignatureView.mMobileContent = (UDEditText) Utils.findRequiredViewAsType(view, R.id.sign_mobile_edit_text, "field 'mMobileContent'", UDEditText.class);
        editSignatureView.mCloseView = Utils.findRequiredView(view, R.id.mail_label_close, "field 'mCloseView'");
        editSignatureView.mSaveView = Utils.findRequiredView(view, R.id.mail_save_tv, "field 'mSaveView'");
    }
}
