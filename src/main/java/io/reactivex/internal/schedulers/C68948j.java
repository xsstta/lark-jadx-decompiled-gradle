package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.j */
public final class C68948j {

    /* renamed from: a */
    public static final boolean f172924a;

    /* renamed from: b */
    public static final int f172925b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f172926c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f172927d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.j$a */
    static final class C68949a {

        /* renamed from: a */
        boolean f172928a;

        /* renamed from: b */
        int f172929b;

        C68949a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238667a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f172928a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f172928a = true;
            }
            if (!this.f172928a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f172929b = 1;
                return;
            }
            try {
                this.f172929b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f172929b = 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.j$b */
    public static final class RunnableC68950b implements Runnable {
        RunnableC68950b() {
        }

        public void run() {
            Iterator it = new ArrayList(C68948j.f172927d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C68948j.f172927d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m265518a() {
        m265519a(f172924a);
    }

    static {
        Properties properties = System.getProperties();
        C68949a aVar = new C68949a();
        aVar.mo238667a(properties);
        f172924a = aVar.f172928a;
        f172925b = aVar.f172929b;
        m265518a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m265517a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m265520a(f172924a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    static void m265519a(boolean z) {
        if (z) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f172926c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        RunnableC68950b bVar = new RunnableC68950b();
                        int i = f172925b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    static void m265520a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f172927d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
