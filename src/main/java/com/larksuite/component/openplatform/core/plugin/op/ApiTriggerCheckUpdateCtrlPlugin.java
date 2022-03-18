package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONObject;

public class ApiTriggerCheckUpdateCtrlPlugin extends OPPlugin {

    private static class ApiTriggerCheckUpdateCtrlRequest extends C25920a {
        private ApiTriggerCheckUpdateCtrlRequest() {
        }
    }

    private static class ApiTriggerCheckUpdateCtrlResponse extends C25921b {
        private ApiTriggerCheckUpdateCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"triggerCheckUpdate"})
    public void apiTriggerCheckUpdateCtrlAsync(AbstractC25895f fVar, final AbstractC25905b bVar, AbstractC25897h<ApiTriggerCheckUpdateCtrlResponse> hVar) {
        final ILogger b = fVar.mo92190b();
        ApiTriggerCheckUpdateCtrlResponse apiTriggerCheckUpdateCtrlResponse = new ApiTriggerCheckUpdateCtrlResponse();
        final AbstractC67538f a = C67432a.m262319a(getAppContext());
        final AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        UpdateAppManager.asyncUpdateApp(AppbrandContext.getInst().getApplicationContext(), appInfo, null, new UpdateAppManager.AbstractC66373a() {
            /* class com.larksuite.component.openplatform.core.plugin.op.ApiTriggerCheckUpdateCtrlPlugin.C253171 */

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onUpdateFailed() {
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onUpdateFailed");
                try {
                    a.getJsBridge().sendMsgToJsCore("onUpdateFailed", new JSONObject().toString());
                } catch (Exception e) {
                    b.mo92223e("ApiTriggerCheckUpdateCtrl", "onCheckForUpdate", e);
                }
            }

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onUpdateReady() {
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onUpdateReady");
                try {
                    if (UpdateAppManager.isUpdateForbidden(ApiTriggerCheckUpdateCtrlPlugin.this.getAppContext(), bVar.mo92207a(), appInfo.appId, true)) {
                        AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "ApiTriggerCheckUpdateCtrlPlugin onUpdateReady  is  UpdateReadyOverTime");
                        return;
                    }
                    a.getJsBridge().sendMsgToJsCore("onUpdateReady", new JSONObject().toString());
                } catch (Exception e) {
                    b.mo92223e("ApiTriggerCheckUpdateCtrl", "onCheckForUpdate", e);
                }
            }

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onCheckForUpdate(AppInfoEntity appInfoEntity) {
                boolean z;
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onCheckForUpdate, appInfoVersion: " + a.getAppInfo().version + " updateInfoVersion: " + appInfoEntity.version);
                JSONObject jSONObject = new JSONObject();
                try {
                    AppInfoEntity appInfo = a.getAppInfo();
                    if (TextUtils.equals(appInfo.md5, appInfoEntity.md5)) {
                        if (TextUtils.equals(appInfo.version, appInfoEntity.version)) {
                            z = false;
                            jSONObject.put("hasUpdate", z);
                            a.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
                        }
                    }
                    z = true;
                    jSONObject.put("hasUpdate", z);
                    a.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("onCheckForUpdate", e);
                }
            }
        }, getAppContext());
        hVar.callback(apiTriggerCheckUpdateCtrlResponse);
    }
}
