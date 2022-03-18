package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;

/* renamed from: com.ss.android.lark.mail.impl.home.c */
public class C42438c {

    /* renamed from: a */
    private boolean f108043a = true;

    /* renamed from: b */
    private boolean f108044b = true;

    /* renamed from: c */
    private void m169454c() {
        C42187a.m168562p(C42187a.C42190b.f107398a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo152729a() {
        if (this.f108043a) {
            m169454c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo152731b() {
        this.f108043a = true;
        if (!this.f108044b) {
            m169454c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo152730a(Context context) {
        this.f108043a = false;
        ((C42322x) C42344d.m169091a(C42322x.class, context)).mo152384d();
    }
}
