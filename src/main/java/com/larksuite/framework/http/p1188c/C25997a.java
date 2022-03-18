package com.larksuite.framework.http.p1188c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.larksuite.framework.http.c.a */
public class C25997a {
    /* renamed from: a */
    public static Class m94105a(Class cls) {
        return m94106a(cls, 0);
    }

    /* renamed from: a */
    public static Class m94106a(Class cls, int i) throws IndexOutOfBoundsException {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        if (i >= actualTypeArguments.length || i < 0 || !(actualTypeArguments[i] instanceof Class)) {
            return Object.class;
        }
        return (Class) actualTypeArguments[i];
    }
}
