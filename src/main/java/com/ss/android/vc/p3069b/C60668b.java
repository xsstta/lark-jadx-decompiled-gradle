package com.ss.android.vc.p3069b;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.p3069b.p3070a.C60661b;
import com.ss.android.vc.p3069b.p3070a.C60665c;
import com.ss.android.vc.p3069b.p3070a.C60667d;
import com.ss.android.vc.p3069b.p3071b.C60672a;
import com.ss.android.vc.p3069b.p3071b.C60673b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.b.b */
public class C60668b {

    /* renamed from: e */
    private static int f151750e = 1;

    /* renamed from: f */
    private static int f151751f;

    /* renamed from: a */
    private final AbstractC60659a f151752a = new C60683f();

    /* renamed from: b */
    private final AbstractC60659a f151753b = new C60684g();

    /* renamed from: c */
    private final AbstractC60659a f151754c = new C60673b();

    /* renamed from: d */
    private AbstractC60659a f151755d;

    /* renamed from: g */
    private C60665c f151756g;

    /* renamed from: h */
    private volatile ScheduledExecutorService f151757h;

    /* renamed from: i */
    private final Handler f151758i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private final Runnable f151759j = new Runnable() {
        /* class com.ss.android.vc.p3069b.$$Lambda$b$Npuo2euspAZIk2PPxLMO0vNw */

        public final void run() {
            C60668b.m271114lambda$Npuo2euspAZIk2PPxLMO0vNw(C60668b.this);
        }
    };

    /* renamed from: k */
    private AbstractC60671a f151760k;

    /* renamed from: l */
    private int f151761l;

    /* renamed from: m */
    private final List<C60680d> f151762m = new LinkedList();

    /* renamed from: n */
    private long f151763n;

    /* renamed from: o */
    private String f151764o;

    /* renamed from: p */
    private final String f151765p;

    /* renamed from: q */
    private ScheduledFuture<?> f151766q;

    /* renamed from: com.ss.android.vc.b.b$a */
    public interface AbstractC60671a {
        /* renamed from: a */
        void mo208226a(C60680d dVar, C60680d dVar2, boolean z);
    }

