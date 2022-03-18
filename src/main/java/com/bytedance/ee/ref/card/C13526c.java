package com.bytedance.ee.ref.card;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12913b;
import com.bytedance.ee.ref.card.meta.C13550a;
import com.bytedance.ee.ref.card.meta.C13558b;
import com.bytedance.ee.ref.card.p689d.C13529a;
import com.bytedance.ee.ref.card.p691f.C13545c;
import com.bytedance.ee.ref.card.p692g.C13546a;
import com.bytedance.ee.ref.impl.host.C13577a;
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

/* renamed from: com.bytedance.ee.ref.card.c */
public class C13526c implements AbstractC67437e {
    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67437e
    /* renamed from: a */
    public AppType mo50158a() {
        return AppType.CardAPP;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(IAppContext iAppContext, Class cls) {
        if (AbstractC67709b.class == cls) {
            return new C67876b(iAppContext, new CommonApiInvokeDispatcher(iAppContext, mo50158a()));
        }
        if (AbstractC67717a.class == cls) {
            return new C13529a(iAppContext);
        }
        if (AbstractC12910a.class == cls) {
            return new C67916a(iAppContext, new C12913b(iAppContext));
        }
        if (AbstractC67724a.class == cls) {
            return new C13577a(iAppContext);
        }
        if (IAppMetaService.class == cls) {
            return new C13558b(iAppContext);
        }
        if (IPkgMgrService.class == cls) {
            return new C13545c(iAppContext);
        }
        if (AbstractC67722a.class == cls) {
            return new C67924c(iAppContext, new C13546a(iAppContext));
        }
        if (AbstractC67796c.class == cls) {
            return new C13550a(iAppContext);
        }
        return null;
    }
}
