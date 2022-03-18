package com.facebook.react.bridge;

import com.facebook.infer.annotation.C21045a;
import com.facebook.jni.HybridData;

public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String str);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray readableArray) {
        boolean z;
        if (readableArray == null || (readableArray instanceof WritableNativeArray)) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Illegal type provided");
        pushNativeArray((WritableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap readableMap) {
        boolean z;
        if (readableMap == null || (readableMap instanceof WritableNativeMap)) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Illegal type provided");
        pushNativeMap((WritableNativeMap) readableMap);
    }
}
