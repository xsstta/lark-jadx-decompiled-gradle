package com.bytedance.apm.trace;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.block.p136a.C2854g;
import com.bytedance.apm.internal.C3009a;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.launch.C3037b;
import com.bytedance.apm.launch.C3042e;
import com.bytedance.apm.launch.p151a.C3027a;
import com.bytedance.apm.launch.p151a.C3031c;
import com.bytedance.apm.launch.p151a.C3034d;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p137c.C2879b;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3113c;
import com.bytedance.apm.util.C3124j;
import com.bytedance.apm6.p184h.p185a.C3330b;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.p230d.p232b.C3975a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.f */
public class C3098f {

    /* renamed from: b */
    private static volatile boolean f9957b = true;

    /* renamed from: a */
    public long f9958a;

    /* renamed from: c */
    private long f9959c;

    /* renamed from: d */
    private final ConcurrentHashMap<String, C2879b> f9960d = new ConcurrentHashMap<>(4);

    /* renamed from: e */
    private final String f9961e;

    /* renamed from: f */
    private final String f9962f;

    /* renamed from: com.bytedance.apm.trace.f$a */
    public interface AbstractC3102a {
        /* renamed from: a */
        void mo12992a(long j);
    }

    /* renamed from: b */
    public long mo12988b() {
        return this.f9959c;
    }

    /* renamed from: c */
    public void mo12990c() {
        this.f9959c = System.currentTimeMillis();
    }

    /* renamed from: d */
    public void mo12991d() {
        this.f9960d.clear();
    }

    /* renamed from: a */
    public boolean mo12987a() {
        return "start_trace".equals(this.f9961e);
    }

    /* renamed from: a */
    public void mo12985a(String str, String str2) {
        mo12986a(str, str2, false);
    }

    public C3098f(String str, String str2) {
        if ("start_trace".equals(str) || "page_load_trace".equals(str)) {
            this.f9961e = str;
            this.f9962f = str2;
            return;
        }
        throw new IllegalStateException("Please add TraceServiceName support on TraceState#reportAsync");
    }

    /* renamed from: b */
    public void mo12989b(String str, String str2) {
        ConcurrentHashMap<String, C2879b> concurrentHashMap = this.f9960d;
        C2879b bVar = concurrentHashMap.get(str + "#" + str2);
        if (bVar != null) {
            bVar.mo12355a(System.currentTimeMillis(), Thread.currentThread().getName());
            ConcurrentHashMap<String, C2879b> concurrentHashMap2 = this.f9960d;
            concurrentHashMap2.put(str + "#" + str2, bVar);
        }
    }

    /* renamed from: a */
    public void mo12982a(int i, String str, long j) {
        mo12983a(i, str, j, 0);
    }

    /* renamed from: a */
    public void mo12986a(String str, String str2, boolean z) {
        ConcurrentHashMap<String, C2879b> concurrentHashMap = this.f9960d;
        if (concurrentHashMap.get(str + "#" + str2) == null || z) {
            C2879b bVar = new C2879b(System.currentTimeMillis());
            ConcurrentHashMap<String, C2879b> concurrentHashMap2 = this.f9960d;
            concurrentHashMap2.put(str + "#" + str2, bVar);
        }
    }

    /* renamed from: a */
    public void mo12983a(int i, String str, long j, long j2) {
        m12892a(i, "", str, j, j2);
    }

