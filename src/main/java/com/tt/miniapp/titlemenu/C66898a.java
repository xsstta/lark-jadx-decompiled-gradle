package com.tt.miniapp.titlemenu;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tt.miniapp.titlemenu.a */
public class C66898a {

    /* renamed from: a */
    private Set<AbstractC66907c> f168741a = new HashSet();

    /* renamed from: a */
    public void mo232911a(AbstractC66907c cVar) {
        this.f168741a.add(cVar);
    }

    /* renamed from: a */
    public static C66898a m260906a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234295p();
    }

    /* renamed from: a */
    public void mo232912a(boolean z) {
        for (AbstractC66907c cVar : this.f168741a) {
            if (cVar != null) {
                cVar.mo230952a(z);
            }
        }
    }
}
