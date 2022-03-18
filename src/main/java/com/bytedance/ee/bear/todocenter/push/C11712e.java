package com.bytedance.ee.bear.todocenter.push;

import android.app.Application;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.service.callback.C10918a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.todocenter.push.e */
public class C11712e extends AbstractC11708a {

    /* renamed from: a */
    private static final Object f31505a = "TODO_NOTICE_";

    /* renamed from: b */
    private final AtomicBoolean f31506b = new AtomicBoolean(false);

    /* renamed from: c */
    private RnPushProtocol f31507c;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11711d
    public void unregisterTodoPushListener() {
        try {
            RnPushProtocol rnPushProtocol = this.f31507c;
            if (rnPushProtocol != null) {
                rnPushProtocol.mo40241a();
                this.f31507c = null;
            }
        } catch (Exception e) {
            C13479a.m54761a("TodoRNService", e);
        } catch (Throwable th) {
            this.f31506b.set(false);
            throw th;
        }
        this.f31506b.set(false);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.todocenter.push.AbstractC11708a
    public void lazyInit(Application application) {
        super.lazyInit(application);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48561a(AccountService.Account account) throws Exception {
        RnPushProtocol rnPushProtocol = this.f31507c;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11711d
    public void registerTodoPushListener(int i) {
        if (!this.f31506b.get()) {
            this.f31506b.set(true);
            ((an) KoinJavaComponent.m268610a(an.class)).mo16405c().mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238005b(new Consumer() {
                /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$e$umeT0k43pL3X07J9c8Lfm7ZcJy8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11712e.this.m48561a((C11712e) ((AccountService.Account) obj));
                }
            }).mo238001b(new Consumer(i) {
                /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$e$F07J9JNYvjwCb72HMVpqgyE4RYY */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11712e.this.m48560a((C11712e) this.f$1, (int) ((AccountService.Account) obj));
                }
            }, $$Lambda$e$Xx2hBRoO9g2q14WDPlnMT9jCPg.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m48562a(String str) {
        C13479a.m54764b("TodoRNService", "todo push call back");
        C10918a.m45420a(TodoPushIPCEntity.class, new TodoPushIPCEntity(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DefinitionParameters m48559a(AccountService.Account account, int i) {
        return C70039b.m268661a(f31505a, account.f14584a, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48560a(int i, AccountService.Account account) throws Exception {
        C13479a.m54764b("TodoRNService", "register todo push : " + account.f14584a);
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Specify, new Function0(i) {
            /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$e$Y7TFqP9ZW29MMKFVFy4mfApeKoQ */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11712e.m48559a(AccountService.Account.this, this.f$1);
            }
        });
        this.f31507c = rnPushProtocol;
        rnPushProtocol.mo40242a($$Lambda$e$X3RFTEL0pSLDoUWwv0BztaQFDzA.INSTANCE);
    }
}
