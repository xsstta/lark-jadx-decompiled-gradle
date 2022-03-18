package com.ss.android.lark.mail.impl.p2171h.p2175c;

import com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.h.c.c */
public class C42343c {

    /* renamed from: a */
    private static ConcurrentHashMap<Class<?>, AbstractC42192a> f107792a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T extends AbstractC42192a> T m169090a(Class<T> cls) {
        if (f107792a.get(cls) == null) {
            try {
                f107792a.put(cls, cls.newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return (T) f107792a.get(cls);
    }
}
