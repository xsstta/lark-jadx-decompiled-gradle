package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/CheckWatermarkPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "checkWatermark", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CheckWatermarkPlugin extends OPPlugin {
    @LKPluginFunction(async = true, eventName = {"checkWatermark"})
    public final void checkWatermark(LKEvent lKEvent) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            IBaseService findServiceByInterface = getAppContext().findServiceByInterface(AbstractC67724a.class);
            Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
            jSONObject.put("hasWatermark", ((AbstractC67724a) findServiceByInterface).mo50473n());
            lKEvent.mo92127a(jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CheckWatermark", e);
            lKEvent.mo92132b(createFailedResponse(C25906a.f64080j, e.getMessage()));
        }
    }
}
