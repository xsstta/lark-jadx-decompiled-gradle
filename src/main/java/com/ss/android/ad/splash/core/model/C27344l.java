package com.ss.android.ad.splash.core.model;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.l */
public class C27344l {

    /* renamed from: a */
    private String f68239a;

    /* renamed from: b */
    private int f68240b;

    /* renamed from: c */
    private int f68241c;

    /* renamed from: d */
    private String f68242d;

    /* renamed from: e */
    private String f68243e;

    /* renamed from: f */
    private String f68244f;

    /* renamed from: g */
    private boolean f68245g;

    /* renamed from: h */
    private int f68246h;

    /* renamed from: i */
    private int f68247i;

    /* renamed from: a */
    public int mo97555a() {
        return this.f68240b;
    }

    /* renamed from: b */
    public int mo97557b() {
        return this.f68241c;
    }

    /* renamed from: c */
    public String mo97558c() {
        return this.f68239a;
    }

    /* renamed from: d */
    public String mo97559d() {
        return this.f68243e;
    }

    /* renamed from: e */
    public String mo97560e() {
        return this.f68244f;
    }

    /* renamed from: f */
    public String mo97561f() {
        return this.f68242d;
    }

    /* renamed from: g */
    public boolean mo97562g() {
        return this.f68245g;
    }

    /* renamed from: h */
    public int mo97563h() {
        return this.f68246h;
    }

    /* renamed from: a */
    public boolean mo97556a(int i) {
        if ((i & this.f68247i) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C27344l m99585a(JSONObject jSONObject) {
        C27344l lVar = new C27344l();
        if (jSONObject != null) {
            lVar.f68239a = jSONObject.optString("countdown_unit", "");
            lVar.f68240b = jSONObject.optInt("height_extra_size");
            lVar.f68241c = jSONObject.optInt("width_extra_size");
            lVar.f68242d = jSONObject.optString("text_color");
            lVar.f68243e = jSONObject.optString("background_color");
            lVar.f68244f = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            lVar.f68245g = z;
            lVar.f68246h = jSONObject.optInt("show_skip_seconds", 0);
            lVar.f68247i = jSONObject.optInt("button_extra_style", 0);
        }
        return lVar;
    }
}
