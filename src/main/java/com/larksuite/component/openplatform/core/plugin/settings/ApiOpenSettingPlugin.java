package com.larksuite.component.openplatform.core.plugin.settings;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.permission.PermissionSettingActivity;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Map;
import org.json.JSONObject;

public class ApiOpenSettingPlugin extends OPPlugin {
    private AbstractC25897h<ApiOpenSettingResponse> mInvokeCallback;
    private JSONObject mJSONObject;
    private ILogger mLogger;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    private static class ApiOpenSettingRequest extends C25920a {
        private ApiOpenSettingRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiOpenSettingResponse extends C25921b {
        @JSONField(name = "authSetting")
        public com.alibaba.fastjson.JSONObject authSetting;

        private ApiOpenSettingResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mInvokeCallback = null;
    }

    private void callbackOk(JSONObject jSONObject) {
        if (this.mInvokeCallback != null) {
            ApiOpenSettingResponse apiOpenSettingResponse = new ApiOpenSettingResponse();
            if (jSONObject != null) {
                apiOpenSettingResponse.authSetting = JSON.parseObject(jSONObject.toString());
            }
            this.mInvokeCallback.callback(apiOpenSettingResponse);
        }
    }

    private void reportRecordScreen(boolean z) {
        if (C67432a.m262319a(getAppContext()).getAppInfo().isGame()) {
            C66036d.m258595a(z, getAppContext());
        }
    }

    @LKPluginFunction(async = true, eventName = {"openSetting"})
    public void openSettingAsync(LKEvent lKEvent, AbstractC25897h<ApiOpenSettingResponse> hVar) {
        ApiOpenSettingResponse apiOpenSettingResponse = new ApiOpenSettingResponse();
        this.mInvokeCallback = hVar;
        ILogger b = lKEvent.mo92134c().mo92190b();
        this.mLogger = b;
        if (b != null) {
            b.mo92224i("ApiOpenSettingPlugin", "invoke api");
        }
        this.mJSONObject = new JSONObject();
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            fillFailedResponse(apiOpenSettingResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            hVar.callback(apiOpenSettingResponse);
            return;
        }
        AbstractC12888c i = C25529d.m91168i(getAppContext());
        if (i != null) {
            i.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, getAppContext()), 6);
        } else {
            currentActivity.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, getAppContext()), 6);
        }
        try {
            HostDependManager.getInst().getLocalScope(this.mJSONObject, getAppContext());
        } catch (Exception e) {
            fillFailedResponse(apiOpenSettingResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(apiOpenSettingResponse);
            ILogger aVar = this.mLogger;
            if (aVar != null) {
                aVar.mo92223e("ApiOpenSettingPlugin", e);
            }
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        ApiOpenSettingResponse apiOpenSettingResponse = new ApiOpenSettingResponse();
        ILogger aVar = this.mLogger;
        char c = 3;
        if (aVar != null) {
            aVar.mo92224i("ApiOpenSettingPlugin", "handleActivityResult ", Integer.valueOf(i), " ", Integer.valueOf(i2));
        }
        if (i == 6 && i2 == 51 && intent != null) {
            Map map = (Map) intent.getSerializableExtra("extra_change_permission_map");
            if (map == null || map.size() <= 0) {
                fillFailedResponse(apiOpenSettingResponse, C25906a.f64080j, "permission map is empty");
                this.mInvokeCallback.callback(apiOpenSettingResponse);
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50183b(((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                    if (this.mJSONObject != null) {
                        ILogger aVar2 = this.mLogger;
                        if (aVar2 != null) {
                            Object[] objArr = new Object[6];
                            objArr[0] = "change permission ";
                            objArr[1] = entry.getKey();
                            objArr[2] = " ";
                            objArr[c] = entry.getValue();
                            objArr[4] = " ";
                            objArr[5] = this.mJSONObject.toString();
                            aVar2.mo92224i("ApiOpenSettingPlugin", objArr);
                        }
                        try {
                            HostDependManager.getInst().handleCustomizePermissionResult(this.mJSONObject, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                        } catch (Exception e) {
                            ILogger aVar3 = this.mLogger;
                            if (aVar3 != null) {
                                aVar3.mo92223e("ApiOpenSettingPlugin", e);
                            }
                        }
                    }
                    c = 3;
                }
                HostDependManager.getInst().syncPermissionToService(getAppContext());
                ILogger aVar4 = this.mLogger;
                if (aVar4 != null) {
                    aVar4.mo92224i("ApiOpenSettingPlugin", "extraDataJO ", this.mJSONObject);
                }
                callbackOk(this.mJSONObject);
            }
            JSONObject jSONObject = this.mJSONObject;
            if (jSONObject != null) {
                reportRecordScreen(jSONObject.optBoolean("scope.screenRecord", true));
            }
            this.mJSONObject = null;
            return true;
        }
        JSONObject jSONObject2 = this.mJSONObject;
        if (jSONObject2 != null) {
            ILogger aVar5 = this.mLogger;
            if (aVar5 != null) {
                aVar5.mo92224i("ApiOpenSettingPlugin", "extraDataJO ", jSONObject2);
            }
            callbackOk(this.mJSONObject);
            if (i == 6) {
                reportRecordScreen(this.mJSONObject.optBoolean("scope.screenRecord", true));
            }
            this.mJSONObject = null;
        }
        return false;
    }
}
