package com.ss.android.ad.splash.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.n */
public class C27347n {

    /* renamed from: a */
    private List<C27348a> f68259a;

    private C27347n(List<C27348a> list) {
        this.f68259a = list;
    }

    /* renamed from: com.ss.android.ad.splash.core.model.n$a */
    public static class C27348a {

        /* renamed from: a */
        private String f68260a;

        /* renamed from: b */
        private String f68261b;

        /* renamed from: c */
        private String f68262c;

        /* renamed from: a */
        public static C27348a m99603a(JSONObject jSONObject) {
            String optString = jSONObject.optString("vendorKey");
            String optString2 = jSONObject.optString("javaScriptResourceUrl");
            String optString3 = jSONObject.optString("verificationParameters");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                return null;
            }
            return new C27348a(optString, optString2, optString3);
        }

        private C27348a(String str, String str2, String str3) {
            this.f68260a = str;
            this.f68261b = str2;
            this.f68262c = str3;
        }
    }

    /* renamed from: a */
    public static C27347n m99602a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        C27348a a;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("vast")) == null || (optJSONArray = optJSONObject.optJSONArray("adVerifications")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (!(optJSONObject2 == null || (a = C27348a.m99603a(optJSONObject2)) == null)) {
                arrayList.add(a);
            }
        }
        return new C27347n(arrayList);
    }
}
