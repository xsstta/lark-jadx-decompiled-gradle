package com.bytedance.apm6.p177f;

import android.app.Activity;
import com.bytedance.apm.p138d.AbstractC2916c;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p177f.p178a.C3305a;
import com.bytedance.apm6.p177f.p179b.AbstractC3311b;
import com.bytedance.apm6.p177f.p179b.C3310a;
import com.bytedance.apm6.p177f.p180c.AbstractC3314a;
import com.bytedance.apm6.p177f.p181d.C3316a;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p191d.C3339b;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.apm6.f.b */
public class C3306b {

    /* renamed from: b */
    private static final String f10541b = "b";

    /* renamed from: a */
    public volatile boolean f10542a;

    /* renamed from: c */
    private volatile boolean f10543c;

    /* renamed from: d */
    private volatile AbstractC2916c f10544d;

    /* renamed from: e */
    private C3310a f10545e;

    /* renamed from: f */
    private AbstractRunnableC3362a f10546f;

    /* renamed from: g */
    private volatile boolean f10547g;

    /* renamed from: h */
    private long f10548h;

    /* renamed from: i */
    private C3309b f10549i;

    /* renamed from: j */
    private Map<Object, Object> f10550j;

    /* renamed from: k */
    private List<AbstractC3314a> f10551k;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.f.b$a */
    public static class C3308a {

        /* renamed from: a */
        public static final C3306b f10553a = new C3306b();
    }

    /* renamed from: d */
    public void mo13524d() {
        this.f10542a = false;
    }

    /* renamed from: e */
    public void mo13525e() {
        this.f10542a = true;
    }

    /* renamed from: a */
    public static C3306b m13762a() {
        return C3308a.f10553a;
    }

    /* renamed from: c */
    public void mo13523c() {
        C3312c.m13787a().mo13541b();
    }

    /* renamed from: g */
    public synchronized void mo13527g() {
        if (this.f10547g) {
            this.f10547g = false;
            m13765k();
        }
    }

    /* renamed from: i */
    public boolean mo13529i() {
        C3310a aVar = this.f10545e;
        if (aVar == null || !aVar.mo13536d()) {
            return false;
        }
        return true;
    }

    private C3306b() {
        this.f10549i = new C3309b();
        this.f10551k = new CopyOnWriteArrayList();
    }

    /* renamed from: k */
    private void m13765k() {
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "cancelCollectMemory");
        }
        if (this.f10546f != null) {
            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(this.f10546f);
            this.f10546f = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo13522b() {
        if (!this.f10543c) {
            this.f10543c = true;
            mo13521a(((AbstractC3311b) C3336c.m13901a(AbstractC3311b.class)).mo13293a());
        }
    }

    /* renamed from: f */
    public synchronized void mo13526f() {
        if (!this.f10547g) {
            this.f10547g = true;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "start");
            }
            m13764j();
        }
    }

    /* renamed from: j */
    private void m13764j() {
        if (this.f10546f == null) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "scheduleCollectMemory");
            }
            this.f10546f = new AbstractRunnableC3362a(0, this.f10548h) {
                /* class com.bytedance.apm6.p177f.C3306b.C33071 */

                public void run() {
                    if (!C3306b.this.f10542a) {
                        C3306b.this.mo13528h();
                    }
                }
            };
            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10546f);
        }
    }

    /* renamed from: h */
    public void mo13528h() {
        long currentTimeMillis = System.currentTimeMillis();
        C3316a a = C3312c.m13787a().mo13540a(this.f10545e);
        if (a != null) {
            a.mo13543a(this.f10550j);
            this.f10550j = null;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", String.format("collect[isUploadEnable=%s cost=%s]: %s", Boolean.valueOf(this.f10545e.mo13538f()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), a.mo13107i().toString()));
            }
            if (this.f10545e.mo13538f()) {
                m13763a(a);
            } else if (C2921a.m12357a()) {
                C2921a.m12361d(f10541b, a.mo13107i().toString());
            }
            if (a.mo13544f() > this.f10545e.mo13533b() && this.f10544d != null) {
                this.f10544d.onReachTop("reach_top_java");
            }
            List<AbstractC3314a> list = this.f10551k;
            if (list != null && list.size() > 0) {
                try {
                    C3305a j = a.mo13545j();
                    for (AbstractC3314a aVar : this.f10551k) {
                        aVar.mo13542a(j);
                    }
                } catch (Exception unused) {
                }
            }
        } else if (C3318a.m13915u()) {
            C3350b.m13932a("APM-Memory", "collectWithConfig return is null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.f.b$b */
    public class C3309b extends C3339b {
        private C3309b() {
        }

        @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c, com.bytedance.apm6.p187i.p191d.C3339b
        public final void onBackground(Activity activity) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "isStopWhenBackground:" + C3306b.this.mo13529i());
            }
            if (C3306b.this.mo13529i()) {
                C3306b.this.mo13527g();
            }
        }

        @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c, com.bytedance.apm6.p187i.p191d.C3339b
        public final void onFront(Activity activity) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "isStopWhenBackground:" + C3306b.this.mo13529i());
            }
            if (C3306b.this.mo13529i()) {
                C3306b.this.mo13526f();
            }
        }
    }

    /* renamed from: a */
    private void m13763a(AbstractC3326b bVar) {
        if (bVar != null) {
            C3324a.m13872a(bVar);
        }
    }

    /* renamed from: a */
    public void mo13520a(AbstractC2916c cVar) {
        this.f10544d = cVar;
    }

    /* renamed from: a */
    public synchronized void mo13521a(C3310a aVar) {
        if (aVar != null) {
            this.f10545e = aVar;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "updateConfig: " + aVar);
            }
            if (!aVar.mo13532a()) {
                mo13527g();
                AbstractC3338a aVar2 = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
                if (aVar2 != null) {
                    aVar2.mo13550b(this.f10549i);
                }
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-Memory", "isApm6SampleEnable: " + aVar.mo13532a());
                }
                return;
            }
            AbstractC3338a aVar3 = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
            if (aVar3 != null) {
                if (aVar.mo13536d()) {
                    aVar3.mo13550b(this.f10549i);
                    aVar3.mo13547a(this.f10549i);
                } else {
                    aVar3.mo13550b(this.f10549i);
                }
            }
            long c = aVar.mo13535c() * 1000;
            this.f10548h = c;
            if (c < 30000) {
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-Memory", "pollingIntervalMillis: " + this.f10548h);
                }
                this.f10548h = 30000;
            }
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Memory", "result pollingIntervalMillis: " + this.f10548h);
            }
            AbstractRunnableC3362a aVar4 = this.f10546f;
            if (!(aVar4 == null || aVar4.mo13584c() == this.f10548h)) {
                mo13527g();
            }
            mo13526f();
            AbstractC3304a aVar5 = (AbstractC3304a) C3336c.m13901a(AbstractC3304a.class);
            if (aVar5 != null) {
                aVar5.mo13113a();
            }
        }
    }
}
