package com.tt.miniapphost.p3362a.p3364b;

import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.tt.refer.common.base.AppType;

/* renamed from: com.tt.miniapphost.a.b.b */
public abstract class AbstractC67442b implements AbstractC12887b {

    /* renamed from: a */
    private final String f170044a;

    /* renamed from: c */
    public abstract AppType mo234175c();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b
    /* renamed from: a */
    public String mo48642a() {
        return this.f170044a;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b
    /* renamed from: b */
    public String mo48643b() {
        return mo234175c().name() + this.f170044a;
    }

    public AbstractC67442b(String str) {
        this.f170044a = str;
    }
}
