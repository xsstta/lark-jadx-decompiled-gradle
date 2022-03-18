package com.bytedance.apm.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.bytedance.apm.util.k */
public class C3125k {
    /* renamed from: a */
    public static int m13013a(TelephonyManager telephonyManager) {
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

    /* renamed from: a */
    public static NetworkUtils.NetworkType m13014a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkUtils.NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkUtils.NetworkType.MOBILE;
                    }
                    switch (m13013a((TelephonyManager) context.getSystemService("phone"))) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        case 14:
                        case 15:
                            return NetworkUtils.NetworkType.MOBILE_3G;
                        case 4:
                        case 7:
                        case 11:
                        default:
                            return NetworkUtils.NetworkType.MOBILE;
                        case 13:
                            return NetworkUtils.NetworkType.MOBILE_4G;
                    }
                }
            }
            return NetworkUtils.NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkUtils.NetworkType.MOBILE;
        }
    }
}
