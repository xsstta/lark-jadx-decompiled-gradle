package com.bytedance.ee.bear.account;

import android.app.Application;
import android.os.IInterface;
import android.text.TextUtils;
import androidx.room.EmptyResultSetException;
import com.bytedance.ee.bear.account.C4176c;
import com.bytedance.ee.bear.account.C4188f;
import com.bytedance.ee.bear.account.NetContract;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5114b;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
import com.bytedance.ee.bear.service.remote.C10959f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.DBController;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.AbstractC69015w;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Single;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.account.f */
public class C4188f extends AbstractC5114b {

    /* renamed from: a */
    private final C10959f<BinderAccountChangeCallback> f12659a = new C10959f<>();

    /* renamed from: b */
    private C4176c f12660b;

    /* renamed from: c */
    private AtomicBoolean f12661c = new AtomicBoolean(false);

    /* renamed from: d */
    private AtomicBoolean f12662d = new AtomicBoolean(false);

    public static /* synthetic */ Boolean lambda$24LH3EzGEScuj0apCNh76MLNZLI(Boolean bool) {
        return true;
    }

    /* renamed from: lambda$e_Es_iwFYK-nD2_cmBRnfnqIBbg  reason: not valid java name */
    public static /* synthetic */ Boolean m269071lambda$e_Es_iwFYKnD2_cmBRnfnqIBbg(Throwable th) {
        return true;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m17386d() throws Exception {
        this.f12661c.set(false);
        m17382c();
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<AccountService.Account> findLoginUser() {
        return this.f12660b.mo16388a().map(new Function() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$dl56IpUU8vtnESaVkdHSnAsTrEw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.this.m17379c((C4201m) obj);
            }
        }).map($$Lambda$f$4x6jKJQ3hcJzYKCYPJdEWqVmg.INSTANCE).onErrorResumeNext($$Lambda$f$KRfcqwyRvPH7QdFNk8WVV6hRjRA.INSTANCE).toFlowable();
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> logoutFlow() {
        return this.f12660b.mo16392c().toFlowable().mo238020d(new Function() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$l9OewxGTMKliAYM9rSw_hLfLPx8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.this.m17380c((Boolean) obj);
            }
        }).mo237985a(C11678b.m48480d());
    }

    /* renamed from: c */
    private void m17382c() {
        C13479a.m54764b("AccountServiceImp", "notifyUserChange()...thread " + Thread.currentThread().getName());
        AbstractC68307f.m265083a("true").mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$CzYCtxduyOo0L1UXPaonRVA1qtE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4188f.this.m17378b((C4188f) ((String) obj));
            }
        }, $$Lambda$f$DgpfFvZPLhp3yQp049rnZXOLPAA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.account.f$a */
    public static class C4190a<R extends NetContract.Result> implements NetService.AbstractC5074c<C4191b<R>> {

        /* renamed from: a */
        private NetContract.AbstractC4160a<R> f12663a;

        public C4190a(NetContract.AbstractC4160a<R> aVar) {
            this.f12663a = aVar;
        }

        /* renamed from: a */
        public C4191b<R> parse(String str) {
            return new C4191b<>(this.f12663a.mo16368a(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.account.f$b */
    public static class C4191b<R extends NetContract.Result> extends NetService.Result {
        public R mOrigin;

        C4191b(R r) {
            this.mOrigin = r;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.account.f$c */
    public class C4192c implements NetContract {
        private C4192c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m17389a(AbstractC68323g gVar, C4191b bVar) throws Exception {
            if (!gVar.isCancelled()) {
                gVar.onNext(bVar.mOrigin);
                gVar.onComplete();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m17390a(AbstractC68323g gVar, Throwable th) throws Exception {
            C13479a.m54759a("AccountServiceImp", "NetContractAdapter  pull fail.", th);
            if (!gVar.isCancelled()) {
                gVar.onError(th);
                gVar.onComplete();
            }
        }

        @Override // com.bytedance.ee.bear.account.NetContract
        /* renamed from: a */
        public <R extends NetContract.Result> AbstractC68307f<R> mo16361a(String str, NetContract.AbstractC4160a<R> aVar, String str2) {
            return AbstractC68307f.m265080a(new AbstractC68324h(str) {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$c$bexDA92mcflqqn5Q5Kzd_0btyjI */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.AbstractC68324h
                public final void subscribe(AbstractC68323g gVar) {
                    C4188f.C4192c.m17388a(NetContract.AbstractC4160a.this, this.f$1, gVar);
                }
            }, BackpressureStrategy.BUFFER);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m17388a(NetContract.AbstractC4160a aVar, String str, AbstractC68323g gVar) throws Exception {
            NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C4190a(aVar));
            C13479a.m54764b("AccountServiceImp", "pull()...host = " + ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20116a().f14784a + ", path = " + str);
            a.mo20141a(new NetService.C5077f(str)).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$c$ooWEGtsgi3C0E9mTef9ZCTfkaI */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4188f.C4192c.m17389a(AbstractC68323g.this, (C4188f.C4191b) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$c$gL6i_ofC_lzQc81XgIJPoJcke8I */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4188f.C4192c.m17390a(AbstractC68323g.this, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> checkAndLogin(String str) {
        return m17367a(false, str);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public void unregisterChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
        this.f12659a.mo41597b(binderAccountChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public void registerChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
        if (binderAccountChangeCallback == null) {
            C13479a.m54758a("AccountServiceImp", "callback is null! There must be some problem in process.");
        } else {
            this.f12659a.mo41595a(binderAccountChangeCallback);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m17371a(String str) throws Exception {
        return logoutFlow();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m17377b(Throwable th) throws Exception {
        this.f12661c.set(false);
        if (!(th instanceof EmptyResultSetException)) {
            return AbstractC68307f.m265084a(th);
        }
        C13479a.m54764b("AccountServiceImp", "checkAndLoginFlow()...EmptyResultSetException");
        return AbstractC68307f.m265083a(new AccountService.Account());
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> checkLoginInfo(LoginInfo loginInfo) {
        C13479a.m54764b("AccountServiceImp", "checkLoginInfo()...   loginInfo ");
        ((an) KoinJavaComponent.m268610a(an.class)).mo16400a(loginInfo);
        return checkAndLogin(loginInfo.mo20247b());
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5114b, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        C4176c.C4177a aVar = new C4176c.C4177a(application);
        aVar.mo16393a(new C4192c());
        this.f12660b = aVar.mo16394a();
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> loginFlow(String str) {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$sJQetaduS1EmIWZRoXB258nHVM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.this.m17381c(this.f$1, (Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m17368a(Boolean bool) throws Exception {
        if (C5084ad.m20847d().mo20038b().mo20041b()) {
            return true;
        }
        C13479a.m54764b("AccountServiceImp", "checkAndLoginFlow()... network is not connected.");
        this.f12661c.set(false);
        throw new IOException("checkAndLoginFlow()... Network doesn't connected.");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m17380c(Boolean bool) throws Exception {
        C13479a.m54764b("AccountServiceImp", "logoutFlow()...thread = " + Thread.currentThread().getName() + ", result = " + bool);
        if (bool.booleanValue()) {
            m17382c();
        }
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC69015w m17384d(Throwable th) throws Exception {
        C13479a.m54759a("AccountServiceImp", "findLoginUser(): ", th);
        if (th instanceof EmptyResultSetException) {
            return Single.just(new AccountService.Account());
        }
        if (th instanceof DBController.GetDBException) {
            return Single.just(new AccountService.Account());
        }
        return Single.error(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17378b(String str) throws Exception {
        this.f12659a.mo41596a(new C10959f.AbstractC10961b() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$lHYaC_tvmNGD3AP2E8kmucTjM9w */

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderAccountChangeCallback) iInterface).onChange(AccountService.Account.this);
            }
        });
        this.f12662d.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ C4201m m17379c(C4201m mVar) throws Exception {
        boolean z;
        String w = C4511g.m18594d().mo17373w();
        if (mVar == null) {
            C13479a.m54775e("AccountServiceImp", "findLoginUser apply: user is null");
            return null;
        } else if (TextUtils.isEmpty(w) || TextUtils.equals(w, mVar.mo16493g())) {
            StringBuilder sb = new StringBuilder();
            sb.append("findLoginUser apply(): user avatar not change,avatarUrl is null == ");
            if (w == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("AccountServiceImp", sb.toString());
            return mVar;
        } else {
            mVar.mo16494g(w);
            this.f12660b.mo16390a(mVar);
            return mVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Boolean m17385d(Boolean bool) throws Exception {
        C13479a.m54764b("AccountServiceImp", "loginFlow()...thread = " + Thread.currentThread().getName() + ", result = " + bool);
        return bool;
    }

    @Override // com.bytedance.ee.bear.contract.AccountService
    public AbstractC68307f<Boolean> notifyConfigChange(DocDynamicConfig docDynamicConfig) {
        String str;
        C13479a.m54764b("AccountServiceImp", "notifyConfigChange begines");
        DBController.m55314a().mo50587a(docDynamicConfig.mo20227d().mo20246a());
        ((an) KoinJavaComponent.m268610a(an.class)).mo16400a(docDynamicConfig.mo20227d());
        ((AbstractC4163a) KoinJavaComponent.m268610a(AbstractC4163a.class)).mo16376a(docDynamicConfig);
        if (docDynamicConfig.mo20227d() == null) {
            str = "";
        } else {
            str = docDynamicConfig.mo20227d().mo20247b();
        }
        return m17367a(true, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static AccountService.Account m17366a(C4201m mVar) {
        if (mVar == null) {
            C13479a.m54758a("AccountServiceImp", "  convert(): User is null");
            return null;
        }
        AccountService.Account account = new AccountService.Account();
        account.f14584a = mVar.mo16474a();
        account.f14585b = mVar.mo16514s();
        account.f14586c = mVar.mo16485d();
        account.f14587d = mVar.mo16488e();
        account.f14588e = mVar.mo16491f();
        account.f14589f = mVar.mo16493g();
        account.f14590g = mVar.mo16495h();
        account.f14591h = mVar.mo16498i();
        account.f14592i = mVar.mo16502k();
        account.f14593j = mVar.mo16508n();
        account.f14595l = mVar.mo16479b();
        account.f14596m = mVar.mo16482c();
        account.f14597n = mVar.mo16515t();
        account.f14598o = mVar.mo16510o();
        account.f14600q = mVar.mo16511p();
        account.f14601r = mVar.mo16512q();
        account.f14602s = mVar.mo16513r();
        account.f14594k = mVar.mo16500j();
        account.f14599p = mVar.mo16504l();
        account.f14603t = mVar.mo16507m();
        return account;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m17369a(String str, AccountService.Account account) throws Exception {
        return Boolean.valueOf(TextUtils.equals(account.f14591h, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m17381c(String str, Boolean bool) throws Exception {
        return this.f12660b.mo16389a(str).toFlowable().mo238020d($$Lambda$f$I2faXk0BBL2BVaWbfdq5NsIVvXA.INSTANCE).mo238021d(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$QKuhvfMfatL98wSzX18sr1iF6U */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C4188f.this.m17386d();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC68307f m17375b(String str, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C13479a.m54764b("AccountServiceImp", "checkAndLoginFlow()... begin log in");
            return loginFlow(str);
        }
        this.f12661c.set(false);
        return AbstractC68307f.m265083a((Object) false);
    }

    /* renamed from: a */
    private AbstractC68307f<Boolean> m17367a(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("AccountServiceImp", "checkAndLogin()...   token == null");
            return AbstractC68307f.m265083a((Object) false);
        }
        if (z && !this.f12662d.get()) {
            C13479a.m54764b("AccountServiceImp", "checkAndLogin()...  open force notify switch");
            this.f12662d.set(true);
        }
        if (this.f12661c.get()) {
            C13479a.m54764b("AccountServiceImp", "checkAndLogin()...  mIsLogining true");
            return AbstractC68307f.m265083a((Object) false);
        }
        C13479a.m54764b("AccountServiceImp", "checkAndLogin()...  encrypttoken: " + str.hashCode());
        this.f12661c.set(true);
        return findLoginUser().mo238026e(new Function() {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$GYQ0DAMeC_p28OFN1UFRFXPC8OQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.this.m17377b((Throwable) obj);
            }
        }).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$VcjgfQNDWexgjbTcOb6eSiLhJc */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.m17369a(this.f$0, (AccountService.Account) obj);
            }
        }).mo237990a(new Function(str) {
            /* class com.bytedance.ee.bear.account.$$Lambda$f$i93TrJVk3YwdHp40LhikuSiCumk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4188f.this.m17372a(this.f$1, (Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m17372a(String str, Boolean bool) throws Exception {
        C13479a.m54764b("AccountServiceImp", "checkAndLoginFlow()... account checking result:" + bool);
        if (!bool.booleanValue()) {
            return AbstractC68307f.m265083a(str).mo238014c(new Function() {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$oqCiENSzEU9mSpWaDDvloUA8sDQ */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4188f.this.m17371a((String) obj);
                }
            }).mo238020d($$Lambda$f$24LH3EzGEScuj0apCNh76MLNZLI.INSTANCE).mo238029f($$Lambda$f$e_Es_iwFYKnD2_cmBRnfnqIBbg.INSTANCE).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$InCz_GAtmfYBap0m23ADWlKOWwE */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4188f.this.m17368a((Boolean) obj);
                }
            }).mo238014c(new Function(str) {
                /* class com.bytedance.ee.bear.account.$$Lambda$f$NAJhsg_957mzEI1HHQ0J4cNtzyM */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4188f.this.m17375b(this.f$1, (Boolean) obj);
                }
            });
        }
        if (this.f12662d.get()) {
            C13479a.m54764b("AccountServiceImp", "checkAndLogin()... force notify the listener, might due to the changeof tenant");
            m17382c();
        }
        C13479a.m54764b("AccountServiceImp", "checkAndLogin()... account is fit.");
        this.f12661c.set(false);
        return AbstractC68307f.m265083a((Object) true);
    }
}
