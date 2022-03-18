package com.larksuite.component.openplatform.core.plugin.op;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.n */
public class C25410n extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getCloudStorageByRelation";
    }

    public C25410n() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            C67531h initParams = AppbrandContext.getInst().getInitParams();
            String str2 = "";
            if (initParams != null) {
                str = initParams.mo234510j();
            } else {
                str = str2;
            }
            AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
            if (appInfo != null) {
                str2 = appInfo.appId;
            }
            String a = C66612a.m260219a(str2);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a) || TextUtils.isEmpty(str2)) {
                String format = String.format("session = %s aId = %s appId = %s", a, str, str2);
                AppBrandLogger.m52829e("tma_ApiGetFriendCloudStorageInfoCtrl", format);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, format);
                    C67509b.m262587a("mp_start_error", 2005, jSONObject2, getAppContext());
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_ApiGetFriendCloudStorageInfoCtrl", e.getStackTrace());
                }
                callbackFail(format);
                return;
            }
            m90924a(str, str2, a, jSONObject);
        } catch (Exception e2) {
            callbackFail(e2);
            AppBrandLogger.stacktrace(6, "tma_ApiGetFriendCloudStorageInfoCtrl", e2.getStackTrace());
        }
    }

    public C25410n(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    private void m90924a(final String str, final String str2, final String str3, JSONObject jSONObject) {
        final String optString = jSONObject.optString("keyList");
        final String optString2 = jSONObject.optString("extra");
        final String optString3 = jSONObject.optString(ShareHitPoint.f121869d);
        Observable.create(new Function<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25410n.C254122 */

            /* renamed from: a */
            public String fun() {
                String str = AppbrandConstant.C65701b.m257612c().mo230153r() + "appid=" + str2 + "&aid=" + str + "&type=" + optString3 + "&keyList=" + Uri.encode(optString) + "&session=" + str3;
                if (TextUtils.equals(optString3, "group")) {
                    str = str + "&extra=" + Uri.encode(optString2);
                }
                AppBrandLogger.m52828d("tma_ApiGetFriendCloudStorageInfoCtrl", "url ", str);
                return C66434g.m259707a().mo231985a(str, C25410n.this.getAppContext()).mo48466d();
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25410n.C254111 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                AppBrandLogger.m52829e("tma_ApiGetFriendCloudStorageInfoCtrl", "onFail ", th);
                C25410n.this.callbackFail(th);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        int optInt = jSONObject.optInt("error", -1);
                        if (optInt == 0) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            C25410n.this.callbackOk(jSONObject2);
                            AppBrandLogger.m52828d("tma_ApiGetFriendCloudStorageInfoCtrl", "jsonObject ", jSONObject2);
                            return;
                        }
                        AppBrandLogger.m52829e("tma_ApiGetFriendCloudStorageInfoCtrl", "errorCode == ", Integer.valueOf(optInt));
                        String optString2 = jSONObject.optString("message");
                        C25410n.this.callbackFail(String.format("%s errorCode = %s", optString2, Integer.valueOf(optInt)));
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("tma_ApiGetFriendCloudStorageInfoCtrl", "friend cloud storage fail", e);
                        C25410n.this.callbackFail(e);
                    }
                } else {
                    AppBrandLogger.m52829e("tma_ApiGetFriendCloudStorageInfoCtrl", "request result is null");
                    C25410n.this.callbackFail("requestResult is null");
                }
            }
        });
    }
}
