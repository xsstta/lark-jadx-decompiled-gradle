package com.tt.miniapphost.process.p3376b;

import com.tt.miniapp.process.p3317b.C66619a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

/* renamed from: com.tt.miniapphost.process.b.c */
public class C67566c implements AbstractC67564a {

    /* renamed from: a */
    private AbstractC67564a f170381a;

    /* renamed from: a */
    public static C67566c m262973a() {
        return ContextSingletonInstance.getInstance().getIpcCallbackManagerProxy();
    }

    /* renamed from: b */
    private boolean m262974b() {
        if (this.f170381a != null) {
            return true;
        }
        synchronized (C67566c.class) {
            if (this.f170381a == null) {
                this.f170381a = new C66619a();
            }
        }
        return true;
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public void mo232254a(int i) {
        if (m262974b()) {
            this.f170381a.mo232254a(i);
        }
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public void mo232256a(AbstractC67565b bVar) {
        if (m262974b()) {
            this.f170381a.mo232256a(bVar);
        }
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public void mo232257a(String str) {
        if (m262974b()) {
            this.f170381a.mo232257a(str);
        }
    }

    /* renamed from: a */
    public void mo234713a(int i, CrossProcessDataEntity crossProcessDataEntity) {
        mo232255a(i, crossProcessDataEntity, false);
    }

    @Override // com.tt.miniapphost.process.p3376b.AbstractC67564a
    /* renamed from: a */
    public void mo232255a(int i, CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        if (m262974b()) {
            this.f170381a.mo232255a(i, crossProcessDataEntity, z);
        }
    }
}
