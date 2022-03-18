package com.bytedance.ee.appstrategy.p240a;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.appstrategy.a.c */
public class C4145c {

    /* renamed from: a */
    public String f12599a;

    /* renamed from: b */
    public String f12600b;

    /* renamed from: c */
    public String f12601c;

    /* renamed from: d */
    public String f12602d;

    /* renamed from: e */
    public List<C4148f> f12603e;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("id", this.f12599a);
            jSONObject.putOpt("name", this.f12600b);
            jSONObject.putOpt("title", this.f12601c);
            jSONObject.putOpt("content", this.f12602d);
            List<C4148f> list = this.f12603e;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (C4148f fVar : this.f12603e) {
                    jSONArray.put(fVar.toString());
                }
                jSONObject.putOpt("buttons", jSONArray);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.m165384e("DialogData", "dialog data to string", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C4145c m17243a(JSONObject jSONObject) {
        ArrayList arrayList = null;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("name");
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("content");
        JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString5 = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString5)) {
                    try {
                        C4148f a = C4148f.m17249a(new JSONObject(optString5));
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } catch (JSONException e) {
                        Log.m165384e("DialogData", "dialog data from string btn", e);
                    }
                }
            }
        }
        return new C4145c(optString, optString2, optString3, optString4, arrayList);
    }

    public C4145c(String str, String str2, String str3, String str4, List<C4148f> list) {
        this.f12599a = str;
        this.f12600b = str2;
        this.f12601c = str3;
        this.f12602d = str4;
        this.f12603e = list;
    }
}
