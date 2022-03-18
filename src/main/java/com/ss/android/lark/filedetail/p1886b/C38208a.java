package com.ss.android.lark.filedetail.p1886b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.filedetail.b.a */
public class C38208a {

    /* renamed from: a */
    private static final List<AbstractC38209a> f97900a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.filedetail.b.a$a */
    public interface AbstractC38209a {
        /* renamed from: a */
        void mo139632a(String str);
    }

    /* renamed from: a */
    public static void m150163a(String str) {
        for (AbstractC38209a aVar : f97900a) {
            aVar.mo139632a(str);
        }
    }
}
