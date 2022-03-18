package com.tt.miniapp.manager;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;

/* renamed from: com.tt.miniapp.manager.n */
public class C66464n {

    /* renamed from: com.tt.miniapp.manager.n$a */
    public static class C66465a {

        /* renamed from: a */
        public String f167770a;

        /* renamed from: b */
        public AbstractC66466b f167771b;
    }

    /* renamed from: com.tt.miniapp.manager.n$b */
    public interface AbstractC66466b {
        void localPackageReady(String str);
    }

    /* renamed from: a */
    private static C66465a m259786a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170184k;
    }

    /* renamed from: a */
    public static void m259787a(AbstractC66466b bVar, IAppContext iAppContext) {
        synchronized (AbstractC66466b.class) {
            C66465a a = m259786a(iAppContext);
            if (a.f167770a != null) {
                bVar.localPackageReady(a.f167770a);
            } else {
                a.f167771b = bVar;
            }
        }
    }
}
