package com.ss.android.lark.monitor;

import android.app.Application;
import android.content.Intent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48243p;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.monitor.traffic.TrafficMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
public class LarkMetrics implements C48243p.AbstractC48245a {

    /* renamed from: a */
    private Application f121294a;

    /* renamed from: b */
    private C48250s f121295b;

    /* renamed from: c */
    private ArrayList<AbstractC48207a> f121296c;

    /* renamed from: d */
    private C48237n f121297d;

    /* renamed from: e */
    private ScheduledExecutorService f121298e;

    /* renamed from: f */
    private TrafficMonitor f121299f;

    /* renamed from: g */
    private C48243p f121300g;

    /* renamed from: h */
    private volatile boolean f121301h;

    /* renamed from: i */
    private long f121302i;

    /* renamed from: j */
    private volatile boolean f121303j;

    /* renamed from: k */
    private volatile boolean f121304k;

    /* renamed from: l */
    private C48225d f121305l;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SwitchType {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.monitor.LarkMetrics$a */
    public static final class C48202a {

        /* renamed from: a */
        public static final LarkMetrics f121306a = new LarkMetrics();
    }

    /* renamed from: a */
    public static LarkMetrics m190223a() {
        return C48202a.f121306a;
    }

    /* renamed from: d */
    private boolean m190231d() {
        return this.f121301h;
    }

    /* renamed from: e */
    private String m190232e() {
        return this.f121297d.f121427l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo168676c() {
        return this.f121297d.f121426k;
    }

    private LarkMetrics() {
        this.f121296c = new ArrayList<>();
        this.f121302i = System.currentTimeMillis();
        this.f121303j = true;
        this.f121304k = false;
    }

    @Override // com.ss.android.lark.monitor.C48243p.AbstractC48245a
    /* renamed from: b */
    public void mo168675b() {
        if (this.f121297d.f121430o) {
            Log.m165379d("LarkMetrics", "background ticked");
        }
        if (!this.f121304k) {
            m190224a("Background", 2);
            m190227b("Background");
        }
    }

    /* renamed from: a */
    private void m190225a(boolean z) {
        C48225d dVar;
        if (!this.f121297d.f121426k || (dVar = this.f121305l) == null) {
            return;
        }
        if (z) {
            dVar.mo168753a();
            return;
        }
        dVar.mo168754b();
        this.f121305l.mo168755c();
    }

    /* renamed from: b */
    private void m190227b(String str) {
        if (mo168676c()) {
            Intent intent = new Intent("com.ss.android.lark.metrics.doMetrics");
            intent.setPackage(this.f121294a.getPackageName());
            intent.putExtra("activity_name", str);
            this.f121294a.sendBroadcast(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m190230c(C48237n nVar) {
        this.f121302i = System.currentTimeMillis();
        this.f121294a = (Application) nVar.f121416a;
        this.f121295b = new C48250s(nVar);
        this.f121296c.add(new C48224c(nVar));
        this.f121296c.add(new C48235l(nVar));
        this.f121296c.add(new C48228f(nVar));
        if (this.f121297d.f121426k) {
            C48243p pVar = new C48243p(this.f121298e, nVar.f121432q);
            this.f121300g = pVar;
            pVar.mo168802a(this);
            m190229b(!nVar.f121431p);
            C48225d dVar = new C48225d(this.f121297d.f121420e);
            this.f121305l = dVar;
            dVar.mo168753a();
        } else {
            ChildProcessMetricsReceiver.m190221a(this.f121294a);
        }
        C48211b.m190253a(nVar.f121420e);
        this.f121301h = true;
    }

    /* renamed from: a */
    public void mo168670a(C48237n nVar) {
        ScheduledExecutorService scheduledExecutorService;
        for (String str : nVar.f121425j) {
            if (nVar.f121427l.contains(str)) {
                return;
            }
        }
        this.f121297d = nVar;
        TrafficMonitor trafficMonitor = new TrafficMonitor(nVar);
        this.f121299f = trafficMonitor;
        this.f121296c.add(trafficMonitor);
        if (nVar.f121417b != null) {
            scheduledExecutorService = nVar.f121417b;
        } else {
            scheduledExecutorService = C48248r.m190383a().mo102824a();
        }
        this.f121298e = scheduledExecutorService;
        scheduledExecutorService.execute(new Runnable(nVar) {
            /* class com.ss.android.lark.monitor.$$Lambda$LarkMetrics$RHzDMFwncXGVj0sNOh2WL_ugotc */
            public final /* synthetic */ C48237n f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                LarkMetrics.this.m190230c(this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168671a(String str) {
        if (m190231d() && !mo168676c()) {
            m190224a(str, 2);
        }
    }

    /* renamed from: b */
    private void m190229b(boolean z) {
        if (this.f121300g != null && mo168676c()) {
            if (z) {
                Log.m165389i("LarkMetrics", "enable background timer");
                this.f121300g.mo168801a();
                return;
            }
            Log.m165389i("LarkMetrics", "disable background timer");
            this.f121300g.mo168803b();
        }
    }

    /* renamed from: a */
    private void m190224a(String str, int i) {
        boolean z = this.f121303j;
        this.f121303j = false;
        if (!z || System.currentTimeMillis() - this.f121302i >= 5000) {
            this.f121298e.execute(new Runnable(str, i) {
                /* class com.ss.android.lark.monitor.$$Lambda$LarkMetrics$1Fdnn0oMloMp6OgVKedWzCQs */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    LarkMetrics.this.m190228b(this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m190228b(String str, int i) {
        this.f121295b.mo168813a("activity", str);
        this.f121295b.mo168816b("process_name", m190232e());
        Iterator<AbstractC48207a> it = this.f121296c.iterator();
        while (it.hasNext()) {
            it.next().mo168678a(this.f121295b, i);
        }
        this.f121295b.mo168815b();
    }

    /* renamed from: a */
    public void mo168672a(String str, long j, long j2) {
        TrafficMonitor trafficMonitor = this.f121299f;
        if (trafficMonitor != null) {
            trafficMonitor.mo168836a(str, j, j2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168674a(boolean z, String str, String str2) {
        if (m190231d()) {
            this.f121304k = z;
            m190229b(!z);
            if (z) {
                Iterator<AbstractC48207a> it = this.f121296c.iterator();
                while (it.hasNext()) {
                    it.next().mo168679a("Background", "0", str2, "1");
                }
                m190224a("Background", 0);
            } else {
                Iterator<AbstractC48207a> it2 = this.f121296c.iterator();
                while (it2.hasNext()) {
                    it2.next().mo168679a(str, "1", "Background", "0");
                }
                m190224a(str, 1);
            }
            m190225a(z);
        }
    }

    /* renamed from: a */
    public void mo168673a(String str, long j, long j2, Set<String> set) {
        TrafficMonitor trafficMonitor = this.f121299f;
        if (trafficMonitor != null) {
            trafficMonitor.mo168837a(str, j, j2, set);
        }
    }
}
