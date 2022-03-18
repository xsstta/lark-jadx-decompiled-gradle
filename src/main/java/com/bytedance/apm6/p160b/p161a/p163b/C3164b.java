package com.bytedance.apm6.p160b.p161a.p163b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.p138d.AbstractC2917d;
import com.bytedance.apm6.foundation.p182a.AbstractC3319b;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.C3209f;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.C3358h;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.b.b */
public class C3164b {

    /* renamed from: d */
    private static volatile C3164b f10156d;

    /* renamed from: a */
    public long f10157a = -1;

    /* renamed from: b */
    public long f10158b = -1;

    /* renamed from: c */
    public AbstractRunnableC3362a f10159c;

    /* renamed from: e */
    private Map<String, C3163a> f10160e = new ConcurrentHashMap();

    /* renamed from: f */
    private C3163a f10161f;

    /* renamed from: a */
    public static C3164b m13245a() {
        if (f10156d == null) {
            synchronized (C3164b.class) {
                if (f10156d == null) {
                    f10156d = new C3164b();
                }
            }
        }
        return f10156d;
    }

    /* renamed from: b */
    public void mo13197b() {
        C3163a aVar = new C3163a();
        aVar.mo13141a("Android");
        aVar.mo13146b("android");
        aVar.mo13150c(Build.VERSION.RELEASE);
        aVar.mo13139a(Build.VERSION.SDK_INT);
        aVar.mo13154d(Build.MODEL);
        aVar.mo13157e(Build.BRAND);
        aVar.mo13160f(Build.MANUFACTURER);
        aVar.mo13162g(C3318a.m13828f());
        aVar.mo13140a(C3318a.m13824c());
        aVar.mo13164h(C3358h.m13969a());
        aVar.mo13186s(C3209f.m13408a());
        aVar.mo13149c(C3318a.m13826d());
        aVar.mo13168j(C3318a.m13830h());
        aVar.mo13144b(C3318a.m13829g());
        aVar.mo13145b(C3318a.m13840r());
        aVar.mo13170k(String.valueOf(C3318a.m13831i()));
        aVar.mo13178o(C3318a.m13832j());
        aVar.mo13176n(String.valueOf(C3318a.m13833k()));
        aVar.mo13172l(C3318a.m13834l());
        aVar.mo13180p(C3318a.m13835m());
        aVar.mo13182q(C3318a.m13917w().getPackageName());
        aVar.mo13188t(aVar.mo13152d());
        aVar.mo13174m(C3318a.m13836n());
        aVar.mo13153d(C3318a.m13841s());
        JSONObject jSONObject = new JSONObject();
        try {
            C3355e.m13954a(jSONObject, C3318a.m13837o());
            if (jSONObject.has("version_code")) {
                jSONObject.remove("version_code");
            }
            if (jSONObject.has("app_version")) {
                jSONObject.remove("app_version");
            }
            if (jSONObject.has("uid")) {
                jSONObject.remove("uid");
            }
            if (jSONObject.has("update_version_code")) {
                jSONObject.remove("update_version_code");
            }
            if (jSONObject.has("manifest_version_code")) {
                jSONObject.remove("manifest_version_code");
            }
        } catch (Exception e) {
            C3350b.m13937d("APM", "header json exception" + e.toString());
        }
        aVar.mo13147b(jSONObject);
        aVar.mo13184r("5.0.19.1-rc.92");
        if (C3318a.m13827e()) {
            C3166c.m13250a().mo13201b();
        }
        m13247b(aVar);
    }

    /* renamed from: b */
    private void m13247b(C3163a aVar) {
        String valueOf = String.valueOf(C3169d.m13256a());
        this.f10160e.put(valueOf, aVar);
        this.f10161f = aVar;
        C3166c.m13250a().mo13200a(valueOf, aVar);
    }

    /* renamed from: a */
    public C3163a mo13196a(String str) {
        C3163a aVar;
        if (this.f10160e.containsKey(str)) {
            aVar = this.f10160e.get(str);
        } else {
            C3163a a = C3166c.m13250a().mo13199a(str);
            if (a == null) {
                return this.f10161f;
            }
            this.f10160e.put(str, a);
            aVar = a;
        }
        m13246a(aVar);
        return aVar;
    }

    /* renamed from: a */
    private void m13246a(C3163a aVar) {
        if (aVar != null) {
            if (TextUtils.isEmpty(aVar.mo13143b())) {
                aVar.mo13166i(C3318a.m13838p());
            }
            AbstractC3319b b = C3318a.m13822b();
            if (b != null) {
                aVar.mo13142a(b.mo13083r());
            }
            long j = this.f10158b;
            if (j != -1) {
                aVar.mo13156e(j);
                aVar.mo13159f(this.f10157a);
            } else {
                final AbstractC2917d a = C3318a.m13817a();
                if (a != null && this.f10159c == null) {
                    synchronized (C3164b.class) {
                        this.f10159c = new AbstractRunnableC3362a() {
                            /* class com.bytedance.apm6.p160b.p161a.p163b.C3164b.C31651 */

                            public void run() {
                                long a = a.mo12600a();
                                if (a != -1) {
                                    C3164b.this.f10158b = a;
                                    C3164b.this.f10157a = System.currentTimeMillis() - a;
                                }
                                synchronized (C3164b.class) {
                                    C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(C3164b.this.f10159c);
                                    C3164b.this.f10159c = null;
                                }
                            }
                        };
                        C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10159c);
                    }
                }
            }
            if (C3318a.m13915u()) {
                String str = C3159a.f10110a;
                C3350b.m13932a(str, "nptTime:" + this.f10158b + " nptOffset:" + this.f10157a);
            }
            aVar.mo13145b(C3318a.m13840r());
            aVar.mo13153d(C3318a.m13841s());
            C3163a aVar2 = this.f10161f;
            if (aVar2 != null) {
                aVar.mo13188t(aVar2.mo13152d());
            }
        }
    }
}
