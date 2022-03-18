package com.bytedance.ee.bear.middleground.permission.p464c;

import com.bytedance.ee.log.C13479a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.permission.c.b */
final class C9591b {
    /* renamed from: a */
    static Map<String, String> m39726a(Object obj) {
        HashMap hashMap = new HashMap();
        if (obj == null) {
            return hashMap;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                hashMap.put(field.getName(), String.valueOf(field.get(obj)));
            }
        } catch (Exception e) {
            C13479a.m54759a("BasePuller", "parse obj to map fail. ", e);
        }
        return hashMap;
    }
}
