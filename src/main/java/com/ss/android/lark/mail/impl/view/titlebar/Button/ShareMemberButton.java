package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class ShareMemberButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.mail_ic_title_bar_share_member_selector;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getLargeDrawableID() {
        return R.drawable.mail_ic_title_bar_share_member_large_selector;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return R.drawable.mail_message_list_text_icon_share_member;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public AbsButton.ModuleType getButtonType() {
        return AbsButton.ModuleType.SHARE;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_ThreadAction_Collaborators);
    }

    public ShareMemberButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }
}
