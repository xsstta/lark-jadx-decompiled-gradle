package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public class ReplyLanguageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReplyLanguageView f110506a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ReplyLanguageView replyLanguageView = this.f110506a;
        if (replyLanguageView != null) {
            this.f110506a = null;
            replyLanguageView.mAutoRadio = null;
            replyLanguageView.mCnRadio = null;
            replyLanguageView.mEnRadio = null;
            replyLanguageView.mAutoLayout = null;
            replyLanguageView.mCnLayout = null;
            replyLanguageView.mEnLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ReplyLanguageView_ViewBinding(ReplyLanguageView replyLanguageView, View view) {
        this.f110506a = replyLanguageView;
        replyLanguageView.mAutoRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_lang_auto_radio, "field 'mAutoRadio'", UDCheckBox.class);
        replyLanguageView.mCnRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_lang_cn_radio, "field 'mCnRadio'", UDCheckBox.class);
        replyLanguageView.mEnRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_lang_en_radio, "field 'mEnRadio'", UDCheckBox.class);
        replyLanguageView.mAutoLayout = Utils.findRequiredView(view, R.id.mail_lang_auto_layout, "field 'mAutoLayout'");
        replyLanguageView.mCnLayout = Utils.findRequiredView(view, R.id.mail_lang_cn_layout, "field 'mCnLayout'");
        replyLanguageView.mEnLayout = Utils.findRequiredView(view, R.id.mail_lang_en_layout, "field 'mEnLayout'");
    }
}
