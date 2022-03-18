package com.facebook.jni;

import com.C1711a;
import com.facebook.jni.C21046a;
import com.facebook.soloader.SoLoader;

public class HybridData {
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends C21046a.AbstractC21048a {
        public long mNativePointer;

        static native void deleteNative(long j);

        /* access modifiers changed from: protected */
        @Override // com.facebook.jni.C21046a.AbstractC21048a
        /* renamed from: a */
        public final void mo71398a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        Destructor(Object obj) {
            super(obj);
        }
    }

    static {
        try {
            SoLoader.loadLibrary("fbrn");
        } catch (Throwable unused) {
            C1711a.m7628a("fbrn");
        }
    }

    /* renamed from: a */
    public synchronized void mo71397a() {
        this.mDestructor.mo71398a();
    }
}
