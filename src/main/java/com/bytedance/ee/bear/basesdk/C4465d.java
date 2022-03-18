package com.bytedance.ee.bear.basesdk;

import com.bytedance.ee.bear.basesdk.IDocInit;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.basesdk.p250a.C4367n;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.DBController;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.d */
public class C4465d implements IDocInit {

    /* renamed from: a */
    private C10917c f13142a = new C10917c(new C10929e());

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18461a(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18468c() {
        C13479a.m54764b("DocInit", "refreshList()...");
        m18464b();
        C8674q.m36243f().mo33651d();
    }

    /* renamed from: b */
    private void m18464b() {
        this.f13142a.mo41508c(AbstractC5094ag.class).mo238020d($$Lambda$d$PF6pyiolCjWnZglkbZXkw3tmWZU.INSTANCE).mo238001b($$Lambda$d$EZyNMhTIEaNlhzXV8riD8isRyNc.INSTANCE, $$Lambda$d$QE7VmSRZC0aDE6WkAIZX2zPxRaI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m18458a(AbstractC5094ag agVar) throws Exception {
        C13479a.m54764b("DocInit", "clearMemUserData()... clear Docs data ");
        agVar.clearMemUserData();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m18469c(Boolean bool) throws Exception {
        C13479a.m54764b("DocInit", "onLoginStatusChangedEvent result = " + bool);
        if (bool.booleanValue()) {
            m18464b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18462a(Boolean bool) throws Exception {
        C13479a.m54764b("DocInit", "onUpdateUserToken()... accept: register result = " + bool);
    }

    /* renamed from: b */
    private void m18465b(DocDynamicConfig docDynamicConfig) {
        C13479a.m54764b("DocInit", "onUpdateUserToken()...");
        if (C4438x.m18352d()) {
            ((an) KoinJavaComponent.m268610a(an.class)).mo16395a(docDynamicConfig).mo237985a(C11678b.m48478b()).mo238021d(new AbstractC68309a() {
                /* class com.bytedance.ee.bear.basesdk.$$Lambda$d$tmoVrnt8hScAe3Ghi_YuAW0K84 */

                @Override // io.reactivex.functions.AbstractC68309a
                public final void run() {
                    C4465d.this.m18468c();
                }
            }).mo238001b($$Lambda$d$ExF4Xz3shnM77UwmLEjlxYT35wE.INSTANCE, $$Lambda$d$rh2qCMbOGVfOf4o_fLSWGSFqo.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18463a(Throwable th) throws Exception {
        C13479a.m54759a("DocInit", "onUpdateUserToken()... accept: register error", th);
        C13606d.m55245a("DocInit", th);
    }

    @Override // com.bytedance.ee.bear.basesdk.IDocInit
    /* renamed from: a */
    public void mo16959a(int i) {
        C13479a.m54764b("DocInit", "onLoginStatusChangedEvent()... event: " + i);
        if (C4438x.m18352d()) {
            if (i == IDocInit.LoginEvent.Logout.ordinal()) {
                ((an) KoinJavaComponent.m268610a(an.class)).mo16407e().mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.basesdk.$$Lambda$d$7WQtgsi9bJhWhmiCt1AfHV9s0oY */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4465d.this.m18469c((C4465d) ((Boolean) obj));
                    }
                }, $$Lambda$d$ExFOiiar6JAY53hOwspOrkPumL8.INSTANCE);
            }
            if (i == IDocInit.LoginEvent.BeforeLogout.ordinal() || i == IDocInit.LoginEvent.SwitchTenantStart.ordinal() || i == IDocInit.LoginEvent.Logout.ordinal()) {
                ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35628a(true);
            }
            this.f13142a.mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(i) {
                /* class com.bytedance.ee.bear.basesdk.$$Lambda$d$pkrxx_ZIfGZSm32avm9mJPuQ_zE */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ((AbstractC7184l) obj).onLoginStatusChangedEvent(this.f$0);
                }
            }).mo238001b($$Lambda$d$uIaAYB4OO7nKuamEFibKK9MFhOc.INSTANCE, $$Lambda$d$nGtpTL1uFrbEUZ6YfhdrBIpdpIc.INSTANCE);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.IDocInit
    /* renamed from: a */
    public void mo16960a(DocDynamicConfig docDynamicConfig) {
        C4511g.m18590a(docDynamicConfig);
        C4367n.f12994a = docDynamicConfig.mo20224a();
        DBController.m55314a().mo50587a(docDynamicConfig.mo20227d().mo20246a());
        if (this.f13142a != null) {
            ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20124d();
            m18465b(docDynamicConfig);
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35633b();
            return;
        }
        C13479a.m54758a("DocInit", "onUpdateDynamicConfig(): mServiceContext is null or not init");
    }

    @Override // com.bytedance.ee.bear.basesdk.IDocInit
    /* renamed from: a */
    public void mo16961a(String str) {
        C13479a.m54764b("DocInit", "syncCookie(session)...");
    }
}
