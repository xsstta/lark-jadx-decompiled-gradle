package com.larksuite.framework.thread;

import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.larksuite.framework.thread.a */
public class C26134a<T> {

    /* renamed from: a */
    public AtomicInteger f64525a;

    /* renamed from: b */
    private final String f64526b = "CoreThreadPool BatchExecutor";

    /* renamed from: c */
    private final Set<T> f64527c;

    /* renamed from: d */
    private long f64528d;

    /* renamed from: e */
    private ScheduledExecutorService f64529e;

    /* renamed from: f */
    private volatile AbstractC26136a<T> f64530f;

    /* renamed from: g */
    private ScheduledFuture<?> f64531g;

    /* renamed from: com.larksuite.framework.thread.a$a */
    public interface AbstractC26136a<T> {
        void onExecute(List<T> list);
    }

    /* renamed from: a */
    public void mo93033a() {
        ArrayList arrayList;
        if (this.f64530f != null && !this.f64527c.isEmpty()) {
            synchronized (this.f64527c) {
                arrayList = new ArrayList(this.f64527c);
                this.f64527c.clear();
            }
            Log.m165389i("CoreThreadPool BatchExecutor", "run flashTask taskname : " + this.f64530f.getClass().toString());
            this.f64530f.onExecute(arrayList);
            Log.m165389i("CoreThreadPool BatchExecutor", "consumed items count : " + arrayList.size());
        }
    }

    /* renamed from: a */
    public void mo93034a(AbstractC26136a<T> aVar) {
        this.f64530f = aVar;
    }

    /* renamed from: a */
    public void mo93035a(T t) {
        if (t == null) {
            Log.m165397w("CoreThreadPool BatchExecutor", "offer item is null");
        } else if (this.f64529e.isShutdown() || this.f64529e.isTerminated()) {
            Log.m165383e("CoreThreadPool BatchExecutor", "ScheduledThreadPoolExecutor had shut down!");
        } else {
            synchronized (this.f64527c) {
                this.f64527c.add(t);
            }
            if (this.f64525a.get() > 0) {
                Log.m165397w("CoreThreadPool BatchExecutor", "Has waitting task, skiped");
                return;
            }
            this.f64531g = this.f64529e.schedule(new Runnable() {
                /* class com.larksuite.framework.thread.C26134a.RunnableC261351 */

                public void run() {
                    C26134a.this.f64525a.getAndDecrement();
                    C26134a.this.mo93033a();
                }
            }, this.f64528d, TimeUnit.MILLISECONDS);
            this.f64525a.incrementAndGet();
        }
    }

    public C26134a(long j, ScheduledExecutorService scheduledExecutorService) {
        this.f64528d = j;
        this.f64527c = new LinkedHashSet();
        this.f64529e = scheduledExecutorService;
        this.f64525a = new AtomicInteger(0);
    }
}
