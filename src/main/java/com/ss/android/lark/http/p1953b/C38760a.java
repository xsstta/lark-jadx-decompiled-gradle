package com.ss.android.lark.http.p1953b;

import com.alibaba.fastjson.JSON;

/* renamed from: com.ss.android.lark.http.b.a */
public class C38760a {
    /* renamed from: a */
    public static String m153057a(Object obj) {
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
    public static final <T> T m153056a(String str, Class<T> cls) {
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
