package com.bytedance.monitor.collector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.p153n.C3056d;
import com.bytedance.monitor.collector.AbstractC20130d;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.C20134g;
import com.bytedance.monitor.util.p853a.C20168b;
import com.bytedance.services.apm.api.AbstractC20698c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.monitor.collector.k */
public class C20152k {

    /* renamed from: a */
    static volatile boolean f49237a;

    /* renamed from: c */
    private static AbstractC20155a f49238c;

    /* renamed from: d */
    private static volatile C20152k f49239d;

    /* renamed from: b */
    protected C3056d f49240b;

    /* renamed from: e */
    private final List<AbsMonitor> f49241e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private volatile boolean f49242f;

    /* renamed from: g */
    private volatile boolean f49243g;

    /* renamed from: h */
    private volatile boolean f49244h;

    /* renamed from: i */
    private volatile boolean f49245i;

    /* renamed from: j */
    private volatile boolean f49246j;

    /* renamed from: k */
    private BinderMonitor f49247k;

    /* renamed from: l */
    private C20157l f49248l;

    /* renamed from: m */
    private C20127b f49249m;

    /* renamed from: n */
    private C20134g f49250n;

    /* renamed from: o */
    private AbstractC20130d f49251o;

    /* renamed from: p */
    private AbstractC20132e f49252p;

    /* renamed from: com.bytedance.monitor.collector.k$a */
    public interface AbstractC20155a {
        /* renamed from: a */
        void mo68307a(String str);
    }

    /* renamed from: com.bytedance.monitor.collector.k$b */
    public interface AbstractC20156b {
        /* renamed from: a */
        void mo12845a(List<String> list);
    }

    /* renamed from: b */
    public void mo68293b() {
        this.f49244h = true;
    }

    /* renamed from: h */
    public C3056d mo68300h() {
        return this.f49240b;
    }

    /* renamed from: c */
    public AbstractC20130d.AbstractC20131a mo68294c() {
        AbstractC20130d dVar = this.f49251o;
        if (dVar == null) {
            return null;
        }
        return dVar.mo68237a();
    }

    /* renamed from: d */
    public void mo68296d() {
        if (this.f49252p != null && this.f49246j) {
            this.f49252p.mo68240a();
        }
    }

    /* renamed from: e */
    public void mo68297e() {
        if (this.f49252p != null && this.f49246j) {
            this.f49252p.mo68242b();
        }
    }

