package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.l */
public class C25408l extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getExtConfig";
    }

    public C25408l() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        HashMap<String, Object> a = m90921a(getAppContext());
        if (a != null) {
            callbackOtherExtraMsg(true, a);
        } else {
            callbackDefaultMsg(false);
        }
    }

    /* renamed from: a */
    public static HashMap<String, Object> m90921a(IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(appInfo.mExtJson)) {
            try {
                String optString = new JSONObject(appInfo.mExtJson).optString("ext");
                if (!TextUtils.isEmpty(optString)) {
                    jSONObject = new JSONObject(optString);
                }
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("ApiGetExtConfigCtrl", "act", e);
            }
        }
        hashMap.put("extConfig", jSONObject);
        return hashMap;
    }

    public C25408l(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
