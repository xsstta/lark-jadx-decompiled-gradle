package com.larksuite.component.openplatform.core.plugin.passport;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class GetUserInfoAsyncHandlerPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class GetUserInfoAsyncHandlerRequest extends C25920a {
        @JSONField(name = "withCredentials")
        public boolean withCredentials;

        private GetUserInfoAsyncHandlerRequest() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void callbackOk(JSONObject jSONObject, LKEvent lKEvent) {
        lKEvent.mo92127a(jSONObject);
    }

    @LKPluginFunction(async = true, eventName = {"getUserInfo"})
    public void getUserInfo(final LKEvent lKEvent, final GetUserInfoAsyncHandlerRequest getUserInfoAsyncHandlerRequest) {
        Context l = lKEvent.mo92145l();
        if (l == null) {
            lKEvent.mo92132b(createFailedResponse(C25906a.f64080j, "context is null"));
        } else if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info")) {
            ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235103a((Activity) l, lKEvent.mo92146m(), C66578b.C66579a.m260109a(getAppContext()), new AbstractC67540b() {
                /* class com.larksuite.component.openplatform.core.plugin.passport.GetUserInfoAsyncHandlerPlugin.C254411 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "granted userInfo permission");
                    GetUserInfoAsyncHandlerPlugin.this.requestUserInfo(lKEvent, getUserInfoAsyncHandlerRequest);
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "denied userInfo permission");
                    lKEvent.mo92132b(GetUserInfoAsyncHandlerPlugin.this.createFailedResponse(C25906a.f64076f, C25906a.f64076f.f64117J));
                }
            });
        } else {
            requestUserInfo(lKEvent, getUserInfoAsyncHandlerRequest);
        }
    }

    public void requestUserInfo(final LKEvent lKEvent, GetUserInfoAsyncHandlerRequest getUserInfoAsyncHandlerRequest) {
        final String g = getApiDependency().mo235053g();
        String g2 = getApiDependency().mo235054g(getAppContext().getAppId());
        if (TextUtils.isEmpty(g)) {
            AppBrandLogger.m52829e("GetUserInfoAsyncHandlerPlugin", "session id is empty!");
            C25921b createFailedResponse = createFailedResponse(C25913h.f64179i);
            createFailedResponse.mInnerMsg = "session id is empty";
            lKEvent.mo92132b(createFailedResponse);
            return;
        }
        String str = C67857a.m263995d(getAppContext()) + "/getUserInfo";
        if (TextUtils.isEmpty(g2)) {
            AppBrandLogger.m52829e("GetUserInfoAsyncHandlerPlugin", "platformSession is empty!");
            C25921b createFailedResponse2 = createFailedResponse(C25913h.f64179i);
            createFailedResponse2.mInnerMsg = "platformSession is empty";
            lKEvent.mo92132b(createFailedResponse2);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppContext().getAppId());
        if (getUserInfoAsyncHandlerRequest.withCredentials) {
            hashMap.put("withCredentials", "true");
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        boolean a = C67857a.m263992a(getAppContext());
        int b = C67857a.m263993b(getAppContext());
        if (!a && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "Request userInfo");
        getApiDependency().mo235016a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), true).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.GetUserInfoAsyncHandlerPlugin.C254422 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "GetUserInfoAsyncHandler:response is empty!");
                    lKEvent.mo92132b(GetUserInfoAsyncHandlerPlugin.this.createFailedResponse(C25906a.f64080j, "response is empty"));
                    return;
                }
                AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "GetUserInfoAsyncHandler:success!");
                GetUserInfoAsyncHandlerPlugin.this.buildCallback(g, str, lKEvent);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.GetUserInfoAsyncHandlerPlugin.C254433 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.m52830i("GetUserInfoAsyncHandlerPlugin", "GetUserInfoAsyncHandler fail:" + th.getMessage());
                lKEvent.mo92132b(GetUserInfoAsyncHandlerPlugin.this.createFailedResponse(C25906a.f64079i, th.getMessage()));
            }
        });
    }

    public void buildCallback(String str, String str2, LKEvent lKEvent) {
        HashMap hashMap = new HashMap();
        try {
            boolean i = getApiDependency().mo235058i();
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optInt("error", -1) == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("userInfo");
                if (i) {
                    optJSONObject.put("sessionId", str);
                }
                hashMap.put("userInfo", optJSONObject);
                hashMap.put("rawData", jSONObject.optString("rawData"));
                if (jSONObject.has("encryptedData")) {
                    hashMap.put("encryptedData", jSONObject.optString("encryptedData"));
                }
                if (jSONObject.has("iv")) {
                    hashMap.put("iv", jSONObject.optString("iv"));
                }
                if (jSONObject.has("signature")) {
                    hashMap.put("signature", jSONObject.optString("signature"));
                }
                callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap), lKEvent);
                return;
            }
            C25921b createFailedResponse = createFailedResponse(C25913h.f64180j);
            createFailedResponse.mInnerMsg = jSONObject.optString("message");
            lKEvent.mo92132b(createFailedResponse);
        } catch (Exception e) {
            lKEvent.mo92132b(createFailedResponse(C25906a.f64080j, e.getMessage()));
        }
    }
}
