package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.util.g */
public class C2564g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f8280a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f8281b;

    /* renamed from: c */
    private long f8282c;

    /* renamed from: d */
    private long f8283d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10733a(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10598a(T t, Y y) {
    }

    /* renamed from: c */
    private void m10881c() {
        mo11248a(this.f8282c);
    }

    /* renamed from: a */
    public void mo11247a() {
        mo11248a(0);
    }

    /* renamed from: b */
    public synchronized long mo11249b() {
        return this.f8282c;
    }

    /* renamed from: b */
    public synchronized boolean mo11251b(T t) {
        return this.f8280a.containsKey(t);
    }

    /* renamed from: c */
    public synchronized Y mo11252c(T t) {
        return this.f8280a.get(t);
    }

    public C2564g(long j) {
        this.f8281b = j;
        this.f8282c = j;
    }

    /* renamed from: d */
    public synchronized Y mo11253d(T t) {
        Y remove;
        remove = this.f8280a.remove(t);
        if (remove != null) {
            this.f8283d -= (long) mo10733a(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo11248a(long j) {
        while (this.f8283d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f8280a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f8283d -= (long) mo10733a(value);
            T key = next.getKey();
            it.remove();
            mo10598a(key, value);
        }
    }

    /* renamed from: b */
    public synchronized Y mo11250b(T t, Y y) {
        try {
            long a = (long) mo10733a(y);
            if (a >= this.f8282c) {
                mo10598a(t, y);
                return null;
            }
            if (y != null) {
                this.f8283d += a;
            }
            Y put = this.f8280a.put(t, y);
            if (put != null) {
                this.f8283d -= (long) mo10733a(put);
                if (!put.equals(y)) {
                    mo10598a(t, put);
                }
            }
            m10881c();
            return put;
        } catch (Exception unused) {
            return null;
        }
    }
}
