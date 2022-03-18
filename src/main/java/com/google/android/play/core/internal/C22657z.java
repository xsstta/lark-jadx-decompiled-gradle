package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.z */
final class C22657z extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ IBinder f56064a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC22621ab f56065b;

    C22657z(ServiceConnectionC22621ab abVar, IBinder iBinder) {
        this.f56065b = abVar;
        this.f56064a = iBinder;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        C22622ac acVar = this.f56065b.f56004a;
        acVar.f56016l = (IInterface) acVar.f56012h.mo78813a(this.f56064a);
        C22622ac.m82237f(this.f56065b.f56004a);
        this.f56065b.f56004a.f56010f = false;
        for (Runnable runnable : this.f56065b.f56004a.f56009e) {
            runnable.run();
        }
        this.f56065b.f56004a.f56009e.clear();
    }
}
