package com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a;

import com.ss.android.lark.mail.impl.p2171h.C42226b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.a.k */
public class C42244k extends AbstractC42235a {

    /* renamed from: l */
    private static final String[] f107536l = {"start", "key_native_start", "key_native_done", "key_finish"};

    /* renamed from: c */
    private boolean f107537c;

    /* renamed from: d */
    private boolean f107538d;

    /* renamed from: e */
    private long f107539e;

    /* renamed from: f */
    private boolean f107540f;

    /* renamed from: g */
    private int f107541g;

    /* renamed from: h */
    private String f107542h = "";

    /* renamed from: i */
    private long f107543i;

    /* renamed from: j */
    private long f107544j;

    /* renamed from: k */
    private long f107545k;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: a */
    public String mo152338a() {
        return "MessageImageLoadDetail";
    }

    /* renamed from: f */
    public boolean mo152355f() {
        return this.f107537c;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: c */
    public void mo152342c() {
        super.mo152342c();
        mo152339a("start");
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: e */
    public void mo152344e() {
        mo152339a("key_finish");
        mo152356g();
        super.mo152344e();
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: b */
    public String[] mo152341b() {
        return f107536l;
    }

    /* renamed from: g */
    public void mo152356g() {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        int i3;
        if (!this.f107523b && this.f107522a != null) {
            long j4 = this.f107543i;
            long j5 = 0;
            if (j4 != 0) {
                long j6 = this.f107544j;
                if (j6 != 0) {
                    long j7 = j6 - j4;
                    if (this.f107537c) {
                        j3 = mo152340b("key_native_start");
                        j2 = mo152340b("key_native_done");
                        j = j3 + j2;
                    } else {
                        j3 = 0;
                        j2 = 0;
                        j = 0;
                    }
                    long j8 = this.f107545k;
                    if (j8 != 0) {
                        j5 = this.f107544j - j8;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (this.f107537c) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.putOpt("intercept", Integer.valueOf(i));
                        if (this.f107538d) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.putOpt("isCurrent", Integer.valueOf(i2));
                        jSONObject.putOpt("length", Long.valueOf(this.f107539e));
                        if (this.f107540f) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        jSONObject.putOpt("cache", Integer.valueOf(i3));
                        jSONObject.putOpt("time_cost_ms", Long.valueOf(j7));
                        jSONObject.putOpt("time_native_start", Long.valueOf(j3));
                        jSONObject.putOpt("time_native_done", Long.valueOf(j2));
                        jSONObject.putOpt("time_wait", Long.valueOf(j5));
                        jSONObject.putOpt("is_read", Integer.valueOf(this.f107541g));
                        jSONObject.putOpt("come_from", this.f107542h);
                        if (this.f107537c) {
                            jSONObject.putOpt("time_load_done", Long.valueOf(j));
                        }
                        C42226b.m168638a().mo152311b("mail_messagelist_image_wait_time_dev", jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo152348b(int i) {
        this.f107541g = i;
    }

    /* renamed from: c */
    public void mo152351c(long j) {
        this.f107544j = j;
    }

    /* renamed from: a */
    public void mo152346a(long j) {
        this.f107539e = j;
    }

    /* renamed from: b */
    public void mo152349b(long j) {
        this.f107543i = j;
    }

    /* renamed from: c */
    public void mo152352c(String str) {
        this.f107542h = str;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: a */
    public long mo152337a(int i) {
        long a = super.mo152337a(i);
        if (a == -9999) {
            return 0;
        }
        return a;
    }

    /* renamed from: b */
    public void mo152350b(boolean z) {
        this.f107538d = z;
    }

    /* renamed from: d */
    public void mo152354d(long j) {
        if (0 == this.f107545k) {
            this.f107545k = j;
        }
    }

    /* renamed from: a */
    public void mo152347a(boolean z) {
        this.f107537c = z;
    }

    /* renamed from: c */
    public void mo152353c(boolean z) {
        this.f107540f = z;
    }
}
