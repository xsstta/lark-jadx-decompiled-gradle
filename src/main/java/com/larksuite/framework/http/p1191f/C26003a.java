package com.larksuite.framework.http.p1191f;

import com.alibaba.fastjson.JSON;

/* renamed from: com.larksuite.framework.http.f.a */
public class C26003a {
    /* renamed from: a */
    public static String m94121a(Object obj) {
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
    public static final <T> T m94120a(String str, Class<T> cls) {
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
