package com.facebook.react.modules.core;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.p957b.C21058b;

@ReactModule(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "HeadlessJsTaskSupport";
    }

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        C21058b a = C21058b.m76703a(getReactApplicationContext());
        if (a.mo71423c(i)) {
            a.mo71421b(i);
            return;
        }
        FLog.m76612w(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
    }

    @ReactMethod
    public void notifyTaskRetry(int i, Promise promise) {
        C21058b a = C21058b.m76703a(getReactApplicationContext());
        if (a.mo71423c(i)) {
            promise.resolve(Boolean.valueOf(a.mo71420a(i)));
            return;
        }
        FLog.m76612w(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
        promise.resolve(false);
    }
}
