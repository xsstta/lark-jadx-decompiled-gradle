package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class InputLabelView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InputLabelView f164355a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InputLabelView inputLabelView = this.f164355a;
        if (inputLabelView != null) {
            this.f164355a = null;
            inputLabelView.mPhoneLabelView = null;
            inputLabelView.mMailLabelView = null;
            inputLabelView.mPhoneSwitcher = null;
            inputLabelView.mMailSwitcher = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InputLabelView_ViewBinding(InputLabelView inputLabelView, View view) {
        this.f164355a = inputLabelView;
        inputLabelView.mPhoneLabelView = (TextView) Utils.findRequiredViewAsType(view, R.id.contacts_label_phone, "field 'mPhoneLabelView'", TextView.class);
        inputLabelView.mMailLabelView = (TextView) Utils.findRequiredViewAsType(view, R.id.contacts_label_mail, "field 'mMailLabelView'", TextView.class);
        inputLabelView.mPhoneSwitcher = Utils.findRequiredView(view, R.id.contacts_switcher_phone, "field 'mPhoneSwitcher'");
        inputLabelView.mMailSwitcher = Utils.findRequiredView(view, R.id.contacts_switcher_mail, "field 'mMailSwitcher'");
    }
}
