package com.ss.android.ttve.log;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetIsToLogcat(boolean z);

    static {
        TENativeLibsLoader.m234147c();
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        C60193a.m233973a(i, str);
    }
}
