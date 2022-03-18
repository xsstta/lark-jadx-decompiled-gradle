package com.bytedance.monitor.util.thread;

import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.p855a.AbstractC20187c;
import com.bytedance.monitor.util.thread.p855a.C20184b;
import com.bytedance.monitor.util.thread.p855a.ThreadFactoryC20181a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.monitor.util.thread.a */
public class C20176a implements AbstractC20190c {

    /* renamed from: b */
    private static final Object f49293b = new Object();

    /* renamed from: a */
    public Map<AsyncTaskType, Long> f49294a = new ConcurrentHashMap(3);

    /* renamed from: c */
    private C20184b f49295c;

    /* renamed from: d */
    private C20184b f49296d;

    /* renamed from: e */
    private C20184b f49297e;

    /* renamed from: f */
    private AbstractC20193e f49298f;

    /* renamed from: g */
    private AbstractC20190c.AbstractC20191a f49299g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.monitor.util.thread.a$a */
    public static final class C20180a {

        /* renamed from: a */
        static final C20176a f49303a = new C20176a();
    }

    /* renamed from: a */
    public static C20176a m73641a() {
        return C20180a.f49303a;
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: c */
    public AbstractC20193e mo68329c() {
        return this.f49298f;
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: b */
    public ExecutorService mo68327b() {
        return mo68331e();
    }

    public C20176a() {
        m73646g();
    }

    /* renamed from: g */
    private void m73646g() {
        m73643b((AbstractC20193e) null);
        m73642a((AbstractC20193e) null);
        m73645c((AbstractC20193e) null);
    }

    /* renamed from: d */
    public C20184b mo68330d() {
        if (this.f49296d == null) {
            m73643b(this.f49298f);
        }
        return this.f49296d;
    }

    /* renamed from: e */
    public C20184b mo68331e() {
        if (this.f49295c == null) {
            m73642a(this.f49298f);
        }
        return this.f49295c;
    }

    /* renamed from: f */
    public C20184b mo68332f() {
        if (this.f49297e == null) {
            m73645c(this.f49298f);
        }
        return this.f49297e;
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: a */
    public void mo68321a(AbstractC20190c.AbstractC20191a aVar) {
        this.f49299g = aVar;
    }

    /* renamed from: c */
    private AbstractC20187c m73644c(AbstractRunnableC20192d dVar) {
        AsyncTaskType b = dVar.mo12093b();
        if (b == AsyncTaskType.IO) {
            return mo68331e();
        }
        if (b == AsyncTaskType.TIME_SENSITIVE) {
            return mo68332f();
        }
        return mo68330d();
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: a */
    public long mo68320a(AsyncTaskType asyncTaskType) {
        Long l = this.f49294a.get(asyncTaskType);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: b */
    public void mo68328b(AbstractRunnableC20192d dVar) {
        if (dVar != null) {
            try {
                m73644c(dVar).mo68328b(dVar);
            } catch (Throwable th) {
                mo68325a(th, "Apm-Async-task-removeTask");
            }
        }
    }

    /* renamed from: a */
    private void m73642a(AbstractC20193e eVar) {
        synchronized (f49293b) {
            if (this.f49295c == null) {
                ThreadFactoryC20181a aVar = new ThreadFactoryC20181a("io-task");
                aVar.mo68335a(eVar);
                aVar.mo68334a(new ThreadFactoryC20181a.AbstractC20183a() {
                    /* class com.bytedance.monitor.util.thread.C20176a.C201771 */

                    @Override // com.bytedance.monitor.util.thread.p855a.ThreadFactoryC20181a.AbstractC20183a
                    /* renamed from: a */
                    public void mo68333a(long j) {
                        C20176a.this.f49294a.put(AsyncTaskType.IO, Long.valueOf(j));
                    }
                });
                C20184b bVar = new C20184b(1, aVar);
                bVar.mo68338a(eVar);
                this.f49295c = bVar;
            }
        }
    }

    /* renamed from: b */
    private void m73643b(AbstractC20193e eVar) {
        synchronized (f49293b) {
            if (this.f49296d == null) {
                ThreadFactoryC20181a aVar = new ThreadFactoryC20181a("light-weight-task");
                aVar.mo68335a(eVar);
                aVar.mo68334a(new ThreadFactoryC20181a.AbstractC20183a() {
                    /* class com.bytedance.monitor.util.thread.C20176a.C201782 */

                    @Override // com.bytedance.monitor.util.thread.p855a.ThreadFactoryC20181a.AbstractC20183a
                    /* renamed from: a */
                    public void mo68333a(long j) {
                        C20176a.this.f49294a.put(AsyncTaskType.LIGHT_WEIGHT, Long.valueOf(j));
                    }
                });
                C20184b bVar = new C20184b(1, aVar);
                bVar.mo68338a(eVar);
                this.f49296d = bVar;
            }
        }
    }

    /* renamed from: c */
    private void m73645c(AbstractC20193e eVar) {
        synchronized (f49293b) {
            if (this.f49297e == null) {
                ThreadFactoryC20181a aVar = new ThreadFactoryC20181a("time-sensitive-task");
                aVar.mo68335a(eVar);
                aVar.mo68334a(new ThreadFactoryC20181a.AbstractC20183a() {
                    /* class com.bytedance.monitor.util.thread.C20176a.C201793 */

                    @Override // com.bytedance.monitor.util.thread.p855a.ThreadFactoryC20181a.AbstractC20183a
                    /* renamed from: a */
                    public void mo68333a(long j) {
                        C20176a.this.f49294a.put(AsyncTaskType.TIME_SENSITIVE, Long.valueOf(j));
                    }
                });
                C20184b bVar = new C20184b(1, aVar);
                bVar.mo68338a(eVar);
                this.f49297e = bVar;
            }
        }
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68322a(AbstractRunnableC20192d dVar) {
        if (dVar != null) {
            try {
                m73644c(dVar).mo68322a(dVar);
            } catch (Throwable th) {
                mo68325a(th, "Apm-Async-task-post");
            }
        }
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: a */
    public void mo68326a(ExecutorService executorService) {
        mo68331e().mo68340a(executorService);
    }

    @Override // com.bytedance.monitor.util.thread.AbstractC20190c
    /* renamed from: a */
    public void mo68325a(Throwable th, String str) {
        AbstractC20190c.AbstractC20191a aVar = this.f49299g;
        if (aVar != null) {
            aVar.mo12829a(th, str);
        }
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68323a(AbstractRunnableC20192d dVar, long j) {
        if (dVar != null) {
            try {
                m73644c(dVar).mo68323a(dVar, j);
            } catch (Throwable th) {
                mo68325a(th, "Apm-Async-task-postDelayed");
            }
        }
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68324a(AbstractRunnableC20192d dVar, long j, long j2) {
        if (dVar != null) {
            try {
                m73644c(dVar).mo68324a(dVar, j, j2);
            } catch (Throwable th) {
                mo68325a(th, "Apm-Async-task-removeTask");
            }
        }
    }
}
