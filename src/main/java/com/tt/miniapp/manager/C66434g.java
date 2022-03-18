package com.tt.miniapp.manager;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.p3392m.AbstractC67655b;

/* renamed from: com.tt.miniapp.manager.g */
public class C66434g {

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.manager.g$a */
    public static class C66436a {

        /* renamed from: a */
        static final C66434g f167706a = new C66434g();
    }

    private C66434g() {
    }

    /* renamed from: a */
    public static C66434g m259707a() {
        return C66436a.f167706a;
    }

    /* renamed from: b */
    public C12830f mo231986b(C12827e eVar, IAppContext iAppContext) {
        return HostDependManager.getInst().doRequest(eVar, iAppContext);
    }

    /* renamed from: a */
    public C12830f mo231984a(C12827e eVar, IAppContext iAppContext) {
        if (TextUtils.equals(eVar.mo48454q(), "GET")) {
            return HostDependManager.getInst().doGet(eVar, iAppContext);
        }
        return HostDependManager.getInst().doPostBody(eVar, iAppContext);
    }

    /* renamed from: a */
    public C12830f mo231985a(String str, IAppContext iAppContext) {
        return mo231984a(new C12827e(str, "GET"), iAppContext);
    }

    /* renamed from: a */
    public C12825c mo231983a(C12824b bVar, AbstractC67655b.AbstractC67656a aVar, IAppContext iAppContext) {
        return HostDependManager.getInst().downloadFile(bVar, aVar, iAppContext);
    }
}
