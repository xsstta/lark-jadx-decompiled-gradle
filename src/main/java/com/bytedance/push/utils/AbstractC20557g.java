package com.bytedance.push.utils;

/* renamed from: com.bytedance.push.utils.g */
public abstract class AbstractC20557g<T> {

    /* renamed from: a */
    private volatile T f50132a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo68870b(Object... objArr);

    /* renamed from: c */
    public final T mo69198c(Object... objArr) {
        if (this.f50132a == null) {
            synchronized (this) {
                if (this.f50132a == null) {
                    this.f50132a = mo68870b(objArr);
                }
            }
        }
        return this.f50132a;
    }
}
