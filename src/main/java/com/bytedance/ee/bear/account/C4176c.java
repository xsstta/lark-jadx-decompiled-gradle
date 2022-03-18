package com.bytedance.ee.bear.account;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.account.c */
public class C4176c {

    /* renamed from: a */
    private final C4165b f12638a;

    /* renamed from: b */
    private final NetContract f12639b;

    /* renamed from: a */
    public Single<C4201m> mo16388a() {
        return this.f12638a.mo16378a();
    }

    /* renamed from: b */
    public C4201m mo16391b() {
        return this.f12638a.mo16382b();
    }

    /* renamed from: c */
    public Single<Boolean> mo16392c() {
        return this.f12638a.mo16386d();
    }

    /* renamed from: com.bytedance.ee.bear.account.c$a */
    public static class C4177a {

        /* renamed from: a */
        private NetContract f12640a;

        /* renamed from: b */
        private Context f12641b;

        /* renamed from: a */
        public C4176c mo16394a() {
            return new C4176c(this.f12641b, this.f12640a);
        }

        /* renamed from: a */
        public C4177a mo16393a(NetContract netContract) {
            this.f12640a = netContract;
            return this;
        }

        public C4177a(Context context) {
            this.f12641b = context;
        }
    }

    /* renamed from: a */
    public void mo16390a(C4201m mVar) {
        this.f12638a.mo16381a(mVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ AbstractC68307f m17323b(C4201m mVar) {
        if (TextUtils.isEmpty(mVar.mo16474a()) || TextUtils.isEmpty(mVar.mo16498i())) {
            return AbstractC68307f.m265084a((Throwable) new LoginException("user id or token is empty."));
        }
        return this.f12638a.mo16384c(mVar).toFlowable();
    }

    /* renamed from: a */
    public Single<Boolean> mo16389a(String str) {
        return new C4209p(this.f12638a, this.f12639b).mo16529a(str).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.account.$$Lambda$c$Gt489XsQqXoD3qfBw3o9E_lFUo */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4176c.m269066lambda$Gt489XsQqXoD3qfBw3o9E_lFUo(this.f$0, (UserInfo) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.account.$$Lambda$c$yHTAXGgmnjeKS5TNkoafboXzV3M */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4176c.lambda$yHTAXGgmnjeKS5TNkoafboXzV3M(C4176c.this, (C4201m) obj);
            }
        }).mo238035j();
    }

    C4176c(Context context, NetContract netContract) {
        this.f12638a = new C4165b(context);
        this.f12639b = netContract;
    }

    /* renamed from: a */
    public static /* synthetic */ C4201m m17322a(String str, UserInfo userInfo) {
        C13479a.m54764b("AccountFacade", "apply: populate user information to user. : " + userInfo);
        C4201m mVar = new C4201m();
        mVar.mo16499i(str);
        mVar.mo16476a(userInfo);
        return mVar;
    }
}
