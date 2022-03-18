package com.bytedance.ee.bear.document.offline.sync;

import com.bytedance.ee.bear.contract.AccountService;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.m */
public class C6005m {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.m$a */
    public static class C6007a {

        /* renamed from: a */
        static C6005m f16815a = new C6005m();
    }

    private C6005m() {
    }

    /* renamed from: a */
    public static C6005m m24312a() {
        return C6007a.f16815a;
    }

    /* renamed from: b */
    private Map<Integer, AbstractC5997i> m24313b() {
        return ((AbstractC5988f) KoinJavaComponent.m268610a(AbstractC5988f.class)).mo24232a();
    }

    /* renamed from: a */
    public AbstractC5997i mo24271a(int i) {
        return m24313b().get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo24272a(AccountService.Account account) {
        for (AbstractC5997i iVar : m24313b().values()) {
            iVar.mo24217a(account);
        }
    }

    /* renamed from: a */
    public void mo24273a(AbstractC5990h hVar) {
        for (AbstractC5997i iVar : m24313b().values()) {
            iVar.mo24222a(hVar);
        }
    }
}
