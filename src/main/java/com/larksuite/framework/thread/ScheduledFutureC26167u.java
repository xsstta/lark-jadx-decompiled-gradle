package com.larksuite.framework.thread;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.thread.u */
public class ScheduledFutureC26167u<V> implements ScheduledFuture<V> {

    /* renamed from: a */
    private ScheduledFuture<?> f64632a;

    public boolean isCancelled() {
        return this.f64632a.isCancelled();
    }

    public boolean isDone() {
        return this.f64632a.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r3 = this;
            r0 = 0
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f64632a     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            java.lang.Object r0 = r1.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return r0
        L_0x0008:
            r1 = move-exception
            goto L_0x0018
        L_0x000a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = r0
            goto L_0x0018
        L_0x0013:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
        L_0x0018:
            if (r1 == 0) goto L_0x0021
            com.larksuite.framework.thread.b r2 = com.larksuite.framework.thread.C26137b.m94599a()
            r2.mo93038a(r1)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.ScheduledFutureC26167u.get():java.lang.Object");
    }

    public ScheduledFutureC26167u(ScheduledFuture<?> scheduledFuture) {
        this.f64632a = scheduledFuture;
    }

    /* renamed from: a */
    public int compareTo(Delayed delayed) {
        return this.f64632a.compareTo(delayed);
    }

    public boolean cancel(boolean z) {
        return this.f64632a.cancel(z);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f64632a.getDelay(timeUnit);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r2 = this;
            r0 = 0
            java.util.concurrent.ScheduledFuture<?> r1 = r2.f64632a     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            java.lang.Object r3 = r1.get(r3, r5)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return r3
        L_0x0008:
            r3 = move-exception
            goto L_0x0018
        L_0x000a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            r3 = r0
            goto L_0x0018
        L_0x0013:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
        L_0x0018:
            if (r3 == 0) goto L_0x0021
            com.larksuite.framework.thread.b r4 = com.larksuite.framework.thread.C26137b.m94599a()
            r4.mo93038a(r3)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.ScheduledFutureC26167u.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
