package com.facebook.react.turbomodule.core;

import com.C1711a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.AbstractC21268a;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.soloader.SoLoader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class TurboModuleManager implements JSIModule, TurboModuleRegistry {

    /* renamed from: a */
    private final TurboModuleManagerDelegate f51803a;

    /* renamed from: b */
    private final Map<String, AbstractC21268a> f51804b;
    private final HybridData mHybridData;

    private native HybridData initHybrid(long j, JSCallInvokerHolderImpl jSCallInvokerHolderImpl, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings();

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
    }

    static {
        try {
            SoLoader.loadLibrary("turbomodulejsijni");
        } catch (Throwable unused) {
            C1711a.m7628a("turbomodulejsijni");
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    /* renamed from: a */
    public Collection<AbstractC21268a> mo72143a() {
        return this.f51804b.values();
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        Iterator<AbstractC21268a> it = this.f51804b.values().iterator();
        while (it.hasNext()) {
            ((NativeModule) it.next()).onCatalystInstanceDestroy();
        }
        this.f51804b.clear();
        this.mHybridData.mo71397a();
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    /* renamed from: a */
    public AbstractC21268a mo72142a(String str) {
        return getJavaModule(str);
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    /* renamed from: b */
    public boolean mo72144b(String str) {
        return this.f51804b.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public AbstractC21268a getJavaModule(String str) {
        AbstractC21268a a;
        if (!this.f51804b.containsKey(str) && (a = this.f51803a.mo72147a(str)) != null) {
            ((NativeModule) a).initialize();
            this.f51804b.put(str, a);
        }
        return this.f51804b.get(str);
    }
}
