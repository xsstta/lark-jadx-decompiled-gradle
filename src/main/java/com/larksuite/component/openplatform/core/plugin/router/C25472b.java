package com.larksuite.component.openplatform.core.plugin.router;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.router.b */
public class C25472b extends ApiHandler {

    /* renamed from: a */
    private String f62064a;

    /* renamed from: b */
    private String f62065b;

    /* renamed from: c */
    private String f62066c;

    /* renamed from: d */
    private String f62067d;

    /* renamed from: e */
    private String f62068e;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "navigateToMiniProgram";
    }

    public C25472b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (appInfo == null || !appInfo.isGame() || appInfo.isWhite()) {
            try {
                JSONObject jSONObject = new JSONObject(this.mArgs);
                this.f62064a = jSONObject.optString("appId");
                this.f62065b = jSONObject.optString("startPage");
                this.f62066c = jSONObject.optString(SearchIntents.EXTRA_QUERY);
                this.f62067d = jSONObject.optString("extraData");
                this.f62068e = jSONObject.optString("versionType", "current");
                if (TextUtils.equals(this.f62064a, C67432a.m262319a(getAppContext()).getAppInfo().appId)) {
                    callbackFail("can not jump to self");
                    return;
                }
                if (!AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().isLocalTest() || !TextUtils.equals("latest", this.f62068e)) {
                    this.f62068e = "current";
                } else {
                    this.f62068e = "latest";
                }
                if (C67432a.m262319a(getAppContext()).getAppInfo().isWhite()) {
                    mo88617a(C66375a.m259515a(this.f62064a, this.f62068e, getAppContext()));
                    return;
                }
                AppConfig appConfig = AppbrandApplicationImpl.getInst(getAppContext()).getAppConfig();
                if (appConfig == null) {
                    callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("config"));
                } else if (!appConfig.mo230050k().contains(this.f62064a)) {
                    callbackFail(ApiCallResultHelper.generateAppIdIsNotInJumpListInfo(this.f62064a));
                } else {
                    for (AppInfoEntity appInfoEntity : appConfig.mo230049j()) {
                        if (appInfoEntity != null && TextUtils.equals(appInfoEntity.appId, this.f62064a)) {
                            m91026b(appInfoEntity);
                            return;
                        }
                    }
                    AppInfoEntity a = C66375a.m259515a(this.f62064a, this.f62068e, getAppContext());
                    if (a == null) {
                        callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("requested navigateApp appInfo"));
                        return;
                    }
                    appConfig.mo230049j().add(a);
                    m91026b(a);
                }
            } catch (JSONException unused) {
                callbackFail(ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
            }
        } else {
            callbackFail("unsupported operation");
        }
    }

    /* renamed from: b */
    private void m91026b(final AppInfoEntity appInfoEntity) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(C67590h.m263073a((int) R.string.microapp_m_isopening_sth), appInfoEntity.appName));
        if (appInfoEntity.isGame()) {
            i = R.string.microapp_m_microgame;
        } else {
            i = R.string.microapp_m_microapp;
        }
        sb.append(C67590h.m263073a(i));
        HostDependManager.getInst().showModal(getAppContext().getCurrentActivity(), null, "", sb.toString(), true, C67590h.m263073a((int) R.string.microapp_m_map_dialog_cancel), "", C67590h.m263073a((int) R.string.microapp_m_brand_permission_ok), "", new AbstractC67550j.AbstractC67551a<Integer>() {
            /* class com.larksuite.component.openplatform.core.plugin.router.C25472b.C254731 */

            /* renamed from: a */
            public void onNativeModuleCall(Integer num) {
                if (num.intValue() == 1) {
                    C25472b.this.mo88617a(appInfoEntity);
                } else {
                    C25472b.this.callbackFail("cancel");
                }
            }
        }, getAppContext().getCurrentActivity());
    }

    /* renamed from: a */
    public void mo88617a(AppInfoEntity appInfoEntity) {
        Object obj;
        boolean z;
        if (appInfoEntity == null) {
            appInfoEntity = new AppInfoEntity();
        }
        appInfoEntity.appId = this.f62064a;
        appInfoEntity.startPage = this.f62065b;
        appInfoEntity.versionType = this.f62068e;
        appInfoEntity.query = this.f62066c;
        JSONObject jSONObject = new JSONObject();
        try {
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo();
            jSONObject.put("appId", appInfo.appId);
            if (TextUtils.isEmpty(this.f62067d)) {
                obj = "";
            } else {
                obj = new JSONObject(this.f62067d);
            }
            jSONObject.put("extraData", obj);
            if (!appInfo.isGame() || appInfo.isWhite()) {
                z = false;
            } else {
                z = true;
            }
            jSONObject.put("__NotInnerGame", z);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", "openJump", e);
        }
        appInfoEntity.refererInfo = jSONObject.toString();
        C66612a.m260222a(appInfoEntity, AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId, getAppContext());
        AppbrandApplicationImpl.getInst(getAppContext()).getForeBackgroundManager().mo231968j();
        callbackOk();
    }

    public C25472b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
