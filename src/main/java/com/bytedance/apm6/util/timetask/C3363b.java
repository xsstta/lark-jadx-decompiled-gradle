package com.bytedance.apm6.util.timetask;

import com.bytedance.apm6.util.C3360j;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.apm6.util.timetask.b */
public class C3363b {

    /* renamed from: a */
    private static Map<AsyncTaskManagerType, C3363b> f10655a = new HashMap();

    /* renamed from: b */
    private ScheduledThreadPoolExecutor f10656b;

    /* renamed from: c */
    private ConcurrentHashMap<AbstractRunnableC3362a, ScheduledFuture> f10657c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private ConcurrentHashMap<AbstractRunnableC3362a, Runnable> f10658d = new ConcurrentHashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.util.timetask.b$a */
    public class RunnableC3365a implements Runnable {

        /* renamed from: b */
        private AbstractRunnableC3362a f10660b;

        public void run() {
            C3360j.m13993a("APM-Task");
            try {
                this.f10660b.run();
            } catch (Throwable th) {
                C3350b.m13935b("APM-AsyncTask", "thread " + Thread.currentThread().getName() + " exception", th);
            }
            C3360j.m13992a();
        }

        private RunnableC3365a(AbstractRunnableC3362a aVar) {
            this.f10660b = aVar;
        }
    }

    private C3363b(String str) {
        this.f10656b = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3366c(str));
    }

    /* renamed from: a */
    public static synchronized C3363b m13999a(AsyncTaskManagerType asyncTaskManagerType) {
        C3363b bVar;
        synchronized (C3363b.class) {
            if (asyncTaskManagerType != null) {
                bVar = f10655a.get(asyncTaskManagerType);
                if (bVar == null) {
                    bVar = new C3363b(asyncTaskManagerType.name());
                    f10655a.put(asyncTaskManagerType, bVar);
                }
            } else {
                throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo13586b(AbstractRunnableC3362a aVar) {
        try {
            Runnable remove = this.f10658d.remove(aVar);
            if (remove != null) {
                this.f10656b.remove(remove);
            }
            ScheduledFuture remove2 = this.f10657c.remove(aVar);
            if (remove2 != null) {
                remove2.cancel(true);
            }
        } catch (Throwable th) {
            C3350b.m13935b("APM-AsyncTask", "removeTask failed", th);
        }
    }

    /* renamed from: a */
    public void mo13585a(AbstractRunnableC3362a aVar) {
        ScheduledFuture<?> scheduledFuture;
        if (aVar != null) {
            try {
                RunnableC3365a aVar2 = new RunnableC3365a(aVar);
                if (aVar.mo13583b()) {
                    scheduledFuture = this.f10656b.scheduleWithFixedDelay(aVar2, aVar.mo13582a(), aVar.mo13584c(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledFuture = this.f10656b.schedule(aVar2, aVar.mo13582a(), TimeUnit.MILLISECONDS);
                }
                this.f10658d.put(aVar, aVar2);
                this.f10657c.put(aVar, scheduledFuture);
            } catch (Throwable th) {
                C3350b.m13935b("APM-AsyncTask", "sendTask failed.", th);
            }
        }
    }
}
