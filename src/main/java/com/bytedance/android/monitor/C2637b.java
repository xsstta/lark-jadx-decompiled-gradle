package com.bytedance.android.monitor;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p104a.AbstractC2633e;
import com.bytedance.android.monitor.p104a.AbstractC2635g;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2653a;
import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.p112i.C2661j;
import com.bytedance.android.monitor.util.MonitorUtils;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b */
public class C2637b implements AbstractC2633e {

    /* renamed from: a */
    protected AbstractC2677a f8370a;

    public C2637b(AbstractC2677a aVar) {
        this.f8370a = aVar;
    }

    /* renamed from: a */
    private static boolean m11079a(String str) {
        if ("jsbPerf".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2633e
    /* renamed from: a */
    public void mo11410a(final AbstractC2635g gVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            MonitorExecutor.f8417a.mo11451a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.C2637b.RunnableC26381 */

                public void run() {
                    C2637b.m11075a(gVar, C2637b.this.f8370a);
                }
            });
        } else {
            m11075a(gVar, this.f8370a);
        }
    }

    /* renamed from: a */
    public static void m11076a(C2641a aVar) {
        String str;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (aVar.mo11428d() != null) {
                C2657e.m11173a(jSONObject, "client_category", aVar.mo11428d());
            }
            if (aVar.mo11429e() != null) {
                C2657e.m11173a(jSONObject, "client_metric", aVar.mo11429e());
            }
            if (aVar.mo11430f() != null) {
                C2657e.m11174a(aVar.mo11430f(), "event_name", aVar.mo11426c());
                C2657e.m11173a(jSONObject, "client_extra", aVar.mo11430f());
            }
            if (aVar.mo11431g() != null) {
                C2657e.m11173a(jSONObject, "client_timing", aVar.mo11431g());
            }
            if (aVar.mo11434j()) {
                str = "samplecustom";
            } else {
                str = "newcustom";
            }
            String a = aVar.mo11421a();
            C2657e.m11174a(jSONObject, "url", a);
            if (a != null) {
                C2657e.m11174a(jSONObject, "host", C2661j.m11191b(a));
                C2657e.m11174a(jSONObject, "path", C2661j.m11190a(a));
            }
            C2657e.m11174a(jSONObject, "ev_type", "custom");
            C2657e.m11175a(jSONObject, aVar.mo11432h());
            if (!TextUtils.isEmpty(aVar.mo11433i())) {
                C2657e.m11174a(jSONObject, "virtual_aid", aVar.mo11433i());
            }
            m11078a(aVar.mo11435k(), jSONObject, str, aVar.mo11424b(), false);
        }
    }

    /* renamed from: a */
    public static void m11075a(AbstractC2635g gVar, AbstractC2677a aVar) {
        boolean z;
        if (gVar == null) {
            throw new NullPointerException("data should not be null");
        } else if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (gVar.mo11407c() != null) {
                    C2657e.m11173a(jSONObject, "nativeBase", gVar.mo11407c().mo11403a());
                }
                if (gVar.mo11408d() != null) {
                    C2657e.m11173a(jSONObject, "nativeInfo", gVar.mo11408d().mo11403a());
                }
                if (gVar.mo11412f() != null) {
                    C2657e.m11173a(jSONObject, "jsInfo", gVar.mo11411e());
                }
                if (gVar.mo11412f() != null) {
                    C2657e.m11173a(jSONObject, "jsBase", gVar.mo11412f());
                }
                if (!m11079a(gVar.mo11413g())) {
                    z = true;
                } else {
                    z = false;
                }
                m11077a(aVar, jSONObject, gVar.mo11413g(), gVar.mo11414h(), gVar.mo11415i(), z);
            } catch (Throwable th) {
                C2655c.m11159a(th);
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: a */
    private static boolean m11080a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (!(jSONObject == null || str == null)) {
            try {
                JSONObject c = C2657e.m11178c(jSONObject, "extra");
                str2 = C2657e.m11177b(c, "virtual_aid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = C2657e.m11177b(C2657e.m11178c(c, "nativeBase"), "virtual_aid");
                }
            } catch (Throwable th) {
                C2655c.m11159a(th);
                return true;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        return !C2640c.m11089a().mo11419a(str2, str);
    }

    /* renamed from: a */
    public static void m11078a(AbstractC2677a aVar, JSONObject jSONObject, String str, String str2, boolean z) {
        if (jSONObject == null) {
            throw new NullPointerException("data should not be null");
        } else if (aVar != null) {
            try {
                m11077a(aVar, jSONObject, str, "", str2, z);
            } catch (Throwable th) {
                C2655c.m11159a(th);
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: a */
    private static void m11077a(AbstractC2677a aVar, JSONObject jSONObject, String str, String str2, String str3, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        C2657e.m11173a(jSONObject2, "extra", jSONObject);
        String a = MonitorUtils.m11181a(str, str2, str3);
        HybridMonitor.getInstance().notifyReportInterceptor(a, str, str2, jSONObject2);
        if (aVar != null && m11080a(jSONObject2, a)) {
            aVar.mo11563a(a, 0, null, jSONObject2);
            C2648b.m11130a("DataMonitor", "monitor : " + a);
        }
        if (z) {
            C2653a.m11156a("BDHybridMonitor", String.format("service:%s,data:%s", a, jSONObject2));
        }
    }
}
