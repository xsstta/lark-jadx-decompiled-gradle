package com.bytedance.apm.battery.p131b;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.b.b */
public class C2807b {

    /* renamed from: A */
    private long f8957A;

    /* renamed from: a */
    private long f8958a;

    /* renamed from: b */
    private long f8959b;

    /* renamed from: c */
    private long f8960c;

    /* renamed from: d */
    private long f8961d;

    /* renamed from: e */
    private long f8962e;

    /* renamed from: f */
    private long f8963f;

    /* renamed from: g */
    private long f8964g;

    /* renamed from: h */
    private long f8965h;

    /* renamed from: i */
    private long f8966i;

    /* renamed from: j */
    private long f8967j;

    /* renamed from: k */
    private long f8968k;

    /* renamed from: l */
    private long f8969l;

    /* renamed from: m */
    private boolean f8970m = true;

    /* renamed from: n */
    private String f8971n;

    /* renamed from: o */
    private String f8972o;

    /* renamed from: p */
    private long f8973p;

    /* renamed from: q */
    private long f8974q;

    /* renamed from: r */
    private int f8975r;

    /* renamed from: s */
    private int f8976s;

    /* renamed from: t */
    private int f8977t;

    /* renamed from: u */
    private int f8978u;

    /* renamed from: v */
    private long f8979v;

    /* renamed from: w */
    private int f8980w;

    /* renamed from: x */
    private int f8981x;

    /* renamed from: y */
    private int f8982y;

