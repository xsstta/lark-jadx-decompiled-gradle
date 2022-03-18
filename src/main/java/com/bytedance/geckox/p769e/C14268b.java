package com.bytedance.geckox.p769e;

import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.p859a.AbstractC20231a;
import com.bytedance.pipeline.p859a.C20232b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.geckox.e.b */
public class C14268b {

    /* renamed from: a */
    private static final Map<Class<? extends AbstractC20235d<?, ?>>, C20232b> f37522a = new HashMap();

    /* renamed from: a */
    public static AbstractC20231a m57586a(Class<? extends AbstractC20235d<?, ?>> cls) {
        C20232b bVar;
        Map<Class<? extends AbstractC20235d<?, ?>>, C20232b> map = f37522a;
        synchronized (map) {
            bVar = map.get(cls);
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m57587a(Class<? extends AbstractC20235d<?, ?>> cls, AbstractC20231a aVar) {
        Map<Class<? extends AbstractC20235d<?, ?>>, C20232b> map = f37522a;
        synchronized (map) {
            C20232b bVar = map.get(cls);
            if (bVar == null) {
                bVar = new C20232b(new AbstractC20231a[0]);
                map.put(cls, bVar);
            }
            bVar.mo68481a(aVar);
        }
    }
}
