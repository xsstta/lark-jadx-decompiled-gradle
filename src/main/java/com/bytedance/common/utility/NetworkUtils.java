package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

public final class NetworkUtils {
    private static long lastAdjustTime;
    private static boolean sIsReceiverRegisted;
    private static NetworkType sNetworkType = NetworkType.UNKNOWN;
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
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

        public boolean is4GOrHigher() {
            if (this == MOBILE_4G || this == MOBILE_5G) {
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

        public boolean is3GOrHigher() {
            if (this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G) {
                return true;
            }
            return false;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    static void setNetworkType(NetworkType networkType) {
        sNetworkType = networkType;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static NetworkType getNetworkTypeFast(Context context) {
        checkNetworkTypeInit(context);
        adjustNetwork(context);
        return sNetworkType;
    }

    public static boolean isNetworkAvailableFast(Context context) {
        checkNetworkTypeInit(context);
        adjustNetwork(context);
        return sNetworkType.isAvailable();
    }

    private static void adjustNetwork(Context context) {
        if (System.currentTimeMillis() - lastAdjustTime > 2000) {
            sNetworkType = getNetworkType(context);
            lastAdjustTime = System.currentTimeMillis();
        }
    }

    public static boolean isNetworkAvailable(Context context) {
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

    private static void checkNetworkTypeInit(Context context) {
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor == null || networkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
            registerReceiver(context);
            if (sNetworkType == NetworkType.UNKNOWN) {
                sNetworkType = getNetworkType(context);
                return;
            }
            return;
        }
        sNetworkType = sNetworkTypeInterceptor.getNetworkType();
    }

    private static void registerReceiver(Context context) {
        if (!sIsReceiverRegisted && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context.getApplicationContext(), new NetworkConnectChangeReceiver(), intentFilter);
            sIsReceiverRegisted = true;
        }
    }

    public static int INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(TelephonyManager telephonyManager) {
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

    public static String getNetworkAccessType(NetworkType networkType) {
        if (networkType == NetworkType.WIFI) {
            return "wifi";
        }
        if (networkType == NetworkType.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (networkType == NetworkType.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (networkType == NetworkType.MOBILE_2G) {
            return "2g";
        }
        if (networkType == NetworkType.MOBILE_3G) {
            return "3g";
        }
        if (networkType == NetworkType.MOBILE_3G_H) {
            return "3gh";
        }
        if (networkType == NetworkType.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (networkType == NetworkType.MOBILE_4G) {
            return "4g";
        }
        if (networkType == NetworkType.MOBILE_5G) {
            return "5g";
        }
        if (networkType == NetworkType.MOBILE) {
            return "mobile";
        }
        return "";
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
                    int INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType = INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType((TelephonyManager) context.getSystemService("phone"));
                    if (INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType != 3) {
                        if (INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType == 20) {
                            return NetworkType.MOBILE_5G;
                        }
                        if (!(INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType == 5 || INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType == 6)) {
                            switch (INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType) {
                                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            return NetworkType.MOBILE_4G;
                                        default:
                                            return NetworkType.MOBILE;
                                    }
                            }
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

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String encode = encode((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(encode);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str2);
        }
        return sb.toString();
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_bytedance_common_utility_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
