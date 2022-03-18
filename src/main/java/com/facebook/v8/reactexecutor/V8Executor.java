package com.facebook.v8.reactexecutor;

import com.C1711a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

public class V8Executor extends JavaScriptExecutor {
    private static native HybridData initHybrid(String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "V8Executor";
    }

    static {
        try {
            SoLoader.loadLibrary("v8executor");
        } catch (Throwable unused) {
            C1711a.m7628a("v8executor");
        }
    }

    V8Executor(String str) {
        super(initHybrid(str));
    }
}
