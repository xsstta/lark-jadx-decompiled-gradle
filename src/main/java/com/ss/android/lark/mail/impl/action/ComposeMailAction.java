package com.ss.android.lark.mail.impl.action;

import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public abstract class ComposeMailAction extends AbsMailAction {

    /* renamed from: a */
    protected String f106064a;

    /* renamed from: a */
    public abstract MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft);

    /* renamed from: e */
    public String mo150261e() {
        return this.f106064a;
    }

    public ComposeMailAction(String str) {
        super(str);
    }

    public ComposeMailAction(String str, String str2) {
        super(str);
        this.f106064a = str2;
    }
}
