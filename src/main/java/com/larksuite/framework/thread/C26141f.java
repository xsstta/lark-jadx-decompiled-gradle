package com.larksuite.framework.thread;

import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.f */
public class C26141f extends ScheduledThreadPoolExecutor implements AbstractC26160p {

    /* renamed from: a */
    public long f64549a = 2000;

    /* renamed from: b */
    public long f64550b = 5000;

    /* renamed from: c */
    private String f64551c;

    /* renamed from: d */
    private HashMap<String, Long> f64552d = new HashMap<>();

    /* renamed from: e */
    private boolean f64553e = false;

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public String mo93047a() {
        return this.f64551c;
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public HashMap<String, Long> mo93051b() {
        return this.f64552d;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return m94607a(runnable, (Object) null);
    }

    /* renamed from: a */
    private <V> Callable<V> m94606a(final Callable<V> callable) {
        final CallableC26139d dVar = new CallableC26139d(callable, this);
        return new Callable<V>() {
            /* class com.larksuite.framework.thread.C26141f.CallableC261421 */

            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                try {
                    Log.m165389i("CoreThreadPool CoreScheduledThreadPoolExecutor", callable.getClass() + " begin run");
                    V v = (V) dVar.call();
                    Log.m165389i("CoreThreadPool CoreScheduledThreadPoolExecutor", callable.getClass() + " end run");
                    return v;
                } catch (Exception e) {
                    Log.m165383e("CoreThreadPool CoreScheduledThreadPoolExecutor", "schedule task exception, task name: " + callable.getClass());
                    C26137b.m94599a().mo93038a(e);
                    throw e;
                }
            }
        };
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public void mo93052b(String str) {
        if (this.f64553e) {
            synchronized (this.f64552d) {
                this.f64552d.remove(str);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public <V> Future<V> submit(Callable<V> callable) {
        return new FutureC26166t(super.submit(m94606a(callable)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Runnable mo93046a(final Runnable runnable) {
        final RunnableC26148j jVar = new RunnableC26148j(runnable, this);
        return new Runnable() {
            /* class com.larksuite.framework.thread.C26141f.RunnableC261432 */

            public void run() {
                try {
                    Log.m165389i("CoreThreadPool CoreScheduledThreadPoolExecutor", runnable.getClass() + " begin run");
                    jVar.run();
                    Log.m165389i("CoreThreadPool CoreScheduledThreadPoolExecutor", runnable.getClass() + " end run");
                } catch (Exception e) {
                    Log.m165383e("CoreThreadPool CoreScheduledThreadPoolExecutor", "schedule task exception, task name: " + runnable.getClass());
                    C26137b.m94599a().mo93038a(e);
                    throw e;
                }
            }
        };
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public void mo93049a(String str) {
        if (this.f64553e) {
            synchronized (this.f64552d) {
                this.f64552d.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93050a(boolean z) {
        this.f64553e = z;
        if (!z) {
            synchronized (this.f64552d) {
                this.f64552d.clear();
            }
        }
    }

    /* renamed from: a */
    public void mo93048a(long j, long j2) {
        this.f64549a = j;
        this.f64550b = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public <V> Future<V> submit(Runnable runnable, V v) {
        return m94607a(runnable, v);
    }

    /* renamed from: a */
    private <V> Future<V> m94607a(Runnable runnable, V v) {
        return new FutureC26166t(super.submit(mo93046a(runnable), v));
    }

    @Override // java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new ScheduledFutureC26167u(super.schedule(mo93046a(runnable), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new ScheduledFutureC26167u(super.schedule(m94606a(callable), j, timeUnit));
    }

    public C26141f(String str, int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.f64551c = str + "-ScheduleExecutor";
        mo93048a(2000, 5000);
        setRejectedExecutionHandler(C26155n.f64600e);
    }

    @Override // java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new ScheduledFutureC26167u(super.scheduleAtFixedRate(mo93046a(runnable), j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new ScheduledFutureC26167u(super.scheduleWithFixedDelay(mo93046a(runnable), j, j2, timeUnit));
    }
}
