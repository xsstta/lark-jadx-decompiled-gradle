package com.larksuite.component.openplatform.core.plugin.messenger.location;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3335u.C66998c;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.i */
public class C25226i {

    /* renamed from: a */
    private boolean f61594a;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.i$a */
    public static class C25228a {

        /* renamed from: a */
        public static final C25226i f61595a = new C25226i();
    }

    private C25226i() {
    }

    /* renamed from: a */
    public static C25226i m90650a() {
        return C25228a.f61595a;
    }

    /* renamed from: a */
    public synchronized void mo88330a(IAppContext iAppContext) {
        if (!this.f61594a) {
            this.f61594a = true;
            C66998c.m261128a(iAppContext).mo233045a(12);
        }
    }

    /* renamed from: b */
    public synchronized void mo88331b(IAppContext iAppContext) {
        if (this.f61594a) {
            this.f61594a = false;
            C66998c.m261128a(iAppContext).mo233047b(12);
        }
    }

    /* renamed from: c */
    public synchronized void mo88332c(IAppContext iAppContext) {
        if (!this.f61594a) {
            C66998c.m261128a(iAppContext).mo233045a(12);
        }
    }

    /* renamed from: d */
    public synchronized void mo88333d(IAppContext iAppContext) {
        if (!this.f61594a) {
            C66998c.m261128a(iAppContext).mo233047b(12);
        }
    }
}
