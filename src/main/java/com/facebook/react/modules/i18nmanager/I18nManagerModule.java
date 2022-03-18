package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.C21108a;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18nManager")
public class I18nManagerModule extends ContextBaseJavaModule {
    private final C21194a sharedI18nUtilInstance = C21194a.m76928a();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "I18nManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap a = C21108a.m76727a();
        a.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo72006a(context)));
        a.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo72008b(context)));
        a.put("localeIdentifier", locale.toString());
        return a;
    }

    public I18nManagerModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.mo72005a(getContext(), z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.mo72009c(getContext(), z);
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.mo72007b(getContext(), z);
    }
}
