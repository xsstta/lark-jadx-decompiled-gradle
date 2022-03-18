package com.bytedance.dr;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.a */
public abstract class AbstractC3997a<T> {

    /* renamed from: a */
    private volatile T f12149a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo15706a(Object... objArr);

    AbstractC3997a() {
    }

    /* renamed from: b */
    public final T mo15707b(Object... objArr) {
        if (this.f12149a == null) {
            synchronized (this) {
                if (this.f12149a == null) {
                    this.f12149a = mo15706a(objArr);
                }
            }
        }
        return this.f12149a;
    }
}
