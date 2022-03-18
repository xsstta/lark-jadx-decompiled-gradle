package com.facebook.react.bridge;

import com.facebook.infer.annotation.C21045a;
import com.facebook.jni.HybridData;

public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        C21045a.m76679a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, ReadableArray readableArray) {
        boolean z;
        if (readableArray == null || (readableArray instanceof WritableNativeArray)) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, ReadableMap readableMap) {
        boolean z;
        if (readableMap == null || (readableMap instanceof WritableNativeMap)) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) readableMap);
    }
}
