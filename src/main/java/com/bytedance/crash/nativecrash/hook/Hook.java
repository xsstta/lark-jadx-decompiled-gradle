package com.bytedance.crash.nativecrash.hook;

public class Hook {
    private static native long doGetAddr_GOTHook_refresh();

    private static native long doGetAddr_GOTHook_register();
}
