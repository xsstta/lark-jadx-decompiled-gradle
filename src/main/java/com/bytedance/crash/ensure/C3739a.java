package com.bytedance.crash.ensure;

import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.EnsureManager;
import com.bytedance.services.apm.api.IEnsure;

/* renamed from: com.bytedance.crash.ensure.a */
public class C3739a {

    /* renamed from: a */
    private static boolean f11522a;

    /* renamed from: a */
    public static void m15397a() {
        if (!f11522a) {
            f11522a = true;
            try {
                EnsureInitInner$1 ensureInitInner$1 = new EnsureInitInner$1();
                C20216d.m73785a(IEnsure.class, ensureInitInner$1);
                EnsureManager.setEnsureImpl(ensureInitInner$1);
            } catch (Throwable unused) {
            }
        }
    }
}
