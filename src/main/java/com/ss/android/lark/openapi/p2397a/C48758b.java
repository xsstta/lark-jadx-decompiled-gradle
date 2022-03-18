package com.ss.android.lark.openapi.p2397a;

import com.alibaba.fastjson.JSON;

/* renamed from: com.ss.android.lark.openapi.a.b */
public class C48758b {
    /* renamed from: a */
    public static String m192085a(Object obj) {
        if (obj == null) {
            return "{}";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable unused) {
            return "{}";
        }
    }

    /* renamed from: a */
    public static final <T> T m192084a(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
