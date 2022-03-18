package com.ss.android.lark.app.util;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.app.util.b */
public class C29082b {

    /* renamed from: a */
    public static List<AbstractC29085a> f72889a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.app.util.b$a */
    public interface AbstractC29085a {
        /* renamed from: a */
        void mo102685a(String str);

        /* renamed from: a */
        void mo102686a(Map<String, Object> map);
    }

    /* renamed from: a */
    public static void m106939a(AbstractC29085a aVar) {
        f72889a.add(aVar);
    }

    /* renamed from: b */
    public static void m106941b(AbstractC29085a aVar) {
        f72889a.remove(aVar);
    }

    /* renamed from: a */
    public static void m106938a(Application application) {
        Log.m165389i("AppsFlyerInitor", "init");
        m106943d(application);
        m106940b(application);
        m106942c(application);
        m106944e(application);
    }

    /* renamed from: b */
    private static void m106940b(Application application) {
        Log.m165389i("AppsFlyerInitor", "initListener");
        C290831 r0 = new AppsFlyerConversionListener() {
            /* class com.ss.android.lark.app.util.C29082b.C290831 */

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                Log.m165397w("AppsFlyerInitor", "error onAttributionFailure : " + str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                for (AbstractC29085a aVar : C29082b.f72889a) {
                    aVar.mo102685a(str);
                }
                Log.m165397w("AppsFlyerInitor", "error getting conversion data: " + str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                StringBuilder sb = new StringBuilder();
                for (String str : map.keySet()) {
                    sb.append(str);
                    sb.append(" = ");
                    sb.append(map.get(str));
                    sb.append(";");
                }
                Log.m165389i("AppsFlyerInitor", "onAppOpenAttribution attribute: " + sb.toString());
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                for (AbstractC29085a aVar : C29082b.f72889a) {
                    aVar.mo102686a(map);
                }
                StringBuilder sb = new StringBuilder();
                for (String str : map.keySet()) {
                    sb.append(str);
                    sb.append(" = ");
                    sb.append(map.get(str));
                    sb.append(";");
                }
                Log.m165389i("AppsFlyerInitor", "onConversionDataSuccess attribute: " + sb.toString());
            }
        };
        AppsFlyerLib.getInstance().waitForCustomerUserId(true);
        AppsFlyerLib.getInstance().init("wiMmKJ9xudwzNqJW6HoM2g", r0, application.getApplicationContext());
    }

    /* renamed from: d */
    private static void m106943d(Application application) {
        Log.m165389i("AppsFlyerInitor", "setupChannelCollect");
        String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(application);
        if (!TextUtils.isEmpty(buildPackageChannel) && !TextUtils.equals(buildPackageChannel, "googleplay")) {
            Log.m165389i("AppsFlyerInitor", "setPreinstallAttribution: " + buildPackageChannel);
            AppsFlyerLib.getInstance().setPreinstallAttribution(buildPackageChannel, null, null);
        }
    }

    /* renamed from: e */
    private static void m106944e(final Application application) {
        Log.m165389i("AppsFlyerInitor", "start");
        AppsFlyerLib.getInstance().startTracking(application);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(application, new UIGetDataCallback(new IGetDataCallback<DeviceId>() {
            /* class com.ss.android.lark.app.util.C29082b.C290842 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("AppsFlyerInitor", "onError setCustomerIdAndTrack");
                m106945a("", application);
            }

            /* renamed from: a */
            public void onSuccess(DeviceId deviceId) {
                Log.m165389i("AppsFlyerInitor", "onSuccess setCustomerIdAndTrack");
                m106945a(deviceId.getDeviceId(), application);
            }

            /* renamed from: a */
            private void m106945a(String str, Context context) {
                try {
                    AppsFlyerLib.getInstance().setCustomerIdAndTrack(str, context);
                } catch (Exception e) {
                    Log.m165398w("AppsFlyerInitor", "setCustomerIdAndTrack", e);
                }
            }
        }), 30000);
    }

    /* renamed from: c */
    private static void m106942c(Application application) {
        String str;
        Log.m165389i("AppsFlyerInitor", "setupIdCollect");
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        try {
            str = Settings.Secure.getString(application.getContentResolver(), "android_id");
        } catch (Exception e) {
            Log.m165398w("AppsFlyerInitor", "exception when getting ANDROID_ID: ", e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Log.m165389i("AppsFlyerInitor", "androidId: " + str);
            AppsFlyerLib.getInstance().setAndroidIdData(str);
        }
    }
}
