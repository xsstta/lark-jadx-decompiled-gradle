package com.bytedance.apm.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.common.utility.NetworkUtils;

/* renamed from: com.bytedance.apm.util.l */
public class C3126l {

    /* renamed from: a */
    private static NetworkUtils.NetworkTypeInterceptor f10049a;

    /* renamed from: b */
    private static NetworkUtils.NetworkType f10050b = NetworkUtils.NetworkType.UNKNOWN;

    /* renamed from: a */
    public static boolean m13015a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m13016b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            NetworkUtils.NetworkTypeInterceptor networkTypeInterceptor = f10049a;
            if (networkTypeInterceptor == null || networkTypeInterceptor.getNetworkType() == NetworkUtils.NetworkType.NONE) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
                return false;
            } else if (f10049a.getNetworkType() == NetworkUtils.NetworkType.WIFI) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
