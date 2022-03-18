package com.facebook.react.modules.debug;

import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "SourceCode")
public class SourceCodeModule extends BaseJavaModule {
    private final ReactContext mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SourceCode";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) C21045a.m76677a(this.mReactContext.getCatalystInstance().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }
}
