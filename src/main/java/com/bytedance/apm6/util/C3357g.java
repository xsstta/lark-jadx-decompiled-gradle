package com.bytedance.apm6.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.bytedance.apm6.util.g */
public class C3357g {
    /* renamed from: a */
    public static int m13967a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                if (networkInfo.isAvailable()) {
                    if (networkInfo.getType() == 0) {
                        return m13968a((TelephonyManager) context.getSystemService("phone"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return -10000;
    }

    /* renamed from: a */
    public static int m13968a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 24) {
            return telephonyManager.getNetworkType();
        }
        try {
            C39400a.m155625a().mo143243a(LarkContext.getApplication());
            C39400a.m155625a().mo143245b(LarkContext.getApplication());
            if (C39400a.m155625a().mo143244b() != -1) {
                return C39400a.m155625a().mo143244b();
            }
            int networkType = telephonyManager.getNetworkType();
            C39400a.m155625a().mo143242a(networkType);
            Log.m165389i("TelephonyManagerLancetHook", "get network type from system");
            return networkType;
        } catch (Throwable th) {
            Log.m165386e("TelephonyManagerLancetHook", th);
            return telephonyManager.getNetworkType();
        }
    }
}
