package com.ss.android.appcenter.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

public class NetworkUtils {

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public int getValue() {
            return this.nativeInt;
        }

        public boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: b */
    public static String m103218b(Context context) {
        return m103217a(m103216a(context));
    }

    /* renamed from: a */
    public static String m103217a(NetworkType networkType) {
        if (networkType == NetworkType.WIFI) {
            return "wifi";
        }
        if (networkType == NetworkType.MOBILE_2G) {
            return "2g";
        }
        if (networkType == NetworkType.MOBILE_3G) {
            return "3g";
        }
        if (networkType == NetworkType.MOBILE_4G) {
            return "4g";
        }
        if (networkType == NetworkType.MOBILE) {
            return "mobile";
        }
        return "";
    }

    /* renamed from: a */
    public static int m103215a(TelephonyManager telephonyManager) {
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
    public static NetworkType m103216a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (m103215a((TelephonyManager) context.getSystemService("phone"))) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 4:
                        case 7:
                        case 11:
                        default:
                            return NetworkType.MOBILE;
                        case 13:
                            return NetworkType.MOBILE_4G;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
