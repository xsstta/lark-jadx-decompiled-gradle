package com.huawei.hms.maps;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.p1009a.AbstractC23399a;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.maps.model.RuntimeRemoteException;

public final class mab {
    /* renamed from: a */
    public static void m86184a(Context context) {
        if (TextUtils.isEmpty(m86185b(context))) {
            mcq.m86889e("ConfigCheckUtil", "AppId is null. Please check whether the agconnect-services.json file is added to your app project.");
            throw new RuntimeRemoteException("AppId is null. Please check whether the agconnect-services.json file is added to your app project.");
        } else if (TextUtils.isEmpty(m86186c(context))) {
            mcq.m86889e("ConfigCheckUtil", "ApiKey is null. Please check whether the agconnect-services.json file is added to your app project.");
            throw new RuntimeRemoteException("ApiKey is null. Please check whether the agconnect-services.json file is added to your app project.");
        }
    }

    /* renamed from: b */
    public static String m86185b(Context context) {
        String str = "";
        try {
            str = AbstractC23399a.m84921a(context).mo81786a("client/app_id", str);
        } catch (NullPointerException unused) {
            mcq.m86889e("ConfigCheckUtil", "Get appId with AGConnectServicesConfig failed");
        }
        if (TextUtils.isEmpty(str)) {
            str = AGCUtils.getAppId(context);
        }
        return TextUtils.isEmpty(str) ? mcs.m86897a(context) : str;
    }

    /* renamed from: c */
    public static String m86186c(Context context) {
        String apiKey = MapClientIdentify.getApiKey();
        return TextUtils.isEmpty(apiKey) ? AbstractC23399a.m84921a(context).mo81785a("client/api_key") : apiKey;
    }
}
