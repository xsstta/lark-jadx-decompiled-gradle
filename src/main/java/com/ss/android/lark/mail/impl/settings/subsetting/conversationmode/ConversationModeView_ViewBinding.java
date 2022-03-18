package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public class ConversationModeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ConversationModeView f110480a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ConversationModeView conversationModeView = this.f110480a;
        if (conversationModeView != null) {
            this.f110480a = null;
            conversationModeView.mConvRadio = null;
            conversationModeView.mNonconvRadio = null;
            conversationModeView.mConvLayout = null;
            conversationModeView.mNonconvLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ConversationModeView_ViewBinding(ConversationModeView conversationModeView, View view) {
        this.f110480a = conversationModeView;
        conversationModeView.mConvRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_conversation_radio, "field 'mConvRadio'", UDCheckBox.class);
        conversationModeView.mNonconvRadio = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_nonconversation_radio, "field 'mNonconvRadio'", UDCheckBox.class);
        conversationModeView.mConvLayout = Utils.findRequiredView(view, R.id.mail_conversation_layout, "field 'mConvLayout'");
        conversationModeView.mNonconvLayout = Utils.findRequiredView(view, R.id.mail_nonconversation_layout, "field 'mNonconvLayout'");
    }
}
