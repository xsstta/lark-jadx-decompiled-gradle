package com.lynx.devtoolwrapper;

import com.lynx.tasm.LynxEnv;
import java.lang.ref.WeakReference;

public class LynxInspectorManager {

    /* renamed from: a */
    private WeakReference<AbstractC26489a> f65484a;

    private native long nativeCreateInspectorManager(LynxInspectorManager lynxInspectorManager);

    private native void nativeDestroy(long j);

    private native long nativeGetFirstPerfContainer(long j);

    private native long nativeGetFunction(long j, int i);

    private native void nativeOnTASMCreated(long j, long j2);

    private native void nativeRunOnJSThread(long j, long j2);

    public long getJavascriptDebugger() {
        if (this.f65484a.get() != null) {
            return this.f65484a.get().mo93922f();
        }
        return 0;
    }

    public long createInspectorRuntimeManager() {
        if (!LynxEnv.m96123e().mo94104k() || !LynxEnv.m96123e().mo94105l() || this.f65484a.get() == null) {
            return 0;
        }
        return this.f65484a.get().mo93921e();
    }

    public long getLynxDevtoolFunction(int i) {
        if (this.f65484a.get() != null) {
            return this.f65484a.get().mo93907a(i);
        }
        return 0;
    }

    public void call(String str, String str2) {
        if (this.f65484a.get() != null) {
            this.f65484a.get().mo93917a(str, str2);
        }
    }

    public void sendConsoleMessage(String str, int i, long j) {
        if (this.f65484a.get() != null) {
            this.f65484a.get().mo93916a(str, i, j);
        }
    }
}
