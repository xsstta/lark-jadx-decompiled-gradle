package com.lark.falcon.engine.holder;

import com.C1711a;
import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.inspect.InspectorClient;
import com.lark.falcon.engine.module.AbstractC24014b;
import com.lark.falcon.engine.module.AbstractC24015c;
import com.lark.falcon.engine.module.C24016d;
import com.lark.falcon.engine.module.FalconModuleRegistry;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

public class AndroidFalconShellHolder {

    /* renamed from: a */
    FalconModuleRegistry f59303a;

    /* renamed from: b */
    C24016d f59304b = new C24016d();

    /* renamed from: c */
    private final AtomicLong f59305c;

    /* renamed from: d */
    private InspectorClient f59306d;

    /* renamed from: e */
    private AndroidShellHolderDelegate f59307e;

    private native void nativeBindAllModules(long j);

    private static native long nativeCreateNativeHolder(int i, String str, boolean z, boolean z2, boolean z3);

    private native void nativeEnableCodeCache(long j, String str, int i);

    private native void nativeEvaluateScript(long j, String str, String str2);

    private native FalconModuleRegistry nativeGetRegistry(long j);

    private native Object nativeInvokeJavaScriptFunction(long j, String str, JavaOnlyArray javaOnlyArray, byte b);

    private native Object nativeInvokeJavaScriptModule(long j, String str, String str2, JavaOnlyArray javaOnlyArray, byte b);

    private native void nativeOnCloseInspectorSession(long j);

    private native void nativeOnInspectorMessage(long j, String str);

    private native void nativeOnJSRunner(long j, Runnable runnable);

    private native void nativeOnJSRunnerAtFront(long j, Runnable runnable);

    private native void nativeOnJSRunnerDelay(long j, Runnable runnable, long j2);

    private native void nativeOnOpenInspectorSession(long j, InspectorClient inspectorClient);

    private native void nativeOnPlatformRunner(long j, Runnable runnable);

    private native void nativeOnWorkerRunner(long j, Runnable runnable);

    private native boolean nativeRelease(long j);

    private native void nativeSetProperties(long j, JavaOnlyMap javaOnlyMap);

    private native void nativeSetShellHolderDelegate(long j, AndroidShellHolderDelegate androidShellHolderDelegate);

    /* renamed from: a */
    public InspectorClient mo86076a() {
        return this.f59306d;
    }

    /* renamed from: h */
    public AndroidShellHolderDelegate mo86097h() {
        return this.f59307e;
    }

    /* renamed from: a */
    public void mo86087a(String str, String str2) {
        if (this.f59305c.get() != 0) {
            nativeEvaluateScript(this.f59305c.get(), str, str2);
        }
    }

    /* renamed from: a */
    public void mo86086a(String str, int i) {
        File file = new File(str);
        if ((file.exists() || file.mkdirs()) && this.f59305c.get() != 0) {
            nativeEnableCodeCache(this.f59305c.get(), str, i);
        }
    }

    static {
        C1711a.m7628a("falconengine");
    }

    /* renamed from: b */
    public long mo86088b() {
        return this.f59305c.get();
    }

    /* renamed from: c */
    public FalconModuleRegistry mo86091c() {
        FalconModuleRegistry falconModuleRegistry = this.f59303a;
        if (falconModuleRegistry != null) {
            return falconModuleRegistry;
        }
        FalconModuleRegistry nativeGetRegistry = nativeGetRegistry(this.f59305c.get());
        this.f59303a = nativeGetRegistry;
        return nativeGetRegistry;
    }

    /* renamed from: d */
    public void mo86093d() {
        if (this.f59305c.get() != 0) {
            nativeBindAllModules(this.f59305c.get());
        }
    }

    /* renamed from: e */
    public void mo86094e() {
        if (this.f59305c.get() != 0) {
            nativeOnOpenInspectorSession(this.f59305c.get(), this.f59306d);
        }
    }

