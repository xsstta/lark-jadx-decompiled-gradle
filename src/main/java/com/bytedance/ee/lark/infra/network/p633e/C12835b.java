package com.bytedance.ee.lark.infra.network.p633e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.lark.infra.network.e.b */
public class C12835b {
    /* renamed from: a */
    public static boolean m53005a(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isAvailable() && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final String m53006b(Context context) {
        String str = null;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String typeName = activeNetworkInfo.getTypeName();
                if (!"MOBILE".equalsIgnoreCase(typeName)) {
                    str = typeName;
                } else {
                    str = activeNetworkInfo.getExtraInfo();
                    if (str == null) {
                        str = typeName + "#[]";
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "NetRequestUtil", e.getStackTrace());
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
