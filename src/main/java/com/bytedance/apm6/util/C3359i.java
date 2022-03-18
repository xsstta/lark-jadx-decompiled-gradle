package com.bytedance.apm6.util;

import android.os.Handler;
import android.os.Looper;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.apm6.util.i */
public final class C3359i {

    /* renamed from: a */
    private static Handler f10650a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m13990a(Runnable runnable) {
        f10650a.post(runnable);
    }

    /* renamed from: a */
    public static byte[] m13991a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
