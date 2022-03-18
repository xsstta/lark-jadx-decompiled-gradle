package com.bytedance.push.utils;

import android.util.Log;
import com.bytedance.push.log.ILogger;

/* renamed from: com.bytedance.push.utils.c */
public class C20552c {

    /* renamed from: a */
    private static boolean f50119a = false;

    /* renamed from: b */
    private static int f50120b = 3;

    /* renamed from: c */
    private static ILogger f50121c;

    /* renamed from: a */
    public static boolean m74848a() {
        return f50119a;
    }

    /* renamed from: a */
    public static void m74842a(int i) {
        f50120b = i;
    }

    /* renamed from: a */
    public static void m74843a(ILogger iLogger) {
        f50121c = iLogger;
    }

    /* renamed from: b */
    public static void m74849b(String str) {
        m74850b("", str);
    }

    /* renamed from: c */
    public static void m74851c(String str) {
        m74852c("", str);
    }

    /* renamed from: a */
    public static void m74844a(String str) {
        m74845a("", str);
    }

    /* renamed from: a */
    public static void m74847a(boolean z) {
        f50119a = z;
    }

    /* renamed from: a */
    public static void m74845a(String str, String str2) {
        ILogger iLogger = f50121c;
        if (iLogger != null) {
            iLogger.mo68949d(str, str2);
        } else if (f50120b <= 3 && f50119a) {
            Log.d("BDPush", str + "\t>>>\t" + str2);
        }
    }

    /* renamed from: b */
    public static void m74850b(String str, String str2) {
        ILogger iLogger = f50121c;
        if (iLogger != null) {
            iLogger.mo68952e(str, str2);
        } else if (f50120b <= 6) {
            Log.e("BDPush", str + "\t>>>\t" + str2);
        }
    }

    /* renamed from: c */
    public static void m74852c(String str, String str2) {
        ILogger iLogger = f50121c;
        if (iLogger != null) {
            iLogger.mo68955i(str, str2);
        } else if (f50120b <= 4) {
            Log.i("BDPush", str + "\t>>>\t" + str2);
        }
    }

    /* renamed from: d */
    public static void m74853d(String str, String str2) {
        ILogger iLogger = f50121c;
        if (iLogger != null) {
            iLogger.mo68955i(str, str2);
        } else if (f50120b <= 2) {
            Log.v("BDPush", str + "\t>>>\t" + str2);
        }
    }

    /* renamed from: a */
    public static void m74846a(String str, String str2, Throwable th) {
        ILogger iLogger = f50121c;
        if (iLogger != null) {
            iLogger.mo68953e(str, str2, th);
        } else if (f50120b <= 6) {
            Log.e("BDPush", str + "\t>>>\t" + str2, th);
        }
    }
}
