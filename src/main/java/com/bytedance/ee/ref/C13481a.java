package com.bytedance.ee.ref;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.ref.impl.host.C13577a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67437e;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67438f;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3404c.C67719a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

/* renamed from: com.bytedance.ee.ref.a */
public class C13481a implements AbstractC67437e {

    /* renamed from: a */
    private AbstractC67438f f35527a = new C67719a();

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67437e
    /* renamed from: a */
    public AppType mo50158a() {
        return AppType.UnKnown;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(IAppContext iAppContext, Class cls) {
        if (AbstractC67724a.class == cls) {
            return new C13577a(iAppContext);
        }
        return this.f35527a.mo50157a(iAppContext, cls);
    }
}
