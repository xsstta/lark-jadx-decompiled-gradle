package com.ss.android.lark.monitor;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.monitor.d */
public class C48225d {

    /* renamed from: a */
    public final AbstractC48230h f121404a;

    /* renamed from: b */
    private ScheduledFuture<?> f121405b;

    /* renamed from: c */
    private RunnableC48226a f121406c;

    /* renamed from: b */
    public void mo168754b() {
        Log.m165379d("CoreThreadPoolMetrics", "stopPeriodicLarkPoolMetrics");
        ScheduledFuture<?> scheduledFuture = this.f121405b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f121405b = null;
        }
    }

    /* renamed from: c */
    public void mo168755c() {
        boolean a = this.f121404a.mo168764a("CoreThreadPoolMetrics");
        CoreThreadPool.setNeedMonitor(a);
        Log.m165379d("CoreThreadPoolMetrics", "collectCorePoolMetricOnce " + a);
        if (a) {
            if (this.f121406c == null) {
                this.f121406c = new RunnableC48226a();
            }
            C48248r.m190383a().mo102824a().schedule(this.f121406c, 0, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.monitor.d$a */
    public class RunnableC48226a implements Runnable {
        public void run() {
            boolean a = C48225d.this.f121404a.mo168764a("CoreThreadPoolMetrics");
            CoreThreadPool.setNeedMonitor(a);
            Log.m165379d("CoreThreadPoolMetrics", "CollectCorePoolMetricTask#run " + a);
            if (!a) {
                C48225d.this.mo168754b();
                return;
            }
            synchronized (this) {
                JSONObject b = C48248r.m190383a().mo102825b();
                if (b != null) {
                    C48225d.this.f121404a.mo168767b("CoreThreadPoolMetrics", b);
                }
            }
        }

        public RunnableC48226a() {
        }
    }

    /* renamed from: a */
    public void mo168753a() {
        boolean a = this.f121404a.mo168764a("CoreThreadPoolMetrics");
        CoreThreadPool.setNeedMonitor(a);
        Log.m165379d("CoreThreadPoolMetrics", "startPeriodicLarkPoolMetrics " + a);
        if (!a) {
            mo168754b();
        } else if (this.f121405b != null) {
            Log.m165379d("CoreThreadPoolMetrics", "startPeriodicLarkPoolMetrics found task have started");
        } else {
            if (this.f121406c == null) {
                this.f121406c = new RunnableC48226a();
            }
            this.f121405b = C48248r.m190383a().mo102824a().scheduleWithFixedDelay(this.f121406c, 2, 5, TimeUnit.MINUTES);
        }
    }

    public C48225d(AbstractC48230h hVar) {
        this.f121404a = hVar;
    }
}
