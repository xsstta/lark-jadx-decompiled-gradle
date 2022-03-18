package com.ss.android.lark.littleapp;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.C12941a;
import com.bytedance.ee.larkbrand.C13061g;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.ee.util.C13582a;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67435c;
import com.tt.miniapphost.p3362a.p3365c.AbstractC67453c;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.littleapp.l */
public class C41390l {

    /* renamed from: a */
    public static AtomicBoolean f105245a = new AtomicBoolean(true);

    /* renamed from: b */
    public static boolean f105246b = false;

    /* renamed from: a */
    private static AbstractC67433a m164162a(final Context context) {
        C67448a.m262353a().mo234176a(context);
        C67448a.m262353a().mo234180a(new AbstractC67453c() {
            /* class com.ss.android.lark.littleapp.C41390l.C413911 */

            @Override // com.tt.miniapphost.p3362a.p3365c.AbstractC67453c
            /* renamed from: a */
            public boolean mo149058a() {
                if (ProcessUtil.isMainProcess(context)) {
                    if (C41390l.f105245a.compareAndSet(true, false)) {
                        try {
                            C41390l.f105246b = HostDependManager.getInst().getFeatureGating("microapp.run.main.process");
                        } catch (Throwable th) {
                            AppBrandLogger.m52829e("MiniAppInitor", ApiHandler.API_CALLBACK_EXCEPTION, th);
                        }
                    }
                    C13479a.m54764b("MiniAppInitor", "main process, runInMainProcessFgValue:" + C41390l.f105246b);
                    return C41390l.f105246b;
                }
                C13479a.m54764b("MiniAppInitor", "miniapp process");
                C67448a.m262353a().getClass();
                return false;
            }
        });
        AbstractC67433a i = C67448a.m262353a().mo234190i();
        i.registerService(C67485a.class, new C67485a());
        i.registerService(C12988a.class, new C12988a());
        return i;
    }

    /* renamed from: a */
    public static IAppContext m164161a(Application application, AbstractC41371j jVar, HostInterface hostInterface) {
        C24401b.m89051c().mo87131a(application);
        AbstractC67433a a = m164162a(application);
        a.registerService(AbstractC67435c.class, new C41396n(application, jVar, hostInterface));
        C12941a.m53321a(new C41381k(jVar));
        if (ProcessUtil.isMiniappProcess()) {
            LarkExtensionManager.getInstance().getExtension().mo49579g();
        }
        C13061g gVar = new C13061g(jVar);
        C12941a.m53316a(application, gVar, gVar, hostInterface, a);
        if (!ProcessUtil.isP0Process()) {
            ComponentCallbacks2C41313c.m163779a(application);
        }
        C13582a.m55112a(application);
        a.mo234163c();
        return a;
    }
}
