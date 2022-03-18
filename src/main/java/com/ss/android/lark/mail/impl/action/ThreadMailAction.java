package com.ss.android.lark.mail.impl.action;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.entity.MailThread;

public abstract class ThreadMailAction extends AbsChangeMailAction {
    public ThreadMailAction(String str) {
        super(str);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        if (mailThread == null || !TextUtils.equals(mailThread.mo151676a(), mo150245a())) {
            return null;
        }
        mo150234a(mailThread);
        return new C41814a(i, mailThread, mo150235a(mailThread, str));
    }
}
