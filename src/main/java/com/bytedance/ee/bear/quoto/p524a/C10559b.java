package com.bytedance.ee.bear.quoto.p524a;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import com.bytedance.ee.bear.quoto.C10556a;
import com.bytedance.ee.bear.quoto.C10582o;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.quoto.a.b */
public class C10559b {

    /* renamed from: a */
    private final BusinessInfoRequester f28336a;

    /* renamed from: a */
    private void m43757a() {
        this.f28336a.mo39960a().mo238004b(C11678b.m48477a()).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$b$w3LHlh7oEmsyCf8uCUPiTlBaObE.INSTANCE, $$Lambda$b$ElFQ5J6aEWuY0BgRFfJVbZ3iwEE.INSTANCE);
    }

    public C10559b(NetService netService) {
        this.f28336a = new BusinessInfoRequester(netService);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ BusinessInfoRequester.BusinessInfoResult m43761b(BusinessInfoRequester.BusinessInfoResult businessInfoResult) throws Exception {
        C13479a.m54764b("SingleFileCheckerManager", "pullInfoFromNetwork()...success, InfoResult = " + businessInfoResult);
        C10556a.m43750a(businessInfoResult);
        return businessInfoResult;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ C10558a m43762b(Long l) throws Exception {
        BusinessInfoRequester.BusinessInfoResult a = C10556a.m43749a();
        if (a != null) {
            m43757a();
            return C10558a.m43753a(Boolean.valueOf(m43760a(l, a)));
        }
        C10556a.m43751b();
        return C10558a.m43752a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m43758a(BusinessInfoRequester.BusinessInfoResult businessInfoResult) throws Exception {
        C13479a.m54764b("SingleFileCheckerManager", "pullInfoFromNetwork()...success, InfoResult = " + businessInfoResult);
        C10556a.m43750a(businessInfoResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m43759a(Throwable th) throws Exception {
        C13479a.m54764b("SingleFileCheckerManager", "pullInfoFromNetwork()...error = " + th);
    }

    /* renamed from: a */
    public AbstractC68307f<C10582o> mo40008a(Long l) {
        return AbstractC68307f.m265083a(l).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.quoto.p524a.$$Lambda$b$PxEzY7eXPXNkAHrhBa2WMtWVtQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10559b.this.m43762b((Long) obj);
            }
        }).mo238014c(new Function(l) {
            /* class com.bytedance.ee.bear.quoto.p524a.$$Lambda$b$hYNrCg9oHTHGbNUsFg5pMulUqE */
            public final /* synthetic */ Long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10559b.this.m43756a(this.f$1, (C10558a) obj);
            }
        }).mo238004b(C11678b.m48477a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ C10582o m43763b(Long l, BusinessInfoRequester.BusinessInfoResult businessInfoResult) throws Exception {
        return new C10582o(l, m43760a(l, businessInfoResult));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m43756a(Long l, C10558a aVar) throws Exception {
        if (!aVar.mo40006b()) {
            return AbstractC68307f.m265083a(new C10582o(l, ((Boolean) aVar.mo40007c()).booleanValue()));
        }
        return this.f28336a.mo39960a().mo238020d($$Lambda$b$e5cqZthTTTnU8xtpU4YdhSH1GmI.INSTANCE).mo238020d(new Function(l) {
            /* class com.bytedance.ee.bear.quoto.p524a.$$Lambda$b$dndUR1QRzap_O4N4TYHaaoOTDlg */
            public final /* synthetic */ Long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10559b.this.m43763b(this.f$1, (BusinessInfoRequester.BusinessInfoResult) obj);
            }
        });
    }

    /* renamed from: a */
    private boolean m43760a(Long l, BusinessInfoRequester.BusinessInfoResult businessInfoResult) {
        Long l2 = businessInfoResult.getSuiteToFileSizeLimitMap().get(businessInfoResult.suiteType);
        if (l == null || l2 == null || l.longValue() <= l2.longValue()) {
            return false;
        }
        return true;
    }
}
