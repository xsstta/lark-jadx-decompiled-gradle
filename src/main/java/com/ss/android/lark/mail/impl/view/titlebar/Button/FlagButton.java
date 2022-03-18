package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class FlagButton extends AbsButton {
    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.ud_icon_flag_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return R.drawable.ud_icon_flag_outlined;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTintColorID() {
        return R.color.mail_icon_flag_tint;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return C43819s.m173684a((int) R.string.Mail_Folder_Flagged);
    }

    public FlagButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public boolean isExtraActionSupported(AbsButton.ExtraAction extraAction) {
        if (extraAction == AbsButton.ExtraAction.FastClick) {
            return true;
        }
        return false;
    }
}
