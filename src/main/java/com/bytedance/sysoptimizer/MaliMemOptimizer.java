package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;

public class MaliMemOptimizer {
    private static volatile boolean hasEnableMaliGLErrorSkip;
    private static volatile boolean hasSetTimeMillsDelayed;

    private static native void enable_gl_error_skip(boolean z);

    private static native void set_time_mills_delayed(int i, int i2);

    private MaliMemOptimizer() {
    }

    public static synchronized void enableMaliGLErrorSkip(Context context, boolean z) {
        synchronized (MaliMemOptimizer.class) {
            if (!hasEnableMaliGLErrorSkip) {
                ByteHook.init();
                SysOptimizer.loadOptimizerLibrary(context);
                enable_gl_error_skip(z);
                hasEnableMaliGLErrorSkip = true;
            }
        }
    }

    public static synchronized void setTimeMillsDelayed(int i, int i2, Context context) {
        synchronized (MaliMemOptimizer.class) {
            if (!hasSetTimeMillsDelayed) {
                ByteHook.init();
                SysOptimizer.loadOptimizerLibrary(context);
                set_time_mills_delayed(i, i2);
                hasSetTimeMillsDelayed = true;
            }
        }
    }
}
