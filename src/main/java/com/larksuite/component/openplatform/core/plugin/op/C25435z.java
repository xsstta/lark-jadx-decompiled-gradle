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

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.z */
public class C25435z extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setUserCloudStorage";
    }

    public C25435z() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String str;
        try {
            String optString = new JSONObject(this.mArgs).optString("KVDataList");
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
                C67509b.m262587a("mp_start_error", 2007, jSONObject, getAppContext());
                AppBrandLogger.m52829e("tma_ApiSetUserCloudStorageInfoCtrl", format);
                return;
            }
            final C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230154s(), "POST");
            eVar.mo48433a("aid", (Object) str);
            eVar.mo48433a(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (Object) str2);
            eVar.mo48433a("KVDataList", (Object) Uri.encode(optString));
            eVar.mo48433a("session", (Object) a);
            Observable.create(new Function<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25435z.C254372 */

                /* renamed from: a */
                public String fun() {
                    String d = C66434g.m259707a().mo231984a(eVar, C25435z.this.getAppContext()).mo48466d();
                    AppBrandLogger.m52828d("tma_ApiSetUserCloudStorageInfoCtrl", "requestResult = ", d);
                    return d;
                }
            }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25435z.C254361 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52829e("tma_ApiSetUserCloudStorageInfoCtrl", Log.getStackTraceString(th));
                    C25435z.this.callbackFail(th);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            int optInt = jSONObject.optInt("error", -1);
                            if (optInt == 0) {
                                C25435z.this.callbackOk();
                                return;
                            }
                            String optString = jSONObject.optString("message");
                            C25435z.this.callbackFail(String.format("%s errorCode = %s", optString, Integer.valueOf(optInt)));
                            return;
                        }
                        C25435z.this.callbackFail("requestResult is null");
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("tma_ApiSetUserCloudStorageInfoCtrl", "json exception ", e);
                        C25435z.this.callbackFail(e);
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_ApiSetUserCloudStorageInfoCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    public C25435z(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
