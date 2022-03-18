package com.tt.miniapp.jsbridge;

import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.falcon.runtime.IJsRuntime;

/* renamed from: com.tt.miniapp.jsbridge.e */
public class C66243e implements IJsRuntime {

    /* renamed from: a */
    private volatile IJsRuntime f167195a;

    /* renamed from: a */
    public IJsRuntime mo231614a() {
        return this.f167195a;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public IJsBridge getJsBridge() {
        return this.f167195a.getJsBridge();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public int getJsSdkLoadState() {
        return this.f167195a.getJsSdkLoadState();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public long getRuntimePointer() {
        return this.f167195a.getRuntimePointer();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void release() {
        this.f167195a.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231615a(IJsRuntime iJsRuntime) {
        if (iJsRuntime != this.f167195a) {
            this.f167195a = iJsRuntime;
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadMainJs(AbstractC66328m mVar) {
        this.f167195a.loadMainJs(mVar);
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable) {
        this.f167195a.postRunnable(runnable);
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadSubPackageMainJs(AbstractC66328m mVar, String str) {
        this.f167195a.loadSubPackageMainJs(mVar, str);
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable, boolean z) {
        this.f167195a.postRunnable(runnable, z);
    }
}
