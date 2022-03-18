package com.bytedance.ee.bear.integrator.p400b;

import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.integrator.p400b.C7875a;
import com.bytedance.ee.bear.p409j.AbstractC7935a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.TimeoutException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.integrator.b.a */
public class C7875a implements AbstractC7935a {

    /* renamed from: a */
    private C10917c f21264a;

    @Override // com.bytedance.ee.bear.p409j.AbstractC7935a
    /* renamed from: a */
    public AbstractC68307f<Object> mo30706a() {
        return AbstractC68307f.m265080a(new AbstractC68324h<Object>() {
            /* class com.bytedance.ee.bear.integrator.p400b.C7875a.C78761 */

            /* renamed from: a */
            public volatile Runnable f21265a;

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(final AbstractC68323g<Object> gVar) {
                if (C4438x.m18352d()) {
                    gVar.onNext("anything non null");
                    gVar.onComplete();
                    C13479a.m54764b("AppInitializeImpl", "init Complete!!!");
                    return;
                }
                C78771 r0 = new AbstractC4482e() {
                    /* class com.bytedance.ee.bear.integrator.p400b.C7875a.C78761.C78771 */

                    /* access modifiers changed from: public */
                    /* renamed from: a */
                    private /* synthetic */ void m31594a() {
                        C4438x.m18350b(this);
                    }

                    @Override // com.bytedance.ee.bear.basesdk.AbstractC4482e
                    public void onInit() {
                        C13479a.m54764b("AppInitializeImpl", "init start!!!");
                        if (C78761.this.f21265a != null) {
                            C13479a.m54764b("AppInitializeImpl", "init remove timeout task!!!");
                            C13742g.m55710c(C78761.this.f21265a);
                        }
                        C13479a.m54764b("AppInitializeImpl", "init remove doc listener!!!");
                        C13742g.m55705a(new Runnable() {
                            /* class com.bytedance.ee.bear.integrator.p400b.$$Lambda$a$1$1$ovKDi_Uvg5kSyTO43mzyT29Fuv0 */

                            public final void run() {
                                C7875a.C78761.C78771.lambda$ovKDi_Uvg5kSyTO43mzyT29Fuv0(C7875a.C78761.C78771.this);
                            }
                        });
                        gVar.onNext("anything non null");
                        gVar.onComplete();
                    }
                };
                this.f21265a = new Runnable(gVar) {
                    /* class com.bytedance.ee.bear.integrator.p400b.$$Lambda$a$1$qpyRVqhdaQ0RxaTwwbsuDEegd_w */
                    public final /* synthetic */ AbstractC68323g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7875a.C78761.m31593a(AbstractC4482e.this, this.f$1);
                    }
                };
                C13479a.m54764b("AppInitializeImpl", "init timeout add DocInitListener!!!");
                C4438x.m18348a(r0);
                C13479a.m54764b("AppInitializeImpl", "init postDelayed timeout Task!!!");
                C13742g.m55706a(this.f21265a, 10000);
            }

            /* renamed from: a */
            public static /* synthetic */ void m31593a(AbstractC4482e eVar, AbstractC68323g gVar) {
                C13479a.m54764b("AppInitializeImpl", "init timeout emitter.onError !!!");
                C4438x.m18350b(eVar);
                gVar.onError(new TimeoutException("Wait docInit timeout !"));
            }
        }, BackpressureStrategy.BUFFER);
    }

    @Override // com.bytedance.ee.bear.p409j.AbstractC7935a
    /* renamed from: b */
    public AbstractC68307f<AccountService.Account> mo30707b() {
        return mo30706a().mo238014c($$Lambda$a$uX6TtiSuUFKSEbcDEOtPcwKwxw.INSTANCE);
    }

    C7875a(C10917c cVar) {
        this.f21264a = cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m31590a(Object obj) {
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f != null) {
            return AbstractC68307f.m265083a(f);
        }
        throw new IllegalStateException("No account after full init !");
    }
}
