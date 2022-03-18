package com.bytedance.ee.bear.list.preload;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.preload.a */
public class C8664a {

    /* renamed from: a */
    private static final List<AbstractC8665a> f23463a = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.list.preload.a$a */
    public interface AbstractC8665a {
        void onFirstContentDraw();
    }

    /* renamed from: a */
    public static void m36217a() {
        for (AbstractC8665a aVar : f23463a) {
            aVar.onFirstContentDraw();
        }
    }

    /* renamed from: a */
    public static void m36218a(AbstractC8665a aVar) {
        if (aVar != null) {
            f23463a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m36219b(AbstractC8665a aVar) {
        if (aVar != null) {
            f23463a.remove(aVar);
        }
    }
}
