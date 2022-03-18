package com.tt.miniapp.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.ab */
public class C67020ab {

    /* renamed from: com.tt.miniapp.util.ab$a */
    public interface AbstractC67023a {
        /* renamed from: a */
        void mo233138a(int i, String str);

        /* renamed from: a */
        void mo233139a(String str);
    }

    /* renamed from: a */
    public static void m261224a(Context context, String str, String str2, AbstractC67023a aVar, IAppContext iAppContext) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            aVar.mo233138a(-1, "open id is empty");
            return;
        }
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            str3 = initParams.mo234510j();
        } else {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            aVar.mo233138a(-1, "host id is empty");
        } else if (TextUtils.isEmpty(str)) {
            aVar.mo233138a(-1, "app id is empty");
        } else {
            m261225a(context, str3, str, str2, aVar, iAppContext);
        }
    }

    /* renamed from: a */
    public static void m261225a(Context context, String str, String str2, String str3, final AbstractC67023a aVar, final IAppContext iAppContext) {
        String str4;
        final String a = C67067x.m261375a();
        final String a2 = C67067x.m261375a();
        byte[] a3 = C67064v.m261370a(context, a + "#" + a2, iAppContext);
        if (a3 != null) {
            str4 = Base64.encodeToString(a3, 10);
        } else {
            str4 = "";
        }
        AppBrandLogger.m52828d("tma_UserInfoUtil", "ttCode ", str4);
        final String str5 = AppbrandConstant.C65701b.m257612c().mo230156u() + "appid=" + str2 + "&openid=" + str3 + "&ttcode=" + str4 + "&aid=" + str;
        AppBrandLogger.m52828d("tma_UserInfoUtil", "url ", str5);
        Observable.create(new Function<String>() {
            /* class com.tt.miniapp.util.C67020ab.C670222 */

            /* renamed from: a */
            public String fun() {
                return C66434g.m259707a().mo231985a(str5, iAppContext).mo48466d();
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.tt.miniapp.util.C67020ab.C670211 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                AppBrandLogger.m52829e("tma_UserInfoUtil", "onFail ", th);
                aVar.mo233138a(-3, "server response error");
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("tma_UserInfoUtil", "request result is null");
                    aVar.mo233138a(-3, "server response error");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    int optInt = jSONObject.optInt("error", -1);
                    if (optInt != 0 || TextUtils.isEmpty(optString)) {
                        AppBrandLogger.m52829e("tma_UserInfoUtil", "errorCode == ", Integer.valueOf(optInt), ", data == ", optString);
                        AbstractC67023a aVar = aVar;
                        aVar.mo233138a(-3, "server response error:" + jSONObject.optString("message"));
                        return;
                    }
                    String optString2 = new JSONObject(optString).optString("uid");
                    AppBrandLogger.m52828d("tma_UserInfoUtil", "uid = ", optString2);
                    if (!TextUtils.isEmpty(optString2)) {
                        optString2 = C67064v.m261368a(a, a2, optString2);
                    }
                    aVar.mo233139a(optString2);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_UserInfoUtil", "parse json fail", e);
                    AbstractC67023a aVar2 = aVar;
                    aVar2.mo233138a(-2, "parse json fail " + e);
                }
            }
        });
    }
}
