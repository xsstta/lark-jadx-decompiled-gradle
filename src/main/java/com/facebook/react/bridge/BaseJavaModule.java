package com.facebook.react.bridge;

import java.util.Map;

public abstract class BaseJavaModule implements NativeModule {
    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    public boolean hasConstants() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
    }
}
