package com.ss.android.lark.optrace.core;

import com.ss.android.lark.optrace.api.AbstractC48931c;
import com.ss.android.lark.optrace.api.TracingCoreSpan;

/* renamed from: com.ss.android.lark.optrace.core.a */
public class C48937a implements AbstractC48931c {

    /* renamed from: a */
    private C48938b f122925a;

    /* renamed from: b */
    private TracingCoreSpan f122926b;

    /* renamed from: c */
    private C48937a f122927c;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public TracingCoreSpan mo170904b() {
        return this.f122926b;
    }

    @Override // com.ss.android.lark.optrace.api.AbstractC48931c
    /* renamed from: a */
    public void mo170895a() {
        if (this.f122925a.f122928a.get() == this) {
            this.f122925a.f122928a.set(this.f122927c);
        }
    }

    public C48937a(C48938b bVar, TracingCoreSpan tracingCoreSpan) {
        this.f122925a = bVar;
        this.f122926b = tracingCoreSpan;
        this.f122927c = bVar.f122928a.get();
        bVar.f122928a.set(this);
    }
}
