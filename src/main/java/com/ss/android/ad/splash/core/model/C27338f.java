package com.ss.android.ad.splash.core.model;

import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.f */
public class C27338f {

    /* renamed from: a */
    private List<String> f68219a;

    /* renamed from: b */
    private int f68220b;

    /* renamed from: c */
    private int f68221c;

    /* renamed from: d */
    private String f68222d;

    /* renamed from: e */
    private String f68223e;

    /* renamed from: a */
    public List<String> mo97534a() {
        return this.f68219a;
    }

    /* renamed from: b */
    public int mo97535b() {
        return this.f68221c;
    }

    /* renamed from: c */
    public String mo97536c() {
        return this.f68222d;
    }

    /* renamed from: d */
    public String mo97537d() {
        return this.f68223e;
    }

    /* renamed from: e */
    public boolean mo97538e() {
        if (this.f68220b <= 0 || this.f68221c <= 0 || C27476f.m100322a(this.f68219a) || C27480i.m100385a(this.f68222d)) {
            return false;
        }
        String str = this.f68219a.get(0);
        if (C27480i.m100385a(str) && this.f68219a.size() >= 2) {
            str = this.f68219a.get(1);
            if (C27480i.m100385a(str) && this.f68219a.size() >= 3) {
                str = this.f68219a.get(2);
            }
        }
        return !C27480i.m100385a(str);
    }

    /* renamed from: a */
    public static C27338f m99561a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!C27480i.m100385a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        String optString3 = jSONObject.optString("secret_key");
        if (C27480i.m100385a(optString2)) {
            return null;
        }
        return new C27338f(arrayList, optInt, optInt2, optString2, optString3);
    }

    private C27338f(List<String> list, int i, int i2, String str, String str2) {
        this.f68219a = list;
        this.f68220b = i;
        this.f68221c = i2;
        this.f68222d = str;
        this.f68223e = str2;
    }
}
