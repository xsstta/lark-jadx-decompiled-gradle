package com.ss.android.ad.splash.core.model;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.g */
public class C27339g {

    /* renamed from: a */
    private String f68224a;

    /* renamed from: b */
    private int f68225b;

    /* renamed from: c */
    private String f68226c;

    /* renamed from: d */
    private String f68227d;

    /* renamed from: a */
    public String mo97539a() {
        return this.f68224a;
    }

    /* renamed from: b */
    public int mo97540b() {
        return this.f68225b;
    }

    /* renamed from: c */
    public String mo97541c() {
        return this.f68226c;
    }

    /* renamed from: d */
    public String mo97542d() {
        return this.f68227d;
    }

    /* renamed from: a */
    public static C27339g m99567a(JSONObject jSONObject) {
        C27339g gVar = new C27339g();
        if (jSONObject != null) {
            gVar.f68224a = jSONObject.optString("background_color");
            gVar.f68225b = jSONObject.optInt("position");
            gVar.f68226c = jSONObject.optString("text_color");
            gVar.f68227d = jSONObject.optString("text");
        }
        return gVar;
    }
}
