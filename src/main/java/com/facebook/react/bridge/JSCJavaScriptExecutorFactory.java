package com.facebook.react.bridge;

public class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory {
    private final String mAppName;
    private final String mDeviceName;

    public String toString() {
        return "JSCExecutor";
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.mAppName);
        writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
        return new JSCJavaScriptExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }

    public JSCJavaScriptExecutorFactory(String str, String str2) {
        this.mAppName = str;
        this.mDeviceName = str2;
    }
}
