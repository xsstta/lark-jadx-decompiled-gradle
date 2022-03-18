package com.facebook.react.bridge;

import com.facebook.infer.annotation.C21045a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSIModuleRegistry {
    private final Map<JSIModuleType, JSIModuleHolder> mModules = new HashMap();

    public void notifyJSInstanceDestroy() {
        for (Map.Entry<JSIModuleType, JSIModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getKey() != JSIModuleType.TurboModuleManager) {
                entry.getValue().notifyJSInstanceDestroy();
            }
        }
    }

    public void registerModules(List<JSIModuleSpec> list) {
        for (JSIModuleSpec jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleType(), new JSIModuleHolder(jSIModuleSpec));
        }
    }

    public JSIModule getModule(JSIModuleType jSIModuleType) {
        JSIModuleHolder jSIModuleHolder = this.mModules.get(jSIModuleType);
        if (jSIModuleHolder != null) {
            return (JSIModule) C21045a.m76676a(jSIModuleHolder.getJSIModule());
        }
        throw new IllegalArgumentException("Unable to find JSIModule for class " + jSIModuleType);
    }
}
