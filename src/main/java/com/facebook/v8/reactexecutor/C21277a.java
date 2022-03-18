package com.facebook.v8.reactexecutor;

import android.os.Build;
import android.os.StrictMode;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import java.util.TimeZone;

/* renamed from: com.facebook.v8.reactexecutor.a */
public class C21277a implements JavaScriptExecutorFactory {
    public String toString() {
        return "JSIExecutor+V8Runtime";
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new V8Executor(m77091a());
    }

    /* renamed from: a */
    private String m77091a() {
        if (Build.VERSION.SDK_INT > 24) {
            return TimeZone.getDefault().getID();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }
}
