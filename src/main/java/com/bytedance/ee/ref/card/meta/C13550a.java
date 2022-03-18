package com.bytedance.ee.ref.card.meta;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.ref.card.meta.a */
public class C13550a extends C25532a<CardAppInfo, C13523c.C13524a> {
    public C13550a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c, com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a
    /* renamed from: a */
    public HashMap<String, Object> mo50340a(int i) {
        HashMap<String, Object> a = super.mo50340a(i);
        a.put("trace_id", this.f62169i.getTraceId());
        return a;
    }
}
