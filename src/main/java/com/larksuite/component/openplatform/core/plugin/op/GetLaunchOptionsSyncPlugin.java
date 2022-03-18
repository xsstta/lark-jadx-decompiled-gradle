package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONObject;

public class GetLaunchOptionsSyncPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"getLaunchOptionsSync"})
    public LKPluginHandleResult getLaunchOptionsSync(LKEvent lKEvent) {
        JSONObject jSONObject;
        try {
            C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(getAppContext()).getRouteEventCtrl();
            if (routeEventCtrl == null) {
                jSONObject = new JSONObject();
            } else {
                JSONObject i = routeEventCtrl.mo232880i();
                AppBrandLogger.m52830i("GetLaunchOptionsSyncPlugin", "GetLaunchOptionsSync exec " + routeEventCtrl.mo232880i());
                jSONObject = i;
            }
            jSONObject.put("isSticky", true);
            AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
            if (appInfo != null) {
                jSONObject.put("shareTicket", appInfo.shareTicket);
                jSONObject.put("scene", appInfo.scene);
            }
            return lKEvent.mo92131b(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "GetLaunchOptionsSyncPlugin", e.getStackTrace());
            return lKEvent.mo92130b(ApiCode.GENERAL_UNKONW_ERROR.code, new JSONObject());
        }
    }
}
