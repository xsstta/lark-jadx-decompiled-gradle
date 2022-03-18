package com.facebook.react.bridge;

import com.C1711a;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class CxxModuleWrapper extends CxxModuleWrapperBase {
    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        try {
            SoLoader.loadLibrary(str);
        } catch (Throwable unused) {
            C1711a.m7628a(str);
        }
        return makeDsoNative(SoLoader.unpackLibraryAndDependencies(str).getAbsolutePath(), str2);
    }
}