    /* renamed from: c */
    public static synchronized boolean m235758c() {
        boolean z;
        synchronized (C60668b.class) {
            z = true;
            f151750e++;
            C60686i.m235797a("ApmCollector", "[shouldStart] current = " + f151750e + ", num = " + f151751f);
            if (f151750e != f151751f) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo208221a() {
        if (this.f151757h == null) {
            this.f151757h = C60735ab.m236007b("VC-ApmCollector");
        }
        C60665c cVar = new C60665c(C60661b.m235737a());
        this.f151756g = cVar;
        this.f151755d = new C60667d(cVar);
        this.f151766q = this.f151757h.scheduleWithFixedDelay(this.f151759j, 0, 5, TimeUnit.SECONDS);
        this.f151757h.schedule(new Runnable() {
            /* class com.ss.android.vc.p3069b.C60668b.RunnableC606702 */

            public void run() {
                C60668b.this.mo208223b();
            }
        }, this.f151763n, TimeUnit.MILLISECONDS);
    }

    public C60668b() {
        String a = C26246a.m94977a(ar.m236694a());
        this.f151764o = a;
        if (a.contains("-")) {
            String str = this.f151764o;
            this.f151764o = str.substring(0, str.indexOf("-"));
        }
        this.f151765p = C61237h.m238223a().mo210561s();
    }

    /* renamed from: d */
    public static void m235759d() {
        C57744a.m224104a().remove("sp_key_monitor_type");
        C57744a.m224104a().remove("sp_key_monitor_part_number");
        C57744a.m224104a().remove("sp_key_monitor_meet_number");
        C57744a.m224104a().remove("sp_key_apm_duration");
        C57744a.m224104a().remove("sp_key_apm_scene");
        C57744a.m224104a().remove("sp_key_phase_num");
        C57744a.m224104a().remove("sp_key_event_id");
        C57744a.m224104a().remove("sp_key_timestamp");
        C60686i.m235797a("ApmCollector", "[clearSP] test finished, clear SP!!!");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m235761f() {
        C60674c a = this.f151752a.mo208203a();
        C60674c b = this.f151752a.mo208204b();
        VCApmSampleMemInfo eVar = (VCApmSampleMemInfo) this.f151753b.mo208204b();
        C60672a aVar = (C60672a) this.f151754c.mo208204b();
        C60674c a2 = this.f151755d.mo208203a();
        C60674c b2 = this.f151755d.mo208204b();
        C60700b.m235851b("ApmCollector", "[compute]", "instFps = " + a2 + " avgFps = " + b2);
        C60680d dVar = new C60680d(a, (VCApmSampleMemInfo) this.f151753b.mo208203a(), a2, (C60672a) this.f151754c.mo208203a());
        if (this.f151760k != null) {
            C60680d dVar2 = new C60680d(b, eVar, b2, aVar);
            this.f151760k.mo208226a(dVar, dVar2, false);
            this.f151762m.add(dVar);
            C60686i.m235798b("ApmCollector", "[onSample] sample = " + dVar + ", avg = " + dVar2);
        }
    }

    /* renamed from: b */
    public void mo208223b() {
        ScheduledFuture<?> scheduledFuture = this.f151766q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f151766q = null;
        }
        if (this.f151757h != null) {
            this.f151757h.shutdown();
            this.f151757h = null;
            C60674c a = this.f151752a.mo208203a();
            C60674c b = this.f151752a.mo208204b();
            C60674c a2 = this.f151755d.mo208203a();
            C60674c b2 = this.f151755d.mo208204b();
            C60680d dVar = new C60680d(a, (VCApmSampleMemInfo) this.f151753b.mo208203a(), a2, (C60672a) this.f151754c.mo208203a());
            C60680d dVar2 = new C60680d(b, (VCApmSampleMemInfo) this.f151753b.mo208204b(), b2, (C60672a) this.f151754c.mo208204b());
            this.f151760k.mo208226a(dVar, dVar2, true);
            this.f151756g.mo208213e();
            m235757a(this.f151762m, dVar2, this.f151761l);
            C60686i.m235798b("ApmCollector", "[onSample] sample = " + dVar);
            C60686i.m235797a("ApmCollector", "[stop] scene = " + C57744a.m224104a().getInt("sp_key_apm_scene") + ", phase = " + this.f151761l + ", avg = " + dVar2);
            this.f151760k = null;
            f151750e = 1;
            this.f151762m.clear();
            if (this.f151761l == C57744a.m224104a().getInt("sp_key_phase_num")) {
                m235759d();
            }
            this.f151761l = 0;
        }
    }

    /* renamed from: a */
    public void mo208222a(int i, long j, AbstractC60671a aVar) {
        long j2;
        this.f151763n = j * 1000;
        this.f151760k = aVar;
        this.f151761l = i;
        f151751f = C57744a.m224104a().getInt("sp_key_monitor_part_number") + 1;
        Handler handler = this.f151758i;
        RunnableC606691 r5 = new Runnable() {
            /* class com.ss.android.vc.p3069b.C60668b.RunnableC606691 */

            public void run() {
                C60668b.this.mo208221a();
            }
        };
        if (i != 0) {
            j2 = 20000;
        } else {
            j2 = 5000;
        }
        handler.postDelayed(r5, j2);
    }

    /* renamed from: a */
    private void m235757a(List<C60680d> list, C60680d dVar, int i) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        try {
            for (C60680d dVar2 : list) {
                jSONArray.put(dVar2.f151795a.f151774a);
                jSONArray2.put(dVar2.f151796b.mo208242a());
                jSONArray3.put(dVar2.f151797c.f151774a);
                jSONArray4.put(dVar2.f151798d.mo208228a());
            }
            jSONObject.put("event_id", C57744a.m224104a().getString("sp_key_event_id", ""));
            jSONObject.put("scene_id", C57744a.m224104a().getInt("sp_key_apm_scene", -1));
            jSONObject.put("timestamp", C57744a.m224104a().getString("sp_key_timestamp"));
            jSONObject.put("phase", i);
            jSONObject.put("deviceName", RomUtils.m94957l());
            jSONObject.put("larkVersion", this.f151764o);
            jSONObject.put("rtcVersion", this.f151765p);
            jSONObject.put("osVersion", RomUtils.m94958m());
            jSONObject.put("avgCpu", dVar.f151795a.f151774a);
            jSONObject.put("avgMem", dVar.f151796b.mo208242a());
            jSONObject.put("avgFps", dVar.f151797c.f151774a);
            jSONObject.put("avgLog", dVar.f151798d.mo208228a());
            jSONObject.put("cpu", jSONArray);
            jSONObject.put("mem", jSONArray2);
            jSONObject.put("fps", jSONArray3);
            jSONObject.put("log", jSONArray4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C60686i.m235797a("ApmCollector", "[uploadData] phase = " + i + ", json = " + jSONObject.toString());
        C60785x.m236236a("http://10.86.111.129:8001/apm", "cmd=uploadData&ip=" + C60785x.m236239c() + "&data=" + jSONObject.toString());
    }
}
