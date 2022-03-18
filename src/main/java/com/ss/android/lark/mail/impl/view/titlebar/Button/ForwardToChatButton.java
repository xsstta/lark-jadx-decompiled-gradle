package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class ForwardToChatButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.mail_operation_title_bar_forward_to_chat_icon_selector;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return R.drawable.mail_operation_title_bar_forward_to_chat_icon;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_ThreadAction_ForwardToChat);
    }

    public ForwardToChatButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }
}
