package com.facebook.react.jscexecutor;

import com.C1711a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;

class JSCExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }

    static {
        try {
            SoLoader.loadLibrary("jscexecutor");
        } catch (Throwable unused) {
            C1711a.m7628a("jscexecutor");
        }
    }
}
