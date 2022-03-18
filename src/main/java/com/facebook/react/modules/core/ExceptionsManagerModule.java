package com.facebook.react.modules.core;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.p961a.AbstractC21121b;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.p960d.C21113a;
import com.facebook.react.p960d.C21114b;

@ReactModule(name = "ExceptionsManager")
public class ExceptionsManagerModule extends BaseJavaModule {
    private final AbstractC21121b mDevSupportManager;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExceptionsManager";
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.mo71811f()) {
            this.mDevSupportManager.mo71796a();
        }
    }

    public ExceptionsManagerModule(AbstractC21121b bVar) {
        this.mDevSupportManager = bVar;
    }

    @ReactMethod
    public void reportException(ReadableMap readableMap) {
        String str;
        ReadableArray readableArray;
        int i;
        boolean z;
        if (readableMap.hasKey("message")) {
            str = readableMap.getString("message");
        } else {
            str = "";
        }
        if (readableMap.hasKey("stack")) {
            readableArray = readableMap.getArray("stack");
        } else {
            readableArray = Arguments.createArray();
        }
        if (readableMap.hasKey("id")) {
            i = readableMap.getInt("id");
        } else {
            i = -1;
        }
        if (readableMap.hasKey("isFatal")) {
            z = readableMap.getBoolean("isFatal");
        } else {
            z = false;
        }
        if (this.mDevSupportManager.mo71811f()) {
            this.mDevSupportManager.mo71799a(str, readableArray, i);
            return;
        }
        String a = C21113a.m76744a(readableMap);
        if (!z) {
            FLog.m76574e("ReactNative", C21114b.m76746a(str, readableArray));
            if (a != null) {
                FLog.m76563d("ReactNative", "extraData: %s", a);
                return;
            }
            return;
        }
        throw new JavascriptException(C21114b.m76746a(str, readableArray)).setExtraDataAsJson(a);
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo71811f()) {
            this.mDevSupportManager.mo71803b(str, readableArray, i);
        }
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }
}
