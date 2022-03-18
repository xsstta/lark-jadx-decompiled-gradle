package com.ss.android.lark.monitor;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.p */
public class C48243p {

    /* renamed from: a */
    public AbstractC48245a f121457a;

    /* renamed from: b */
    private long f121458b = 360000;

    /* renamed from: c */
    private ScheduledFuture<?> f121459c;

    /* renamed from: d */
    private ScheduledExecutorService f121460d;

    /* renamed from: com.ss.android.lark.monitor.p$a */
    public interface AbstractC48245a {
        /* renamed from: b */
        void mo168675b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo168803b() {
        ScheduledFuture<?> scheduledFuture = this.f121459c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168801a() {
        mo168803b();
        ScheduledExecutorService scheduledExecutorService = this.f121460d;
        RunnableC482441 r1 = new Runnable() {
            /* class com.ss.android.lark.monitor.C48243p.RunnableC482441 */

            public void run() {
                boolean z;
                if (C48243p.this.f121457a != null) {
                    if (System.currentTimeMillis() < 180000) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C48243p.this.f121457a.mo168675b();
                    }
                }
            }
        };
        long j = this.f121458b;
        this.f121459c = scheduledExecutorService.scheduleWithFixedDelay(r1, j, j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168802a(AbstractC48245a aVar) {
        this.f121457a = aVar;
    }

    C48243p(ScheduledExecutorService scheduledExecutorService, long j) {
        this.f121460d = scheduledExecutorService;
        if (j > 0) {
            this.f121458b = j;
        }
    }
}