    /* renamed from: i */
    public void mo68301i() {
        LockMonitorManager.setOpenFetchStack(false);
        if (f49237a) {
            try {
                MonitorJni.doCloseLockStackTrace();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: j */
    public List<BinderMonitor.C20114a> mo68302j() {
        BinderMonitor binderMonitor = this.f49247k;
        if (binderMonitor != null) {
            return binderMonitor.mo68218e();
        }
        return null;
    }

    /* renamed from: l */
    public C20134g.AbstractC20141c mo68304l() {
        C20134g gVar = this.f49250n;
        if (gVar == null) {
            return null;
        }
        return gVar.f49149h;
    }

    /* renamed from: m */
    public C20134g.C20143e mo68305m() {
        C20134g gVar = this.f49250n;
        if (gVar == null) {
            return null;
        }
        return gVar.mo68247f();
    }

    private C20152k() {
        ActivityLifeObserver.getInstance().register(new AbstractC20698c() {
            /* class com.bytedance.monitor.collector.C20152k.C201531 */

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityPause(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityResume(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onActivityStarted(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onChange(Activity activity, Fragment fragment) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onBackground(Activity activity) {
                C20152k.this.mo68297e();
            }

            @Override // com.bytedance.services.apm.api.AbstractC20698c
            public void onFront(Activity activity) {
                C20152k.this.mo68296d();
            }
        });
    }

    /* renamed from: a */
    public static C20152k m73538a() {
        if (f49239d == null) {
            synchronized (C20152k.class) {
                if (f49239d == null) {
                    f49239d = new C20152k();
                }
            }
        }
        return f49239d;
    }

    /* renamed from: f */
    public void mo68298f() {
        for (int i = 0; i < this.f49241e.size(); i++) {
            this.f49241e.get(i).mo68211a();
        }
        this.f49243g = true;
    }

    /* renamed from: g */
    public void mo68299g() {
        for (int i = 0; i < this.f49241e.size(); i++) {
            this.f49241e.get(i).mo68213b();
        }
        this.f49243g = false;
    }

    /* renamed from: k */
    public JSONObject mo68303k() {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.f49241e.size(); i++) {
            try {
                Pair<String, ?> c = this.f49241e.get(i).mo68215c();
                jSONObject.put((String) c.first, c.second);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo68291a(boolean z) {
        this.f49245i = z;
    }

    /* renamed from: a */
    public static synchronized boolean m73539a(Context context) {
        boolean z;
        synchronized (C20152k.class) {
            if (!f49237a) {
                AbstractC20155a aVar = f49238c;
                if (aVar != null) {
                    aVar.mo68307a("monitorcollector-lib");
                    f49237a = true;
                } else {
                    f49237a = C20168b.m73599a(context, "monitorcollector-lib");
                }
                ByteHook.init();
            }
            z = f49237a;
        }
        return z;
    }

    /* renamed from: a */
    public void mo68287a(int i) {
        if (this.f49244h) {
            for (AbsMonitor absMonitor : this.f49241e) {
                if (absMonitor != null) {
                    absMonitor.mo68212a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo68289a(AbsMonitor absMonitor) {
        if (absMonitor != null && !this.f49241e.contains(absMonitor)) {
            this.f49241e.add(absMonitor);
            if (this.f49243g) {
                absMonitor.mo68211a();
            }
        }
    }

    /* renamed from: a */
    public void mo68290a(final AbstractC20156b bVar) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.monitor.collector.C20152k.RunnableC201542 */

            public void run() {
                AbstractC20156b bVar;
                try {
                    if (!C20152k.f49237a || (bVar = bVar) == null) {
                        bVar.mo12845a(null);
                    } else {
                        bVar.mo12845a(LockMonitorManager.dumpLockInfo());
                    }
                } catch (Throwable unused) {
                    bVar.mo12845a(null);
                }
            }
        });
    }

    /* renamed from: a */
    public JSONObject mo68285a(long j, long j2) {
        return mo68286a(j, j2, false);
    }

    /* renamed from: b */
    public String mo68292b(long j, long j2) {
        if (this.f49252p == null || this.f49245i) {
            return null;
        }
        return this.f49252p.mo68239a(j, j2);
    }

    /* renamed from: c */
    public String mo68295c(long j, long j2) {
        if (this.f49252p == null || this.f49245i) {
            return null;
        }
        return C20159m.m73571a(this.f49252p.mo68239a(j, j2));
    }

    /* renamed from: a */
    public void mo68288a(Context context, C20150j jVar) {
        boolean z;
        if (!this.f49242f) {
            synchronized (this) {
                if (!this.f49242f) {
                    boolean a = m73539a(context);
                    this.f49246j = jVar.mo68273d();
                    AbstractC20132e eVar = this.f49252p;
                    if (eVar != null) {
                        if (this.f49245i || !this.f49246j) {
                            z = false;
                        } else {
                            z = true;
                        }
                        eVar.mo68241a(z);
                    }
                    if (a) {
                        C20157l.m73564d();
                        this.f49248l = new C20157l(jVar.mo68276g());
                        if (jVar.mo68271b()) {
                            BinderMonitor binderMonitor = new BinderMonitor(jVar.mo68276g());
                            this.f49247k = binderMonitor;
                            binderMonitor.mo68217d();
                        }
                        if (jVar.mo68270a()) {
                            C20127b bVar = new C20127b(jVar.mo68276g());
                            this.f49249m = bVar;
                            bVar.mo68233a(jVar.mo68275f());
                            if (jVar.mo68274e()) {
                                this.f49249m.mo68234d();
                            }
                        }
                    }
                    if (jVar.mo68272c()) {
                        this.f49250n = new C20134g(jVar.mo68276g(), false);
                    }
                    this.f49242f = true;
                }
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo68286a(long j, long j2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.f49241e.size(); i++) {
            try {
                AbsMonitor absMonitor = this.f49241e.get(i);
                if (!z || !(absMonitor instanceof C20134g)) {
                    Pair<String, ?> a = absMonitor.mo68210a(j, j2);
                    jSONObject.put((String) a.first, a.second);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
