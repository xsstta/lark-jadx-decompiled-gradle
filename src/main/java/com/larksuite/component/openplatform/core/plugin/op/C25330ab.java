package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.ab */
public class C25330ab extends ApiHandler {

    /* renamed from: a */
    public AbstractC67538f f61839a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "triggerCheckUpdate";
    }

    public C25330ab() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        this.f61839a = C67432a.m262319a(getAppContext());
        final AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        UpdateAppManager.asyncUpdateApp(AppbrandContext.getInst().getApplicationContext(), appInfo, null, new UpdateAppManager.AbstractC66373a() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25330ab.C253311 */

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onUpdateFailed() {
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onUpdateFailed");
                try {
                    C25330ab.this.f61839a.getJsBridge().sendMsgToJsCore("onUpdateFailed", new JSONObject().toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("onCheckForUpdate", e);
                }
            }

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onUpdateReady() {
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onUpdateReady");
                try {
                    if (UpdateAppManager.isUpdateForbidden(C25330ab.this.getAppContext(), AppbrandContext.getInst().getApplicationContext(), appInfo.appId, true)) {
                        AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "ApiTriggerCheckUpdateCtrl onUpdateReady  is  UpdateReadyOverTime");
                        return;
                    }
                    C25330ab.this.f61839a.getJsBridge().sendMsgToJsCore("onUpdateReady", new JSONObject().toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("onCheckForUpdate", e);
                }
            }

            @Override // com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
            public void onCheckForUpdate(AppInfoEntity appInfoEntity) {
                boolean z;
                AppBrandLogger.m52830i("ApiTriggerCheckUpdateCtrl", "onCheckForUpdate, appInfoVersion: " + C25330ab.this.f61839a.getAppInfo().version + " updateInfoVersion: " + appInfoEntity.version);
                JSONObject jSONObject = new JSONObject();
                try {
                    AppInfoEntity appInfo = C25330ab.this.f61839a.getAppInfo();
                    if (TextUtils.equals(appInfo.md5, appInfoEntity.md5)) {
                        if (TextUtils.equals(appInfo.version, appInfoEntity.version)) {
                            z = false;
                            jSONObject.put("hasUpdate", z);
                            C25330ab.this.f61839a.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
                        }
                    }
                    z = true;
                    jSONObject.put("hasUpdate", z);
                    C25330ab.this.f61839a.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("onCheckForUpdate", e);
                }
            }
        }, getAppContext());
        callbackOk();
    }

    public C25330ab(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
