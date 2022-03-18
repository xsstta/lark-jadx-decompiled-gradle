package com.bytedance.crash.p218b;

import com.bytedance.crash.p218b.AbstractC3703g;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.b.h */
public class C3705h {

    /* renamed from: a */
    public HashMap<String, String> f11427a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, String> f11428b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, Long> f11429c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, Float> f11430d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, String> f11431e = new HashMap<>();

    /* renamed from: f */
    final int[] f11432f = {0, 0, 0};

    /* renamed from: g */
    private final C3702f f11433g = new C3702f();

    /* renamed from: h */
    private AbstractC3703g.AbstractC3704a f11434h = new AbstractC3703g.AbstractC3704a() {
        /* class com.bytedance.crash.p218b.C3705h.C37061 */

        @Override // com.bytedance.crash.p218b.AbstractC3703g.AbstractC3704a
        /* renamed from: a */
        public void mo15135a(String str, String str2) {
            C3705h.this.f11427a.put(str, str2);
        }

        @Override // com.bytedance.crash.p218b.AbstractC3703g.AbstractC3704a
        /* renamed from: a */
        public void mo15134a(String str, float f) {
            C3705h.this.f11430d.put(str, Float.valueOf(f));
        }
    };

    /* renamed from: i */
    private String f11435i = "unknown";

    /* renamed from: j */
    private String f11436j = "unknown";

    /* renamed from: k */
    private String f11437k = "unknown";

    /* renamed from: l */
    private List<Pattern> f11438l;

    /* renamed from: a */
    public void mo15142a(String str, String str2, String str3, float f, float f2) {
    }

    /* renamed from: b */
    public void mo15149b(String str, String str2, String str3, float f, float f2) {
    }

    /* renamed from: c */
    public void mo15151c() {
    }

