package com.tt.miniapphost.p3362a.p3367e;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;

/* renamed from: com.tt.miniapphost.a.e.c */
public abstract class AbstractC67457c implements IBaseService {

    /* renamed from: d */
    public IAppContext f170082d;

    public AbstractC67457c() {
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f170082d;
    }

    protected AbstractC67457c(IAppContext iAppContext) {
        this.f170082d = iAppContext;
    }
}
