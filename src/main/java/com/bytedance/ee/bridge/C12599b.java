package com.bytedance.ee.bridge;

import com.bytedance.ee.bridge.connectormodule.JsToNativeBridge;
import com.facebook.react.AbstractC21102c;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.AbstractC21151a;
import java.util.Arrays;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.bytedance.ee.bridge.b */
public class C12599b extends AbstractC21102c {
    @Override // com.facebook.react.AbstractC21102c
    /* renamed from: a */
    public AbstractC21151a mo47877a() {
        return AbstractC21102c.m76717a(this);
    }

    @Override // com.facebook.react.AbstractC21102c
    /* renamed from: a */
    public List<ModuleSpec> mo47878a(final ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(ModuleSpec.nativeModuleSpec(JsToNativeBridge.class, new Provider<NativeModule>() {
            /* class com.bytedance.ee.bridge.C12599b.C126001 */

            /* renamed from: a */
            public NativeModule mo47880b() {
                return new JsToNativeBridge(reactApplicationContext);
            }
        }));
    }
}