    /* renamed from: e */
    public String mo15158e() {
        return this.f11433g.mo15128c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject mo15159f() {
        return this.f11433g.mo15116a();
    }

    /* renamed from: b */
    public void mo15145b() {
        this.f11434h.mo15135a("success_end_anrinfo", "true");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15136a() {
        this.f11427a.clear();
        this.f11428b.clear();
        this.f11429c.clear();
        this.f11430d.clear();
    }

    C3705h() {
    }

    /* renamed from: d */
    public void mo15156d() {
        this.f11434h.mo15135a("max_utm_thread", this.f11435i);
        this.f11434h.mo15135a("max_stm_thread", this.f11436j);
        this.f11434h.mo15135a("max_utm_stm_thread", this.f11437k);
        C3968x.m16536b("AnrDataCallback", "end trace: " + this.f11437k);
        int[] iArr = this.f11432f;
        iArr[2] = 0;
        iArr[1] = 0;
        iArr[0] = 0;
        this.f11435i = "unknown";
        this.f11436j = "unknown";
        this.f11437k = "unknown";
    }

    /* renamed from: a */
    public void mo15139a(String str) {
        this.f11434h.mo15135a("anr_reason", str);
    }

    /* renamed from: b */
    public void mo15147b(String str) {
        this.f11434h.mo15135a("input_timeout_type", str);
    }

    /* renamed from: c */
    public void mo15153c(String str) {
        this.f11434h.mo15135a("anr_tag", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15150b(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f11428b.entrySet()) {
            C3955q.m16447a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15157d(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f11431e.entrySet()) {
            C3955q.m16447a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15155c(JSONObject jSONObject) {
        for (Map.Entry<String, Long> entry : this.f11429c.entrySet()) {
            C3955q.m16447a(jSONObject, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Float> entry2 : this.f11430d.entrySet()) {
            C3955q.m16447a(jSONObject, entry2.getKey(), entry2.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15144a(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f11427a.entrySet()) {
            C3955q.m16447a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15140a(String str, String str2) {
        this.f11433g.mo15122a(str, str2);
    }

    /* renamed from: a */
    private boolean m15267a(String str, AbstractC3703g.AbstractC3704a aVar) {
        String str2;
        if (this.f11438l == null) {
            JSONArray g = C3840b.m15889g();
            if (g != null) {
                this.f11438l = new LinkedList();
                str2 = g.optString(0);
                for (int i = 1; i < g.length(); i++) {
                    try {
                        this.f11438l.add(Pattern.compile(g.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                str2 = "npth_inner_default";
            }
            if (this.f11438l == null) {
                LinkedList linkedList = new LinkedList();
                this.f11438l = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f11438l.add(Pattern.compile("^default_npth_thread$"));
                this.f11438l.add(Pattern.compile("^RenderThread$"));
                this.f11438l.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
            this.f11434h.mo15135a("max_utm_thread_version", str2);
        }
        for (Pattern pattern : this.f11438l) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo15137a(float f, float f2, float f3) {
        this.f11434h.mo15135a("load_0", String.valueOf(f));
        this.f11434h.mo15135a("load_1", String.valueOf(f2));
        this.f11434h.mo15135a("load_2", String.valueOf(f3));
        this.f11433g.mo15120a(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    /* renamed from: c */
    public void mo15154c(String str, String str2, float f, float f2) {
        this.f11433g.mo15127b(str2, Integer.valueOf(str).intValue(), Float.valueOf(f + f2));
    }

    /* renamed from: b */
    public void mo15148b(String str, String str2, float f, float f2) {
        float f3 = f + f2;
        if (str2.contains("kworker")) {
            this.f11433g.mo15119a(Float.valueOf(f3));
            this.f11434h.mo15134a("cpu_kwork", this.f11433g.mo15124b().floatValue());
        } else if (str2.contains("kswapd")) {
            this.f11434h.mo15134a("cpu_kswapd", f3);
            this.f11433g.mo15129c(Float.valueOf(f3));
        } else if (str2.contains("mmcqd")) {
            this.f11434h.mo15134a("cpu_mmcqd", f3);
            this.f11433g.mo15126b(Float.valueOf(f3));
        } else if (str2.contains("dex2oat")) {
            this.f11434h.mo15134a("cpu_dex2oat", f3);
            this.f11433g.mo15118a(Integer.valueOf(str).intValue(), Float.valueOf(f3));
        } else if (str2.contains("system_server")) {
            this.f11434h.mo15134a("cpu_system_server", f3);
            this.f11433g.mo15132d(Float.valueOf(f3));
        } else if (str2.contains("lmkd")) {
            this.f11434h.mo15134a("cpu_lmkd", f3);
            this.f11433g.mo15133e(Float.valueOf(f3));
        } else if (C3933b.m16327a().equals(str2)) {
            this.f11434h.mo15134a("cpu_app_total", f3);
            this.f11434h.mo15134a("cpu_app_user", f);
            this.f11434h.mo15134a("cpu_app_kernel", f2);
        }
        this.f11433g.mo15121a(str2, Integer.valueOf(str).intValue(), Float.valueOf(f3));
    }

    /* renamed from: a */
    public void mo15141a(String str, String str2, float f, float f2) {
        float f3 = f + f2;
        if (str2.contains("kworker")) {
            this.f11433g.mo15119a(Float.valueOf(f3));
            this.f11434h.mo15134a("cpu_kwork", this.f11433g.mo15124b().floatValue());
        } else if (str2.contains("kswapd")) {
            this.f11434h.mo15134a("cpu_kswapd", f3);
            this.f11433g.mo15129c(Float.valueOf(f3));
        } else if (str2.contains("mmcqd")) {
            this.f11434h.mo15134a("cpu_mmcqd", f3);
            this.f11433g.mo15126b(Float.valueOf(f3));
        } else if (str2.contains("dex2oat")) {
            this.f11434h.mo15134a("cpu_dex2oat", f3);
            this.f11433g.mo15118a(Integer.valueOf(str).intValue(), Float.valueOf(f3));
        } else if (str2.contains("system_server")) {
            this.f11434h.mo15134a("cpu_system_server", f3);
            this.f11433g.mo15132d(Float.valueOf(f3));
        } else if (str2.contains("lmkd")) {
            this.f11434h.mo15134a("cpu_lmkd", f3);
            this.f11433g.mo15133e(Float.valueOf(f3));
        } else if (C3933b.m16327a().equals(str2)) {
            this.f11434h.mo15134a("cpu_app_total", f3);
            this.f11434h.mo15134a("cpu_app_user", f);
            this.f11434h.mo15134a("cpu_app_kernel", f2);
        }
        this.f11433g.mo15130c(str2, Integer.valueOf(str).intValue(), Float.valueOf(f3));
    }

    /* renamed from: c */
    public void mo15152c(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j) {
        this.f11433g.mo15125b(f, f2, f3, f6, f7);
    }

    /* renamed from: a */
    public void mo15138a(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j) {
        this.f11434h.mo15135a("anr_has_ago", "true");
        this.f11434h.mo15134a("cpu_total", f + f2 + f3 + f4 + f5);
        this.f11434h.mo15134a("cpu_user", f);
        this.f11434h.mo15134a("cpu_kernel", f2);
        this.f11434h.mo15134a("cpu_iowait", f3);
        if (j > 0) {
            float f8 = (float) j;
            this.f11434h.mo15134a("minor_rate", f6 / f8);
            this.f11434h.mo15134a("major_rate", f7 / f8);
        }
        this.f11433g.mo15117a(f, f2, f3, f6, f7);
    }

    /* renamed from: b */
    public void mo15146b(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j) {
        this.f11434h.mo15134a("cpu_total", f + f2 + f3 + f4 + f5);
        this.f11434h.mo15134a("cpu_user", f);
        this.f11434h.mo15134a("cpu_kernel", f2);
        this.f11434h.mo15134a("cpu_iowait", f3);
        if (j > 0) {
            float f8 = (float) j;
            this.f11434h.mo15134a("minor_rate", f6 / f8);
            this.f11434h.mo15134a("major_rate", f7 / f8);
        }
        this.f11433g.mo15117a(f, f2, f3, f6, f7);
    }

    /* renamed from: a */
    public void mo15143a(String str, String str2, String str3, JSONArray jSONArray, int i, int i2, int i3, long j, long j2, long j3) {
        if (!m15267a(str3, this.f11434h)) {
            int[] iArr = this.f11432f;
            if (i > iArr[0]) {
                iArr[0] = i;
                this.f11435i = str3;
            }
            if (i2 > iArr[1]) {
                iArr[1] = i2;
                this.f11436j = str3;
            }
            int i4 = i + i2;
            if (i4 > iArr[2]) {
                iArr[2] = i4;
                this.f11437k = str3;
            }
        }
        this.f11433g.mo15123a(str2, str3, Integer.valueOf(str).intValue(), i + i2, i3, j, j2, j3);
    }
}
