package com.ss.android.lark.mail.impl.action;

import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;

/* renamed from: com.ss.android.lark.mail.impl.action.a */
public class C41814a {

    /* renamed from: a */
    private final int f106159a;

    /* renamed from: b */
    private final MailThread f106160b;

    /* renamed from: c */
    private AbsChangeMailAction.OP f106161c;

    /* renamed from: a */
    public int mo150372a() {
        return this.f106159a;
    }

    /* renamed from: b */
    public MailThread mo150374b() {
        return this.f106160b;
    }

    /* renamed from: c */
    public AbsChangeMailAction.OP mo150375c() {
        return this.f106161c;
    }

    /* renamed from: a */
    public void mo150373a(AbsChangeMailAction.OP op) {
        this.f106161c = op;
    }

    public C41814a(int i, MailThread mailThread, AbsChangeMailAction.OP op) {
        this.f106159a = i;
        this.f106160b = mailThread;
        this.f106161c = op;
    }
}
