package com.ss.android.lark.live.apm.p2138e;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.live.apm.e.b */
public final class C41502b {

    /* renamed from: a */
    private List<C41503c> f105506a = new ArrayList();

    /* renamed from: b */
    public synchronized void mo149371b() {
        for (C41503c cVar : this.f105506a) {
            if (cVar.f105512f != null) {
                cVar.f105512f.cancel(true);
                cVar.f105512f = null;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo149369a() {
        mo149371b();
        this.f105506a.clear();
    }

    /* renamed from: b */
    public synchronized void mo149372b(String str) {
        m164702b(m164703d(str));
    }

    /* renamed from: b */
    private void m164702b(C41503c cVar) {
        m164701a(cVar);
        if (cVar != null && cVar.f105512f == null) {
            cVar.f105512f = m164698a(cVar.f105511e, cVar.f105510d, cVar.f105509c);
        }
    }

    /* renamed from: c */
    public synchronized void mo149373c(String str) {
        C41503c d = m164703d(str);
        if (d != null) {
            d.f105510d = 0;
            m164702b(d);
        }
    }

    /* renamed from: a */
    private void m164701a(C41503c cVar) {
        if (cVar != null && cVar.f105512f != null) {
            cVar.f105512f.cancel(true);
            cVar.f105512f = null;
        }
    }

    /* renamed from: d */
    private C41503c m164703d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C41503c cVar : this.f105506a) {
            if (str.equals(cVar.f105508b)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized boolean mo149370a(String str) {
        C41503c d = m164703d(str);
        if (d == null) {
            return false;
        }
        m164701a(d);
        this.f105506a.remove(d);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m164700a(AbstractC41501a aVar, String str, int i) {
        if (aVar != null) {
            aVar.mo149336a(str, i);
        }
    }

    /* renamed from: a */
    private ScheduledFuture m164698a(Runnable runnable, int i, int i2) {
        return m164699a(runnable, (long) i, (long) i2);
    }

    /* renamed from: a */
    private ScheduledFuture<?> m164699a(Runnable runnable, long j, long j2) {
        return CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(runnable, j, j2, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public synchronized C41502b mo149367a(String str, int i, int i2, AbstractC41501a aVar) {
        return mo149368a("", str, i, i2, aVar);
    }

    /* renamed from: a */
    public synchronized C41502b mo149368a(String str, String str2, int i, int i2, AbstractC41501a aVar) {
        if (TextUtils.isEmpty(str2) || i2 <= 0) {
            throw new IllegalArgumentException("taskName null or peroid <= 0");
        }
        if (mo149370a(str2)) {
            C45855f.m181664c("LiveTimerExecutor", "task removed: " + str2);
        }
        this.f105506a.add(new C41503c(str, str2, i, i2, new Runnable(str2, i2) {
            /* class com.ss.android.lark.live.apm.p2138e.$$Lambda$b$mQOkittRU7wvBzAsWpLipqtk20 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C41502b.m164700a(AbstractC41501a.this, this.f$1, this.f$2);
            }
        }));
        return this;
    }
}
