package com.larksuite.framework.utils;

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

    /* renamed from: a */
    private static volatile boolean f64799a = true;

    /* renamed from: b */
    private static AbstractC26239a f64800b;

    /* renamed from: com.larksuite.framework.utils.NetworkUtils$a */
    public interface AbstractC26239a {
        /* renamed from: a */
        NetworkType mo93333a();
    }

    public enum NetworkType {
        NONE(0, "unvailable"),
        MOBILE(1, "mobile"),
        MOBILE_2G(2, "mobile_2g"),
        MOBILE_3G(3, "mobile_3g"),
        WIFI(4, "wifi"),
        MOBILE_4G(5, "mobile_4g"),
        UNKNOWN(6, "unknown");
        
        final int nativeInt;
        private final String nativeName;

        public String getNativeName() {
            return this.nativeName;
        }

        public int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i, String str) {
            this.nativeInt = i;
            this.nativeName = str;
        }
    }

    /* renamed from: b */
    public static boolean m94915b(Context context) {
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

    /* renamed from: a */
    public static boolean m94914a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            AbstractC26239a aVar = f64800b;
            if (aVar == null || aVar.mo93333a() == NetworkType.NONE) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
                return false;
            } else if (f64800b.mo93333a() == NetworkType.WIFI) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m94913a(TelephonyManager telephonyManager) {
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

    /* renamed from: c */
    public static NetworkType m94916c(Context context) {
        AbstractC26239a aVar = f64800b;
        if (aVar != null && aVar.mo93333a() != NetworkType.NONE) {
            return f64800b.mo93333a();
        }
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
                    switch (m94913a((TelephonyManager) context.getSystemService("phone"))) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return NetworkType.MOBILE_2G;
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
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable th) {
            Log.m165383e("network", th.getMessage());
            return NetworkType.MOBILE;
        }
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
}
