package com.ss.android.vesdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.a */
public class C63922a<E> {

    /* renamed from: a */
    private List<E> f161407a = new ArrayList();

    /* renamed from: b */
    private boolean f161408b = false;

    /* renamed from: c */
    private List<E> f161409c = new ArrayList();

    /* renamed from: a */
    public synchronized void mo221135a() {
        this.f161408b = true;
        this.f161407a.clear();
    }

    /* renamed from: b */
    public synchronized boolean mo221137b() {
        return this.f161407a.isEmpty();
    }

    /* renamed from: c */
    public synchronized List<E> mo221139c() {
        if (this.f161408b) {
            this.f161409c = new ArrayList(this.f161407a.size());
            for (E e : this.f161407a) {
                this.f161409c.add(e);
            }
            this.f161408b = false;
        }
        return this.f161409c;
    }

    /* renamed from: a */
    public synchronized boolean mo221136a(E e) {
        if (this.f161407a.contains(e)) {
            return false;
        }
        this.f161408b = true;
        return this.f161407a.add(e);
    }

    /* renamed from: b */
    public synchronized boolean mo221138b(E e) {
        this.f161408b = true;
        return this.f161407a.remove(e);
    }
}
