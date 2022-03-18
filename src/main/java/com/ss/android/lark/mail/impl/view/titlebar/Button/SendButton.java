package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class SendButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.ud_icon_sent_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getId() {
        return R.id.mail_btn_title_bar_send;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getLargeDrawableID() {
        return R.drawable.ud_icon_sent_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTintColorID() {
        return R.color.mail_icon_color_selector_n1_n650_disable;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_Message_SendMail);
    }

    public SendButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }
}
