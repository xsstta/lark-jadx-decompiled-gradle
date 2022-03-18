package com.bytedance.vcloud.networkpredictor;

import org.json.JSONObject;

/* renamed from: com.bytedance.vcloud.networkpredictor.m */
public class C20900m {

    /* renamed from: a */
    private int f51151a;

    /* renamed from: b */
    private long f51152b;

    /* renamed from: c */
    private long f51153c;

    /* renamed from: d */
    private long f51154d;

    /* renamed from: e */
    private String f51155e;

    /* renamed from: f */
    private String f51156f;

    /* renamed from: g */
    private long f51157g;

    /* renamed from: h */
    private long f51158h;

    /* renamed from: i */
    private String f51159i;

    /* renamed from: a */
    public void mo70612a(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            this.f51151a = jSONObject.optInt("trackType");
            this.f51152b = jSONObject.optLong("size");
            this.f51153c = jSONObject.optLong("costTime");
            this.f51154d = jSONObject.optLong("timestamp");
            this.f51155e = jSONObject.optString("loadType");
            this.f51156f = jSONObject.optString("host");
            this.f51157g = jSONObject.optLong("rtt");
            this.f51158h = jSONObject.optLong("last_data_recv");
            this.f51159i = jSONObject.optString("protocol");
        }
    }
}
