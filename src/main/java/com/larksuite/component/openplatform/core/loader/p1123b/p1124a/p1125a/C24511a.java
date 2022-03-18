package com.larksuite.component.openplatform.core.loader.p1123b.p1124a.p1125a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.block.C24421i;
import com.tt.refer.common.pkg.AbsPkgMgrService;

/* renamed from: com.larksuite.component.openplatform.core.loader.b.a.a.a */
public class C24511a extends AbsPkgMgrService {
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public String getPkgSuffix() {
        return ".zip";
    }

    public C24511a(IAppContext iAppContext) {
        super(iAppContext);
        setPkgMonitorCreator(new C24421i(iAppContext));
    }
}
