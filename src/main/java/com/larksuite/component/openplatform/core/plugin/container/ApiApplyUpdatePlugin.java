package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.C67432a;

public class ApiApplyUpdatePlugin extends OPPlugin {

    private static class ApiApplyUpdateResponse extends C25921b {
        private ApiApplyUpdateResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"applyUpdate"})
    public void applyUpdate(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25897h<ApiApplyUpdateResponse> hVar) {
        ApiApplyUpdateResponse apiApplyUpdateResponse = new ApiApplyUpdateResponse();
        if (C67432a.m262319a(getAppContext()).getUpdateAppInfo() != null) {
            C66036d.m258605c(C67432a.m262319a(getAppContext()).getUpdateAppInfo().version, C67432a.m262319a(getAppContext()).getAppInfo().version, getAppContext());
        } else {
            fillFailedResponse(apiApplyUpdateResponse, C25906a.f64080j, "update app info is null");
        }
        hVar.callback(apiApplyUpdateResponse);
        if (UpdateAppManager.isUpdateForbidden(getAppContext(), bVar.mo92207a(), getAppContext().getAppId(), false)) {
            AppBrandLogger.m52830i("ApiApplyUpdatePlugin", "apiTriggerCheckUpdateCtrlAsync onUpdateReady  is  UpdateReadyOverTime");
            return;
        }
        UpdateAppManager.setUpdateTime(bVar.mo92207a(), getAppContext().getAppId(), System.currentTimeMillis());
        UpdateAppManager.setUserUpdateTime(bVar.mo92207a(), getAppContext().getAppId());
        C66612a.m260227a(C67432a.m262319a(getAppContext()).getAppInfo().appId, C67432a.m262319a(getAppContext()).getSchema(), true);
    }
}
