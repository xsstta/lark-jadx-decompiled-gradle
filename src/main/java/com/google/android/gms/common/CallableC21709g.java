package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.g */
public final /* synthetic */ class CallableC21709g implements Callable {

    /* renamed from: a */
    private final boolean f52945a;

    /* renamed from: b */
    private final String f52946b;

    /* renamed from: c */
    private final zze f52947c;

    CallableC21709g(boolean z, String str, zze zze) {
        this.f52945a = z;
        this.f52946b = str;
        this.f52947c = zze;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C21708f.m78863a(this.f52945a, this.f52946b, this.f52947c);
    }
}
