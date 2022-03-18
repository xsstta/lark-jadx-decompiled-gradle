package com.larksuite.component.openplatform.infra.network.configcenter;

import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.util.C67043j;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.infra.network.configcenter.a */
public class C25547a extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        Map<String, Object> a = cVar.mo48501a();
        a.put("userId", LarkExtensionManager.getInstance().getExtension().mo49566c());
        a.put("platformVersion", C67043j.m261279d());
        Object a2 = eVar.mo48552a();
        if (a2 instanceof IAppContext) {
            IAppContext iAppContext = (IAppContext) a2;
            a.put("larkVersion", C67043j.m261283f(iAppContext.getApplicationContext()));
            a.put("needStableJs", String.valueOf(DebugHelper.m54236e(iAppContext.getApplicationContext())));
            a.put("noCompress", String.valueOf(DebugHelper.m54237f(iAppContext.getApplicationContext())));
        }
        a.put("appId", "1");
        a.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "1");
        a.put("platform", "android");
        return new C12874a<>(cVar);
    }
}
