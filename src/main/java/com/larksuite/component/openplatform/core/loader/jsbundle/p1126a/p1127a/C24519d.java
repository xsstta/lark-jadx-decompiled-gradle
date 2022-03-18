package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a;

import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.a.d */
public class C24519d implements AbstractC24541e {
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e
    /* renamed from: a */
    public void mo87392a(IAppContext iAppContext, AbstractC24541e.AbstractC24542a aVar) {
        JSONObject b = C12738a.m52729b(iAppContext.getApplicationContext(), Settings.TMA_SDK_CONFIG);
        if (b != null) {
            aVar.mo87376a(b);
            return;
        }
        AppBrandLogger.m52829e("gadget_mina_setting", "setting JSON is null!");
        aVar.mo87375a("-1", "setting JSON is null!");
    }
}
