package com.ss.android.lark.feed.p1871b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.feed.b.c */
public class C38068c {

    /* renamed from: a */
    private static final List<AbstractC38069a> f97689a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.feed.b.c$a */
    public interface AbstractC38069a {
        /* renamed from: a */
        void mo139353a();
    }

    /* renamed from: a */
    public static void m149767a() {
        for (AbstractC38069a aVar : f97689a) {
            aVar.mo139353a();
        }
    }

    /* renamed from: a */
    public static void m149768a(AbstractC38069a aVar) {
        if (aVar != null) {
            f97689a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m149769b(AbstractC38069a aVar) {
        if (aVar != null) {
            f97689a.remove(aVar);
        }
    }
}
