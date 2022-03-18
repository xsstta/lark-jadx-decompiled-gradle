package com.lynx.tasm.common;

import com.lynx.tasm.base.C26614b;

/* renamed from: com.lynx.tasm.common.b */
public class C26874b {

    /* renamed from: a */
    private Thread f66721a;

    /* renamed from: a */
    public void mo95656a() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (this.f66721a == null) {
            this.f66721a = currentThread;
        }
        if (this.f66721a == currentThread) {
            z = true;
        } else {
            z = false;
        }
        C26614b.m96457a(z);
    }
}
