package com.lynx.tasm.core;

import android.view.Choreographer;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

public class VSyncMonitor {

    /* renamed from: a */
    public static WeakReference<WindowManager> f66736a;

    public static native void nativeOnVSync(long j, long j2, long j3);

    /* renamed from: a */
    public static void m97712a(WindowManager windowManager) {
        f66736a = new WeakReference<>(windowManager);
    }

    public static void request(final long j) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.core.VSyncMonitor.Choreographer$FrameCallbackC268791 */

            public void doFrame(long j) {
                long j2;
                if (VSyncMonitor.f66736a.get() != null) {
                    j2 = (long) (1.0E9d / ((double) VSyncMonitor.f66736a.get().getDefaultDisplay().getRefreshRate()));
                } else {
                    j2 = 16666666;
                }
                VSyncMonitor.nativeOnVSync(j, j, j + j2);
            }
        });
    }
}
