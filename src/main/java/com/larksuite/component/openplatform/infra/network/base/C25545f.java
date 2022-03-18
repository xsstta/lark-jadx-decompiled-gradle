package com.larksuite.component.openplatform.infra.network.base;

import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.f */
public class C25545f extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        Map<String, String> d;
        Object a = eVar.mo48552a();
        if ((a instanceof IAppContext) && (d = DependencyMgr.m52811b().mo48312d((IAppContext) a)) != null && d.size() > 0) {
            for (Map.Entry<String, String> entry : d.entrySet()) {
                cVar.mo48504a(entry.getKey(), entry.getValue());
            }
            AppBrandLogger.m52830i("SessionHeaderInterceptor", " add platform session size " + d.size());
        }
        return new C12874a<>(cVar);
    }
}
