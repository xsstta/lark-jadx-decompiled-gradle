package com.ss.android.lark.optrace.core;

import com.ss.android.lark.optrace.api.AbstractC48931c;
import com.ss.android.lark.optrace.api.AbstractC48932d;
import com.ss.android.lark.optrace.api.TracingCoreSpan;

/* renamed from: com.ss.android.lark.optrace.core.b */
public class C48938b implements AbstractC48932d {

    /* renamed from: a */
    final ThreadLocal<C48937a> f122928a = new ThreadLocal<>();

    @Override // com.ss.android.lark.optrace.api.AbstractC48932d
    /* renamed from: a */
    public TracingCoreSpan mo170896a() {
        C48937a aVar = this.f122928a.get();
        if (aVar == null) {
            return null;
        }
        return aVar.mo170904b();
    }

    @Override // com.ss.android.lark.optrace.api.AbstractC48932d
    /* renamed from: a */
    public AbstractC48931c mo170897a(TracingCoreSpan tracingCoreSpan) {
        return new C48937a(this, tracingCoreSpan);
    }
}
