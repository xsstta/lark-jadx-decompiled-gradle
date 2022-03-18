package com.ss.android.lark.inno.utils;

import com.alibaba.fastjson.JSON;

/* renamed from: com.ss.android.lark.inno.utils.b */
public class C39092b {
    /* renamed from: a */
    public static final <T> T m154342a(String str, Class<T> cls) {
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
