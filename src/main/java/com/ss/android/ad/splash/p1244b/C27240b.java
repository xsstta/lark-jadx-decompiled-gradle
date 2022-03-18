package com.ss.android.ad.splash.p1244b;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.b */
public class C27240b {

    /* renamed from: a */
    private static volatile C27240b f67774a;

    /* renamed from: b */
    private volatile long f67775b;

    /* renamed from: c */
    private volatile boolean f67776c = true;

    /* renamed from: d */
    private volatile long f67777d;

    /* renamed from: c */
    public void mo97135c() {
        this.f67776c = false;
    }

    /* renamed from: d */
    public boolean mo97136d() {
        return this.f67776c;
    }

    private C27240b() {
    }

    /* renamed from: b */
    public void mo97134b() {
        this.f67775b = System.currentTimeMillis();
        this.f67776c = true;
    }

    /* renamed from: e */
    public void mo97137e() {
        this.f67777d = System.currentTimeMillis();
        m99007g();
    }

    /* renamed from: a */
    public static C27240b m99006a() {
        if (f67774a == null) {
            synchronized (C27240b.class) {
                if (f67774a == null) {
                    f67774a = new C27240b();
                }
            }
        }
        return f67774a;
    }

    /* renamed from: g */
    private void m99007g() {
        if (m99006a().mo97136d()) {
            try {
                long j = this.f67777d - this.f67775b;
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("duration_init_to_show_ad", Long.valueOf(j));
                    C27234a.m98988a().mo97123a("service_init_to_show_ad", jSONObject, (JSONObject) null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public void mo97138f() {
        long currentTimeMillis = System.currentTimeMillis() - this.f67777d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            C27234a.m98988a().mo97123a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97132a(int i) {
        C27234a.m98988a().mo97121a("service_splash_ad_show_result", i, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo97133a(Integer num, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_video_play_error_msg", str);
            C27234a.m98988a().mo97121a("service_video_play_error", num.intValue(), jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
