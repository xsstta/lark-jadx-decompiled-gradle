package com.ss.android.lark.ding.service.impl.controller;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.i */
public class C36751i {

    /* renamed from: a */
    private volatile int f94453a;

    /* renamed from: a */
    public synchronized void mo135438a(int i) {
        this.f94453a = i | this.f94453a;
    }

    /* renamed from: b */
    public synchronized void mo135439b(int i) {
        this.f94453a = (~i) & this.f94453a;
    }

    /* renamed from: c */
    public synchronized boolean mo135440c(int i) {
        boolean z;
        if ((i & this.f94453a) != 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
