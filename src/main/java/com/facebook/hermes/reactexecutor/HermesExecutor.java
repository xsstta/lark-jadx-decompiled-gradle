package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesMemoryDumper;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import javax.annotation.Nullable;

public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    private static String f51447a;

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j, boolean z, int i, boolean z2, @Nullable HermesMemoryDumper hermesMemoryDumper, long j2, long j3);

    private static native HybridData initHybridDefaultConfig();

    static {
        SoLoader.loadLibrary("hermes");
        try {
            SoLoader.loadLibrary("hermes-executor-release");
            f51447a = "Release";
        } catch (UnsatisfiedLinkError unused) {
            SoLoader.loadLibrary("hermes-executor-debug");
            f51447a = "Debug";
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f51447a;
    }
}
