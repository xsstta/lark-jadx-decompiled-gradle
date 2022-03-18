package com.larksuite.component.openplatform.infra.network.openchatid2chatid;

import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.service.net.C67852a;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.openchatid2chatid.c */
public class C25551c extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        C25549a aVar;
        C67852a c;
        Map<String, Object> a = cVar.mo48501a();
        if ((eVar instanceof C25549a) && (c = (aVar = (C25549a) eVar).mo88687c()) != null) {
            a.put("ttcode", c.mo235486a((IAppContext) aVar.mo48552a()));
        }
        return new C12874a<>(cVar);
    }
}
