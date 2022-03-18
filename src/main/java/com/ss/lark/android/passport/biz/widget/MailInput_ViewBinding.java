package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.EditText;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class MailInput_ViewBinding extends BaseContactInput_ViewBinding {

    /* renamed from: a */
    private MailInput f164381a;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput_ViewBinding, butterknife.Unbinder
    public void unbind() {
        MailInput mailInput = this.f164381a;
        if (mailInput != null) {
            this.f164381a = null;
            mailInput.mMailInput = null;
            mailInput.mDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MailInput_ViewBinding(MailInput mailInput, View view) {
        super(mailInput, view);
        this.f164381a = mailInput;
        mailInput.mMailInput = (EditText) Utils.findRequiredViewAsType(view, R.id.email_input, "field 'mMailInput'", EditText.class);
        mailInput.mDivider = Utils.findRequiredView(view, R.id.rootView, "field 'mDivider'");
    }
}
