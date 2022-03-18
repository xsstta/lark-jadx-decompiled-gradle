package com.ss.lark.android.passport.biz.compat.p3211a;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback;
import com.ss.lark.android.passport.biz.C64340b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.lark.android.passport.biz.compat.a.a */
public class C64360a {

    /* renamed from: a */
    public static final PassportLog f162635a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private static final AtomicBoolean f162636b = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m253030a(final Context context) {
        if (C49224w.m194054b(context)) {
            m253031a(context, UniContext.CONTEXT_START_UP);
            AbstractC49384b<?> kaIdp = ServiceFinder.m193763r().getKaIdp();
            if (kaIdp != null && kaIdp.mo171895d() != null) {
                kaIdp.mo171895d().mo171959a(context, new IGetIdpTokenCallback() {
                    /* class com.ss.lark.android.passport.biz.compat.p3211a.C64360a.C643611 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback
                    /* renamed from: a */
                    public void mo145132a(Object obj, int i, String str) {
                        if (3 == i) {
                            String format = String.format(Locale.getDefault(), "IdpRefreshTokenInvalid makes logout. reason=%d, msg=%s", 1, str);
                            PassportLog passportLog = C64360a.f162635a;
                            passportLog.mo171465b("LoginServiceImpl", "startRefreshToken: " + format);
                            ServiceFinder.m193757l().logoutAll(context, new IGetDataCallback<C49376b>() {
                                /* class com.ss.lark.android.passport.biz.compat.p3211a.C64360a.C643611.C643621 */

                                /* renamed from: a */
                                public void onSuccess(C49376b bVar) {
                                    C64360a.f162635a.mo171465b("LoginServiceImpl", "startRefreshToken and logout");
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    C64360a.f162635a.mo171471d("LoginServiceImpl", "startRefreshToken but logout failed");
                                }
                            });
                        }
                    }
                }, 600000);
            }
        }
    }

    /* renamed from: a */
    public static void m253031a(Context context, UniContext uniContext) {
        if (f162636b.compareAndSet(false, true) && C49224w.m194054b(context)) {
            PassportConfigCenter.f123034a.mo171109a(uniContext);
            C64340b.m252955a().mo222862d();
        }
    }
}
