package com.bytedance.common.jato;

import com.C1711a;

public class JatoNativeLoader {
    private static boolean sIsLoaded;

    public static synchronized boolean loadLibrary() {
        synchronized (JatoNativeLoader.class) {
            if (sIsLoaded) {
                return true;
            }
            try {
                C1711a.m7628a("jato");
                sIsLoaded = true;
            } catch (Throwable unused) {
            }
            return sIsLoaded;
        }
    }
}
