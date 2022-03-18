package com.larksuite.component.openplatform.infra.network.base;

import com.bytedance.ee.lark.infra.foundation.utils.C12787e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.b */
public class C25541b extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        Map<String, Object> a = cVar.mo48501a();
        Object a2 = eVar.mo48552a();
        if (a2 instanceof IAppContext) {
            IAppContext iAppContext = (IAppContext) a2;
            a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, iAppContext.getAppId());
            a.put("app_version", C12787e.m52853a(iAppContext.getApplicationContext()));
            a.put("platform", "android");
        }
        return new C12874a<>(cVar);
    }
}
