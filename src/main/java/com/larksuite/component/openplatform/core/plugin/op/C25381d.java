package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.p3397r.C67673c;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.d */
public class C25381d extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "canLaunchAppSync";
    }

    public C25381d() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, mo232452b("canLaunchAppSync", "ok"));
            AppInfoEntity appInfo = C67432a.m262319a(mo232455f()).getAppInfo();
            AppConfig appConfig = AppbrandApplicationImpl.getInst(mo232455f()).getAppConfig();
            String str = "";
            if (appInfo == null || appConfig == null || appConfig.mo230045f() == null) {
                z = false;
            } else {
                if (!C67673c.m263285a(mo232455f()).mo234939a() || !appInfo.isCanLaunchApp() || TextUtils.isEmpty(appConfig.mo230045f().f165530b) || TextUtils.isEmpty(appConfig.mo230045f().f165529a)) {
                    z = false;
                } else {
                    z = true;
                }
                str = appConfig.mo230045f().f165529a;
            }
            AppBrandLogger.m52830i("ApiCanLaunchAppSyncCtrl", " ApiCanLaunchAppSyncCtrl canLaunch = " + z + " , appName = " + str);
            jSONObject.put("canLaunch", z);
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiCanLaunchAppSyncCtrl", e);
            return mo232445a(e);
        }
    }

    public C25381d(String str) {
        super(str);
    }
}
