package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.littleapp.service.p2132a.C41420a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.littleapp.a */
public class C39799a {
    /* renamed from: b */
    public static void m157972b(Context context) {
        LittleAppModuleProvider.m157932a().mo148943b().mo149157a(new C41420a(context, C41354g.m163939a()));
    }

    /* renamed from: a */
    public static IAppContext m157970a(Context context) {
        final IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        final ILittleAppService b = LittleAppModuleProvider.m157932a().mo148943b();
        final IAppContext a = b.mo149142a(context, new C39801b());
        if (C26252ad.m94993b(context)) {
            iPassportApi.registerLoginEnvChangeListener(new AbstractC49370a.AbstractC49371a() {
                /* class com.ss.android.lark.integrator.littleapp.C39799a.C398001 */

                @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
                /* renamed from: a */
                public boolean mo102729a() {
                    return false;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
                /* renamed from: a */
                public void mo102728a(boolean z, AbstractC49352d<String> dVar) {
                    Log.m165389i("InitUtil", "onLoginEnvChanged : " + z);
                    b.mo149147a(a.getApplicationContext(), iPassportApi.oldSdkEnv());
                }
            });
            iCoreApi.registerLanguageChangeListener(new AbstractC29540ab() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$a$AtHlAoJdwgSSf3RfwWU37pJ4fmg */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
                public final void onLanguageChange(Locale locale, Locale locale2) {
                    C39799a.lambda$AtHlAoJdwgSSf3RfwWU37pJ4fmg(ILittleAppService.this, locale, locale2);
                }
            });
        }
        return a;
    }
}
