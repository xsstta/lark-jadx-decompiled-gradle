package com.larksuite.component.openplatform.core.plugin.settings;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.android.HwBuildEx;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.settings.a */
public class C25478a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getSetting";
    }

    public C25478a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiGetSettingCtrl", "invoke api");
        JSONObject jSONObject = new JSONObject();
        try {
            HostDependManager.getInst().getLocalScope(jSONObject, getAppContext());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("authSetting", jSONObject);
            callbackOk(jSONObject2);
        } catch (JSONException e) {
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52829e("tma_ApiGetSettingCtrl", e);
        }
    }

    /* renamed from: a */
    public static void m91031a(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        for (C66578b.C66579a aVar2 : C66578b.C66579a.m260127l(iAppContext)) {
            if (aVar.mo50184b(aVar2.mo232177a())) {
                switch (aVar2.mo232177a()) {
                    case 11:
                        jSONObject.put("scope.userInfo", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        jSONObject.put("scope.userLocation", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 13:
                        jSONObject.put("scope.record", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 14:
                        jSONObject.put("scope.camera", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 15:
                        jSONObject.put("scope.address", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 17:
                        jSONObject.put("scope.album", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 19:
                        jSONObject.put("scope.clipboard", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 20:
                        jSONObject.put("scope.appBadge", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 21:
                        jSONObject.put("scope.runData", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                }
            }
        }
        if (C67432a.m262319a(iAppContext).getAppInfo().isGame()) {
            jSONObject.put("scope.screenRecord", aVar.mo50179a(18, true));
        }
    }

    public C25478a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
