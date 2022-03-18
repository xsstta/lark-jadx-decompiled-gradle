package com.larksuite.component.openplatform.core.plugin.op;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.y */
public class C25432y extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "removeUserCloudStorage";
    }

    public C25432y() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String str;
        try {
            String optString = new JSONObject(this.mArgs).optString("keyList");
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
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                String format = String.format("session = %s aId = %s appId = %s", a, str, str2);
                callbackFail(format);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, format);
                C67509b.m262587a("mp_start_error", 2008, jSONObject, getAppContext());
                AppBrandLogger.m52829e("tma_ApiRemoveUserCloudStorageInfoCtrl", format);
                return;
            }
            final C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230155t(), "POST");
            eVar.mo48433a("aid", (Object) str);
            eVar.mo48433a(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (Object) str2);
            eVar.mo48433a("keyList", (Object) Uri.encode(optString));
            eVar.mo48433a("session", (Object) a);
            Observable.create(new Function<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25432y.C254342 */

                /* renamed from: a */
                public String fun() {
                    String d = C66434g.m259707a().mo231984a(eVar, C25432y.this.getAppContext()).mo48466d();
                    AppBrandLogger.m52828d("tma_ApiRemoveUserCloudStorageInfoCtrl", "requestResult = ", d);
                    return d;
                }
            }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25432y.C254331 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52829e("tma_ApiRemoveUserCloudStorageInfoCtrl", Log.getStackTraceString(th));
                    C25432y.this.callbackFail(th);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            int optInt = jSONObject.optInt("error", -1);
                            if (optInt == 0) {
                                C25432y.this.callbackOk();
                                return;
                            }
                            String optString = jSONObject.optString("message");
                            C25432y.this.callbackFail(String.format("%s errorCode = %s", optString, Integer.valueOf(optInt)));
                            return;
                        }
                        C25432y.this.callbackFail("requestResult is null");
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("tma_ApiRemoveUserCloudStorageInfoCtrl", "json exception ", e);
                        C25432y.this.callbackFail(e);
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_ApiRemoveUserCloudStorageInfoCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    public C25432y(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
