package com.ss.mediakit.vcnlib;

import android.util.Log;
import java.lang.reflect.Method;

public class CustomVerify {
    private static Method getVerifyStatusMethod;
    private static boolean hasInited = true;
    private static Method verifyMethod;
    private static Class<?> verifyResultClass;

    private static final native void _init();

    public static void init() {
        Log.e("custom_verify", "start init native");
        _init();
        Log.e("custom_verify", "end init native");
    }

    static {
        try {
            verifyMethod = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            Log.e("custom_verify", "found verify class or method exception:" + e.getMessage());
        }
        if (verifyMethod != null && verifyResultClass != null) {
            Log.e("custom_verify", "get verify method or verify result class suc");
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        if (verifyMethod == null || verifyResultClass == null || getVerifyStatusMethod == null) {
            Log.e("custom_verify", "verify method is null ecception");
            return -99995;
        }
        try {
            Log.e("custom_verify", "host: " + str2 + "  authType: " + str);
            Object invoke = verifyMethod.invoke(null, bArr, str, str2);
            Log.e("custom_verify", "get status end");
            int intValue = ((Integer) getVerifyStatusMethod.invoke(invoke, new Object[0])).intValue();
            Log.e("custom_verify", "verify result status: " + intValue);
            return intValue;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("custom_verify", "verify exception stacktrace:" + th.getMessage());
            return -99996;
        }
    }
}
