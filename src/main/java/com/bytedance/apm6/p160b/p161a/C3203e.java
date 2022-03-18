package com.bytedance.apm6.p160b.p161a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.p129b.C2786a;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.p162a.AbstractC3161b;
import com.bytedance.apm6.p160b.p161a.p162a.C3160a;
import com.bytedance.apm6.p160b.p161a.p163b.C3164b;
import com.bytedance.apm6.p160b.p161a.p163b.C3169d;
import com.bytedance.apm6.p160b.p161a.p164c.C3178c;
import com.bytedance.apm6.p160b.p161a.p165d.C3190c;
import com.bytedance.apm6.p160b.p161a.p165d.C3193d;
import com.bytedance.apm6.p160b.p161a.p166e.C3206c;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.p183g.AbstractC3327c;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.util.C3357g;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.e */
public class C3203e implements AbstractC3327c {

    /* renamed from: a */
    private static volatile C3203e f10252a = new C3203e();

    /* renamed from: b */
    private C3178c f10253b;

    /* renamed from: c */
    private C3160a f10254c;

    /* renamed from: d */
    private volatile boolean f10255d;

    private C3203e() {
    }

    /* renamed from: a */
    public static C3203e m13385a() {
        return f10252a;
    }

    /* renamed from: b */
    public void mo13279b() {
        if (C3318a.m13915u()) {
            C3350b.m13932a(C3159a.f10110a, "pause");
        }
        C3170c.m13261a().mo13208c();
        C3193d.m13346a().mo13269c();
    }

    /* renamed from: c */
    public void mo13280c() {
        if (C3318a.m13915u()) {
            C3350b.m13932a(C3159a.f10110a, "resume");
        }
        C3170c.m13261a().mo13210d();
        C3193d.m13346a().mo13270d();
    }

    /* renamed from: d */
    private synchronized void m13387d() {
        if (!this.f10255d) {
            if (C3318a.m13915u()) {
                C3350b.m13932a(C3159a.f10110a, "Initializing SlardarHandler...");
            }
            C2921a.m12355a(C3159a.f10110a, "ensureInited");
            C3164b.m13245a().mo13197b();
            AbstractC3161b bVar = (AbstractC3161b) C3336c.m13901a(AbstractC3161b.class);
            if (bVar != null) {
                mo13277a(bVar.mo13132a());
            }
            this.f10253b = new C3178c(C3169d.m13256a(), C3162b.m13179c(), C3162b.m13180d());
            C3170c.m13261a().mo13205a(this.f10253b);
            C3206c.m13399a().mo13290a(C3170c.m13261a());
            C3206c.m13399a().mo13290a(C3193d.m13346a());
            C3206c.m13399a().mo13291b();
            C3170c.m13261a().mo13206b();
            C3193d.m13346a().mo13268b();
            this.f10255d = true;
        }
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3327c
    /* renamed from: a */
    public void mo13278a(AbstractC3326b bVar) {
        if (!this.f10255d) {
            m13387d();
        }
        JSONObject i = bVar.mo13107i();
        if (C3159a.f10111b.contains(bVar.mo13105g()) || "tracing".equals(bVar.mo13105g())) {
            m13386a(i, false);
        } else {
            m13386a(i, true);
        }
        this.f10253b.mo13229a(i);
        if (C3318a.m13915u()) {
            C2786a.m11784a(bVar.mo13105g(), i, true);
        }
    }

    /* renamed from: a */
    public synchronized void mo13277a(C3160a aVar) {
        this.f10254c = aVar;
        if (aVar != null) {
            C3190c.m13326a().mo13252a(aVar);
            C3170c.m13261a().mo13207b(aVar.mo13128f());
            C3170c.m13261a().mo13203a(aVar.mo13127e());
            C3206c.m13399a().mo13288a(aVar.mo13129g(), aVar.mo13130h());
        }
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "setSlardarHandlerConfig:" + aVar);
        }
    }

    /* renamed from: a */
    private void m13386a(JSONObject jSONObject, boolean z) {
        int a;
        try {
            if (!TextUtils.isEmpty(C3318a.m13839q())) {
                jSONObject.put("session_id", C3318a.m13839q());
            }
            if (jSONObject.isNull("network_type")) {
                NetworkUtils.NetworkType networkTypeFast = NetworkUtils.getNetworkTypeFast(C3318a.m13917w());
                jSONObject.put("network_type", networkTypeFast.getValue());
                if ((networkTypeFast.is2G() || networkTypeFast.is3GOrHigher()) && (a = C3357g.m13967a(C3318a.m13917w())) != -10000) {
                    jSONObject.put("network_type_code", a);
                }
            }
            if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                jSONObject.put("timestamp", System.currentTimeMillis());
            }
            if (jSONObject.isNull("sid")) {
                jSONObject.put("sid", C3318a.m13824c());
            }
            jSONObject.put("process_name", C3318a.m13828f());
            if (z) {
                jSONObject.put("seq_no", C3181d.m13301a().mo13232b());
            }
        } catch (Exception e) {
            Log.e(C3159a.f10110a, "addExtension", e);
        }
    }
}
