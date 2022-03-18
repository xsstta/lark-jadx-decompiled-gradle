package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class ReplyAllButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.ud_icon_reply_all_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return R.drawable.ud_icon_reply_all_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_Compose_Template_ReplyAll);
    }

    public ReplyAllButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }
}
