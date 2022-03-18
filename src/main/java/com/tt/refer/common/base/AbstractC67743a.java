package com.tt.refer.common.base;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.refer.common.base.AbstractC67744b;

/* renamed from: com.tt.refer.common.base.a */
public abstract class AbstractC67743a<D extends AbstractC67744b> extends AbstractC67457c implements AbstractC67745c<D> {

    /* renamed from: a */
    private D f170599a = mo235129h();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract D mo235129h();

    @Override // com.tt.refer.common.base.AbstractC67745c
    /* renamed from: i */
    public D mo235130i() {
        return this.f170599a;
    }

    protected AbstractC67743a(IAppContext iAppContext) {
        super(iAppContext);
    }
}
