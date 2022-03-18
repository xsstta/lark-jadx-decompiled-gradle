package com.bytedance.ee.bear.leanmode;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5198c;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.p576a.AbstractC11903a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.leanmode.a */
public class C8132a {

    /* renamed from: c */
    private static volatile C8132a f21715c;

    /* renamed from: a */
    private final C1177w<CCMConfig> f21716a = new C1177w<>();

    /* renamed from: b */
    private final C1177w<Long> f21717b = new C1177w<>();

    /* renamed from: a */
    public void mo31330a(C10917c cVar, long j) {
        if (C5102ai.m20872j().mo20214f()) {
            C13479a.m54775e("LeanModeHelper", "is doze mode, return directly");
            return;
        }
        C13479a.m54764b("LeanModeHelper", "timingCleanDataFlow(), beforeTimeInMills:" + j);
        AbstractC68307f.m265093a(((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19647a(j), ((AbstractC11903a) KoinJavaComponent.m268610a(AbstractC11903a.class)).mo45780a(j), ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31485a(j)).mo238004b(C11678b.m48479c()).mo238001b($$Lambda$a$4dTRaca8CDU9FeLTvs6FeiG66m0.INSTANCE, $$Lambda$a$t7_geIPXA39D3I32QoDLW_hQax8.INSTANCE);
    }

    /* renamed from: b */
    public CCMConfig mo31331b() {
        return this.f21716a.mo5927b();
    }

    private C8132a() {
    }

    /* renamed from: a */
    public static C8132a m32450a() {
        if (f21715c == null) {
            synchronized (C8132a.class) {
                if (f21715c == null) {
                    f21715c = new C8132a();
                }
            }
        }
        return f21715c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m32451a(AbstractC5198c cVar) throws Exception {
        cVar.syncCCMConfig(mo31331b());
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m32459c(C10917c cVar) {
        this.f21716a.mo5925a(new AbstractC1178x(cVar) {
            /* class com.bytedance.ee.bear.leanmode.$$Lambda$a$sLQEUSFvwGnJvDaNWKqhvYHELCE */
            public final /* synthetic */ C10917c f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8132a.this.m32457b(this.f$1, (CCMConfig) obj);
            }
        });
        this.f21717b.mo5925a(new AbstractC1178x(cVar) {
            /* class com.bytedance.ee.bear.leanmode.$$Lambda$a$6nnZFtSwW4qMPKx2h2B4e38FE90 */
            public final /* synthetic */ C10917c f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8132a.this.m32453a((C8132a) this.f$1, (C10917c) ((Long) obj));
            }
        });
    }

    /* renamed from: b */
    public void mo31332b(C10917c cVar) {
        if (C13629i.m55302a()) {
            cVar.mo41508c(AbstractC5198c.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.leanmode.$$Lambda$a$rWZaNkthDKLTuLbEtvXCAKLfZm8 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8132a.this.m32451a((AbstractC5198c) obj);
                }
            }).mo238001b($$Lambda$a$P91H4IWffeQ4cx428_4PHGvg1AY.INSTANCE, $$Lambda$a$BCCbFHRJsZcArwfrBZXce5MgEg.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32454a(Boolean bool) throws Exception {
        C13479a.m54764b("LeanModeHelper", "clear data result:" + bool);
    }

    /* renamed from: a */
    public void mo31327a(long j) {
        this.f21717b.mo5926a(Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo31328a(CCMConfig cCMConfig) {
        C13479a.m54764b("LeanModeHelper", "setCCMConfigLiveData()...");
        this.f21716a.mo5926a(cCMConfig);
    }

    /* renamed from: a */
    public void mo31329a(C10917c cVar) {
        if (C13629i.m55302a()) {
            C13479a.m54764b("LeanModeHelper", "addObserverInMainProcess()...");
            C13748k.m55732a(new Runnable(cVar) {
                /* class com.bytedance.ee.bear.leanmode.$$Lambda$a$pfdi2TROiPHEAFhDgs5iAlAolSg */
                public final /* synthetic */ C10917c f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C8132a.this.m32459c(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32453a(C10917c cVar, Long l) {
        if (l != null) {
            mo31330a(cVar, l.longValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32457b(C10917c cVar, CCMConfig cCMConfig) {
        if (cCMConfig != null) {
            C13479a.m54764b("LeanModeHelper", "updateLeanMode()... clearData = " + cCMConfig.mo20775a());
            if (cCMConfig.mo20775a()) {
                C13479a.m54764b("LeanModeHelper", "ccm config cacheDataTime:" + cCMConfig.mo20776b());
                mo31327a(System.currentTimeMillis() - cCMConfig.mo20776b());
                return;
            }
            return;
        }
        C13479a.m54775e("LeanModeHelper", "updateLeanMode()... ccmConfig is empty");
    }
}
