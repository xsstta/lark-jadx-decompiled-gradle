package com.bytedance.ee.bear.wiki.common.p579a;

import android.text.TextUtils;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.wiki.common.a.b */
public final class C11931b {
    /* renamed from: a */
    public static Map<String, String> m49469a(Object obj) throws Exception {
        HashMap hashMap = new HashMap();
        if (obj == null) {
            return hashMap;
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            hashMap.put(field.getName(), String.valueOf(field.get(obj)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m49468a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m49470a(K k, V v) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(k, v);
        return arrayMap;
    }

    /* renamed from: a */
    public static int m49467a(int i, int i2, int i3) {
        if (i2 > i3) {
            return -1;
        }
        return Math.min(Math.max(i, i2), i3);
    }
}
