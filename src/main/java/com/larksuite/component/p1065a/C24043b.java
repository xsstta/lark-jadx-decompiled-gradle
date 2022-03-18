package com.larksuite.component.p1065a;

/* renamed from: com.larksuite.component.a.b */
public class C24043b {

    /* renamed from: a */
    private static AbstractC24042a f59448a;

    /* renamed from: a */
    private static synchronized AbstractC24042a m87850a() {
        AbstractC24042a aVar;
        synchronized (C24043b.class) {
            if (f59448a == null) {
                try {
                    f59448a = (AbstractC24042a) Class.forName("com.larksuite.component.lazyapi_impl.LazyApiImpl").newInstance();
                } catch (Exception unused) {
                    return null;
                }
            }
            aVar = f59448a;
        }
        return aVar;
    }

    /* renamed from: a */
    public static <T> T m87851a(Class<T> cls) {
        AbstractC24042a a = m87850a();
        if (a != null) {
            return (T) a.mo86277a(cls);
        }
        return null;
    }
}
