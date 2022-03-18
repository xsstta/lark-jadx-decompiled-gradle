package com.bytedance.apm.p124a.p125a;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.AbstractC2738a;
import com.bytedance.apm.p124a.p126b.C2748a;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.util.C3131o;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a.d */
public class C2744d extends AbstractC2738a<C2748a> {

    /* renamed from: q */
    private static long f8803q = 30000;

    /* renamed from: r */
    private static boolean f8804r;

    /* renamed from: b */
    private int f8805b;

    /* renamed from: c */
    private boolean f8806c;

    /* renamed from: d */
    private volatile int f8807d;

    /* renamed from: e */
    private volatile List<String> f8808e;

    /* renamed from: f */
    private List<Pattern> f8809f;

    /* renamed from: g */
    private List<String> f8810g;

    /* renamed from: h */
    private List<Pattern> f8811h;

    /* renamed from: i */
    private List<String> f8812i;

    /* renamed from: j */
    private List<String> f8813j;

    /* renamed from: k */
    private List<String> f8814k;

    /* renamed from: l */
    private boolean f8815l;

    /* renamed from: m */
    private boolean f8816m;

    /* renamed from: n */
    private double f8817n;

    /* renamed from: o */
    private boolean f8818o;

    /* renamed from: p */
    private AbstractC2743c f8819p;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.a.a.d$a */
    public static final class C2746a {

        /* renamed from: a */
        public static final C2744d f8820a = new C2744d();
    }

    /* renamed from: c */
    public static C2744d m11644c() {
        return C2746a.f8820a;
    }

    /* renamed from: e */
    public int mo11804e() {
        return this.f8805b;
    }

    /* renamed from: f */
    public boolean mo11805f() {
        return this.f8815l;
    }

    /* renamed from: g */
    public boolean mo11806g() {
        return this.f8806c;
    }

    private C2744d() {
        this.f8806c = true;
        this.f8815l = true;
    }

    /* renamed from: d */
    public boolean mo11803d() {
        if (!this.f8815l || this.f8817n == 0.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m11647h() {
        if (f8804r && C2785b.m11778s() != 0 && System.currentTimeMillis() - C2785b.m11778s() <= f8803q) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m11635a(long j) {
        f8803q = j;
    }

    /* renamed from: b */
    public static void m11642b(boolean z) {
        f8804r = z;
    }

    /* renamed from: c */
    private boolean m11645c(String str) {
        return C3131o.m13020a(str, this.f8812i);
    }

    /* renamed from: a */
    public void mo11798a(AbstractC2743c cVar) {
        this.f8819p = cVar;
    }

    /* renamed from: a */
    private boolean m11638a(String str) {
        return C3131o.m13021a(str, this.f8810g, this.f8811h);
    }

    /* renamed from: b */
    private void m11641b(JSONObject jSONObject) {
        m11636a(this.f8813j, jSONObject, "requestHeader");
        m11636a(this.f8814k, jSONObject, "responseHeader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11790e(C2748a aVar) {
        m11646d(aVar);
    }

    /* renamed from: b */
    private boolean m11643b(String str) {
        return C3131o.m13021a(str, this.f8808e, this.f8809f);
    }

    /* renamed from: a */
    public void mo11799a(boolean z) {
        this.f8818o = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11789d(C2748a aVar) {
        boolean z;
        try {
            if (!m11620b()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo11813a(z);
            if (m11647h()) {
                aVar.mo11814e();
            }
            aVar.mo11812a("ttnet");
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11646d(com.bytedance.apm.p124a.p126b.C2748a r9) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p124a.p125a.C2744d.m11646d(com.bytedance.apm.a.b.a):void");
    }

    /* renamed from: a */
    private boolean m11640a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            String optString = jSONObject.optString("cronet_internal_error_code");
            if (!"11".equals(jSONObject.optString("cronet_error_code")) || !"-999".equals(optString)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11788c(C2748a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f8824d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m11639a(String str, JSONObject jSONObject) {
        boolean z;
        int i;
        if (mo11803d() || this.f8805b != 0 || m11638a(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        boolean b = C3023c.m12694b("smart_traffic");
        if (b) {
            i |= 4;
        }
        try {
            jSONObject.put("hit_rules", i);
        } catch (JSONException unused) {
        }
        if (z || b) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a, com.bytedance.apm.p124a.AbstractC2738a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        JSONObject a = C3131o.m13019a(jSONObject, "network_image_modules");
        if (a != null) {
            JSONObject a2 = C3131o.m13019a(a, "network");
            if (a2 != null) {
                this.f8808e = C3131o.m13022b(a2, "api_block_list");
                this.f8809f = C3131o.m13024d(a2, "api_block_list");
                this.f8810g = C3131o.m13023c(a2, "api_allow_list");
                this.f8811h = C3131o.m13025e(a2, "api_allow_list");
                boolean z2 = false;
                this.f8805b = a2.optInt("enable_api_all_upload", 0);
                this.f8806c = a2.optBoolean("enable_trace_log", true);
                this.f8807d = a2.optInt("enable_api_error_upload", 1);
                if (a2.optInt("enable_cancel_error_report") == 1) {
                    z2 = true;
                }
                this.f8816m = z2;
                this.f8813j = C3131o.m13023c(a2, "request_allow_header");
                this.f8814k = C3131o.m13023c(a2, "response_allow_header");
                this.f8817n = a2.optDouble("enable_base_api_all", 0.0d);
            }
            JSONObject a3 = C3131o.m13019a(a, "image");
            if (a3 != null) {
                this.f8812i = C3131o.m13023c(a3, "image_allow_list");
            }
        }
    }

    /* renamed from: a */
    private void m11637a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                if (TextUtils.equals(str, "api_all")) {
                    jSONObject.put("net_log_type", "api_all_v2");
                } else if (TextUtils.equals(str, "api_error")) {
                    jSONObject.put("net_log_type", "api_error_v2");
                }
                if (mo11803d() && mo11806g()) {
                    jSONObject.put("inject_tracelog", HiAnalyticsConstant.KeyAndValue.NUMBER_01);
                } else if (mo11804e() == 1 && mo11806g()) {
                    jSONObject.put("inject_tracelog", "02");
                }
                double d = this.f8817n;
                if (d != 0.0d) {
                    jSONObject.put("enable_base_api_all", d);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m11636a(List<String> list, JSONObject jSONObject, String str) {
        if (list != null && jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String optString = jSONObject.optString(str);
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            JSONObject jSONObject3 = new JSONObject();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (list.contains(next)) {
                                    jSONObject3.put(next, jSONObject2.opt(next));
                                }
                            }
                            jSONObject.put(str, jSONObject3.toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
