package com.lynx.tasm.core;

import com.lynx.jsbridge.C26507b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.image.C26785a;
import com.lynx.tasm.provider.CanvasProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class JSProxy {

    /* renamed from: a */
    private long f66732a;

    /* renamed from: b */
    private long f66733b;

    /* renamed from: c */
    private final WeakReference<AbstractC26684l> f66734c;

    /* renamed from: d */
    private final ReadWriteLock f66735d = new ReentrantReadWriteLock();

    private native void nativeCallIntersectionObserver(long j, int i, int i2, JavaOnlyMap javaOnlyMap);

    private native void nativeCallJSFunction(long j, String str, String str2, JavaOnlyArray javaOnlyArray);

    private native long nativeCreate(long j);

    private native void nativeDestroy(long j);

    private static native void nativeDoFrameForAllProxiesOnJSThread(long j);

    private static native JSProxy nativeGetProxyById(long j);

    /* renamed from: a */
    public long mo95660a() {
        return this.f66733b;
    }

    /* renamed from: b */
    public void mo95664b() {
        CanvasProvider a = LynxEnv.m96123e().mo94081a();
        if (a != null) {
            a.mo95205b(Long.valueOf(this.f66733b));
        }
        this.f66735d.writeLock().lock();
        nativeDestroy(this.f66732a);
        this.f66732a = 0;
        this.f66735d.writeLock().unlock();
    }

    /* renamed from: a */
    public static void m97705a(long j) {
        nativeDoFrameForAllProxiesOnJSThread(j);
    }

    private void setRuntimeId(long j) {
        this.f66733b = j;
    }

    /* renamed from: a */
    public C26507b mo95661a(String str) {
        return new C26507b(str, this);
    }

    public JSProxy(long j, WeakReference<AbstractC26684l> weakReference) {
        this.f66734c = weakReference;
        this.f66732a = nativeCreate(j);
    }

    private static void ensureHeliumLoaded(long j, boolean z) {
        CanvasProvider a = LynxEnv.m96123e().mo94081a();
        if (a != null) {
            a.mo95200a(z);
            a.mo95199a(new Long(j));
        }
    }

    /* renamed from: a */
    public static String m97704a(long j, String str) {
        AbstractC26684l lVar;
        JSProxy nativeGetProxyById = nativeGetProxyById(j);
        if (nativeGetProxyById == null || (lVar = nativeGetProxyById.f66734c.get()) == null) {
            return str;
        }
        String a = C26785a.m97218a(lVar, str);
        LLog.m96423b("redirectUrl", "result:" + a);
        return a;
    }

    private static long createCanvas(String str, long j, boolean z) {
        CanvasProvider a = LynxEnv.m96123e().mo94081a();
        if (a != null) {
            return a.mo95193a(str, new Long(j), z);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo95662a(int i, int i2, JavaOnlyMap javaOnlyMap) {
        this.f66735d.readLock().lock();
        long j = this.f66732a;
        if (j != 0) {
            nativeCallIntersectionObserver(j, i, i2, javaOnlyMap);
        }
        this.f66735d.readLock().unlock();
    }

    /* renamed from: a */
    public void mo95663a(String str, String str2, JavaOnlyArray javaOnlyArray) {
        this.f66735d.readLock().lock();
        long j = this.f66732a;
        if (j != 0) {
            nativeCallJSFunction(j, str, str2, javaOnlyArray);
        }
        this.f66735d.readLock().unlock();
    }
}
