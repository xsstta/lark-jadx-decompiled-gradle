package com.bytedance.ee.bear.basesdk.services;

import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.service.callback.AbstractC10927c;
import com.bytedance.ee.bear.service.callback.C10918a;
import com.bytedance.ee.bear.service.callback.ProcessLifecycle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Function;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.basesdk.services.e */
public class C4507e implements AbstractC6307e {

    /* renamed from: a */
    public Set<BinderOnDomainCharacteristicChangeListener> f13191a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private C68289a f13192b = new C68289a();

    /* renamed from: c */
    private BinderOnDomainCharacteristicChangeListener f13193c = new DomainCharacteristicServiceImp$1(this);

    /* renamed from: d */
    private AbstractC10927c<ProcessLifecycle> f13194d = new AbstractC10927c() {
        /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$e$QeQhp1bJ_EDW7odnyeXNahDmDUM */

        @Override // com.bytedance.ee.bear.service.callback.AbstractC10927c
        public final void callback(Class cls, Object obj) {
            C4507e.this.m18571a(cls, (ProcessLifecycle) obj);
        }
    };

    /* renamed from: c */
    private void m18577c() {
        C10918a.m45418a(ProcessLifecycle.class, (AbstractC10927c) this.f13194d);
    }

    public C4507e() {
        m18577c();
        m18578d();
    }

    /* renamed from: d */
    private void m18578d() {
        this.f13192b.mo237937a(ar.m20936a().mo41508c(AbstractC6307e.AbstractC6308a.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$e$56miyYFqSnmKpSJS4WE_w7Dvg4 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4507e.this.m18576c((AbstractC6307e.AbstractC6308a) obj);
            }
        }).mo238001b($$Lambda$e$cxVFbTB_UkkzKv_cr_InspTHW8U.INSTANCE, $$Lambda$e$9KLTVYXOAiAQXFiy37YepSfPu0.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e
    /* renamed from: a */
    public void mo17334a() {
        this.f13192b.mo237937a(ar.m20936a().mo41508c(AbstractC6307e.AbstractC6308a.class).mo238020d($$Lambda$e$hqQU9u0UTuoTgJaPWpkR5B6sjw0.INSTANCE).mo238001b($$Lambda$e$O3wPEiw6RBuDacPEtNIumuDb8I.INSTANCE, $$Lambda$e$XWXSfrOF1LvABOPjiF6ww6a7r2U.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e
    /* renamed from: b */
    public AbstractC68307f<String> mo17336b() {
        return ar.m20936a().mo41508c(AbstractC6307e.AbstractC6308a.class).mo238014c($$Lambda$e$7M6z1L4XnbsJihX7fcKYSxPUZ14.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m18569a(AbstractC6307e.AbstractC6308a aVar) throws Exception {
        if (aVar != null) {
            return aVar.getDomainCharacteristicConfig();
        }
        return AbstractC68307f.m265083a("{}");
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e
    /* renamed from: b */
    public void mo17337b(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        this.f13191a.remove(binderOnDomainCharacteristicChangeListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18570a(Boolean bool) throws Exception {
        C13479a.m54764b("DomainCharacteristicServiceImp", "fetchConfig()...aBoolean = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m18573b(AbstractC6307e.AbstractC6308a aVar) throws Exception {
        if (aVar == null) {
            return false;
        }
        aVar.fetchConfig();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m18576c(AbstractC6307e.AbstractC6308a aVar) throws Exception {
        if (aVar == null) {
            return false;
        }
        aVar.registerConfigChangeListener(this.f13193c);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18574b(Boolean bool) throws Exception {
        C13479a.m54764b("DomainCharacteristicServiceImp", "registerRemoteCallback()...aBoolean = " + bool);
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e
    /* renamed from: a */
    public void mo17335a(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        this.f13191a.add(binderOnDomainCharacteristicChangeListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18571a(Class cls, ProcessLifecycle processLifecycle) {
        C13479a.m54764b("DomainCharacteristicServiceImp", "onProcessStart()... " + processLifecycle);
        if (processLifecycle.getProcessSate() == ProcessLifecycle.ProcessSate.START && C13629i.m55306b(processLifecycle.getProcessName())) {
            m18578d();
        }
    }
}
