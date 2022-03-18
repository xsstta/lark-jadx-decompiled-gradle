package com.bytedance.ee.falcon.inspector.utils;

/* renamed from: com.bytedance.ee.falcon.inspector.utils.a */
public class C12700a {
    /* renamed from: a */
    public static RuntimeException m52565a(Throwable th) {
        m52566a(th, Error.class);
        m52566a(th, RuntimeException.class);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static <T extends Throwable> void m52566a(Throwable th, Class<T> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw th;
        }
    }
}
