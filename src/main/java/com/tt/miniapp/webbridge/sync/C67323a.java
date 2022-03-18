package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.p3392m.C67657c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.webbridge.sync.a */
public class C67323a extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getHostInfoSync";
    }

    public C67323a() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", initParams.mo234510j());
                jSONObject.put("did", C67657c.m263250a());
                jSONObject.put("channel", initParams.mo234502b());
                jSONObject.put("osVersion", initParams.mo234504d());
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, initParams.mo234500a());
                jSONObject.put("updateVersion", initParams.mo234508h());
                jSONObject.put("devicePlatform", initParams.mo234503c());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiGetHostInfoSyncCtrl", "act", e);
            }
            hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
            AppBrandLogger.m52829e("ApiGetHostInfoSyncCtrl", "get Host info success!");
            return mo232446a(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
        }
        AppBrandLogger.m52829e("ApiGetHostInfoSyncCtrl", "initParams is null!");
        return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("initParams"));
    }

    public C67323a(String str) {
        super(str);
    }
}
