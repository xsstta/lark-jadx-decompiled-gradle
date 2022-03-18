package com.ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ttvecamera.k */
public class C60405k {

    /* renamed from: a */
    private static WeakReference<AbstractC60406a> f150975a;

    /* renamed from: com.ss.android.ttvecamera.k$a */
    public interface AbstractC60406a {
        /* renamed from: a */
        void mo206870a(Throwable th);
    }

    /* renamed from: a */
    public static void m234763a(AbstractC60406a aVar) {
        WeakReference<AbstractC60406a> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        f150975a = weakReference;
    }

    /* renamed from: a */
    public static void m234764a(Throwable th) {
        AbstractC60406a aVar;
        WeakReference<AbstractC60406a> weakReference = f150975a;
        if (weakReference == null) {
            aVar = null;
        } else {
            aVar = weakReference.get();
        }
        if (aVar != null) {
            aVar.mo206870a(th);
        }
    }
}
