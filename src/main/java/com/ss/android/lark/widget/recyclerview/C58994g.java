package com.ss.android.lark.widget.recyclerview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.widget.recyclerview.g */
public class C58994g {

    /* renamed from: a */
    private static final Object f146185a = new Object();

    /* renamed from: b */
    private static Map<AbstractC58995a, Object> f146186b = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.widget.recyclerview.g$a */
    public interface AbstractC58995a {
        /* renamed from: a */
        void mo102521a();

        /* renamed from: b */
        void mo102522b();
    }

    /* renamed from: a */
    public static void m228967a() {
        for (AbstractC58995a aVar : f146186b.keySet()) {
            aVar.mo102521a();
        }
    }

    /* renamed from: b */
    public static void m228969b() {
        for (AbstractC58995a aVar : f146186b.keySet()) {
            aVar.mo102522b();
        }
    }

    /* renamed from: a */
    public static void m228968a(AbstractC58995a aVar) {
        if (aVar != null) {
            f146186b.put(aVar, f146185a);
        }
    }

    /* renamed from: b */
    public static void m228970b(AbstractC58995a aVar) {
        if (aVar != null) {
            f146186b.remove(aVar);
        }
    }
}