    /* renamed from: b */
    private void m12893b(final int i, final String str, final long j, final long j2) {
        final long[] i2 = C2854g.m12031a().mo12271i();
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 != null) {
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.trace.C3098f.RunnableC31013 */

                public void run() {
                    try {
                        String a = C2854g.m12031a().mo12264a(i2, uptimeMillis);
                        if (!TextUtils.isEmpty(a)) {
                            long j = j2 - j;
                            JSONObject k = C20152k.m73538a().mo68303k();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("is_main_process", C2785b.m11761e());
                            jSONObject.put("block_duration", j);
                            jSONObject.put("stack", a);
                            jSONObject.put("stack_key", "1048574\n");
                            jSONObject.put("scene", "launchTrace");
                            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
                            jSONObject.put("method_time", j);
                            jSONObject.put("message", "launchTrace");
                            jSONObject.put("event_type", "lag_drop_frame");
                            JSONObject a2 = C3331c.m13887a().mo13563a(true);
                            a2.put("crash_section", C2785b.m11754c(System.currentTimeMillis()));
                            a2.put("trace_type", "launchTrace");
                            a2.put("launchMode", String.valueOf(i));
                            a2.put("customLaunchMode", str);
                            jSONObject.put("custom", k);
                            jSONObject.put("filters", a2);
                            C2741a.m11630c().mo11785a(new C2751d("drop_frame_stack", jSONObject));
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m12892a(final int i, final String str, final String str2, long j, long j2) {
        if (i != -1 || !str.isEmpty() || !C2785b.m11769j()) {
            final C3042e.C3043a aVar = null;
            if (mo12987a()) {
                aVar = C3037b.m12717a();
            }
            this.f9958a = System.currentTimeMillis();
            if (j2 > 0) {
                this.f9958a = this.f9959c + j2;
            }
            long j3 = this.f9958a - this.f9959c;
            if (j <= 0 || j3 <= j) {
                if (mo12987a() && C3975a.f12074b && f9957b) {
                    f9957b = false;
                    m12893b(i, str, this.f9959c, this.f9958a);
                }
                if (!mo12987a() || !C3024a.m12698a().mo12842c().mo12966a() || !C3009a.m12648a(8)) {
                    C3047b.m12756a().mo12886a(new Runnable() {
                        /* class com.bytedance.apm.trace.C3098f.RunnableC31002 */

                        public void run() {
                            C3042e.C3043a aVar;
                            if (C3098f.this.mo12987a()) {
                                long a = C3027a.m12704a();
                                if (!(a == 0 || (aVar = aVar) == null)) {
                                    aVar.mo12860b(a);
                                }
                            }
                            C3098f fVar = C3098f.this;
                            fVar.mo12984a(i, str, str2, fVar.f9958a, aVar);
                        }
                    });
                } else {
                    C3031c.m12711a(new AbstractC3102a() {
                        /* class com.bytedance.apm.trace.C3098f.C30991 */

                        @Override // com.bytedance.apm.trace.C3098f.AbstractC3102a
                        /* renamed from: a */
                        public void mo12992a(long j) {
                            C3042e.C3043a aVar;
                            C3042e.C3043a aVar2;
                            if (!(j == -1 || (aVar2 = aVar) == null)) {
                                aVar2.mo12858a(j);
                            }
                            long a = C3027a.m12704a();
                            if (!(a == 0 || (aVar = aVar) == null)) {
                                aVar.mo12860b(a);
                            }
                            C3098f fVar = C3098f.this;
                            fVar.mo12984a(i, str, str2, fVar.f9958a, aVar);
                        }
                    }, !C3024a.m12698a().mo12842c().mo12968c(), "is_launch_lock");
                }
                if (mo12987a()) {
                    C3034d.m12715a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Launch mode is both none");
    }

    /* renamed from: a */
    public void mo12984a(int i, String str, String str2, long j, C3042e.C3043a aVar) {
        JSONObject a;
        JSONArray jSONArray = new JSONArray();
        int i2 = 2;
        char c = 1;
        try {
            if (TextUtils.equals(str2, AutoLaunchTraceHelper.sLauncherActivityName)) {
                jSONArray = AutoLaunchTraceHelper.assemblySpan();
            }
            ConcurrentHashMap<String, C2879b> concurrentHashMap = this.f9960d;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                for (Map.Entry<String, C2879b> entry : this.f9960d.entrySet()) {
                    String key = entry.getKey();
                    C2879b value = entry.getValue();
                    if (value.f9219b != 0) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = key.split("#");
                        if (split.length == i2) {
                            if ("page_load_trace".equals(this.f9961e)) {
                                jSONObject.put("name", split[c]);
                            } else {
                                jSONObject.put("module_name", split[0]);
                                jSONObject.put("span_name", split[1]);
                            }
                        } else if (split.length == 1) {
                            jSONObject.put("span_name", split[0]);
                        }
                        jSONObject.put("start", value.f9218a);
                        jSONObject.put("end", value.f9219b);
                        jSONObject.put("thread", value.f9220c);
                        jSONArray.put(jSONObject);
                        i2 = 2;
                        c = 1;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ConcurrentHashMap<String, C2879b> concurrentHashMap2 = this.f9960d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("name", this.f9962f);
            jSONObject2.put("page_type", this.f9962f);
            jSONObject2.put("start", this.f9959c);
            jSONObject2.put("end", j);
            jSONObject2.put("spans", jSONArray);
            jSONObject2.put("collect_from", 2);
            jSONObject2.put("page_name", str2);
            if (i != -1) {
                jSONObject2.put("launch_mode", i);
            }
            if (!str.isEmpty()) {
                jSONObject2.put("custom_launch_mode", str);
            }
            if (C2921a.m12357a()) {
                C2921a.m12361d("AppStartStats", jSONObject2.toString());
            }
        } catch (JSONException unused) {
        }
        if (mo12987a() && C3024a.m12698a().mo12840b().mo12851c()) {
            JSONObject jSONObject3 = new JSONObject();
            C3113c.m12960a().mo13045a(jSONObject3, true);
            C3113c.m12960a().mo13047b(jSONObject3, true);
            try {
                jSONObject2.put("device_info_data", jSONObject3);
            } catch (Throwable unused2) {
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("trace", jSONObject2);
            if (!(aVar == null || (a = C3037b.m12718a(aVar)) == null)) {
                jSONObject4.put("perf_data", a);
            }
        } catch (JSONException unused3) {
        }
        C2753f fVar = new C2753f(this.f9961e, "", null, null, jSONObject4);
        C3330b.m13886a(fVar, false);
        if (C2785b.m11769j()) {
            C3124j.m13012a("AppStartStats", "reportAsync: " + jSONObject4);
        }
        C2741a.m11630c().mo11785a(fVar);
    }
}
