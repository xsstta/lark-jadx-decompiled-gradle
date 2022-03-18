package com.ss.android.lark.passport.infra.base.p2423a;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49344b;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;

/* renamed from: com.ss.android.lark.passport.infra.base.a.b */
public class C49011b<T extends AbstractC49344b> implements AbstractC49347c {

    /* renamed from: a */
    public T f123044a;

    /* renamed from: b */
    private boolean f123045b;

    public C49011b() {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c
    /* renamed from: b */
    public boolean mo171124b() {
        return this.f123045b;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c
    /* renamed from: a */
    public void mo171123a() {
        this.f123045b = true;
        this.f123044a = null;
    }

    public C49011b(T t) {
        this.f123044a = t;
    }
}
