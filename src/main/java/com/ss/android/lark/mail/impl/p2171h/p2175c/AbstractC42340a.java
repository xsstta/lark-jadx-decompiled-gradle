package com.ss.android.lark.mail.impl.p2171h.p2175c;

import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.h.c.a */
public abstract class AbstractC42340a<T> {

    /* renamed from: l */
    protected HashMap<String, T> f107787l = new HashMap<>();

    /* renamed from: m */
    protected T f107788m;

    /* renamed from: n */
    protected String f107789n;

    /* renamed from: o */
    protected volatile T f107790o;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo152325c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract T mo152332g(String str);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public synchronized void mo152331f(String str) {
        this.f107789n = str;
        T t = this.f107787l.get(str);
        this.f107788m = t;
        if (t == null) {
            T g = mo152332g(str);
            this.f107788m = g;
            this.f107787l.put(this.f107789n, g);
        }
    }
}
