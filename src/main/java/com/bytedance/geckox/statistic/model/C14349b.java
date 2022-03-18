package com.bytedance.geckox.statistic.model;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.bytedance.geckox.statistic.model.b */
public class C14349b {

    /* renamed from: a */
    public String f37705a;

    /* renamed from: b */
    public String f37706b;

    /* renamed from: c */
    public String f37707c;

    /* renamed from: d */
    public String f37708d;

    /* renamed from: e */
    public String f37709e;

    /* renamed from: f */
    public String f37710f;

    /* renamed from: g */
    public int f37711g;

    /* renamed from: h */
    public int f37712h = 1;

    /* renamed from: i */
    public int f37713i;

    /* renamed from: j */
    public int f37714j;

    /* renamed from: k */
    public int f37715k;

    /* renamed from: l */
    public String f37716l;

    /* renamed from: m */
    public long f37717m = -1;

    /* renamed from: n */
    public long f37718n = -1;

    /* renamed from: o */
    public int f37719o = -1;

    /* renamed from: a */
    public static String m57797a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
