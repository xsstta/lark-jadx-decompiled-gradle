package com.bytedance.crash.p218b;

import com.bytedance.crash.util.C3955q;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.f */
class C3702f {

    /* renamed from: A */
    private int f11399A = -1;

    /* renamed from: B */
    private final long f11400B = 100;

    /* renamed from: a */
    private float f11401a;

    /* renamed from: b */
    private float f11402b;

    /* renamed from: c */
    private float f11403c;

    /* renamed from: d */
    private float f11404d;

    /* renamed from: e */
    private float f11405e;

    /* renamed from: f */
    private float f11406f;

    /* renamed from: g */
    private float f11407g;

    /* renamed from: h */
    private float f11408h;

    /* renamed from: i */
    private float f11409i;

    /* renamed from: j */
    private float f11410j;

    /* renamed from: k */
    private float f11411k;

    /* renamed from: l */
    private float f11412l;

    /* renamed from: m */
    private float f11413m;

    /* renamed from: n */
    private float f11414n;

    /* renamed from: o */
    private float f11415o;

    /* renamed from: p */
    private String f11416p;

    /* renamed from: q */
    private String f11417q;

    /* renamed from: r */
    private int f11418r = -1;

    /* renamed from: s */
    private JSONArray f11419s;

    /* renamed from: t */
    private JSONObject f11420t;

    /* renamed from: u */
    private JSONObject f11421u;

    /* renamed from: v */
    private JSONObject f11422v;

    /* renamed from: w */
    private JSONObject f11423w;

    /* renamed from: x */
    private JSONArray f11424x;

    /* renamed from: y */
    private float f11425y;

    /* renamed from: z */
    private final int f11426z = 1000;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Float mo15124b() {
        return Float.valueOf(this.f11403c);
    }

    /* renamed from: c */
    public String mo15128c() {
        String str = this.f11417q;
        if (str != null) {
            return str;
        }
        return "";
    }

    C3702f() {
    }

    /* renamed from: d */
    public void mo15131d() {
        this.f11403c = BitmapDescriptorFactory.HUE_RED;
        this.f11401a = BitmapDescriptorFactory.HUE_RED;
        this.f11402b = BitmapDescriptorFactory.HUE_RED;
        this.f11403c = BitmapDescriptorFactory.HUE_RED;
        this.f11404d = BitmapDescriptorFactory.HUE_RED;
        this.f11405e = BitmapDescriptorFactory.HUE_RED;
        this.f11406f = BitmapDescriptorFactory.HUE_RED;
        this.f11407g = BitmapDescriptorFactory.HUE_RED;
        this.f11408h = BitmapDescriptorFactory.HUE_RED;
        this.f11418r = -1;
        this.f11417q = null;
        this.f11419s = null;
        this.f11420t = null;
        this.f11421u = null;
        this.f11423w = null;
        this.f11424x = null;
        this.f11425y = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public JSONObject mo15116a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("kswapd", (double) this.f11401a);
            jSONObject2.put("mmcqd", (double) this.f11402b);
            jSONObject2.put("kwork", (double) this.f11403c);
            jSONObject2.put("system_server", (double) this.f11404d);
            jSONObject2.put("lmkd", (double) this.f11405e);
            jSONObject2.put("user", (double) this.f11406f);
            jSONObject2.put("sys", (double) this.f11407g);
            jSONObject2.put("iowait", (double) this.f11408h);
            jSONObject2.put("minor", (double) this.f11409i);
            jSONObject2.put("major", (double) this.f11410j);
            jSONObject2.put("user2", (double) this.f11411k);
            jSONObject2.put("sys2", (double) this.f11412l);
            jSONObject2.put("iowait2", (double) this.f11413m);
            jSONObject2.put("minor2", (double) this.f11414n);
            jSONObject2.put("major2", (double) this.f11415o);
            jSONObject2.put("process_name", this.f11416p);
            jSONObject2.put("top_cpu_process_name", this.f11417q);
            jSONObject2.put("top_cpu_process_is_anrapp", this.f11418r);
            jSONObject2.put("load", this.f11419s);
            jSONObject2.put("before_cpu_list", this.f11420t);
            jSONObject2.put("after_cpu_list", this.f11421u);
            jSONObject2.put("cpu_thread_list", this.f11423w);
            jSONObject2.put("dex2oat", this.f11424x);
            jSONObject2.put("main_thread_cpu", (double) this.f11425y);
            jSONObject.put("cpu", jSONObject2);
        } catch (Throwable unused) {
        }
        mo15131d();
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15132d(Float f) {
        this.f11404d = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15133e(Float f) {
        this.f11405e = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15129c(Float f) {
        this.f11401a = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15126b(Float f) {
        this.f11402b = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15119a(Float f) {
        this.f11403c += f.floatValue();
    }

    /* renamed from: a */
    public void mo15122a(String str, String str2) {
        this.f11416p = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15118a(int i, Float f) {
        if (this.f11424x == null) {
            this.f11424x = new JSONArray();
        }
        this.f11424x.put(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15127b(String str, int i, Float f) {
        if (this.f11422v == null) {
            this.f11422v = new JSONObject();
        }
        try {
            this.f11422v.put(String.valueOf(i), new JSONObject().put("process_name", str).put("cpu", f));
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15130c(String str, int i, Float f) {
        if (this.f11420t == null) {
            this.f11420t = new JSONObject();
        }
        if (this.f11418r == -1) {
            this.f11418r = str.equals(this.f11416p) ? 1 : 0;
            this.f11417q = str;
        }
        C3955q.m16447a(this.f11420t, String.valueOf(i), C3955q.m16447a(C3955q.m16447a(new JSONObject(), "process_name", str), "cpu", f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15120a(Float f, Float f2, Float f3) {
        JSONArray jSONArray = new JSONArray();
        this.f11419s = jSONArray;
        jSONArray.put(f);
        this.f11419s.put(f2);
        this.f11419s.put(f3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15121a(String str, int i, Float f) {
        if (this.f11421u == null) {
            this.f11421u = new JSONObject();
        }
        if (this.f11418r == -1) {
            this.f11418r = str.equals(this.f11416p) ? 1 : 0;
            this.f11417q = str;
        }
        C3955q.m16447a(this.f11421u, String.valueOf(i), C3955q.m16447a(C3955q.m16447a(new JSONObject(), "process_name", str), "cpu", f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15117a(float f, float f2, float f3, float f4, float f5) {
        this.f11406f = f;
        this.f11407g = f2;
        this.f11408h = f3;
        this.f11409i = f4;
        this.f11410j = f5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15125b(float f, float f2, float f3, float f4, float f5) {
        this.f11411k = f;
        this.f11412l = f2;
        this.f11413m = f3;
        this.f11414n = f4;
        this.f11415o = f5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15123a(String str, String str2, int i, int i2, int i3, long j, long j2, long j3) {
        if (this.f11423w == null) {
            this.f11423w = new JSONObject();
        }
        if ("main".equals(str2)) {
            this.f11425y = (float) i2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str2);
            jSONObject.put("cpu", i2);
            jSONObject.put("nice", i3);
            jSONObject.put("runTime", j);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, j2);
            jSONObject.put("switchCount", j3);
            this.f11423w.put(String.valueOf(i), jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
