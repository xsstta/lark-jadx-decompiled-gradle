package com.bytedance.apm.p152m;

import java.util.LinkedList;

/* renamed from: com.bytedance.apm.m.a */
public class C3045a<T> {

    /* renamed from: a */
    private LinkedList<T> f9810a = new LinkedList<>();

    /* renamed from: b */
    private int f9811b;

    /* renamed from: a */
    public LinkedList<T> mo12876a() {
        return this.f9810a;
    }

    public C3045a(int i) {
        this.f9811b = i;
    }

    /* renamed from: a */
    public void mo12877a(T t) {
        if (this.f9810a.size() > this.f9811b) {
            this.f9810a.removeFirst();
        }
        this.f9810a.addLast(t);
    }
}
