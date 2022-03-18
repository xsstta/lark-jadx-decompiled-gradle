package com.bytedance.ee.bear.document.p304d;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.d.a */
public class C5736a implements AbstractC7945d<Void> {

    /* renamed from: a */
    private AbstractC6307e f16191a;

    /* renamed from: b */
    private AbstractC5089af f16192b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23202a(Throwable th) throws Exception {
        C13479a.m54761a("FetchDomainConfigHandler", th);
        C13606d.m55245a("FetchDomainConfigHandler", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23201a(Boolean bool) throws Exception {
        C13479a.m54764b("FetchDomainConfigHandler", "***reportPreloadHtml*** preload result = " + bool);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m23200a(String str) throws Exception {
        C13479a.m54764b("FetchDomainConfigHandler", "getDomainCharacteristicConfig()...result = " + str);
        if (TextUtils.isEmpty(str)) {
            return AbstractC68307f.m265083a((Object) false);
        }
        return this.f16192b.mo20190b(false);
    }

    C5736a(AbstractC6307e eVar, AbstractC5089af afVar) {
        this.f16191a = eVar;
        this.f16192b = afVar;
    }

    /* renamed from: a */
    public void handle(Void r2, AbstractC7947h hVar) {
        C13479a.m54764b("FetchDomainConfigHandler", "handle()...");
        AbstractC6307e eVar = this.f16191a;
        if (eVar == null) {
            C13479a.m54764b("FetchDomainConfigHandler", "domainCharacteristicService is null");
        } else if (this.f16192b == null) {
            C13479a.m54764b("FetchDomainConfigHandler", "docWebService is null");
        } else {
            eVar.mo17336b().mo237985a(C11678b.m48481e()).mo238014c(new Function() {
                /* class com.bytedance.ee.bear.document.p304d.$$Lambda$a$9eOgp8g18l5cCiJfPmzk3EA7o7A */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C5736a.this.m23200a((String) obj);
                }
            }).mo238001b($$Lambda$a$9xUohziOIQu6z9tq4qY37MBy7A.INSTANCE, $$Lambda$a$GWwU1T3ZPC4sPfFe2k1wqCMpLUE.INSTANCE);
        }
    }
}