    /* renamed from: z */
    private int f8983z;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo12153d() {
        if (this.f8958a > 60000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo12155e() {
        if (this.f8959b > 5000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo12144a() {
        return this.f8970m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12145b() {
        this.f8958a = 0;
        this.f8959b = 0;
        this.f8960c = 0;
        this.f8961d = 0;
        this.f8962e = 0;
        this.f8963f = 0;
        this.f8964g = 0;
        this.f8965h = 0;
        this.f8966i = 0;
        this.f8967j = 0;
        this.f8968k = 0;
        this.f8969l = 0;
        this.f8970m = true;
        this.f8971n = "";
        this.f8972o = "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12150c() {
        this.f8963f = (long) this.f8975r;
        this.f8960c = (long) this.f8978u;
        this.f8961d = (long) this.f8976s;
        this.f8964g = this.f8979v;
        this.f8962e = (long) this.f8977t;
        this.f8958a = this.f8973p;
        this.f8968k = (long) this.f8980w;
        this.f8965h = (long) this.f8983z;
        this.f8966i = (long) this.f8981x;
        this.f8969l = this.f8957A;
        this.f8967j = (long) this.f8982y;
        this.f8959b = this.f8974q;
        this.f8970m = false;
        this.f8971n = "all_process";
        try {
            mo12148b(false);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12142a(String str) {
        this.f8971n = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12147b(String str) {
        this.f8972o = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12141a(long j) {
        this.f8959b += j;
    }

    /* renamed from: b */
    public void mo12146b(long j) {
        this.f8965h += j;
    }

    /* renamed from: c */
    public void mo12151c(long j) {
        this.f8967j += j;
    }

    /* renamed from: d */
    public void mo12152d(long j) {
        this.f8969l += j;
    }

    /* renamed from: e */
    public void mo12154e(long j) {
        this.f8968k += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12156f(long j) {
        this.f8958a += j;
    }

    /* renamed from: g */
    public void mo12157g(long j) {
        this.f8960c += j;
    }

    /* renamed from: h */
    public void mo12158h(long j) {
        this.f8962e += j;
    }

    /* renamed from: i */
    public void mo12159i(long j) {
        this.f8964g += j;
    }

    /* renamed from: j */
    public void mo12160j(long j) {
        this.f8963f += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12143a(boolean z) {
        this.f8970m = z;
    }

    /* renamed from: d */
    private boolean m11857d(boolean z) throws Exception {
        JSONObject c = mo12149c(z);
        if (c == null || c.length() <= 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_main_process", this.f8970m);
        jSONObject.put("process_name", this.f8971n);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sid", this.f8972o);
        C2741a.m11630c().mo11785a(new C2753f("battery", "", c, jSONObject, jSONObject2));
        if (C2785b.m11769j()) {
            String str = C2922b.f9427b;
            C2925e.m12374c(str, "stats report, processName: " + this.f8971n);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo12148b(boolean z) throws Exception {
        boolean d = m11857d(z);
        if (!d && C2785b.m11769j()) {
            String str = C2922b.f9427b;
            C2925e.m12374c(str, "stats report failed, processName: " + this.f8971n);
        }
        mo12145b();
        return d;
    }

    /* renamed from: c */
    public JSONObject mo12149c(boolean z) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (mo12153d()) {
            jSONObject.put("front_alarm", this.f8963f);
            jSONObject.put("front_loc_p_time", this.f8961d / 1000);
            jSONObject.put("front_power_p_time", this.f8962e / 1000);
            long j = this.f8960c;
            if (j < 0) {
                if (C2785b.m11769j()) {
                    String str = C2922b.f9427b;
                    C2925e.m12373b(str, " report data invalid, frontCpuMs < 0 : " + this.f8960c);
                }
                return null;
            }
            jSONObject.put("front_cpu_active_time_p_time", j / 1000);
            long j2 = this.f8964g;
            if (j2 < 0) {
                if (C2785b.m11769j()) {
                    String str2 = C2922b.f9427b;
                    C2925e.m12374c(str2, " report data invalid, mFrontTrafficBytes < 0 : " + this.f8964g);
                }
                return null;
            }
            if (!z) {
                jSONObject.put("front_traffic_p_capacity", j2 / 1024);
            }
            double d = (((double) this.f8963f) * 0.002083333383779973d) + (((double) this.f8960c) * 6.944444612599909E-5d) + (((double) this.f8961d) * 7.499999810534064E-6d) + (((double) this.f8962e) * 6.944444521650439E-6d);
            if (!z) {
                d += ((double) this.f8964g) * 5.464481073431671E-4d;
            }
            if (d < 0.0d) {
                if (C2785b.m11769j()) {
                    String str3 = C2922b.f9427b;
                    C2925e.m12373b(str3, " report data invalid, frontScore < 0 : " + d);
                }
                return null;
            }
            jSONObject.put("front_score", d);
            jSONObject.put("front_p_time", this.f8958a / 1000);
            float f = 60000.0f / ((float) this.f8958a);
            jSONObject.put("front_alarm_per_min", (double) (((float) this.f8963f) * f));
            jSONObject.put("front_loc_per_min_p_time", (double) ((((float) this.f8961d) / 1000.0f) * f));
            jSONObject.put("front_power_per_min_p_time", (double) ((((float) this.f8962e) / 1000.0f) * f));
            jSONObject.put("front_cpu_active_time_per_min_p_time", (double) ((((float) this.f8960c) / 1000.0f) * f));
            if (!z) {
                jSONObject.put("front_traffic_per_min_p_capacity", (double) ((((float) this.f8964g) / 1024.0f) * f));
            }
            jSONObject.put("front_score_per_min", d * ((double) f));
            if (z) {
                this.f8975r = (int) (((long) this.f8975r) + this.f8963f);
                this.f8978u = (int) (((long) this.f8978u) + this.f8960c);
                this.f8976s = (int) (((long) this.f8976s) + this.f8961d);
                this.f8977t = (int) (((long) this.f8977t) + this.f8962e);
                boolean z2 = this.f8970m;
                if (z2) {
                    this.f8979v = this.f8964g;
                }
                if (z2) {
                    this.f8973p = this.f8958a;
                }
            }
        }
        if (mo12155e()) {
            jSONObject.put("back_alarm", this.f8968k);
            jSONObject.put("back_loc_p_time", this.f8966i / 1000);
            jSONObject.put("back_power_p_time", this.f8967j / 1000);
            long j3 = this.f8965h;
            if (j3 < 0) {
                if (C2785b.m11769j()) {
                    String str4 = C2922b.f9427b;
                    C2925e.m12373b(str4, " report data invalid, mBackCpuMs < 0 : " + this.f8965h);
                }
                return null;
            }
            jSONObject.put("back_cpu_active_time_p_time", j3 / 1000);
            long j4 = this.f8969l;
            if (j4 < 0) {
                if (C2785b.m11769j()) {
                    String str5 = C2922b.f9427b;
                    C2925e.m12373b(str5, " report data invalid, mBackTrafficBytes < 0 : " + this.f8969l);
                }
                return null;
            }
            if (!z) {
                jSONObject.put("back_traffic_p_capacity", j4 / 1024);
            }
            double d2 = (((double) this.f8968k) * 0.002083333383779973d) + (((double) this.f8965h) * 6.944444612599909E-5d) + (((double) this.f8966i) * 7.499999810534064E-6d) + (((double) this.f8967j) * 6.944444521650439E-6d);
            if (!z) {
                d2 += ((double) this.f8969l) * 5.464481073431671E-4d;
            }
            jSONObject.put("back_score", d2);
            jSONObject.put("back_p_time", this.f8959b / 1000);
            float f2 = 60000.0f / ((float) this.f8959b);
            jSONObject.put("back_alarm_per_min", (double) (((float) this.f8968k) * f2));
            jSONObject.put("back_loc_per_min_p_time", (double) ((((float) this.f8966i) / 1000.0f) * f2));
            jSONObject.put("back_power_per_min_p_time", (double) ((((float) this.f8967j) / 1000.0f) * f2));
            jSONObject.put("back_cpu_active_time_per_min_p_time", (double) ((((float) this.f8965h) / 1000.0f) * f2));
            if (!z) {
                jSONObject.put("back_traffic_per_min_p_capacity", (double) ((((float) this.f8969l) / 1024.0f) * f2));
            }
            jSONObject.put("back_score_per_min", d2 * ((double) f2));
            if (z) {
                this.f8980w = (int) (((long) this.f8980w) + this.f8968k);
                this.f8983z = (int) (((long) this.f8983z) + this.f8965h);
                this.f8981x = (int) (((long) this.f8981x) + this.f8966i);
                this.f8982y = (int) (((long) this.f8982y) + this.f8967j);
                if (this.f8970m) {
                    this.f8957A = this.f8969l;
                }
                long j5 = this.f8959b;
                if (j5 > this.f8974q) {
                    this.f8974q = j5;
                }
            }
        }
        return jSONObject;
    }
}
