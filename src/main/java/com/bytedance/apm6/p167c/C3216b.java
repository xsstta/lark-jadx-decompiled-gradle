package com.bytedance.apm6.p167c;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a;
import com.bytedance.apm6.util.C3355e;
import com.google.firebase.messaging.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.c.b */
public class C3216b extends AbstractC3329a {

    /* renamed from: g */
    private long f10284g;

    /* renamed from: h */
    private long f10285h;

    /* renamed from: i */
    private long f10286i;

    /* renamed from: j */
    private long f10287j;

    /* renamed from: k */
    private long f10288k;

    /* renamed from: l */
    private long f10289l;

    /* renamed from: m */
    private long f10290m;

    /* renamed from: n */
    private double f10291n;

    /* renamed from: o */
    private JSONArray f10292o;

    /* renamed from: p */
    private JSONArray f10293p;

    /* renamed from: q */
    private JSONArray f10294q;

    /* renamed from: r */
    private JSONArray f10295r;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: a */
    public String mo13323a() {
        return "disk";
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: d */
    public JSONObject mo13326d() {
        JSONObject c = C3331c.m13887a().mo13569c();
        try {
            C3355e.m13954a(c, C3331c.m13887a().mo13570d());
        } catch (Exception unused) {
        }
        return c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: c */
    public JSONObject mo13325c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", C3331c.m13887a().mo13566b());
            jSONObject.put("process_name", C3318a.m13828f());
            jSONObject.put("is_front", false);
            jSONObject.put("is_main_process", C3318a.m13827e());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: e */
    public JSONObject mo13327e() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f10295r;
            if (jSONArray != null) {
                jSONObject.put("disk_info", jSONArray);
            }
            JSONArray jSONArray2 = this.f10292o;
            if (jSONArray2 != null) {
                jSONObject.put("top_usage", jSONArray2);
            }
            JSONArray jSONArray3 = this.f10293p;
            if (jSONArray3 != null) {
                jSONObject.put("exception_folders", jSONArray3);
            }
            JSONArray jSONArray4 = this.f10294q;
            if (jSONArray4 != null) {
                jSONObject.put("outdated_files", jSONArray4);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: b */
    public JSONObject mo13324b() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j = this.f10284g;
            if (j > 0) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, j);
            }
            long j2 = this.f10285h;
            if (j2 > 0) {
                jSONObject.put("cache", j2);
            }
            long j3 = this.f10286i;
            if (j3 > 0) {
                jSONObject.put("total", j3);
            }
            long j4 = this.f10287j;
            if (j4 > 0) {
                jSONObject.put("rom_free", j4);
            }
            long j5 = this.f10288k;
            if (j5 > 0) {
                jSONObject.put("app_usage", j5);
            }
            long j6 = this.f10289l;
            if (j6 > 0) {
                jSONObject.put("total_capacity", j6);
            }
            long j7 = this.f10290m;
            if (j7 > 0) {
                jSONObject.put("free_capacity", j7);
            }
            double d = this.f10291n;
            if (d > 0.0d) {
                jSONObject.put("app_occupied_rate", d);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C3216b(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        this.f10284g = j;
        this.f10285h = j2;
        this.f10286i = j3;
        this.f10287j = j4;
        this.f10288k = j5;
        this.f10289l = j6;
        this.f10290m = j7;
        this.f10291n = d;
        this.f10292o = jSONArray;
        this.f10293p = jSONArray2;
        this.f10294q = jSONArray3;
        this.f10295r = jSONArray4;
    }
}
