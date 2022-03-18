package com.facebook.react.modules.appstate;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "AppState")
public class AppStateModule extends ReactContextBaseJavaModule implements LifecycleEventListener, WindowFocusChangeListener {
    private String mAppState;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AppState";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mAppState = "background";
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mAppState = "active";
        sendAppStateChangeEvent();
    }

    private WritableMap createAppStateEventMap() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("app_state", this.mAppState);
        return createMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialAppState", this.mAppState);
        return hashMap;
    }

    private void sendAppStateChangeEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("appStateDidChange", createAppStateEventMap());
    }

    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        String str;
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.addWindowFocusChangeListener(this);
        if (reactApplicationContext.getLifecycleState() == LifecycleState.RESUMED) {
            str = "active";
        } else {
            str = "background";
        }
        this.mAppState = str;
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean z) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("appStateFocusChange", Boolean.valueOf(z));
    }

    @ReactMethod
    public void getCurrentAppState(Callback callback, Callback callback2) {
        callback.invoke(createAppStateEventMap());
    }
}
