package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.reactivex.internal.schedulers.g */
public final class C68945g extends Scheduler {

    /* renamed from: b */
    private static final RxThreadFactory f172920b = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a */
    final ThreadFactory f172921a;

    public C68945g() {
        this(f172920b);
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68946h(this.f172921a);
    }

    public C68945g(ThreadFactory threadFactory) {
        this.f172921a = threadFactory;
    }
}
