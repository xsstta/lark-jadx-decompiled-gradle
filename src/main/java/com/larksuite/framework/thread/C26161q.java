package com.larksuite.framework.thread;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.larksuite.framework.thread.q */
public class C26161q {

    /* renamed from: a */
    public AbstractC26163a f64614a;

    /* renamed from: b */
    public AtomicInteger f64615b = new AtomicInteger(0);

    /* renamed from: c */
    private final long f64616c;

    /* renamed from: d */
    private final long f64617d;

    /* renamed from: e */
    private ScheduledExecutorService f64618e = CoreThreadPool.getDefault().getScheduleThreadPool();

    /* renamed from: f */
    private Runnable f64619f = new Runnable() {
        /* class com.larksuite.framework.thread.C26161q.RunnableC261621 */

        public void run() {
            C26161q.this.f64615b.incrementAndGet();
            if (C26161q.this.f64614a != null) {
                C26161q.this.f64614a.mo93101a(C26161q.this.f64615b);
            }
        }
    };

    /* renamed from: g */
    private ScheduledFuture f64620g;

    /* renamed from: com.larksuite.framework.thread.q$a */
    public interface AbstractC26163a {
        /* renamed from: a */
        void mo93101a(AtomicInteger atomicInteger);
    }

    /* renamed from: c */
    private boolean m94661c() {
        ScheduledFuture scheduledFuture = this.f64620g;
        if (scheduledFuture == null || scheduledFuture.isCancelled() || this.f64620g.isDone()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C26161q mo93097a() {
        if (this.f64619f == null || m94661c()) {
            return this;
        }
        this.f64620g = this.f64618e.scheduleAtFixedRate(this.f64619f, this.f64617d, this.f64616c, TimeUnit.MILLISECONDS);
        return this;
    }

    /* renamed from: b */
    public C26161q mo93099b() {
        if (m94661c()) {
            this.f64620g.cancel(false);
            this.f64615b.set(0);
        }
        return this;
    }

    /* renamed from: a */
    public C26161q mo93098a(AbstractC26163a aVar) {
        this.f64614a = aVar;
        return this;
    }

    public C26161q(long j, long j2) {
        this.f64616c = j2;
        this.f64617d = j;
    }
}
