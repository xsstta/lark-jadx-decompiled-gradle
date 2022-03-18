package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.ab */
public final class ServiceConnectionC22621ab implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C22622ac f56004a;

    /* synthetic */ ServiceConnectionC22621ab(C22622ac acVar) {
        this.f56004a = acVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f56004a.f56007c.mo78874c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f56004a.m82233b((C22622ac) new C22657z(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f56004a.f56007c.mo78874c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f56004a.m82233b((C22622ac) new C22620aa(this));
    }
}
