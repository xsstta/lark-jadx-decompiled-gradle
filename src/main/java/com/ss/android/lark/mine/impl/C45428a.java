package com.ss.android.lark.mine.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.mine.impl.a */
public class C45428a {

    /* renamed from: a */
    private static final List<AbstractC45429a> f115028a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.mine.impl.a$a */
    public interface AbstractC45429a {
        /* renamed from: a */
        void mo160315a();
    }

    /* renamed from: a */
    public static void m180460a() {
        for (AbstractC45429a aVar : f115028a) {
            aVar.mo160315a();
        }
    }

    /* renamed from: a */
    public static void m180461a(AbstractC45429a aVar) {
        if (aVar != null) {
            f115028a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m180462b(AbstractC45429a aVar) {
        if (aVar != null) {
            f115028a.remove(aVar);
        }
    }
}