    /* renamed from: f */
    public void mo86095f() {
        if (this.f59305c.get() != 0) {
            nativeOnCloseInspectorSession(this.f59305c.get());
        }
    }

    /* renamed from: g */
    public boolean mo86096g() {
        long andSet = this.f59305c.getAndSet(0);
        if (andSet == 0) {
            return false;
        }
        InspectorClient inspectorClient = this.f59306d;
        if (inspectorClient != null) {
            inspectorClient.mo86117e();
        }
        return nativeRelease(andSet);
    }

    /* renamed from: a */
    public <T extends AbstractC24015c> T mo86077a(Class<T> cls) {
        return (T) this.f59304b.mo86198a(this, cls);
    }

    /* renamed from: a */
    public void mo86082a(InspectorClient inspectorClient) {
        this.f59306d = inspectorClient;
    }

    /* renamed from: b */
    public <T extends AbstractC24014b> T mo86089b(Class<T> cls) {
        return (T) this.f59304b.mo86199b(this, cls);
    }

    /* renamed from: b */
    public void mo86090b(Runnable runnable) {
        if (this.f59305c.get() != 0) {
            nativeOnWorkerRunner(this.f59305c.get(), runnable);
        }
    }

    /* renamed from: c */
    public void mo86092c(Runnable runnable) {
        if (this.f59305c.get() != 0) {
            nativeOnJSRunnerAtFront(this.f59305c.get(), runnable);
        }
    }

    public AndroidFalconShellHolder(C23974a aVar) {
        AtomicLong atomicLong = new AtomicLong(0);
        this.f59305c = atomicLong;
        atomicLong.set(nativeCreateNativeHolder(aVar.mo86099a().ordinal(), aVar.mo86100b(), aVar.mo86101c(), aVar.mo86102d(), aVar.mo86103e()));
        if (aVar.mo86102d()) {
            this.f59306d = new InspectorClient(this);
        } else {
            this.f59306d = null;
        }
    }

    /* renamed from: a */
    public void mo86080a(JavaOnlyMap javaOnlyMap) {
        if (javaOnlyMap != null && javaOnlyMap.size() > 0 && this.f59305c.get() != 0) {
            nativeSetProperties(this.f59305c.get(), javaOnlyMap);
        }
    }

    /* renamed from: a */
    public void mo86081a(AndroidShellHolderDelegate androidShellHolderDelegate) {
        if (androidShellHolderDelegate != null && this.f59305c.get() != 0) {
            this.f59307e = androidShellHolderDelegate;
            nativeSetShellHolderDelegate(this.f59305c.get(), androidShellHolderDelegate);
        }
    }

    /* renamed from: a */
    public void mo86083a(Runnable runnable) {
        if (this.f59305c.get() != 0) {
            nativeOnJSRunner(this.f59305c.get(), runnable);
        }
    }

    /* renamed from: a */
    public void mo86085a(String str) {
        if (this.f59305c.get() != 0) {
            nativeOnInspectorMessage(this.f59305c.get(), str);
        }
    }

    /* renamed from: a */
    public void mo86084a(Runnable runnable, long j) {
        if (this.f59305c.get() != 0) {
            nativeOnJSRunnerDelay(this.f59305c.get(), runnable, j);
        }
    }

    /* renamed from: a */
    public Object mo86078a(String str, JavaOnlyArray javaOnlyArray, char c) {
        if (this.f59305c.get() != 0) {
            return nativeInvokeJavaScriptFunction(this.f59305c.get(), str, javaOnlyArray, (byte) c);
        }
        return null;
    }

    /* renamed from: a */
    public Object mo86079a(String str, String str2, JavaOnlyArray javaOnlyArray, char c) {
        if (this.f59305c.get() != 0) {
            return nativeInvokeJavaScriptModule(this.f59305c.get(), str, str2, javaOnlyArray, (byte) c);
        }
        return null;
    }
}
