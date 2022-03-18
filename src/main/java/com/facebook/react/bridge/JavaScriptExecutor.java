package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    public abstract String getName();

    public void close() {
        this.mHybridData.mo71397a();
    }

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
