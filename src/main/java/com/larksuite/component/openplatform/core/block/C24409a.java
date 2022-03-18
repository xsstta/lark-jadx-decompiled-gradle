package com.larksuite.component.openplatform.core.block;

import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24560a;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24566e;
import com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.block.a */
public class C24409a extends C25532a<C24560a, C24566e.C24567a> {
    public C24409a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c, com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a
    /* renamed from: a */
    public HashMap<String, Object> mo50340a(int i) {
        HashMap<String, Object> a = super.mo50340a(i);
        a.put("trace_id", this.f62169i.getTraceId());
        C24560a aVar = (C24560a) this.f62167g.get(i);
        if (aVar != null) {
            a.put("app_version", StringUtil.f34171a.mo48349a(aVar.mo87517e()));
        } else {
            a.put("app_version", "");
        }
        a.put("block_id", this.f62169i.getExtra("block_id"));
        a.put("block_host", this.f62169i.getExtra("host"));
        return a;
    }
}
