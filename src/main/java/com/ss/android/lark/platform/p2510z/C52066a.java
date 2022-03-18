package com.ss.android.lark.platform.p2510z;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.p2989x.C59333a;
import com.ss.android.lark.p2989x.p2990a.AbstractC59334a;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.platform.p2486g.C51808a;
import com.ss.android.lark.platform.statistics.p2502b.C51966c;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.z.a */
public class C52066a {

    /* renamed from: com.ss.android.lark.platform.z.a$a */
    public static class C52069a {

        /* renamed from: a */
        public static final AbstractC59334a f129221a = C52066a.m201978a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C59333a m201979a() {
        return new C59333a(C52069a.f129221a);
    }

    /* renamed from: a */
    public static AbstractC59334a m201978a(final Context context) {
        return new AbstractC59334a() {
            /* class com.ss.android.lark.platform.p2510z.C52066a.C520671 */

            @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a
            /* renamed from: a */
            public Context mo178414a() {
                return context;
            }

            @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a
            /* renamed from: d */
            public AbstractC59334a.AbstractC59335a mo178418d() {
                return $$Lambda$a$1$nrJK5zojRRfYNn4djOEXB1KJAl4.INSTANCE;
            }

            @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a
            /* renamed from: b */
            public AbstractC59334a.AbstractC59336b mo178416b() {
                return new AbstractC59334a.AbstractC59336b() {
                    /* class com.ss.android.lark.platform.p2510z.C52066a.C520671.C520681 */

                    @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a.AbstractC59336b
                    /* renamed from: a */
                    public void mo178419a() {
                        C51995b.m201714a();
                    }

                    @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a.AbstractC59336b
                    /* renamed from: a */
                    public void mo178420a(ErrorResult errorResult) {
                        C51966c.m201571a().mo178144a(errorResult);
                    }

                    @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a.AbstractC59336b
                    /* renamed from: b */
                    public void mo178422b(String str, String str2) {
                        C51995b.m201724b(str, str2);
                    }

                    @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a.AbstractC59336b
                    /* renamed from: c */
                    public void mo178423c(String str, String str2) {
                        C51995b.m201726c(str, str2);
                    }

                    @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a.AbstractC59336b
                    /* renamed from: a */
                    public void mo178421a(String str, String str2) {
                        C51995b.m201718a(str, str2, 1);
                    }
                };
            }

            @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a
            /* renamed from: c */
            public int mo178417c() {
                return C36083a.m141486a().getIMDependency().mo132883b();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ boolean m201980a(String str) {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172423d();
            }

            @Override // com.ss.android.lark.p2989x.p2990a.AbstractC59334a
            /* renamed from: a */
            public void mo178415a(InitSDKRequest.EnvType envType, String str, DomainSettings domainSettings) {
                DynamicConfigModule.m145552b().mo136168a(envType, str, domainSettings);
                C51894a.m201282a();
                C51894a.C51895a.m201287c(context);
                C51808a.m200830a().mo177931c();
            }
        };
    }
}
