package com.bytedance.apm.p153n;

import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import com.bytedance.monitor.util.thread.C20188b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.n.b */
public class C3047b {

    /* renamed from: b */
    public static long f9814b = 30000;

    /* renamed from: c */
    public static long f9815c = 30000;

    /* renamed from: a */
    public volatile boolean f9816a;

    /* renamed from: d */
    CopyOnWriteArraySet<AbstractC3052b> f9817d;

    /* renamed from: e */
    CopyOnWriteArraySet<AbstractC3052b> f9818e;

    /* renamed from: f */
    private volatile ExecutorService f9819f;

    /* renamed from: g */
    private AbstractC20190c f9820g;

    /* renamed from: h */
    private final AbstractRunnableC20192d f9821h;

    /* renamed from: i */
    private final AbstractRunnableC20192d f9822i;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.n.b$a */
    public static final class C3051a {

        /* renamed from: a */
        static final C3047b f9826a = new C3047b();
    }

    /* renamed from: com.bytedance.apm.n.b$b */
    public interface AbstractC3052b {
        void onTimeEvent(long j);
    }

    /* renamed from: a */
    public static C3047b m12756a() {
        return C3051a.f9826a;
    }

    /* renamed from: c */
    public void mo12892c() {
        this.f9816a = false;
        mo12884a(this.f9821h);
        mo12884a(this.f9822i);
    }

    /* renamed from: b */
    public boolean mo12891b() {
        if (this.f9820g == null || Thread.currentThread().getId() != this.f9820g.mo68320a(AsyncTaskType.LIGHT_WEIGHT)) {
            return false;
        }
        return true;
    }

    private C3047b() {
        this.f9816a = true;
        this.f9821h = new AbstractRunnableC20192d() {
            /* class com.bytedance.apm.p153n.C3047b.C30481 */

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: a */
            public String mo12092a() {
                return "AsyncEventManager-mTimerRunnable";
            }

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: b */
            public AsyncTaskType mo12093b() {
                return AsyncTaskType.LIGHT_WEIGHT;
            }

            public void run() {
                Iterator<AbstractC3052b> it = C3047b.this.f9817d.iterator();
                while (it.hasNext()) {
                    it.next().onTimeEvent(System.currentTimeMillis());
                }
                if (C3047b.this.f9816a) {
                    C3047b.this.mo12885a((AbstractRunnableC20192d) this, C3047b.f9814b);
                }
            }
        };
        this.f9822i = new AbstractRunnableC20192d() {
            /* class com.bytedance.apm.p153n.C3047b.C30492 */

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: a */
            public String mo12092a() {
                return "AsyncEventManager-mControlledTimerRunnable";
            }

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: b */
            public AsyncTaskType mo12093b() {
                return AsyncTaskType.LIGHT_WEIGHT;
            }

            public void run() {
                Iterator<AbstractC3052b> it = C3047b.this.f9818e.iterator();
                while (it.hasNext()) {
                    it.next().onTimeEvent(System.currentTimeMillis());
                }
                if (C3047b.this.f9816a) {
                    C3047b.this.mo12885a((AbstractRunnableC20192d) this, C3047b.f9815c);
                }
            }
        };
        this.f9817d = new CopyOnWriteArraySet<>();
        this.f9818e = new CopyOnWriteArraySet<>();
        this.f9820g = C20188b.m73688a();
    }

    /* renamed from: d */
    public void mo12893d() {
        this.f9816a = true;
        if (!this.f9817d.isEmpty()) {
            mo12884a(this.f9821h);
            mo12885a(this.f9821h, f9814b);
        }
        if (!this.f9818e.isEmpty()) {
            mo12884a(this.f9822i);
            mo12885a(this.f9822i, f9815c);
        }
    }

    /* renamed from: b */
    public void mo12889b(AbstractC3052b bVar) {
        if (bVar != null) {
            try {
                this.f9817d.remove(bVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo12884a(AbstractRunnableC20192d dVar) {
        AbstractC20190c cVar = this.f9820g;
        if (cVar != null && dVar != null) {
            cVar.mo68328b(dVar);
        }
    }

    /* renamed from: a */
    public void mo12883a(AbstractC3052b bVar) {
        if (bVar != null) {
            try {
                if (this.f9816a && !this.f9817d.contains(bVar)) {
                    this.f9817d.add(bVar);
                    mo12884a(this.f9821h);
                    mo12885a(this.f9821h, f9814b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo12890b(Runnable runnable) {
        if (this.f9819f == null) {
            synchronized (this) {
                if (this.f9819f == null) {
                    AbstractC20190c cVar = this.f9820g;
                    if (cVar != null) {
                        this.f9819f = cVar.mo68327b();
                    } else {
                        this.f9819f = Executors.newFixedThreadPool(1, new ThreadFactory() {
                            /* class com.bytedance.apm.p153n.C3047b.ThreadFactoryC30503 */

                            /* renamed from: a */
                            public static Thread m12773a(Thread thread) {
                                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                            }

                            public Thread newThread(Runnable runnable) {
                                return m12773a(new Thread(runnable, "Apm_Normal"));
                            }
                        });
                    }
                }
            }
        }
        this.f9819f.submit(runnable);
    }

    /* renamed from: a */
    public void mo12886a(Runnable runnable) {
        if (this.f9820g != null && runnable != null && this.f9816a) {
            this.f9820g.mo68322a(m12757a(runnable, "post"));
        }
    }

    /* renamed from: a */
    public void mo12888a(ExecutorService executorService) {
        this.f9819f = executorService;
        AbstractC20190c cVar = this.f9820g;
        if (cVar != null) {
            cVar.mo68326a(executorService);
        }
    }

    /* renamed from: a */
    private AbstractRunnableC20192d m12757a(Runnable runnable, String str) {
        return C20188b.m73690a("AsyncEventManager-" + str, runnable);
    }

    /* renamed from: a */
    public void mo12885a(AbstractRunnableC20192d dVar, long j) {
        if (this.f9820g != null && dVar != null && this.f9816a) {
            this.f9820g.mo68323a(dVar, j);
        }
    }

    /* renamed from: a */
    public void mo12887a(Runnable runnable, long j) {
        if (this.f9820g != null && runnable != null && this.f9816a) {
            this.f9820g.mo68323a(m12757a(runnable, "postDelayed"), j);
        }
    }
}
