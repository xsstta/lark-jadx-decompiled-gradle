package com.ss.android.ad.splash.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class NetworkUtils {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    /* renamed from: a */
    public static String m100275a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? "" : "mobile" : "2g" : "3g" : "4g" : "wifi";
    }

    /* renamed from: e */
    public static String m100280e(Context context) {
        return m100275a(m100279d(context));
    }

    /* renamed from: b */
    public static boolean m100277b(Context context) {
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

    /* renamed from: c */
    public static boolean m100278c(Context context) {
        if (m100277b(context) && m100279d(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m100274a(TelephonyManager telephonyManager) {
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

    /* renamed from: d */
    public static int m100279d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (1 == type) {
                return 1;
            }
            if (type != 0) {
                return 16;
            }
            int a = m100274a((TelephonyManager) context.getSystemService("phone"));
            if (a == 3) {
                return 4;
            }
            if (a == 20) {
                return 2;
            }
            if (a == 5 || a == 6) {
                return 4;
            }
            switch (a) {
                case 8:
                case 9:
                case 10:
                    return 4;
                default:
                    switch (a) {
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        case 14:
                        case 15:
                            return 4;
                        case 13:
                            return 2;
                        default:
                            return 16;
                    }
            }
        } catch (Throwable unused) {
            return 16;
        }
    }

    /* renamed from: a */
    public static boolean m100276a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
