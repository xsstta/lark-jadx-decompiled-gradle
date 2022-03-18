package com.tt.refer.common.download.engine.p3419a;

import java.util.ArrayList;

/* renamed from: com.tt.refer.common.download.engine.a.a */
public abstract class AbstractC67758a<T> implements AbstractC67759b<T> {

    /* renamed from: b */
    protected ArrayList<T> f170646b = new ArrayList<>();

    /* renamed from: a */
    public int mo235152a() {
        return this.f170646b.size();
    }

    protected AbstractC67758a() {
    }

    /* renamed from: a */
    public T mo235153a(int i) {
        return this.f170646b.get(i);
    }

    /* renamed from: c */
    public synchronized void mo235158c(T t) {
        this.f170646b.remove(t);
    }

    /* renamed from: a */
    public T mo235154a(String str) {
        int b = mo235156b(str);
        if (b != -1) {
            return mo235153a(b);
        }
        return null;
    }

    /* renamed from: b */
    public int mo235156b(String str) {
        for (int i = 0; i < mo235152a(); i++) {
            if (mo235137a((Object) mo235153a(i)).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public synchronized void mo235157b(T t) {
        if (t != null) {
            int b = mo235156b(mo235137a((Object) t));
            if (b == -1) {
                this.f170646b.add(t);
            } else {
                mo235155a(b, t);
            }
        }
    }

    /* renamed from: d */
    public boolean mo235159d(T t) {
        if (t == null) {
            return false;
        }
        String a = mo235137a((Object) t);
        for (int i = 0; i < mo235152a(); i++) {
            if (mo235137a((Object) mo235153a(i)).equals(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo235155a(int i, T t) {
        this.f170646b.set(i, t);
    }
}
