package com.bytedance.apm6.p157a;

import android.text.TextUtils;
import com.bytedance.apm.p129b.C2786a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p157a.p158a.AbstractC3153b;
import com.bytedance.apm6.p157a.p158a.C3152a;
import com.bytedance.apm6.p157a.p159b.C3154a;
import com.bytedance.apm6.p157a.p159b.C3155b;
import com.bytedance.apm6.p157a.p159b.C3156c;
import com.bytedance.apm6.p157a.p159b.C3157d;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.util.p194a.C3346a;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a.a */
public class C3150a {

    /* renamed from: a */
    private static volatile C3152a f10094a;

    /* renamed from: b */
    private static volatile boolean f10095b;

    /* renamed from: c */
    private static C3346a<AbstractC3326b> f10096c;

    /* renamed from: a */
    public static void m13132a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m13128a(str, 0, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m13129a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        m13122a(new C3154a(str, i, jSONObject, jSONObject2, jSONObject3, jSONObject4));
    }

    /* renamed from: a */
    public static void m13131a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m13122a(new C3154a(str, 0, jSONObject, null, null, jSONObject2));
    }

    /* renamed from: a */
    public static void m13130a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            m13123a(new C3155b(str, jSONObject));
        } else if (C3318a.m13915u()) {
            C3350b.m13932a("APM-CommonEvent", "logType must be not empty");
        }
    }

    static {
        C3346a<AbstractC3326b> aVar = new C3346a<>(1000);
        f10096c = aVar;
        aVar.mo13575a(new C3346a.AbstractC3347a<AbstractC3326b>() {
            /* class com.bytedance.apm6.p157a.C3150a.C31511 */

            /* renamed from: a */
            public void mo13094a(AbstractC3326b bVar) {
                C3350b.m13937d("APM-CommonEvent", "evicted Monitorable " + bVar);
            }
        });
    }

    /* renamed from: a */
    private static synchronized void m13120a() {
        AbstractC3153b bVar;
        synchronized (C3150a.class) {
            if (!f10095b && (bVar = (AbstractC3153b) C3336c.m13901a(AbstractC3153b.class)) != null) {
                m13121a(bVar.mo13098a());
                f10095b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m13124a(C3156c cVar) {
        if (cVar != null) {
            C3324a.m13872a(cVar);
        }
    }

    /* renamed from: a */
    public static void m13125a(C3157d dVar) {
        if (dVar != null) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-CommonEvent", "trace_data:" + dVar.mo13107i());
            }
            C3324a.m13872a(dVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m13121a(C3152a aVar) {
        synchronized (C3150a.class) {
            if (aVar != null) {
                if (f10094a != aVar) {
                    if (C3318a.m13915u()) {
                        C3350b.m13932a("APM-CommonEvent", "updateConfig " + aVar);
                    }
                    f10094a = aVar;
                    while (!f10096c.mo13577b()) {
                        AbstractC3326b a = f10096c.mo13574a();
                        if (a instanceof C3154a) {
                            m13122a((C3154a) a);
                        } else if (a instanceof C3155b) {
                            m13123a((C3155b) a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13122a(C3154a aVar) {
        if (aVar != null) {
            if (f10094a == null) {
                f10096c.mo13576a(aVar);
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CommonEvent", "cached CommonEvent:" + aVar);
                }
                m13120a();
            } else if (f10094a.mo13095a(aVar.mo13099a())) {
                if (C3318a.m13915u()) {
                    C2786a.m11784a(aVar.mo13105g(), aVar.mo13107i(), true);
                }
                C3324a.m13872a(aVar);
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CommonEvent", "Sampled CommonEvent:" + aVar);
                }
            } else {
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CommonEvent", "UnSampled CommonEvent:" + aVar);
                }
                if (C3318a.m13915u()) {
                    C2786a.m11784a(aVar.mo13105g(), aVar.mo13107i(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13123a(C3155b bVar) {
        if (bVar != null) {
            if (f10094a == null) {
                f10096c.mo13576a(bVar);
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CommonEvent", "Cached CommonLog: " + bVar);
                }
                m13120a();
            } else if (f10094a.mo13096b(bVar.mo13105g())) {
                if (C3318a.m13915u()) {
                    C2786a.m11784a(bVar.mo13105g(), bVar.mo13107i(), true);
                    C3350b.m13932a("APM-CommonEvent", "Sampled CommonLog:" + bVar);
                }
                C3324a.m13872a(bVar);
            } else if (C3318a.m13915u()) {
                C2786a.m11784a(bVar.mo13105g(), bVar.mo13107i(), false);
                C3350b.m13932a("APM-CommonEvent", "UnSampled CommonLog:" + bVar);
            }
        }
    }

    /* renamed from: a */
    public static void m13126a(String str, int i, JSONObject jSONObject) {
        m13128a(str, i, null, null, jSONObject);
    }

    /* renamed from: a */
    public static void m13127a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        m13122a(new C3154a(str, i, jSONObject, null, null, jSONObject2));
    }

    /* renamed from: a */
    public static void m13128a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m13129a(str, i, null, jSONObject, jSONObject2, jSONObject3);
    }
}
