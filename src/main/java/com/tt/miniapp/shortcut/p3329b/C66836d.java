package com.tt.miniapp.shortcut.p3329b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.shortcut.ShortcutResult;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.shortcut.b.d */
public class C66836d extends AbstractC66828a {
    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.shortcut.p3329b.AbstractC66828a
    /* renamed from: b */
    public ShortcutResult mo232759b() {
        if (C66588h.m260183a().mo232195a(this.f168584b, "com.android.launcher.permission.INSTALL_SHORTCUT")) {
            AppBrandLogger.m52828d("PermissionHandler", "has shortcut permission create directly");
            return mo232757a().mo232759b();
        }
        AppBrandLogger.m52828d("PermissionHandler", "no shortcut permission request");
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.android.launcher.permission.INSTALL_SHORTCUT");
        C66588h.m260183a().mo232191a(this.f168584b, (String[]) arrayList.toArray(new String[0]), new AbstractC66590i() {
            /* class com.tt.miniapp.shortcut.p3329b.C66836d.C668371 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                AppBrandLogger.m52828d("PermissionHandler", "granted shortcut permission");
                C66836d.this.f168585c.mo232769a(C66836d.this.mo232757a().mo232759b());
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52828d("PermissionHandler", "denied shortcut permission");
                C66836d.this.f168585c.mo232769a(new ShortcutResult(ShortcutResult.Result.FAIL, "permission_denied"));
            }
        });
        return null;
    }

    C66836d(C66838e eVar, IAppContext iAppContext) {
        super(eVar, iAppContext);
    }
}
