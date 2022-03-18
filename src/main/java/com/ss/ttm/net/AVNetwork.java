package com.ss.ttm.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class AVNetwork {
    public static int getNetworkType(Context context) {
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return 0;
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return 1;
            }
            if (type == 0) {
                return 2;
            }
            return 0;
        } catch (Throwable unused) {
        }
    }
}
