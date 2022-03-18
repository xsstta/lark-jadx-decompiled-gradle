package com.ss.android.lark.voip.service.impl.p2914b;

import android.content.Context;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.voip.service.impl.app.AbstractC58046e;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58133t;

/* renamed from: com.ss.android.lark.voip.service.impl.b.a */
public class C58141a implements C37008a.AbstractC37010a {

    /* renamed from: a */
    private C58142b f143029a;

    /* renamed from: b */
    private Context f143030b;

    public C58141a(Context context) {
        this.f143030b = context;
        this.f143029a = new C58142b(context);
    }

    @Override // com.ss.android.lark.exception.crash.C37008a.AbstractC37010a
    /* renamed from: a */
    public boolean mo136537a(Thread thread, Throwable th) {
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f == null || f.mo196802a() == null || !C58133t.m225481b(f.mo196802a())) {
            return true;
        }
        this.f143029a.mo197027a();
        return true;
    }
}
