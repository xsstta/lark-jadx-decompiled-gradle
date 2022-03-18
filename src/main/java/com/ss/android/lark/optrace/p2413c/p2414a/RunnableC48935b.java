package com.ss.android.lark.optrace.p2413c.p2414a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.AbstractC48931c;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48939c;

/* renamed from: com.ss.android.lark.optrace.c.a.b */
public class RunnableC48935b implements Runnable {

    /* renamed from: a */
    private TracingCoreSpan f122923a;

    /* renamed from: b */
    private Runnable f122924b;

    /* renamed from: a */
    public void mo170899a() {
    }

    public RunnableC48935b() {
        m192781b();
    }

    /* renamed from: b */
    private void m192781b() {
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (a == null) {
            Log.m165397w("SpanWrappedRunnable", "no activeSpan for currentThread");
            a = C48939c.m192792a().mo170891b();
            C48939c.m192792a().mo170890a().mo170897a(a);
        }
        this.f122923a = a.generateSpan();
    }

    public void run() {
        AbstractC48931c a = C48939c.m192792a().mo170890a().mo170897a(this.f122923a);
        if (this.f122924b == null) {
            Log.m165389i("SpanWrappedRunnable", "no innerRunnable, do execute()");
            mo170899a();
        } else {
            Log.m165389i("SpanWrappedRunnable", "has innerRunnable, ignore execute()");
            this.f122924b.run();
        }
        a.mo170895a();
    }

    public RunnableC48935b(Runnable runnable) {
        this.f122924b = runnable;
        m192781b();
    }
}
