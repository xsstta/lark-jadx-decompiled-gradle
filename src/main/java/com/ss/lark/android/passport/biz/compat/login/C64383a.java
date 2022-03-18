package com.ss.lark.android.passport.biz.compat.login;

import android.util.SparseArray;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.lark.android.passport.biz.compat.login.a */
public class C64383a implements IAccountChangeObserver {

    /* renamed from: a */
    private ConcurrentHashMap<Object, C64385a> f162665a;

    /* renamed from: com.ss.lark.android.passport.biz.compat.login.a$b */
    private static class C64386b {

        /* renamed from: a */
        public static final C64383a f162672a = new C64383a();
    }

    /* renamed from: a */
    public static C64383a m253083a() {
        return C64386b.f162672a;
    }

    private C64383a() {
        this.f162665a = new ConcurrentHashMap<>();
        C64395b.m253103a().mo222948a(new C64395b.AbstractC64400b() {
            /* class com.ss.lark.android.passport.biz.compat.login.$$Lambda$a$PpDZ8CnLKRFBgFrKb3Nbcg_FJM */

            @Override // com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b.AbstractC64400b
            public final void onLoginInfoChange(LoginInfo loginInfo, LoginInfo loginInfo2) {
                C64383a.this.m253085a((C64383a) loginInfo, loginInfo2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.login.a$a */
    public class C64385a implements IAccountChangeObserver.AbstractC49385a {

        /* renamed from: a */
        public int f162669a;

        /* renamed from: b */
        public IAccountChangeObserver.AbstractC49385a f162670b;

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
        public void onAccountChange(LoginInfo loginInfo) {
            this.f162670b.onAccountChange(loginInfo);
        }

        public C64385a(int i, IAccountChangeObserver.AbstractC49385a aVar) {
            this.f162669a = i;
            this.f162670b = aVar;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver
    /* renamed from: b */
    public void mo172399b(IAccountChangeObserver.AbstractC49385a aVar) {
        if (aVar != null) {
            this.f162665a.remove(aVar);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver
    /* renamed from: a */
    public void mo172398a(IAccountChangeObserver.AbstractC49385a aVar) {
        mo222940a(1, aVar);
    }

    /* renamed from: a */
    private void m253084a(final LoginInfo loginInfo) {
        PassportLog.f123351c.mo171474a().mo171465b("AccountChangeObserver", "start notify");
        final SparseArray sparseArray = new SparseArray();
        for (Map.Entry<Object, C64385a> entry : this.f162665a.entrySet()) {
            C64385a value = entry.getValue();
            if (!(value == null || value.f162670b == null)) {
                List list = (List) sparseArray.get(value.f162669a);
                if (list == null) {
                    list = new ArrayList();
                    sparseArray.put(value.f162669a, list);
                }
                list.add(value.f162670b);
            }
        }
        List<IAccountChangeObserver.AbstractC49385a> list2 = (List) sparseArray.get(0);
        if (list2 != null) {
            for (IAccountChangeObserver.AbstractC49385a aVar : list2) {
                if (aVar != null) {
                    PassportLog.f123351c.mo171474a().mo171465b("AccountChangeObserver", "IAccountChangeListener onAccountChange");
                    aVar.onAccountChange(loginInfo);
                }
            }
        }
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.compat.login.C64383a.RunnableC643841 */

            public void run() {
                List<IAccountChangeObserver.AbstractC49385a> list = (List) sparseArray.get(1);
                if (list != null) {
                    for (IAccountChangeObserver.AbstractC49385a aVar : list) {
                        if (aVar != null) {
                            PassportLog.f123351c.mo171474a().mo171465b("AccountChangeObserver", "CoreThreadPool onAccountChange");
                            aVar.onAccountChange(loginInfo);
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m253085a(LoginInfo loginInfo, LoginInfo loginInfo2) {
        m253084a(loginInfo2);
    }

    /* renamed from: a */
    public void mo222940a(int i, IAccountChangeObserver.AbstractC49385a aVar) {
        if (aVar != null) {
            this.f162665a.put(aVar, new C64385a(i, aVar));
        }
    }
}
