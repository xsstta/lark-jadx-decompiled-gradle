package com.ss.android.ad.splash.core.model;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.r */
public class C27352r {

    /* renamed from: a */
    private Map<String, int[][]> f68278a = new HashMap();

    /* renamed from: a */
    public Map<String, int[][]> mo97590a() {
        return this.f68278a;
    }

    private C27352r() {
    }

    /* renamed from: a */
    public static C27352r m99622a(String str) {
        JSONObject jSONObject;
        C27352r rVar = new C27352r();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            rVar.f68278a = m99623a(jSONObject);
        }
        return rVar;
    }

    /* renamed from: a */
    private static Map<String, int[][]> m99623a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                    hashMap.put(next, m99624a(optJSONArray));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static int[][] m99624a(JSONArray jSONArray) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 0, 0);
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length;
            iArr = (int[][]) Array.newInstance(int.class, iArr2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                if (optJSONArray != null && optJSONArray.length() >= 2) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        iArr[i][i2] = optJSONArray.optInt(i2);
                    }
                }
            }
        }
        return iArr;
    }
}
