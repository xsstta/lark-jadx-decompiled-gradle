package com.ss.android.lark.platform.ae;

import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.larkconfig.userconfig.AbstractC41237g;
import com.ss.android.lark.larkconfig.userconfig.C41222c;
import com.ss.android.lark.larkconfig.userconfig.p2118a.AbstractC41220a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.ae.a */
public class C51677a {

    /* renamed from: com.ss.android.lark.platform.ae.a$b */
    public static class C51681b {

        /* renamed from: a */
        public static final C51679a f128563a = new C51679a();
    }

    /* renamed from: a */
    public static C41222c m200443a() {
        return new C41222c(C51681b.f128563a);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.ae.a$a */
    public static class C51679a implements AbstractC41220a {

        /* renamed from: a */
        private ConcurrentHashMap<AbstractC41237g, IAccountChangeObserver.AbstractC49385a> f128560a;

        private C51679a() {
            this.f128560a = new ConcurrentHashMap<>();
        }

        @Override // com.ss.android.lark.larkconfig.userconfig.p2118a.AbstractC41220a
        /* renamed from: a */
        public String mo148552a() {
            return C36083a.m141486a().getPassportDependency().mo133085d();
        }

        @Override // com.ss.android.lark.larkconfig.userconfig.p2118a.AbstractC41220a
        /* renamed from: a */
        public void mo148553a(final AbstractC41237g gVar) {
            C516801 r0 = new IAccountChangeObserver.AbstractC49385a() {
                /* class com.ss.android.lark.platform.ae.C51677a.C51679a.C516801 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
                public void onAccountChange(LoginInfo loginInfo) {
                    gVar.onAccountChange();
                }
            };
            this.f128560a.put(gVar, r0);
            C36083a.m141486a().getPassportDependency().mo133095n().mo172398a(r0);
        }

        @Override // com.ss.android.lark.larkconfig.userconfig.p2118a.AbstractC41220a
        /* renamed from: b */
        public void mo148554b(AbstractC41237g gVar) {
            IAccountChangeObserver.AbstractC49385a remove = this.f128560a.remove(gVar);
            if (remove != null) {
                C36083a.m141486a().getPassportDependency().mo133095n().mo172399b(remove);
            }
        }
    }
}
