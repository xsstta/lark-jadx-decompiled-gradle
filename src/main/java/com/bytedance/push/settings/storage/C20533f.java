package com.bytedance.push.settings.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.f */
final class C20533f {

    /* renamed from: a */
    private static Map<String, AbstractC20532e> f50095a = new ConcurrentHashMap();

    static {
        m74778a(new C20524a());
    }

    /* renamed from: a */
    public static AbstractC20532e m74777a(String str) {
        return f50095a.get(str);
    }

    /* renamed from: a */
    public static void m74778a(AbstractC20532e eVar) {
        f50095a.put(eVar.mo69106a(), eVar);
    }
}
