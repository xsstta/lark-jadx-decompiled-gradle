package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.b */
public class C5671b {

    /* renamed from: a */
    private C10917c f16030a;

    /* renamed from: b */
    public void mo22660b() {
        C13479a.m54764b("BearCookieManager", "checkCookie()...");
        String v = C4511g.m18594d().mo17372v();
        ((an) KoinJavaComponent.m268610a(an.class)).mo16400a(C4511g.m18594d().mo17361k().mo20227d());
        if (TextUtils.isEmpty(v)) {
            C13479a.m54758a("BearCookieManager", "checkCookie()... in lark token is empty");
        } else {
            ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(v).mo238001b($$Lambda$b$20CXyc1z0iHSa24CUqQzbfygz_M.INSTANCE, $$Lambda$b$T6Km8BcaI6tHJRQ_lAWFhTqg1w.INSTANCE);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<AccountService.Account> mo22659a() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo237990a((Function) $$Lambda$b$kIgAQDKZJowrL2SClCXCJuppI.INSTANCE).mo237985a(C11678b.m48481e());
    }

    public C5671b(C10917c cVar) {
        this.f16030a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23005a(Boolean bool) throws Exception {
        C13479a.m54764b("BearCookieManager", "checkCookie()... success " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC70020b m23008b(Boolean bool) throws Exception {
        C13479a.m54764b("BearCookieManager", "accept: register success: " + bool);
        return ((an) KoinJavaComponent.m268610a(an.class)).mo16405c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m23002a(String str) throws Exception {
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        if (d != null && d.mo19677a()) {
            return AbstractC68307f.m265083a(d);
        }
        C13479a.m54758a("BearCookieManager", "checkAccount()... account is empty or account has not login");
        String v = C4511g.m18594d().mo17372v();
        if (!TextUtils.isEmpty(v)) {
            return AbstractC68307f.m265080a(new AbstractC68324h(v) {
                /* class com.bytedance.ee.bear.document.$$Lambda$b$GjSxQ7RMCIlRvNVvBZPdm7sOxlg */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.AbstractC68324h
                public final void subscribe(AbstractC68323g gVar) {
                    C5671b.m23006a(this.f$0, gVar);
                }
            }, BackpressureStrategy.BUFFER);
        }
        C13479a.m54758a("BearCookieManager", "checkAccount()... in lark token is empty");
        throw new DocException(-51, "lark token is null");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23003a(AbstractC68323g gVar, AccountService.Account account) throws Exception {
        if (!gVar.isCancelled()) {
            gVar.onNext(account);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23004a(AbstractC68323g gVar, Throwable th) throws Exception {
        if (!gVar.isCancelled()) {
            gVar.onError(th);
        }
        C13479a.m54761a("BearCookieManager", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23006a(String str, AbstractC68323g gVar) throws Exception {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(str).mo238014c($$Lambda$b$VYqE74Int_VfaHuy1UjiY5dOiNE.INSTANCE).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$b$GbosCoXH4C0hB3b1QGb1M152dc4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5671b.m23003a(AbstractC68323g.this, (AccountService.Account) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$b$ZMPdfItt_x0b7KnU27SEozzQT8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5671b.m23004a(AbstractC68323g.this, (Throwable) obj);
            }
        });
    }
}
