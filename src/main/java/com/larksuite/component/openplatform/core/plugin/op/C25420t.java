package com.larksuite.component.openplatform.core.plugin.op;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.google.firebase.messaging.Constants;
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

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.t */
public class C25420t extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getUserCloudStorage";
    }

    public C25420t() {
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
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                String format = String.format("session = %s aId = %s appId = %s", a, str, str2);
                callbackFail(format);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, format);
                C67509b.m262587a("mp_start_error", 2006, jSONObject2, getAppContext());
                AppBrandLogger.m52829e("tma_ApiGetUserCloudStorageInfoCtrl", format);
                return;
            }
            String optString = jSONObject.optString("keyList");
            final String str3 = AppbrandConstant.C65701b.m257612c().mo230152q() + "appid=" + str2 + "&aid=" + str + "&keyList=" + Uri.encode(optString) + "&session=" + a;
            AppBrandLogger.m52828d("tma_ApiGetUserCloudStorageInfoCtrl", "url ", str3);
            Observable.create(new Function<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25420t.C254222 */

                /* renamed from: a */
                public String fun() {
                    return C66434g.m259707a().mo231985a(str3, C25420t.this.getAppContext()).mo48466d();
                }
            }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25420t.C254211 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52829e("tma_ApiGetUserCloudStorageInfoCtrl", "onFail ", th);
                    C25420t.this.callbackFail(th);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            int optInt = jSONObject.optInt("error", -1);
                            if (optInt == 0) {
                                C25420t.this.callbackOk(new JSONObject(optString));
                                return;
                            }
                            AppBrandLogger.m52829e("tma_ApiGetUserCloudStorageInfoCtrl", "errorCode == ", Integer.valueOf(optInt));
                            String optString2 = jSONObject.optString("message");
                            C25420t.this.callbackFail(String.format("%s errorCode = %s", optString2, Integer.valueOf(optInt)));
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("tma_ApiGetUserCloudStorageInfoCtrl", "user cloud storage parse json fail", e);
                            C25420t.this.callbackFail(e);
                        }
                    } else {
                        AppBrandLogger.m52829e("tma_ApiGetUserCloudStorageInfoCtrl", "request result is null");
                        C25420t.this.callbackFail("requestResult is null");
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_ApiGetUserCloudStorageInfoCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    public C25420t(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
