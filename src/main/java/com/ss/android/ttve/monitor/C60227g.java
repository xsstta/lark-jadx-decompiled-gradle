package com.ss.android.ttve.monitor;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ttve.monitor.g */
public class C60227g {

    /* renamed from: a */
    private static WeakReference<AbstractC60228a> f150338a;

    /* renamed from: com.ss.android.ttve.monitor.g$a */
    public interface AbstractC60228a {
        /* renamed from: a */
        void mo205709a(Throwable th);
    }

    /* renamed from: a */
    public static void m234084a(Throwable th) {
        AbstractC60228a aVar;
        WeakReference<AbstractC60228a> weakReference = f150338a;
        if (weakReference == null) {
            aVar = null;
        } else {
            aVar = weakReference.get();
        }
        if (aVar != null) {
            aVar.mo205709a(th);
        }
    }
}
