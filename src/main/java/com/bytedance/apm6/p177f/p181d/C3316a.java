package com.bytedance.apm6.p177f.p181d;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p177f.p178a.C3305a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p188a.AbstractC3333a;
import com.bytedance.apm6.util.C3355e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.f.d.a */
public final class C3316a extends AbstractC3329a {

    /* renamed from: g */
    private long f10566g;

    /* renamed from: h */
    private long f10567h;

    /* renamed from: i */
    private long f10568i;

    /* renamed from: j */
    private long f10569j;

    /* renamed from: k */
    private boolean f10570k;

    /* renamed from: l */
    private long f10571l;

    /* renamed from: m */
    private long f10572m;

    /* renamed from: n */
    private long f10573n;

    /* renamed from: o */
    private long f10574o;

    /* renamed from: p */
    private long f10575p;

    /* renamed from: q */
    private long f10576q;

    /* renamed from: r */
    private double f10577r;

    /* renamed from: s */
    private boolean f10578s;

    /* renamed from: t */
    private boolean f10579t;

    /* renamed from: u */
    private Map<Object, Object> f10580u;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: a */
    public String mo13323a() {
        return "memory";
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return true;
    }

    /* renamed from: f */
    public double mo13544f() {
        return this.f10577r;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: c */
    public JSONObject mo13325c() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", C3331c.m13887a().mo13566b());
            jSONObject.put("process_name", C3318a.m13828f());
            if (!this.f10570k) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_front", z);
            jSONObject.put("is_main_process", C3318a.m13827e());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: d */
    public JSONObject mo13326d() {
        JSONObject c = C3331c.m13887a().mo13569c();
        if (this.f10579t) {
            try {
                C3355e.m13954a(c, C3331c.m13887a().mo13570d());
            } catch (Exception unused) {
            }
        }
        AbstractC3333a aVar = (AbstractC3333a) C3336c.m13901a(AbstractC3333a.class);
        if (aVar != null) {
            try {
                C3355e.m13954a(c, aVar.mo13092a());
            } catch (Exception unused2) {
            }
        }
        return c;
    }

    /* renamed from: j */
    public C3305a mo13545j() {
        C3305a aVar = new C3305a();
        aVar.f10529a = this.f10566g;
        aVar.f10530b = this.f10567h;
        aVar.f10531c = this.f10568i;
        aVar.f10532d = this.f10569j;
        aVar.f10533e = this.f10570k;
        aVar.f10534f = this.f10571l;
        aVar.f10535g = this.f10572m;
        aVar.f10536h = this.f10573n;
        aVar.f10537i = this.f10574o;
        aVar.f10538j = this.f10575p;
        aVar.f10539k = this.f10576q;
        aVar.f10540l = this.f10578s;
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: b */
    public JSONObject mo13324b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.f10566g);
            jSONObject.put("gc_time", this.f10567h);
            jSONObject.put("block_gc_count", this.f10568i);
            jSONObject.put("block_gc_time", this.f10569j);
            if (this.f10570k) {
                jSONObject.put("dalvik_pss_background", this.f10574o);
                jSONObject.put("native_pss_background", this.f10571l);
                jSONObject.put("total_pss_background", this.f10572m);
                jSONObject.put("java_heap_background", this.f10573n);
                jSONObject.put("java_heap_background_used_rate", this.f10577r);
                jSONObject.put("vm_size_background", this.f10576q);
                jSONObject.put("graphics_background", this.f10575p);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.f10574o);
                jSONObject.put("native_pss_foreground", this.f10571l);
                jSONObject.put("total_pss_foreground", this.f10572m);
                jSONObject.put("java_heap_foreground", this.f10573n);
                jSONObject.put("java_heap_foreground_used_rate", this.f10577r);
                jSONObject.put("vm_size_foreground", this.f10576q);
                jSONObject.put("graphics_foreground", this.f10575p);
            }
            if (this.f10578s) {
                jSONObject.put("reach_top_java", 1);
            }
            m13801a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "MemoryPerfMonitorable{gcCount=" + this.f10566g + ", gcTime=" + this.f10567h + ", blockingGcCount=" + this.f10568i + ", blockingGcTime=" + this.f10569j + ", background=" + this.f10570k + ", nativePss=" + this.f10571l + ", totalPss=" + this.f10572m + ", javaUsedMemory=" + this.f10573n + ", dalvikUsedSize=" + this.f10574o + ", graphics=" + this.f10575p + ", vmSize=" + this.f10576q + ", javaUsedMemoryRate=" + this.f10577r + ", isMemoryReachTop=" + this.f10578s + '}';
    }

    /* renamed from: a */
    public void mo13543a(Map<Object, Object> map) {
        this.f10580u = map;
    }

    /* renamed from: a */
    private void m13801a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Map<Object, Object> map = this.f10580u;
                if (map != null) {
                    for (Map.Entry<Object, Object> entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), Long.parseLong((String) entry.getValue()));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public C3316a(long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, long j9, long j10, double d, boolean z2, boolean z3) {
        this.f10566g = j;
        this.f10567h = j2;
        this.f10568i = j3;
        this.f10569j = j4;
        this.f10570k = z;
        this.f10571l = j5;
        this.f10572m = j6;
        this.f10573n = j7;
        this.f10574o = j8;
        this.f10575p = j9;
        this.f10576q = j10;
        this.f10577r = d;
        this.f10578s = z2;
        this.f10579t = z3;
    }
}
