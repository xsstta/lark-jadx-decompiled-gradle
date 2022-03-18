package com.google.android.play.core.internal;

public final class bz<T> implements cc<T> {

    /* renamed from: a */
    private cc<T> f56045a;

    /* renamed from: a */
    public static <T> void m82373a(cc<T> ccVar, cc<T> ccVar2) {
        bd.m82321a(ccVar2);
        bz bzVar = (bz) ccVar;
        if (bzVar.f56045a == null) {
            bzVar.f56045a = ccVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final T mo78728a() {
        cc<T> ccVar = this.f56045a;
        if (ccVar != null) {
            return ccVar.mo78728a();
        }
        throw new IllegalStateException();
    }
}
