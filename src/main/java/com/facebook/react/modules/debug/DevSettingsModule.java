package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.p961a.AbstractC21121b;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DevSettings")
public class DevSettingsModule extends BaseJavaModule {
    public final AbstractC21121b mDevSupportManager;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @ReactMethod
    public void toggleElementInspector() {
        this.mDevSupportManager.mo71809e();
    }

    @ReactMethod
    public void reload() {
        if (this.mDevSupportManager.mo71811f()) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.modules.debug.DevSettingsModule.RunnableC211881 */

                public void run() {
                    DevSettingsModule.this.mDevSupportManager.mo71813h();
                }
            });
        }
    }

    public DevSettingsModule(AbstractC21121b bVar) {
        this.mDevSupportManager = bVar;
    }

    @ReactMethod
    public void setHotLoadingEnabled(boolean z) {
        this.mDevSupportManager.mo71804b(z);
    }

    @ReactMethod
    public void setIsDebuggingRemotely(boolean z) {
        this.mDevSupportManager.mo71806c(z);
    }

    @ReactMethod
    public void setLiveReloadEnabled(boolean z) {
        this.mDevSupportManager.mo71808d(z);
    }

    @ReactMethod
    public void setProfilingEnabled(boolean z) {
        this.mDevSupportManager.mo71810e(z);
    }
}
