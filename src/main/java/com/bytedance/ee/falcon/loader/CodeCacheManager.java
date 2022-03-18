package com.bytedance.ee.falcon.loader;

public class CodeCacheManager {
    private static native void nativeDisableCodeCache(long j);

    private static native boolean nativeEnableCodeCache(long j, String str, int i);
}
