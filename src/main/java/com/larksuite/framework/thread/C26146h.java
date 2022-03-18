package com.larksuite.framework.thread;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.h */
public class C26146h extends C26155n {

    /* renamed from: d */
    private static final int f64574d = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    private static C26146h f64575h = null;

    /* renamed from: a */
    public long f64576a = 1000;

    /* renamed from: b */
    public long f64577b = 5000;

    /* renamed from: c */
    public long f64578c = 5000;

    /* renamed from: i */
    private AtomicInteger f64579i = new AtomicInteger(0);

    /* renamed from: c */
    public static C26155n m94620c(String str) {
        C26146h hVar = f64575h;
        if (hVar != null) {
            return hVar;
        }
        synchronized (C26146h.class) {
            if (f64575h == null) {
                f64575h = new C26146h(str, new LinkedBlockingDeque((int) SmActions.ACTION_ONTHECALL_EXIT), new ThreadFactoryC26153m("lk-serial", 0, false));
            }
            f64575h.mo93072a(400, 300, 500);
        }
        return f64575h;
    }

    /* renamed from: a */
    public void mo93073a(boolean z) {
        int i;
        if (z) {
            i = this.f64579i.incrementAndGet();
        } else {
            i = this.f64579i.decrementAndGet();
        }
        int corePoolSize = getCorePoolSize();
        int maximumPoolSize = getMaximumPoolSize();
        int i2 = corePoolSize * 2;
        if (i > i2 + 1 && corePoolSize < f64574d) {
            setCorePoolSize(corePoolSize + 1);
            setMaximumPoolSize(maximumPoolSize + 1);
        } else if (corePoolSize > 1 && i <= i2 - 1) {
            setMaximumPoolSize(maximumPoolSize - 1);
            setCorePoolSize(corePoolSize - 1);
        }
    }

    /* renamed from: a */
    public void mo93072a(long j, long j2, long j3) {
        this.f64576a = j2;
        this.f64577b = j3;
        this.f64578c = j;
    }

    private C26146h(String str, BlockingQueue<Runnable> blockingQueue, ThreadFactoryC26153m mVar) {
        super(str, 1, 2, 30, blockingQueue, mVar);
        this.f64604g = this.f64603f + "-SerialExecutor";
    }
}
