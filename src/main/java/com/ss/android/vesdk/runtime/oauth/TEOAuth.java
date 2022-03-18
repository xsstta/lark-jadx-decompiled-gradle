package com.ss.android.vesdk.runtime.oauth;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class TEOAuth {
    private static native int nativeActivate(String str, String str2, String str3, String str4, String str5, String str6);

    private static native String nativeGetActivationCode();

    static {
        TENativeLibsLoader.m234143a();
    }
}
