package dagger.hilt.android.internal;

import android.os.Looper;

/* renamed from: dagger.hilt.android.internal.b */
public final class C68127b {

    /* renamed from: a */
    private static Thread f171365a;

    /* renamed from: b */
    public static void m264767b() {
        if (!m264766a()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: a */
    public static boolean m264766a() {
        if (f171365a == null) {
            f171365a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f171365a) {
            return true;
        }
        return false;
    }
}
