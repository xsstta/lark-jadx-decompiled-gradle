package com.ss.android.lark.account_provider;

import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.account_provider.p1325a.C28502a;
import com.ss.android.lark.account_provider.p1326b.AbstractC28511a;
import com.ss.android.lark.passport.device.C48951a;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.AppActivityManager;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService;
import com.ss.android.lark.security.C54055a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.C64356c;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.account_provider.a */
public class C28498a {

    /* renamed from: a */
    private static boolean f71644a;

    /* renamed from: b */
    private static boolean f71645b;

    /* renamed from: c */
    private final List<AbstractC28511a> f71646c;

    /* renamed from: d */
    private final List<AbstractC28511a> f71647d;

    /* renamed from: com.ss.android.lark.account_provider.a$a */
    private static class C28501a {

        /* renamed from: a */
        public static final C28498a f71650a = new C28498a();
    }

    /* renamed from: a */
    public static C28498a m104383a() {
        return C28501a.f71650a;
    }

    /* renamed from: m */
    private boolean m104388m() {
        return f71645b;
    }

    /* renamed from: n */
    private boolean m104389n() {
        return f71644a;
    }

    /* renamed from: l */
    private void m104387l() {
        C54055a.f133856a.mo185052a();
    }

    /* renamed from: i */
    private void m104384i() {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            AppActivityManager.m193868b();
        }
    }

    /* renamed from: k */
    private void m104386k() {
        ServiceFinder.m193752g().registerNetworkChangeListener(new Function1<Boolean, Unit>() {
            /* class com.ss.android.lark.account_provider.C28498a.C284991 */

            /* renamed from: a */
            public Unit invoke(Boolean bool) {
                if (!bool.booleanValue()) {
                    return null;
                }
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.account_provider.C28498a.C284991.RunnableC285001 */

                    public void run() {
                        ILogoutUserService hVar = (ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class);
                        if (hVar != null) {
                            PassportLog.f123351c.mo171474a().mo171465b("n_action_logout_offline_start", "reason:network_reachable");
                            UniContext c = WatcherUniContext.m193674c();
                            c.appendOneSceneMonitorParam("task_type", "net_available");
                            hVar.startOfflineLogout(c, null);
                        }
                    }
                });
                return null;
            }
        });
    }

    private C28498a() {
        this.f71646c = new ArrayList();
        this.f71647d = new ArrayList();
    }

    /* renamed from: c */
    public void mo101375c() {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            m104385j();
            m104386k();
        }
    }

    /* renamed from: e */
    public synchronized void mo101377e() {
        if (!m104388m()) {
            C64471a.f162788a.mo223058a();
            f71645b = true;
        }
    }

    /* renamed from: f */
    public void mo101378f() {
        for (AbstractC28511a aVar : this.f71646c) {
            aVar.mo101383a(LarkContext.getApplication());
        }
    }

    /* renamed from: g */
    public void mo101379g() {
        for (AbstractC28511a aVar : this.f71647d) {
            aVar.mo101383a(LarkContext.getApplication());
        }
    }

    /* renamed from: j */
    private void m104385j() {
        ILogoutUserService hVar = (ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class);
        if (hVar != null && !ServiceFinder.m193752g().isNetWorkUnAvailable()) {
            PassportLog.f123351c.mo171474a().mo171465b("n_action_logout_offline_start", "reason:app_start");
            UniContext c = WatcherUniContext.m193674c();
            c.appendOneSceneMonitorParam("task_type", "app_init");
            hVar.startOfflineLogout(c, null);
        }
    }

    /* renamed from: b */
    public void mo101374b() {
        C64356c.f162622a = new C64356c();
        C64471a.f162788a = new C64471a();
        C48998a.f123026a = new C48998a();
        C54055a.f133856a = new C54055a();
        C48951a.f122940a = new C48951a();
        this.f71647d.add(new C28502a());
        m104387l();
        m104384i();
        ((IBDTuringService) ServiceFinder.m193746a(IBDTuringService.class)).init();
    }

    /* renamed from: d */
    public synchronized void mo101376d() {
        if (!m104389n()) {
            mo101377e();
            C48998a.f123026a.mo171067b();
            C54055a.f133856a.mo185056b();
            C48951a.f122940a.mo170960a();
            C64356c.f162622a.mo222896a();
            f71644a = true;
        }
    }

    /* renamed from: h */
    public synchronized void mo101380h() {
        if (m104389n()) {
            C64471a.f162788a.mo223064b();
            C48998a.f123026a.mo171068c();
            C54055a.f133856a.mo185057c();
            C48951a.f122940a.mo170961b();
            C64356c.f162622a.mo222902b();
            f71644a = false;
            f71645b = false;
        }
    }
}
