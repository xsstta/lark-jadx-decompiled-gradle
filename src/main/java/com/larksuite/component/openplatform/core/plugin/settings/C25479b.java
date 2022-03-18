package com.larksuite.component.openplatform.core.plugin.settings;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.permission.PermissionSettingActivity;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.settings.b */
public class C25479b extends ApiHandler {

    /* renamed from: a */
    private JSONObject f62071a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openSetting";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25479b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiOpenSettingCtrl", "invoke api");
        this.f62071a = new JSONObject();
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            return;
        }
        AbstractC12888c i = C25529d.m91168i(getAppContext());
        if (i != null) {
            i.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, getAppContext()), 6);
        } else {
            currentActivity.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, getAppContext()), 6);
        }
        try {
            HostDependManager.getInst().getLocalScope(this.f62071a, getAppContext());
        } catch (Exception e) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
            AppBrandLogger.m52829e("tma_ApiOpenSettingCtrl", e);
        }
    }

    /* renamed from: a */
    private void m91032a(boolean z) {
        if (C67432a.m262319a(getAppContext()).getAppInfo().isGame()) {
            C66036d.m258595a(z, getAppContext());
        }
    }

    public C25479b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        char c = 3;
        AppBrandLogger.m52830i("tma_ApiOpenSettingCtrl", "handleActivityResult ", Integer.valueOf(i), " ", Integer.valueOf(i2));
        if (i == 6 && i2 == 51 && intent != null) {
            Map map = (Map) intent.getSerializableExtra("extra_change_permission_map");
            if (map == null || map.size() <= 0) {
                callbackFail("permission map is empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50183b(((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                    if (this.f62071a != null) {
                        Object[] objArr = new Object[6];
                        objArr[0] = "change permission ";
                        objArr[1] = entry.getKey();
                        objArr[2] = " ";
                        objArr[c] = entry.getValue();
                        objArr[4] = " ";
                        objArr[5] = this.f62071a.toString();
                        AppBrandLogger.m52830i("tma_ApiOpenSettingCtrl", objArr);
                        try {
                            HostDependManager.getInst().handleCustomizePermissionResult(this.f62071a, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("tma_ApiOpenSettingCtrl", e);
                        }
                    }
                    c = 3;
                }
                HostDependManager.getInst().syncPermissionToService(getAppContext());
                try {
                    JSONObject put = new JSONObject().put("authSetting", this.f62071a);
                    AppBrandLogger.m52830i("tma_ApiOpenSettingCtrl", "extraDataJO ", put);
                    callbackOk(put);
                } catch (JSONException e2) {
                    AppBrandLogger.m52829e("tma_ApiOpenSettingCtrl", e2);
                    callbackFail(ApiCode.GENERAL_JSON_ERROR);
                }
            }
            m91032a(this.f62071a.optBoolean("scope.screenRecord", true));
            this.f62071a = null;
            return true;
        }
        if (this.f62071a != null) {
            try {
                JSONObject put2 = new JSONObject().put("authSetting", this.f62071a);
                AppBrandLogger.m52830i("tma_ApiOpenSettingCtrl", "extraDataJO ", put2);
                callbackOk(put2);
            } catch (JSONException e3) {
                AppBrandLogger.m52829e("tma_ApiOpenSettingCtrl", e3);
                callbackFail(e3);
            }
            if (i == 6) {
                m91032a(this.f62071a.optBoolean("scope.screenRecord", true));
            }
            this.f62071a = null;
        }
        return false;
    }
}
