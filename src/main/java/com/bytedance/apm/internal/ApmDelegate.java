package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.AbstractC2877c;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.alog.AbstractC2783d;
import com.bytedance.apm.alog.C2776a;
import com.bytedance.apm.alog.IALogActiveUploadObserver;
import com.bytedance.apm.alog.p128a.C2778a;
import com.bytedance.apm.battery.C2825d;
import com.bytedance.apm.block.C2863b;
import com.bytedance.apm.block.C2867f;
import com.bytedance.apm.block.p136a.C2835b;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.block.p136a.C2854g;
import com.bytedance.apm.config.C2882b;
import com.bytedance.apm.config.C2885c;
import com.bytedance.apm.config.C2888d;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.constant.C2905a;
import com.bytedance.apm.core.AbstractC2909c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.launch.p151a.C3029b;
import com.bytedance.apm.p124a.AbstractC2738a;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p125a.C2744d;
import com.bytedance.apm.p129b.C2787b;
import com.bytedance.apm.p138d.AbstractC2915b;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p142h.C2942a;
import com.bytedance.apm.p143i.C2981d;
import com.bytedance.apm.p143i.C2986g;
import com.bytedance.apm.p143i.C2995i;
import com.bytedance.apm.p143i.p145b.C2950a;
import com.bytedance.apm.p143i.p147c.C2973f;
import com.bytedance.apm.p148j.C3017a;
import com.bytedance.apm.p149k.C3020a;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.p153n.C3046a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.trace.AbstractC3064a;
import com.bytedance.apm.trace.C3088b;
import com.bytedance.apm.trace.C3094d;
import com.bytedance.apm.trace.C3097e;
import com.bytedance.apm.trace.p155a.C3078c;
import com.bytedance.apm.util.C3111a;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm6.C3144a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.p165d.C3190c;
import com.bytedance.apm6.p167c.C3212a;
import com.bytedance.apm6.p174e.C3274a;
import com.bytedance.apm6.p177f.C3306b;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.bytedance.article.common.monitor.stack.C3475c;
import com.bytedance.crash.C3771k;
import com.bytedance.monitor.collector.C20146h;
import com.bytedance.monitor.collector.C20150j;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.news.common.service.manager.AbstractC20213a;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.p230d.p232b.AbstractC3981b;
import com.bytedance.p230d.p232b.C3975a;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.AbstractC20702g;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.C20703h;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmDelegate implements AbstractC20704a {

    /* renamed from: n */
    private static long f9666n;

    /* renamed from: o */
    private static boolean f9667o;

    /* renamed from: p */
    private static boolean f9668p;

    /* renamed from: a */
    public C2888d f9669a;

    /* renamed from: b */
    public SlardarConfigManagerImpl f9670b;

    /* renamed from: c */
    public boolean f9671c;

    /* renamed from: d */
    public Set<AbstractC20702g> f9672d;

    /* renamed from: e */
    boolean f9673e;

    /* renamed from: f */
    private C2882b f9674f;

    /* renamed from: g */
    private AbstractC3064a f9675g;

    /* renamed from: h */
    private C3097e f9676h;

    /* renamed from: i */
    private AbstractC2915b f9677i;

    /* renamed from: j */
    private AbstractC20699d f9678j;

    /* renamed from: k */
    private volatile boolean f9679k;

    /* renamed from: l */
    private volatile boolean f9680l;

    /* renamed from: m */
    private volatile boolean f9681m;

    /* renamed from: q */
    private boolean f9682q;

    /* renamed from: r */
    private List<String> f9683r;

    /* renamed from: s */
    private List<String> f9684s;

    /* renamed from: t */
    private List<String> f9685t;

    /* renamed from: u */
    private long f9686u;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.internal.ApmDelegate$a */
    public static class C3008a {

        /* renamed from: a */
        public static final ApmDelegate f9716a = new ApmDelegate();
    }

    /* renamed from: a */
    private void m12592a(Application application) {
    }

    private void initEvilMethodTraceInject() {
    }

    /* renamed from: a */
    public void mo12777a(C2885c cVar) {
    }

    /* renamed from: a */
    public static ApmDelegate m12591a() {
        return C3008a.f9716a;
    }

    /* renamed from: b */
    public boolean mo12785b() {
        return this.f9681m;
    }

    /* renamed from: g */
    public boolean mo12794g() {
        return this.f9679k;
    }

    /* renamed from: h */
    public AbstractC20699d mo12795h() {
        return this.f9678j;
    }

    private ApmDelegate() {
        this.f9682q = true;
    }

    /* renamed from: f */
    public C2882b mo12793f() {
        C2882b bVar = this.f9674f;
        if (bVar == null) {
            return C2882b.m12147s().mo12415a();
        }
        return bVar;
    }

    /* renamed from: c */
    public C2888d.C2890a mo12787c() {
        if (this.f9681m) {
            return C2888d.m12187a(this.f9669a);
        }
        C2925e.m12372a("ERROR", "apm sdk only can get startconfigBuilder after start finished");
        return C2888d.m12186a();
    }

    /* renamed from: e */
    public void mo12792e() {
        Set<AbstractC20702g> set = this.f9672d;
        if (set != null) {
            for (AbstractC20702g gVar : set) {
                try {
                    gVar.start();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: i */
    public void mo12796i() {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.RunnableC30079 */

            public void run() {
                C20152k.m73538a().mo68299g();
            }
        });
        C3047b.m12756a().mo12892c();
        C3274a.m13679a();
    }

    /* renamed from: j */
    public void mo12797j() {
        C3047b.m12756a().mo12893d();
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass10 */

            public void run() {
                C20152k.m73538a().mo68298f();
            }
        });
        C3274a.m13681b();
    }

    /* renamed from: k */
    public void mo12798k() {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass12 */

            public void run() {
                C20152k.m73538a().mo68299g();
            }
        });
        C3047b.m12756a().mo12892c();
    }

    /* renamed from: l */
    public void mo12799l() {
        C3047b.m12756a().mo12893d();
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass13 */

            public void run() {
                C20152k.m73538a().mo68298f();
            }
        });
    }

    private static void initTraceEvilMethod() {
        C3975a.m16580a(f9666n);
        C3975a.m16582a(f9667o);
        C3975a.f12073a = true;
        C2848f.m12008a().mo12248b();
        C2854g.m12031a().mo12268b();
        new C3975a(f9668p).mo15648b();
        C20152k.m73538a().mo68291a(true);
    }

    /* renamed from: n */
    private static void m12596n() {
        try {
            String b = C3771k.m15584b();
            if (!TextUtils.isEmpty(b)) {
                C2785b.m11774o().put("bytrace_id", b);
                C2785b.m11774o().put("pid", String.valueOf(Process.myPid()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m12598p() {
        if (!this.f9673e) {
            this.f9673e = true;
            C3046a.m12755a().post(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC30002 */

                public void run() {
                    C20146h.m73512a();
                }
            });
            C2863b bVar = new C2863b();
            bVar.mo12302a(this.f9669a.mo12441p());
            bVar.mo12304a(this.f9669a.mo12440o());
            bVar.mo12305b();
            if (ActivityLifeObserver.getInstance().isForeground()) {
                bVar.mo12306c();
            }
        }
    }

    /* renamed from: r */
    private void m12600r() {
        String a = C3010b.m12651a().mo12819a("update_version_code");
        String optString = C2785b.m11774o().optString("update_version_code");
        if (!TextUtils.equals(a, optString)) {
            C2785b.m11739a(1);
            C3010b.m12651a().mo12822a("update_version_code", optString);
            return;
        }
        C2785b.m11739a(2);
    }

    /* renamed from: s */
    private void m12601s() {
        SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
        this.f9670b = slardarConfigManagerImpl;
        slardarConfigManagerImpl.registerConfigListener(this);
        C20216d.m73785a(IConfigManager.class, this.f9670b);
        C20216d.m73784a(IMonitorLogManager.class, (AbstractC20213a) new AbstractC20213a<IMonitorLogManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C30013 */

            /* renamed from: a */
            public IMonitorLogManager mo12813b() {
                return new MonitorLogManagerImpl();
            }
        });
        C20216d.m73784a(IActivityLifeManager.class, (AbstractC20213a) new AbstractC20213a<IActivityLifeManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C30024 */

            /* renamed from: a */
            public IActivityLifeManager mo12813b() {
                return ActivityLifeObserver.getInstance();
            }
        });
        C20216d.m73784a(IApmAgent.class, (AbstractC20213a) new AbstractC20213a<IApmAgent>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C30035 */

            /* renamed from: a */
            public IApmAgent mo12813b() {
                return new ApmAgentServiceImpl();
            }
        });
        C20216d.m73784a(ILaunchTrace.class, (AbstractC20213a) new AbstractC20213a<ILaunchTrace>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C30046 */

            /* renamed from: a */
            public ILaunchTrace mo12813b() {
                return new LaunchTraceImpl();
            }
        });
    }

    /* renamed from: t */
    private void m12602t() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("switch_sp", this.f9686u);
            jSONObject.put("init", C2785b.m11780u());
            jSONObject.put("start", C2785b.m11781v());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.f9671c);
            ApmAgent.monitorEvent("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: o */
    private void m12597o() {
        C3306b.m13762a().mo13523c();
        if (this.f9671c) {
            C2986g gVar = new C2986g();
            gVar.mo12734a(this.f9669a.mo12446u());
            gVar.mo12647i();
        }
        C2973f.m12512a(this.f9669a.mo12451z());
        C3212a.m13412a().mo13294a(this.f9669a.mo12446u());
        C3306b.m13762a().mo13520a(this.f9669a.mo12429d());
        if (this.f9669a.mo12438m() && !this.f9669a.mo12439n()) {
            m12598p();
        }
    }

    /* renamed from: q */
    private void m12599q() {
        if (C3122i.m13009a(this.f9669a.mo12430e()) && !C3122i.m13009a(this.f9683r)) {
            this.f9669a.mo12426b(this.f9683r);
        }
        if (C3122i.m13009a(this.f9669a.mo12433h()) && !C3122i.m13009a(this.f9684s)) {
            this.f9669a.mo12424a(this.f9684s);
        }
        if (C3122i.m13009a(this.f9669a.mo12434i()) && !C3122i.m13009a(this.f9685t)) {
            this.f9669a.mo12428c(this.f9685t);
        }
    }

    /* renamed from: d */
    public void mo12791d() {
        try {
            long nanoTime = System.nanoTime();
            C3318a.m13820a(this.f9669a.mo12425b());
            m12595m();
            if (this.f9671c) {
                C2785b.m11749b(System.nanoTime() - nanoTime);
                m12602t();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        boolean z;
        boolean z2 = true;
        this.f9679k = true;
        AbstractC2915b bVar = this.f9677i;
        if (bVar != null) {
            bVar.mo12598b();
        }
        JSONObject config = this.f9670b.getConfig();
        if (this.f9671c) {
            new C2995i().mo12647i();
            if (C3121h.m12996a(config, "performance_modules", "traffic", "enable_collect") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C2973f.m12511a().mo12647i();
            }
        }
        if (this.f9669a.mo12443r()) {
            if (C3121h.m12996a(config, "performance_modules", "battery", "enable_upload") != 1) {
                z2 = false;
            }
            if (z2) {
                C2825d.m11954a();
            }
        }
        if (this.f9669a.mo12439n() && C2981d.m12529a().mo12725b("block_monitor")) {
            m12598p();
        }
    }

    /* renamed from: m */
    private void m12595m() {
        C3010b.m12651a();
        C2785b.m11762f(System.currentTimeMillis());
        m12599q();
        C3023c.m12691a(new C3020a());
        C3013j.m12658a().mo12825a(new C3013j.AbstractC3015a() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass16 */

            @Override // com.bytedance.apm.C3013j.AbstractC3015a
            /* renamed from: a */
            public void mo12807a(String str) {
                C3474b.m14691a(str);
            }

            @Override // com.bytedance.apm.C3013j.AbstractC3015a
            /* renamed from: a */
            public void mo12808a(Throwable th, String str) {
                C3474b.m14693a(th, str);
            }

            @Override // com.bytedance.apm.C3013j.AbstractC3015a
            /* renamed from: b */
            public void mo12809b(Throwable th, String str) {
                C3475c.m14705a().mo13923a(th, str);
            }
        });
        C2785b.m11746a(this.f9669a.mo12435j());
        C2785b.m11742a(this.f9669a.mo12427c());
        C2785b.m11743a(this.f9669a.mo12436k());
        C2785b.m11745a(this.f9669a.mo12430e());
        C2785b.m11750b(this.f9669a.mo12450y());
        this.f9678j = this.f9669a.mo12448w();
        this.f9672d = this.f9669a.mo12437l();
        m12597o();
        C2942a.m12401a().mo12641a(this.f9669a.mo12445t());
        C2741a.m11630c().mo11784a();
        C2744d.m11644c().mo11784a();
        C2744d.m11644c().mo11799a(this.f9669a.mo12449x());
        C2776a.m11716a(C2785b.m11735a(), this.f9674f.mo12407p());
        m12596n();
        long q = this.f9669a.mo12442q();
        AnonymousClass17 r2 = new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass17 */

            public void run() {
                ApmDelegate.this.f9670b.initParams(ApmDelegate.this.f9669a.mo12432g(), new AbstractC2909c() {
                    /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass17.C29991 */

                    @Override // com.bytedance.apm.core.AbstractC2909c
                    /* renamed from: a */
                    public Map<String, String> mo12554a() {
                        return C2785b.m11773n();
                    }
                }, ApmDelegate.this.f9669a.mo12430e());
                if (!ApmDelegate.this.f9669a.mo12431f() || !C2785b.m11761e()) {
                    ApmDelegate.this.f9670b.fetchConfig();
                } else {
                    ApmDelegate.this.f9670b.forceUpdateFromRemote(null, null);
                }
            }
        };
        if (q <= 0) {
            C3047b.m12756a().mo12886a(r2);
        } else {
            C3047b.m12756a().mo12887a(r2, 1000 * q);
        }
        if (C2785b.m11769j()) {
            C2921a.m12360c("apm_debug", "delayRequestSeconds:" + q);
        }
        if (this.f9671c) {
            m12600r();
        }
        m12593b(C2785b.m11735a());
        C20703h hVar = new C20703h();
        hVar.mo69906a(this.f9669a.mo12433h());
        mo12779a(hVar);
        mo12792e();
        C3047b.m12756a().mo12888a(this.f9669a.mo12447v());
        m12594d(this.f9669a);
        AbstractC2915b s = this.f9669a.mo12444s();
        this.f9677i = s;
        if (s != null) {
            s.mo12597a();
        }
        AutoLaunchTraceHelper.reportStats();
        C20216d.m73785a(IHttpService.class, new IHttpService() {
            /* class com.bytedance.apm.internal.ApmDelegate.C30057 */

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b doGet(String str, Map<String, String> map) throws Exception {
                return C2785b.m11737a(str, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
                return C2785b.m11738a(str, bArr, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
                return C2785b.m11736a(str, list, map);
            }
        });
        if (C2785b.m11769j()) {
            if (this.f9671c) {
                C2787b.m11791a().mo12090a("APM_START", (String) null);
            } else {
                C2787b.m11791a().mo12090a("APM_START_OTHER_PROCESS", (String) null);
            }
        }
        C2921a.m12360c("apm_debug", "APM_START");
    }

    /* renamed from: b */
    public void mo12783b(final C2888d dVar) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass15 */

            public void run() {
                ApmDelegate.this.mo12788c(dVar);
            }
        });
    }

    /* renamed from: c */
    public void mo12789c(List<String> list) {
        if (!this.f9681m && !C3122i.m13009a(list)) {
            this.f9685t = list;
        }
    }

    /* renamed from: b */
    private void m12593b(Context context) {
        Set<AbstractC20702g> set = this.f9672d;
        if (set != null) {
            for (AbstractC20702g gVar : set) {
                try {
                    gVar.init(context);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12779a(C20703h hVar) {
        Set<AbstractC20702g> set = this.f9672d;
        if (set != null) {
            for (AbstractC20702g gVar : set) {
                try {
                    gVar.notifyParams(hVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12775a(Context context) {
        C2882b.C2884a s = C2882b.m12147s();
        s.mo12412a(this.f9675g);
        C3097e eVar = this.f9676h;
        if (eVar != null) {
            s.mo12414a(eVar.mo12980c());
            s.mo12410a(this.f9676h.mo12979b());
            s.mo12417b(this.f9676h.mo12978a());
            s.mo12416b((long) this.f9676h.mo12981d());
        }
        mo12776a(context, s.mo12415a());
    }

    /* renamed from: b */
    public void mo12784b(List<String> list) {
        if (!this.f9681m && !C3122i.m13009a(list)) {
            this.f9684s = list;
        }
    }

    /* renamed from: c */
    public boolean mo12790c(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f9679k || (slardarConfigManagerImpl = this.f9670b) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getMetricTypeSwitch(str);
    }

    /* renamed from: a */
    public void mo12778a(C2888d dVar) {
        if (!this.f9680l) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (dVar == null) {
            throw new IllegalArgumentException("startConfig must not be allowed");
        } else if (!this.f9681m) {
            C3047b.m12756a().mo12893d();
            this.f9681m = true;
            this.f9669a = dVar;
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass14 */

                public void run() {
                    ApmDelegate.this.mo12791d();
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo12786b(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f9679k || (slardarConfigManagerImpl = this.f9670b) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    /* renamed from: c */
    public void mo12788c(C2888d dVar) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        this.f9669a = dVar;
        C2785b.m11746a(dVar.mo12435j());
        C2785b.m11742a(dVar.mo12427c());
        C2785b.m11743a(dVar.mo12436k());
        this.f9678j = dVar.mo12448w();
        if (this.f9671c) {
            this.f9670b.forceUpdateFromRemote(new AbstractC2909c() {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass18 */

                @Override // com.bytedance.apm.core.AbstractC2909c
                /* renamed from: a */
                public Map<String, String> mo12554a() {
                    return C2785b.m11773n();
                }
            }, dVar.mo12430e());
        } else if (dVar.mo12432g() && (slardarConfigManagerImpl = this.f9670b) != null) {
            slardarConfigManagerImpl.initParams(dVar.mo12432g(), new AbstractC2909c() {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass19 */

                @Override // com.bytedance.apm.core.AbstractC2909c
                /* renamed from: a */
                public Map<String, String> mo12554a() {
                    return C2785b.m11773n();
                }
            }, dVar.mo12430e());
        }
        C2744d.m11644c().mo11799a(dVar.mo12449x());
        m12594d(this.f9669a);
        C3047b.m12756a().mo12888a(dVar.mo12447v());
    }

    /* renamed from: d */
    private void m12594d(C2888d dVar) {
        List<String> h = dVar.mo12433h();
        if (!C3122i.m13009a(h)) {
            try {
                String host = new URL(h.get(0)).getHost();
                C3017a.m12668a(host);
                C3017a.m12671b(host);
                C2778a.m11722a(host);
            } catch (MalformedURLException unused) {
            }
            ArrayList arrayList = new ArrayList(2);
            int size = h.size();
            for (int i = 0; i < size; i++) {
                try {
                    String host2 = new URL(h.get(i)).getHost();
                    if (!TextUtils.isEmpty(host2) && host2.indexOf(46) > 0) {
                        arrayList.add("https://" + host2 + "/monitor/collect/batch/");
                    }
                } catch (Exception unused2) {
                }
            }
            C3190c.m13326a().mo13253a(arrayList);
        }
        C3190c.m13326a().mo13257c(C2905a.f9397d);
        C3190c.m13326a().mo13255b(C2905a.f9399f);
        List<String> i2 = dVar.mo12434i();
        C3190c.m13326a().mo13255b(i2);
        if (!C3122i.m13009a(h)) {
            C3474b.m14698b(i2.get(0));
        }
    }

    /* renamed from: a */
    public void mo12781a(List<String> list) {
        if (!this.f9681m && !C3122i.m13009a(list)) {
            this.f9683r = list;
        }
    }

    /* renamed from: a */
    public boolean mo12782a(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f9679k || (slardarConfigManagerImpl = this.f9670b) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getLogTypeSwitch(str);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            this.f9682q = optJSONObject.optBoolean("enable_active_upload_alog", true);
        } else {
            this.f9682q = true;
        }
    }

    /* renamed from: a */
    public void mo12776a(final Context context, final C2882b bVar) {
        if (!this.f9680l) {
            long nanoTime = System.nanoTime();
            this.f9680l = true;
            this.f9686u = System.nanoTime() - nanoTime;
            C2785b.m11767h();
            C2785b.m11757d(System.currentTimeMillis());
            C2785b.m11759e(System.currentTimeMillis() - SystemClock.uptimeMillis());
            this.f9674f = bVar;
            AbstractC3064a aVar = this.f9675g;
            if (aVar != null) {
                bVar.mo12389a(aVar);
            }
            C3097e eVar = this.f9676h;
            if (eVar != null) {
                this.f9674f.mo12390a(eVar.mo12980c());
                this.f9674f.mo12388a(this.f9676h.mo12979b());
                this.f9674f.mo12392b(this.f9676h.mo12978a());
                this.f9674f.mo12391b((long) this.f9676h.mo12981d());
            }
            AbstractC2738a.m11618a(bVar.mo12387a());
            C3088b.m12866a(bVar.mo12403l());
            C3088b.m12869a(bVar.mo12404m());
            Application a = C3111a.m12934a(context);
            C2785b.m11741a(a);
            ActivityLifeObserver.init(a);
            m12601s();
            AbstractC2877c c = C2785b.m11753c();
            if (c != null) {
                c.mo12333a();
            }
            C2785b.m11744a(bVar.mo12405n());
            this.f9671c = C2785b.m11761e();
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC29981 */

                public void run() {
                    boolean z;
                    boolean z2;
                    C3009a.m12647a(context);
                    AbstractC2877c c = C2785b.m11753c();
                    if (c != null) {
                        c.mo12334b();
                    }
                    if (ApmDelegate.this.f9671c) {
                        C20150j.C20151a aVar = new C20150j.C20151a();
                        C20150j.C20151a a = aVar.mo68278a(C3009a.m12649b());
                        if (C3009a.m12649b() == 0 || !C3009a.m12648a(2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C20150j.C20151a b = a.mo68281b(z);
                        if (!bVar.mo12400i() || !C3009a.m12648a(2)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        b.mo68282c(z2).mo68284e(C3009a.m12648a(64)).mo68279a(false).mo68283d(true).mo68277a(C3009a.m12650c());
                        C20152k.m73538a().mo68288a(C2785b.m11735a(), aVar.mo68280a());
                        C20152k.m73538a().mo68298f();
                    }
                }
            });
            if (this.f9671c) {
                C2950a.m12424a(a, this.f9674f.mo12401j());
                if (bVar.mo12393b()) {
                    new C3094d().mo12975a();
                }
                AutoPageTraceHelper.setMaxValidTimeMs(bVar.mo12394c());
                AutoLaunchTraceHelper.setMaxValidTimeMs(bVar.mo12402k());
                m12592a(a);
                f9668p = bVar.mo12398g();
                f9666n = bVar.mo12397f();
                f9667o = bVar.mo12396e();
                boolean h = bVar.mo12399h();
                C2848f.m12008a().mo12248b();
                if (h) {
                    final C2835b bVar2 = new C2835b();
                    C3078c.m12830a(bVar2);
                    C3975a.m16581a(new AbstractC3981b() {
                        /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass11 */

                        @Override // com.bytedance.p230d.p232b.AbstractC3981b
                        /* renamed from: a */
                        public void mo12802a(long j, boolean z) {
                            bVar2.mo12222a(j, z);
                        }
                    });
                    C2848f.m12008a().mo12243a(bVar2);
                }
                initEvilMethodTraceInject();
                C3029b.m12709c();
                C3024a.m12698a().mo12838a(bVar.mo12406o());
                C2785b.m11740a(System.nanoTime() - nanoTime);
                C2785b.m11763f(bVar.mo12409r());
                C2785b.m11760e(bVar.mo12408q());
            }
            C2867f.m12071a().mo12313b();
            if (C2785b.m11769j()) {
                if (this.f9671c) {
                    C2787b.m11791a().mo12090a("APM_INIT", (String) null);
                } else {
                    C2787b.m11791a().mo12090a("APM_INIT_OTHER_PROCESS", (String) null);
                }
            }
            C3144a.m13090a(context);
            C2921a.m12360c("apm_debug", "apm_init");
            C2785b.m11747a(true);
        }
    }

    /* renamed from: a */
    public void mo12780a(final String str, final long j, final long j2, final String str2, final IALogActiveUploadObserver iALogActiveUploadObserver, final AbstractC2783d dVar) {
        if (this.f9682q) {
            C3047b.m12756a().mo12890b(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC30068 */

                public void run() {
                    C2776a.m11717a(str, j, j2, str2, iALogActiveUploadObserver, dVar);
                }
            });
        }
    }
}
