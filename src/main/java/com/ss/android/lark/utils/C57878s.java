package com.ss.android.lark.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/* renamed from: com.ss.android.lark.utils.s */
public class C57878s {
    /* renamed from: a */
    public static JSONObject m224589a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m224591a(Object obj) {
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
    public static final <T> T m224590a(String str, Class<T> cls) {
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
