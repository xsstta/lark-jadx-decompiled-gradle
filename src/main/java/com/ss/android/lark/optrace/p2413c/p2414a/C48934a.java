package com.ss.android.lark.optrace.p2413c.p2414a;

import com.ss.android.lark.optrace.api.AbstractC48931c;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48939c;

/* renamed from: com.ss.android.lark.optrace.c.a.a */
public class C48934a extends Thread {

    /* renamed from: a */
    private TracingCoreSpan f122922a;

    public void run() {
        AbstractC48931c a = C48939c.m192792a().mo170890a().mo170897a(this.f122922a);
        super.run();
        a.mo170895a();
    }

    public C48934a(Runnable runnable, String str) {
        super(runnable, str);
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (a == null) {
            a = C48939c.m192792a().mo170891b();
            C48939c.m192792a().mo170890a().mo170897a(a);
        }
        this.f122922a = a.generateSpan();
    }
}
