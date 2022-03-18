package com.google.android.gms.common.api.internal;

final class cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f52853a;

    /* renamed from: b */
    private final /* synthetic */ String f52854b;

    /* renamed from: c */
    private final /* synthetic */ cv f52855c;

    cw(cv cvVar, LifecycleCallback lifecycleCallback, String str) {
        this.f52855c = cvVar;
        this.f52853a = lifecycleCallback;
        this.f52854b = str;
    }

    public final void run() {
        if (this.f52855c.f52851c > 0) {
            this.f52853a.mo73327a(this.f52855c.f52852d != null ? this.f52855c.f52852d.getBundle(this.f52854b) : null);
        }
        if (this.f52855c.f52851c >= 2) {
            this.f52853a.mo73329b();
        }
        if (this.f52855c.f52851c >= 3) {
            this.f52853a.mo73331c();
        }
        if (this.f52855c.f52851c >= 4) {
            this.f52853a.mo73332d();
        }
        if (this.f52855c.f52851c >= 5) {
            this.f52853a.mo73333e();
        }
    }
}
