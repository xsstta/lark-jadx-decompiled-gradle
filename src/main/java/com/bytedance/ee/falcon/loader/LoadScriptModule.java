package com.bytedance.ee.falcon.loader;

import com.C1711a;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.module.JavaBaseModule;

public class LoadScriptModule implements JavaBaseModule {

    /* renamed from: a */
    private final C12703b f33999a;
    private long mNativeLoader;

    private native long nativeRegister(long j);

    private native void nativeResetNative();

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ String aliasName() {
        return JavaBaseModule.CC.$default$aliasName(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ ReadableMap getConstants() {
        return JavaBaseModule.CC.$default$getConstants(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ boolean hasAliasName() {
        return JavaBaseModule.CC.$default$hasAliasName(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public String name() {
        return "LoadScriptModule";
    }

    public native void nativeSwitchNativeReader(String str);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        nativeResetNative();
    }

    static {
        C1711a.m7628a("falconengine");
        C1711a.m7628a("falconloader");
    }

    private byte[] readScriptFromFiles(String str) {
        return this.f33999a.mo48094a(str);
    }

    public LoadScriptModule(AbstractC12702a aVar) {
        this.f33999a = new C12703b(aVar);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public void initialize(AndroidFalconShellHolder androidFalconShellHolder) {
        this.mNativeLoader = nativeRegister(androidFalconShellHolder.mo86088b());
    }
}
