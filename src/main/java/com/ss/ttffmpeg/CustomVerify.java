package com.ss.ttffmpeg;

import android.util.Log;
import java.lang.reflect.Method;

public class CustomVerify {

    /* renamed from: a */
    public static String f164676a = "custom_verify_ffmpeg";

    /* renamed from: b */
    private static Method f164677b;

    /* renamed from: c */
    private static boolean f164678c = true;

    /* renamed from: d */
    private static Class<?> f164679d;

    /* renamed from: e */
    private static Method f164680e;

    private static final native void _init();

    static {
        try {
            f164677b = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            f164679d = cls;
            f164680e = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            String str = f164676a;
            Log.e(str, "found verify class or method exception:" + e.getMessage());
        }
        if (f164677b != null && f164679d != null) {
            Log.e(f164676a, "get verify method or verify result class suc");
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        if (f164677b == null || f164679d == null || f164680e == null) {
            Log.e(f164676a, "verify method is null ecception");
            return -99995;
        }
        try {
            String str3 = f164676a;
            Log.e(str3, "host: " + str2 + "  authType: " + str);
            Object invoke = f164677b.invoke(null, bArr, str, str2);
            Log.e(f164676a, "get status end");
            int intValue = ((Integer) f164680e.invoke(invoke, new Object[0])).intValue();
            String str4 = f164676a;
            Log.e(str4, "verify result status: " + intValue);
            return intValue;
        } catch (Throwable th) {
            th.printStackTrace();
            String str5 = f164676a;
            Log.e(str5, "verify exception stacktrace:" + th.getMessage());
            return -99996;
        }
    }
}
