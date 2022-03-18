package com.tt.refer.p3400a.p3404c;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67438f;
import com.tt.refer.common.service.net.AbstractC67855c;
import com.tt.refer.common.service.net.p3426a.C67853a;
import com.tt.refer.impl.business.container.ContainerServiceImpl;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;

/* renamed from: com.tt.refer.a.c.a */
public class C67719a implements AbstractC67438f {
    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(IAppContext iAppContext, Class cls) {
        if (AbstractC67855c.class == cls) {
            return new C67853a(iAppContext);
        }
        if (AbstractC67720a.class == cls) {
            return new ContainerServiceImpl(iAppContext);
        }
        return null;
    }
}
