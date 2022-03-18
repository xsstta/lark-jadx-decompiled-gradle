package com.google.android.gms.common.api.internal;

final class cu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f52846a;

    /* renamed from: b */
    private final /* synthetic */ String f52847b;

    /* renamed from: c */
    private final /* synthetic */ zza f52848c;

    cu(zza zza, LifecycleCallback lifecycleCallback, String str) {
        this.f52848c = zza;
        this.f52846a = lifecycleCallback;
        this.f52847b = str;
    }

    public final void run() {
        if (this.f52848c.f52913c > 0) {
            this.f52846a.mo73327a(this.f52848c.f52914d != null ? this.f52848c.f52914d.getBundle(this.f52847b) : null);
        }
        if (this.f52848c.f52913c >= 2) {
            this.f52846a.mo73329b();
        }
        if (this.f52848c.f52913c >= 3) {
            this.f52846a.mo73331c();
        }
        if (this.f52848c.f52913c >= 4) {
            this.f52846a.mo73332d();
        }
        if (this.f52848c.f52913c >= 5) {
            this.f52846a.mo73333e();
        }
    }
}
