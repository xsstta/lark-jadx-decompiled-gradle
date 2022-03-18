package com.ss.android.vc.irtc.impl.widget.utils;

import android.content.Context;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;

public class EnvUtils {
    public static boolean LOG_DEBUG = true;
    private static boolean isDebug;
    private static C61065q rtcConfig;

    public static C61065q getRtcConfig() {
        return rtcConfig;
    }

    public static boolean isApkInDebug() {
        return isDebug;
    }

    public static void configRtc(C61065q qVar) {
        rtcConfig = qVar;
    }

    public static void configEnv(Context context) {
        boolean z;
        if (context != null) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                isDebug = z;
            } catch (Exception e) {
                C61064p.m237487c("EnvUtils", e.getMessage());
            }
        }
    }

    public static void throwException(String str) {
        if (!isApkInDebug()) {
            C61064p.m237487c("EnvUtils", str);
            return;
        }
        throw new IllegalStateException(str);
    }
}
