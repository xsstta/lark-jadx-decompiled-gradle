package com.ss.android.lark.mm.statistics.hitpoint;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.k */
public class C47088k {
    /* renamed from: a */
    public static JSONObject m186459a(String str) {
        try {
            return JSONObject.parseObject(str);
        } catch (Exception e) {
            C45855f.m181666e("MmSafeJsonOpt", "parser: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static org.json.JSONObject m186460a(org.json.JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception e) {
            C45855f.m181666e("MmSafeJsonOpt", "parser: " + e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static org.json.JSONObject m186461a(org.json.JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            C45855f.m181666e("MmSafeJsonOpt", "parser: " + e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static org.json.JSONObject m186462a(org.json.JSONObject jSONObject, String str, String str2, String str3) {
        if (str2 == null) {
            str2 = str3;
        }
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            C45855f.m181666e("MmSafeJsonOpt", "parser: " + e.getMessage());
        }
        return jSONObject;
    }
}
