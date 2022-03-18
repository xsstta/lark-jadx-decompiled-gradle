package com.ss.android.lark.notification.p2382e;

import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.notification.e.a */
public class C48445a<T> {

    /* renamed from: a */
    public final Set<T> f121913a;

    /* renamed from: b */
    public AtomicInteger f121914b;

    /* renamed from: c */
    public final AtomicBoolean f121915c;

    /* renamed from: d */
    private final String f121916d = "BatchExecutor";

    /* renamed from: e */
    private long f121917e;

    /* renamed from: f */
    private final ScheduledExecutorService f121918f;

    /* renamed from: g */
    private volatile AbstractC48448a<T> f121919g;

    /* renamed from: h */
    private ScheduledFuture<?> f121920h;

    /* renamed from: com.ss.android.lark.notification.e.a$a */
    public interface AbstractC48448a<T> {
        /* renamed from: a */
        void mo169510a(List<T> list);
    }

    /* renamed from: b */
    public void mo169507b() {
        ArrayList arrayList;
        if (this.f121919g != null && !this.f121913a.isEmpty()) {
            synchronized (this.f121913a) {
                arrayList = new ArrayList(this.f121913a);
                this.f121913a.clear();
            }
            this.f121919g.mo169510a(arrayList);
            Log.m165379d("BatchExecutor", "consumed items count : " + arrayList.size());
        }
    }

    /* renamed from: a */
    public void mo169503a() {
        ScheduledFuture<?> scheduledFuture = this.f121920h;
        if (scheduledFuture != null && !scheduledFuture.isCancelled() && !this.f121920h.isDone()) {
            this.f121920h.cancel(false);
            this.f121915c.set(true);
        }
        if (this.f121918f.isShutdown() || this.f121918f.isTerminated()) {
            Log.m165383e("BatchExecutor", "ScheduledThreadPoolExecutor had shut down!");
        } else if (this.f121914b.get() > 0) {
            this.f121920h = this.f121918f.schedule(new Runnable() {
                /* class com.ss.android.lark.notification.p2382e.C48445a.RunnableC484472 */

                public void run() {
                    C48445a.this.f121914b.getAndDecrement();
                    C48445a.this.mo169507b();
                }
            }, 0, TimeUnit.MICROSECONDS);
        }
    }

    /* renamed from: a */
    public void mo169504a(long j) {
        this.f121917e = j;
    }

    /* renamed from: a */
    public void mo169505a(AbstractC48448a<T> aVar) {
        this.f121919g = aVar;
    }

    /* renamed from: a */
    public void mo169506a(T t) {
        if (t != null) {
            if (this.f121918f.isShutdown() || this.f121918f.isTerminated()) {
                Log.m165383e("BatchExecutor", "ScheduledThreadPoolExecutor had shut down!");
                return;
            }
            synchronized (this.f121913a) {
                this.f121913a.add(t);
            }
            if (this.f121915c.get()) {
                mo169507b();
                this.f121915c.set(false);
            }
            if (this.f121914b.get() > 0) {
                Log.m165379d("BatchExecutor", "Has waitting task, skiped");
                return;
            }
            this.f121920h = this.f121918f.schedule(new Runnable() {
                /* class com.ss.android.lark.notification.p2382e.C48445a.RunnableC484461 */

                public void run() {
                    C48445a.this.f121914b.getAndDecrement();
                    synchronized (C48445a.this.f121913a) {
                        if (C48445a.this.f121913a.size() <= 1) {
                            C48445a.this.f121915c.set(true);
                        }
                    }
                    C48445a.this.mo169507b();
                }
            }, this.f121917e, TimeUnit.MILLISECONDS);
            this.f121914b.incrementAndGet();
        }
    }

    public C48445a(long j, ScheduledExecutorService scheduledExecutorService) {
        this.f121917e = j;
        this.f121913a = new LinkedHashSet();
        this.f121918f = scheduledExecutorService;
        this.f121914b = new AtomicInteger(0);
        this.f121915c = new AtomicBoolean(true);
    }
}
