package com.bytedance.ee.falcon.worker;

import com.C1711a;
import com.lark.falcon.engine.bridge.NativeHostObject;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;

public class WorkerPipe implements NativeHostObject {

    /* renamed from: a */
    private AndroidFalconShellHolder f34042a;

    /* renamed from: b */
    private AndroidFalconShellHolder f34043b;

    /* renamed from: c */
    private int f34044c = nativeCreateWorkerPipe();

    private native long nativeCreateHostObject(int i);

    private native int nativeCreateWorkerPipe();

    private native void nativeReleaseWorkerPipe(int i);

    /* renamed from: a */
    public void mo48145a() {
        nativeReleaseWorkerPipe(this.f34044c);
    }

    public long getHostShellHolder() {
        return this.f34042a.mo86088b();
    }

    @Override // com.lark.falcon.engine.bridge.NativeHostObject
    public long getPtr() {
        return nativeCreateHostObject(this.f34044c);
    }

    public long getTargetShellHolder() {
        return this.f34043b.mo86088b();
    }

    static {
        C1711a.m7628a("falconengine");
        C1711a.m7628a("falconjsworker");
    }

    public WorkerPipe(AndroidFalconShellHolder androidFalconShellHolder, AndroidFalconShellHolder androidFalconShellHolder2) {
        this.f34042a = androidFalconShellHolder;
        this.f34043b = androidFalconShellHolder2;
    }
}
