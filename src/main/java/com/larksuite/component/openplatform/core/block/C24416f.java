package com.larksuite.component.openplatform.core.block;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12911a;
import com.bytedance.ee.ref.impl.host.C13577a;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24564c;
import com.larksuite.component.openplatform.core.loader.p1123b.p1124a.p1125a.C24511a;
import com.tt.miniapp.business.api.base.CommonApiInvokeDispatcher;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67437e;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.impl.business.api.C67876b;
import com.tt.refer.impl.business.file.C67924c;
import com.tt.refer.impl.business.p3435f.C67916a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

/* renamed from: com.larksuite.component.openplatform.core.block.f */
public class C24416f implements AbstractC67437e {
    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67437e
    /* renamed from: a */
    public AppType mo50158a() {
        return AppType.BlockitApp;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(IAppContext iAppContext, Class cls) {
        if (AbstractC67709b.class == cls) {
            return new C67876b(iAppContext, new CommonApiInvokeDispatcher(iAppContext, mo50158a()));
        }
        if (AbstractC12910a.class == cls) {
            return new C67916a(iAppContext, new C12911a(iAppContext));
        }
        if (AbstractC67724a.class == cls) {
            return new C13577a(iAppContext);
        }
        if (IAppMetaService.class == cls) {
            return new C24564c(iAppContext);
        }
        if (AbstractC67796c.class == cls) {
            return new C24409a(iAppContext);
        }
        if (IPkgMgrService.class == cls) {
            return new C24511a(iAppContext);
        }
        if (AbstractC67722a.class == cls) {
            return new C67924c(iAppContext, new C24411c(iAppContext));
        }
        if (AbstractC67717a.class == cls) {
            return new C24414e(iAppContext);
        }
        return null;
    }
}
