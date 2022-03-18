package com.bytedance.ee.appstrategy.p240a;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.appstrategy.a.a */
public class C4143a {
    /* renamed from: a */
    public static HashMap<String, Serializable> m17242a(int i, String str, long j, long j2, long j3, String str2, String str3, String str4, boolean z, String str5) {
        HashMap<String, Serializable> hashMap = new HashMap<>(9);
        hashMap.put("code", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("domain", str);
        }
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("rust_sdk_duration", Long.valueOf(j2));
        hashMap.put("double_check_duration", Long.valueOf(j3));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("error_msg", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("app_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("feature_type", str4);
        }
        hashMap.put("is_null", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("data_from", str5);
        }
        return hashMap;
    }
}
