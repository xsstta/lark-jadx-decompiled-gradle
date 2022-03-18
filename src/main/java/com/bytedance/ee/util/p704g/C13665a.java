package com.bytedance.ee.util.p704g;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.g.a */
public class C13665a {
    /* renamed from: a */
    public static <T> String m55439a(T t) {
        if (t == null) {
            return "";
        }
        if (t instanceof JSONObject) {
            return t.toString();
        }
        return JSON.toJSONString(t);
    }

    /* renamed from: b */
    public static <T> JSONObject m55442b(T t) {
        String a = m55439a((Object) t);
        if (TextUtils.isEmpty(a)) {
            return new JSONObject();
        }
        return JSON.parseObject(a);
    }

    /* renamed from: a */
    private static String m55440a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new NullPointerException("function name must not be null");
        } else if (!str.contains("(") && !str.contains(")")) {
            return str;
        } else {
            throw new IllegalArgumentException("function name can't contain brackets");
        }
    }

    /* renamed from: a */
    public static <T> String m55441a(String str, T t) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return String.format("%s(%s)", m55440a(str), m55439a((Object) t)).replaceAll("\n", "\\\\n");
            }
            throw new IllegalArgumentException("js func empty !");
        } catch (Exception e) {
            C13479a.m54759a("JsonUtils", "Combine requested contents fail : ", e);
            return null;
        }
    }
}
