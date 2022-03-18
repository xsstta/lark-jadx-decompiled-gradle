package com.bytedance.geckox.utils;

import com.bytedance.geckox.p771g.C14276b;

/* renamed from: com.bytedance.geckox.utils.d */
public class C14356d {
    /* renamed from: a */
    public static void m57820a(Throwable th) {
        if (!C14359f.m57831a()) {
            C14276b.m57603a("gecko-debug-tag", "throwIfDebug:", th);
        } else {
            C14276b.m57605b("gecko-debug-tag", "throwIfDebug:", th);
            throw new RuntimeException(th);
        }
    }
}
