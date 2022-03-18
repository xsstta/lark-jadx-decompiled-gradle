package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class MoreButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.ud_icon_more_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getId() {
        return R.id.mail_btn_title_bar_more;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getLargeDrawableID() {
        return R.drawable.ud_icon_more_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_ThreadAction_MoreMobile);
    }

    public MoreButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }
}
