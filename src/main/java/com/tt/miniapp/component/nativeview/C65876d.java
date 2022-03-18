package com.tt.miniapp.component.nativeview;

import com.tt.miniapphost.util.C67589g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.d */
public class C65876d {

    /* renamed from: a */
    public boolean f166151a;

    /* renamed from: b */
    public String f166152b;

    /* renamed from: c */
    public boolean f166153c;

    /* renamed from: d */
    public String f166154d;

    /* renamed from: e */
    public int f166155e;

    /* renamed from: f */
    public boolean f166156f;

    /* renamed from: g */
    public int f166157g;

    /* renamed from: h */
    public int f166158h;

    /* renamed from: i */
    public int f166159i;

    /* renamed from: j */
    public int f166160j;

    /* renamed from: k */
    public int f166161k;

    /* renamed from: l */
    public String f166162l;

    /* renamed from: m */
    public String f166163m;

    /* renamed from: n */
    public int f166164n;

    /* renamed from: o */
    public int f166165o;

    /* renamed from: p */
    public boolean f166166p;

    /* renamed from: q */
    public boolean f166167q;

    /* renamed from: r */
    public boolean f166168r;

    /* renamed from: s */
    public boolean f166169s = true;

    /* renamed from: a */
    public static C65876d m258063a(String str) throws JSONException {
        C65876d dVar = new C65876d();
        JSONObject jSONObject = new JSONObject(str);
        dVar.f166155e = jSONObject.optInt("inputId");
        boolean has = jSONObject.has("placeholder");
        dVar.f166151a = has;
        if (has) {
            dVar.f166152b = jSONObject.optString("placeholder");
        }
        boolean has2 = jSONObject.has("value");
        dVar.f166153c = has2;
        if (has2) {
            dVar.f166154d = jSONObject.optString("value");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("style");
        if (optJSONObject != null) {
            dVar.f166156f = true;
            dVar.f166164n = optJSONObject.optInt("fontSize");
            int optInt = optJSONObject.optInt("width");
            dVar.f166157g = optInt;
            if (optInt > 0) {
                dVar.f166157g = C67589g.m263062a((double) optInt);
            }
            int optDouble = (int) optJSONObject.optDouble("height");
            dVar.f166158h = optDouble;
            if (optDouble > 0) {
                dVar.f166158h = C67589g.m263062a(optJSONObject.optDouble("height"));
            }
            int optInt2 = optJSONObject.optInt("left");
            dVar.f166159i = optInt2;
            if (optInt2 > 0) {
                dVar.f166159i = C67589g.m263062a((double) optInt2);
            }
            int optInt3 = optJSONObject.optInt("top");
            dVar.f166160j = optInt3;
            if (optInt3 > 0) {
                dVar.f166160j = C67589g.m263062a((double) optInt3);
            }
            int optInt4 = optJSONObject.optInt("marginBottom");
            dVar.f166161k = optInt4;
            if (optInt4 > 0) {
                dVar.f166161k = C67589g.m263062a((double) optInt4);
            }
            dVar.f166163m = optJSONObject.optString("backgroundColor");
            dVar.f166162l = optJSONObject.optString("color");
        }
        if (jSONObject.has("zIndex")) {
            dVar.f166166p = true;
            dVar.f166165o = jSONObject.optInt("zIndex");
        }
        if (jSONObject.has("fixed")) {
            dVar.f166168r = true;
            dVar.f166167q = jSONObject.optBoolean("fixed");
        }
        if (jSONObject.has("autoBlur")) {
            dVar.f166169s = jSONObject.optBoolean("autoBlur");
        }
        return dVar;
    }
}
