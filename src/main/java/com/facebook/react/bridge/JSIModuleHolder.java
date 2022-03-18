package com.facebook.react.bridge;

public class JSIModuleHolder {
    private JSIModule mModule;
    private final JSIModuleSpec mSpec;

    public void notifyJSInstanceDestroy() {
        JSIModule jSIModule = this.mModule;
        if (jSIModule != null) {
            jSIModule.onCatalystInstanceDestroy();
        }
    }

    public JSIModule getJSIModule() {
        if (this.mModule == null) {
            synchronized (this) {
                JSIModule jSIModule = this.mModule;
                if (jSIModule != null) {
                    return jSIModule;
                }
                JSIModule jSIModule2 = this.mSpec.getJSIModuleProvider().get();
                this.mModule = jSIModule2;
                jSIModule2.initialize();
            }
        }
        return this.mModule;
    }

    public JSIModuleHolder(JSIModuleSpec jSIModuleSpec) {
        this.mSpec = jSIModuleSpec;
    }
}
