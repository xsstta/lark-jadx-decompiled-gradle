package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

public class NetworkUtils {

    public enum NetworkType {
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

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    static int getNetworkState(Context context) {
        boolean isNetworkAvailable = isNetworkAvailable(context);
        NetworkType networkType = getNetworkType(context);
        if (!isNetworkAvailable) {
            return 2;
        }
        if (NetworkType.WIFI == networkType) {
            return 3;
        }
        if (NetworkType.NONE != networkType) {
            return 4;
        }
        return 1;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(TelephonyManager telephonyManager) {
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

    public static NetworkType getNetworkType(Context context) {
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
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return NetworkType.MOBILE;
                    }
                    if (!(INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 3 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 5 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 6 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 8 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 9 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 10 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 12 || INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 14)) {
                        if (INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) != 15) {
                            if (INVOKEVIRTUAL_com_bytedance_common_wschannel_server_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(telephonyManager) == 13) {
                                return NetworkType.MOBILE_4G;
                            }
                            return NetworkType.MOBILE;
                        }
                    }
                    return NetworkType.MOBILE_3G;
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
