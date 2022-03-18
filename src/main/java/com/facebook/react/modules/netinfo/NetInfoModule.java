package com.facebook.react.modules.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule {
    private final AbstractC21199b mConnectivityReceiver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCNetInfo";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.mo72016a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mConnectivityReceiver.mo72018b();
    }

    @ReactMethod
    public void getCurrentState(Promise promise) {
        this.mConnectivityReceiver.mo72017a(promise);
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new C21201d(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new C21196a(reactApplicationContext);
        }
    }
}
