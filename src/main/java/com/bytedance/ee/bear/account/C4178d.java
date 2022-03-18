package com.bytedance.ee.bear.account;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.ee.bear.account.d */
public class C4178d implements AbstractC4196j {

    /* renamed from: a */
    private static volatile C4178d f12642a;

    /* renamed from: b */
    private boolean f12643b;

    /* renamed from: c */
    private C10917c f12644c = new C10917c(new C10929e());

    /* renamed from: d */
    private AccountService.Account f12645d;

    /* renamed from: e */
    private Set<AccountService.AbstractC4981a> f12646e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private BinderIProcessStart f12647f;

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public synchronized void mo16400a(LoginInfo loginInfo) {
        AccountService.Account account = this.f12645d;
        if (account == null || !TextUtils.equals(account.f14591h, loginInfo.mo20247b()) || !TextUtils.equals(this.f12645d.f14584a, loginInfo.mo20246a())) {
            C13479a.m54764b("AccountManager", "  injectAccount  uid: " + loginInfo.mo20246a() + "   encrypttoken: " + loginInfo.mo20247b().hashCode());
            AccountService.Account account2 = new AccountService.Account();
            this.f12645d = account2;
            account2.f14591h = loginInfo.mo20247b();
            this.f12645d.f14584a = loginInfo.mo20246a();
            this.f12645d.f14585b = loginInfo.mo20251e();
            this.f12645d.f14589f = loginInfo.mo20248c();
            this.f12645d.f14592i = loginInfo.mo20253g();
            this.f12645d.f14593j = loginInfo.mo20254h();
            this.f12645d.f14595l = loginInfo.mo20251e();
            this.f12645d.f14596m = loginInfo.mo20252f();
            this.f12645d.f14594k = -1;
            return;
        }
        C13479a.m54764b("AccountManager", "injectAccount same loginInfo ");
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public void mo16399a(BinderAccountChangeCallback binderAccountChangeCallback) {
        if (binderAccountChangeCallback != null) {
            this.f12646e.add(binderAccountChangeCallback);
        }
        mo16405c().mo238001b(new Consumer(binderAccountChangeCallback) {
            /* class com.bytedance.ee.bear.account.$$Lambda$d$Z9F57uqxUyBnepuC4PHRlPeMSiM */
            public final /* synthetic */ BinderAccountChangeCallback f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4178d.this.m17333a(this.f$1, (AccountService.Account) obj);
            }
        }, $$Lambda$d$P8DoHeLLcRECGs6CkbCHINowIzU.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: g */
    public boolean mo16409g() {
        AccountService.Account account = this.f12645d;
        if (account != null) {
            return account.mo19677a();
        }
        return false;
    }

    private C4178d() {
    }

    /* renamed from: a */
    public static C4178d m17331a() {
        if (f12642a == null) {
            synchronized (C4178d.class) {
                if (f12642a == null) {
                    f12642a = new C4178d();
                }
            }
        }
        return f12642a;
    }

    /* renamed from: h */
    private void m17344h() {
        AbstractC68307f.m265083a("true").mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$d$EbqiyPsqwStNJ77v6tsBtmsjb_U */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4178d.this.m17338b((C4178d) ((String) obj));
            }
        }, $$Lambda$d$Ezn45k0gmFWgww6D1MmCUbGYSUw.INSTANCE);
    }

    /* renamed from: i */
    private AbstractC68307f<AccountService.Account> m17345i() {
        return this.f12644c.mo41508c(AccountService.class).mo238014c($$Lambda$d$Xj_LR2guI69MJp6YtJS6BNMy3GI.INSTANCE).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.account.$$Lambda$d$vcgYcT2Iaj9ynplnLb8pJ7ug5H8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4178d.this.m17339c((AccountService.Account) obj);
            }
        }).mo238029f($$Lambda$d$CwkY6nnXw6d_oJVL8IY4iPFjXMw.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: d */
    public AccountService.Account mo16406d() {
        try {
            return mo16405c().mo238017c();
        } catch (Exception e) {
            C13479a.m54759a("AccountManager", "AccountManager  findLoginUserBlocked : ", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: e */
    public AbstractC68307f<Boolean> mo16407e() {
        return this.f12644c.mo41508c(AccountService.class).mo238014c(new Function<AccountService, AbstractC68307f<Boolean>>() {
            /* class com.bytedance.ee.bear.account.C4178d.C41824 */

            /* renamed from: a */
            public AbstractC68307f<Boolean> apply(AccountService accountService) throws Exception {
                return accountService.logoutFlow();
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: f */
    public AccountService.Account mo16408f() {
        C13479a.m54764b("AccountManager", "LocalAccountServiceImp  findUserFromCache : " + this.f12645d);
        return this.f12645d;
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: c */
    public AbstractC68307f<AccountService.Account> mo16405c() {
        AccountService.Account account = this.f12645d;
        if (account == null) {
            return m17345i();
        }
        if (account.f14594k == -1) {
            return m17345i().mo238020d(new Function() {
                /* class com.bytedance.ee.bear.account.$$Lambda$d$pHH4P8qjVFes0oRl_p2vtQVQi20 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4178d.this.m17341d((AccountService.Account) obj);
                }
            });
        }
        return AbstractC68307f.m265083a(this.f12645d);
    }

    /* renamed from: b */
    public void mo16402b() {
        this.f12644c.mo41508c(AccountService.class).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$d$rc46YoDsmr7RX2mACK7ZOESZE24 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4178d.this.m17337b((C4178d) ((AccountService) obj));
            }
        }, $$Lambda$d$rE66Nvxgznbhp61z0KbQcnrTcMs.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AccountService.Account m17341d(AccountService.Account account) throws Exception {
        return this.f12645d;
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: b */
    public void mo16404b(BinderAccountChangeCallback binderAccountChangeCallback) {
        if (binderAccountChangeCallback != null) {
            this.f12646e.remove(binderAccountChangeCallback);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m17332a(AccountService accountService) throws Exception {
        C13479a.m54764b("AccountManager", "getRemoteLoginUser STATE_LOCAL_LOGIN  start ");
        return accountService.findLoginUser();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AccountService.Account m17336b(Throwable th) throws Exception {
        C13479a.m54759a("AccountManager", "getRemoteLoginUser failed : ", th);
        return new AccountService.Account();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17337b(AccountService accountService) throws Exception {
        try {
            accountService.registerChangeCallback(new AccountManager$2(this));
        } catch (Throwable th) {
            C13479a.m54761a("AccountManager", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17334a(ak akVar) throws Exception {
        akVar.addProcessStartCallback(this.f12647f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17338b(String str) throws Exception {
        this.f12647f = new AccountManager$1(this);
        this.f12644c.mo41507b(ak.class).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.account.$$Lambda$d$2NI5KCV9rpL3_WU8n6uV0mpi7q0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4178d.this.m17334a((C4178d) ((ak) obj));
            }
        }, $$Lambda$d$hICrB261Cp9ukvZ_BS39xqnH9A.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AccountService.Account m17339c(AccountService.Account account) throws Exception {
        int i;
        if (account == null || TextUtils.isEmpty(account.f14591h)) {
            i = 0;
        } else {
            i = account.f14591h.hashCode();
        }
        C13479a.m54764b("AccountManager", "getRemoteLoginUser STATE_LOCAL_LOGIN account " + account + "   encrypttoken: " + i);
        mo16403b(account);
        return account;
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo16401b(final LoginInfo loginInfo) {
        return this.f12644c.mo41508c(AccountService.class).mo238014c(new Function<AccountService, AbstractC68307f<Boolean>>() {
            /* class com.bytedance.ee.bear.account.C4178d.C41813 */

            /* renamed from: a */
            public AbstractC68307f<Boolean> apply(AccountService accountService) throws Exception {
                return accountService.checkLoginInfo(loginInfo);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo16395a(final DocDynamicConfig docDynamicConfig) {
        mo16400a(docDynamicConfig.mo20227d());
        return this.f12644c.mo41508c(AccountService.class).mo238014c(new Function<AccountService, AbstractC68307f<Boolean>>() {
            /* class com.bytedance.ee.bear.account.C4178d.C41835 */

            /* renamed from: a */
            public AbstractC68307f<Boolean> apply(AccountService accountService) throws Exception {
                C13479a.m54764b("AccountManager", "notifyConfigChange to remote starts");
                return accountService.notifyConfigChange(docDynamicConfig);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo16396a(final String str) {
        return this.f12644c.mo41508c(AccountService.class).mo238014c(new Function<AccountService, AbstractC68307f<Boolean>>() {
            /* class com.bytedance.ee.bear.account.C4178d.C41802 */

            /* renamed from: a */
            public AbstractC68307f<Boolean> apply(AccountService accountService) throws Exception {
                return accountService.checkAndLogin(str);
            }
        });
    }

    /* renamed from: b */
    public void mo16403b(AccountService.Account account) {
        if (C13616d.m55263b()) {
            AccountService.Account account2 = this.f12645d;
            if (account2 == null || account2.f14584a == null || !(account == null || account.f14584a == null)) {
                this.f12645d = account;
                return;
            }
            return;
        }
        AccountService.Account account3 = this.f12645d;
        if (account3 == null || account3.f14584a == null || (account != null && TextUtils.equals(account.f14584a, this.f12645d.f14584a) && TextUtils.equals(account.f14591h, this.f12645d.f14591h))) {
            this.f12645d = account;
        }
    }

    /* renamed from: a */
    public void mo16397a(Context context) {
        if (!this.f12643b) {
            this.f12643b = true;
            m17344h();
            mo16402b();
        }
    }

    /* renamed from: a */
    public synchronized void mo16398a(final AccountService.Account account) {
        Set<AccountService.AbstractC4981a> set = this.f12646e;
        if (set != null && set.size() > 0) {
            for (final AccountService.AbstractC4981a aVar : this.f12646e) {
                if (aVar != null) {
                    if (aVar instanceof AccountService.AccountChangeUICallback) {
                        C13748k.m55732a(new Runnable() {
                            /* class com.bytedance.ee.bear.account.C4178d.RunnableC41791 */

                            public void run() {
                                aVar.onChange(account);
                            }
                        });
                    } else {
                        aVar.onChange(account);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17333a(BinderAccountChangeCallback binderAccountChangeCallback, AccountService.Account account) throws Exception {
        binderAccountChangeCallback.onChange(this.f12645d);
    }
}
