package com.ss.android.lark.log;

import android.util.Log;
import com.C1711a;

public class NativeHandler {

    /* renamed from: a */
    private static NativeHandler f105869a = null;

    public native void start();

    private NativeHandler() {
    }

    static {
        try {
            C1711a.m7628a("logutil");
        } catch (Throwable th) {
            Log.e("NativeHandler", "load so err", th);
        }
    }

    /* renamed from: a */
    public static synchronized NativeHandler m165401a() {
        NativeHandler nativeHandler;
        synchronized (NativeHandler.class) {
            if (f105869a == null) {
                synchronized (NativeHandler.class) {
                    if (f105869a == null) {
                        f105869a = new NativeHandler();
                    }
                }
            }
            nativeHandler = f105869a;
        }
        return nativeHandler;
    }
}
