package com.bytedance.ee.appstrategy;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.appstrategy.b */
public class C4149b {

    /* renamed from: a */
    public String f12607a;

    /* renamed from: b */
    public String f12608b;

    /* renamed from: c */
    public ArrayList<C4150a> f12609c = new ArrayList<>(2);

    /* renamed from: d */
    public String f12610d;

    public C4149b() {
    }

    /* renamed from: com.bytedance.ee.appstrategy.b$a */
    public static class C4150a {

        /* renamed from: a */
        public String f12611a;

        /* renamed from: b */
        public int f12612b;

        /* renamed from: c */
        public String f12613c;

        /* renamed from: d */
        public String f12614d;

        /* renamed from: e */
        public String f12615e;

        /* renamed from: f */
        public boolean f12616f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public JSONObject mo16253a() {
            JSONObject jSONObject = null;
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("text", this.f12611a);
                    jSONObject2.put("code", this.f12612b);
                    jSONObject2.put("extraAdminId", this.f12613c);
                    jSONObject2.put("extraParams", this.f12614d);
                    jSONObject2.put("extraUrl", this.f12615e);
                    jSONObject2.put("should_close_mini_app", this.f12616f);
                    return jSONObject2;
                } catch (JSONException unused) {
                    jSONObject = jSONObject2;
                }
            } catch (JSONException unused2) {
                return jSONObject;
            }
        }

        /* renamed from: a */
        static C4150a m17253a(JSONObject jSONObject) {
            C4150a aVar = new C4150a();
            aVar.f12611a = jSONObject.optString("text");
            aVar.f12612b = jSONObject.optInt("code", -1);
            aVar.f12613c = jSONObject.optString("extraAdminId");
            aVar.f12614d = jSONObject.optString("extraParams");
            aVar.f12615e = jSONObject.optString("extraUrl");
            aVar.f12616f = jSONObject.optBoolean("should_close_mini_app", false);
            return aVar;
        }
    }

    /* renamed from: a */
    public String mo16252a() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("title", this.f12607a);
                jSONObject.put("msg", this.f12608b);
                jSONObject.put("appName", this.f12610d);
                JSONArray jSONArray = new JSONArray();
                Iterator<C4150a> it = this.f12609c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mo16253a());
                }
                jSONObject.put("actions", jSONArray);
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
                jSONObject = jSONObject2;
                return jSONObject.toString();
            }
        } catch (JSONException unused2) {
            jSONObject = jSONObject2;
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C4149b m17250a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C4149b bVar = new C4149b();
            bVar.f12607a = jSONObject.optString("title");
            bVar.f12608b = jSONObject.optString("msg");
            bVar.f12610d = jSONObject.optString("appName");
            JSONArray jSONArray = jSONObject.getJSONArray("actions");
            for (int i = 0; i < jSONArray.length(); i++) {
                bVar.f12609c.add(C4150a.m17253a(jSONArray.getJSONObject(i)));
            }
            return bVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C4149b(String str, String str2, ArrayList<C4150a> arrayList, String str3) {
        this.f12607a = str;
        this.f12608b = str2;
        this.f12609c = arrayList;
        this.f12610d = str3;
    }

    /* renamed from: a */
    public static C4149b m17251a(String str, String str2, ArrayList<C4150a> arrayList, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || arrayList == null) {
            return null;
        }
        return new C4149b(str, str2, arrayList, str3);
    }
}
