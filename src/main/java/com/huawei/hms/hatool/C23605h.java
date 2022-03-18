package com.huawei.hms.hatool;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.huawei.hms.hatool.h */
public class C23605h {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static String m85733a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 14:
            case 15:
                break;
            case 13:
                return "4G";
            default:
                return (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) ? "3G" : str;
        }
    }

    /* renamed from: a */
    public static String m85734a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            C23625y.m85982f("hmsSdk", "not have network state phone permission!");
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            String subtypeName = activeNetworkInfo.getSubtypeName();
            C23625y.m85977c("hmsSdk", "Network getSubtypeName : " + subtypeName);
            return m85733a(activeNetworkInfo.getSubtype(), subtypeName);
        } else if (activeNetworkInfo.getType() == 16) {
            C23625y.m85982f("hmsSdk", "type name = " + "COMPANION_PROXY");
            return "COMPANION_PROXY";
        } else if (activeNetworkInfo.getType() == 9) {
            C23625y.m85977c("hmsSdk", "type name = " + "ETHERNET");
            return "ETHERNET";
        } else {
            C23625y.m85977c("hmsSdk", "type name = " + activeNetworkInfo.getType());
            return "OTHER_NETWORK_TYPE";
        }
    }
}
