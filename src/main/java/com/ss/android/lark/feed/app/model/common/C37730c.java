package com.ss.android.lark.feed.app.model.common;

/* renamed from: com.ss.android.lark.feed.app.model.common.c */
public class C37730c {

    /* renamed from: a */
    private volatile int f96757a;

    /* renamed from: a */
    public synchronized void mo138390a(int i) {
        this.f96757a = i | this.f96757a;
    }

    /* renamed from: b */
    public synchronized void mo138391b(int i) {
        this.f96757a = (~i) & this.f96757a;
    }

    /* renamed from: c */
    public synchronized boolean mo138392c(int i) {
        boolean z;
        if ((i & this.f96757a) != 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
