package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.util.e */
public final class C2560e {

    /* renamed from: a */
    private static final Executor f8276a = new Executor() {
        /* class com.bumptech.glide.util.C2560e.ExecutorC25611 */

        /* renamed from: a */
        private final Handler f8278a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f8278a.post(runnable);
        }
    };

    /* renamed from: b */
    private static final Executor f8277b = new Executor() {
        /* class com.bumptech.glide.util.C2560e.ExecutorC25622 */

        public void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: a */
    public static Executor m10877a() {
        return f8276a;
    }

    /* renamed from: b */
    public static Executor m10878b() {
        return f8277b;
    }
}
