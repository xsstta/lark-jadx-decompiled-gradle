package com.ss.lark.android.passport.biz.feature.set_credential;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.MailInput;
import com.ss.lark.android.passport.biz.widget.PhoneInput;

public class RecoverAccountView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecoverAccountView f163746a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RecoverAccountView recoverAccountView = this.f163746a;
        if (recoverAccountView != null) {
            this.f163746a = null;
            recoverAccountView.mPhoneInput = null;
            recoverAccountView.mMailInput = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecoverAccountView_ViewBinding(RecoverAccountView recoverAccountView, View view) {
        this.f163746a = recoverAccountView;
        recoverAccountView.mPhoneInput = (PhoneInput) Utils.findRequiredViewAsType(view, R.id.phone_input, "field 'mPhoneInput'", PhoneInput.class);
        recoverAccountView.mMailInput = (MailInput) Utils.findRequiredViewAsType(view, R.id.mail_input, "field 'mMailInput'", MailInput.class);
    }
}
