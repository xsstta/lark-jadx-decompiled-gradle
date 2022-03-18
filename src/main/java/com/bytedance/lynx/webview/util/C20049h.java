package com.bytedance.lynx.webview.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.lynx.webview.util.p844a.AbstractC20035c;
import com.bytedance.lynx.webview.util.p844a.C20030a;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.bytedance.lynx.webview.util.h */
public class C20049h {

    /* renamed from: a */
    public static AbstractC20035c f48987a;

    /* renamed from: b */
    private static final Uri f48988b = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: a */
    public static AbstractC20035c m73168a() {
        if (f48987a == null) {
            f48987a = new C20030a();
        }
        return f48987a;
    }

    /* renamed from: b */
    public static boolean m73170b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m73171c(Context context) {
        switch (m73167a((TelephonyManager) context.getSystemService("phone"))) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static int m73167a(TelephonyManager telephonyManager) {
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
    public static String m73169a(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            Context applicationContext = context.getApplicationContext();
            ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "unknown";
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo == null || !networkInfo.isConnected()) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 == null || !networkInfo2.isConnected()) {
                    return "unknown";
                }
                return "wifi";
            } else if (!m73171c(applicationContext)) {
                return "2g";
            } else {
                if (m73167a((TelephonyManager) context.getSystemService("phone")) == 13) {
                    return "4g";
                }
                return "3g";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
