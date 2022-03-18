package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.g */
public abstract class AbstractC12790g<T> {

    /* renamed from: a */
    private T f34170a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo48227b(Context... contextArr);

    /* renamed from: c */
    public final T mo48348c(Context... contextArr) {
        T t;
        synchronized (this) {
            if (this.f34170a == null) {
                this.f34170a = mo48227b(contextArr);
            }
            t = this.f34170a;
        }
        return t;
    }
}
