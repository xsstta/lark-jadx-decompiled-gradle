package com.bytedance.ee.bear.connection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.bytedance.ee.bear.connection.b */
public class C4974b {
    /* renamed from: a */
    public static NetworkType m20619a() {
        return NetStateChangeReceiver.m20610a();
    }

    /* renamed from: a */
    public static int m20618a(TelephonyManager telephonyManager) {
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
    public static NetworkType m20620a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                C13479a.m54764b("NetworkCheck", "getNetworkState: info is null or not available.");
                return NetworkType.NETWORK_NO;
            }
            int type = activeNetworkInfo.getType();
            if (1 == type) {
                C13479a.m54764b("NetworkCheck", "getNetworkState: type is wifi");
                return NetworkType.NETWORK_WIFI;
            } else if (type != 0) {
                return NetworkType.NETWORK_MOBILE;
            } else {
                C13479a.m54764b("NetworkCheck", "getNetworkState: type is mobile");
                switch (m20618a((TelephonyManager) context.getSystemService("phone"))) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    case 14:
                    case 15:
                        return NetworkType.NETWORK_3G;
                    case 4:
                    case 7:
                    case 11:
                    default:
                        return NetworkType.NETWORK_MOBILE;
                    case 13:
                        return NetworkType.NETWORK_4G;
                }
            }
        } catch (Throwable th) {
            C13479a.m54758a("network", th.getMessage());
            return NetworkType.NETWORK_UNKNOWN;
        }
    }
}
