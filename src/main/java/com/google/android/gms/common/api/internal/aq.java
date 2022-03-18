package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class aq extends be {

    /* renamed from: a */
    private WeakReference<aj> f52671a;

    aq(aj ajVar) {
        this.f52671a = new WeakReference<>(ajVar);
    }

    @Override // com.google.android.gms.common.api.internal.be
    /* renamed from: a */
    public final void mo73361a() {
        aj ajVar = this.f52671a.get();
        if (ajVar != null) {
            ajVar.m78377p();
        }
    }
}
