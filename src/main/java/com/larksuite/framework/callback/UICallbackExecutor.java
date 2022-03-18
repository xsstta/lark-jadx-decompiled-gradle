package com.larksuite.framework.callback;

import android.os.Handler;
import android.os.Looper;

public class UICallbackExecutor {
    private static C25967a executor;
    private static final Handler sHandler = new Handler(Looper.getMainLooper());

    private static void initIfNeed() {
        if (executor == null) {
            synchronized (C25967a.class) {
                if (executor == null) {
                    executor = new C25967a(sHandler);
                }
            }
        }
    }

    public static void post(Runnable runnable) {
        initIfNeed();
        executor.mo92345a(runnable);
    }

    public static void execute(Runnable runnable) {
        initIfNeed();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            executor.mo92345a(runnable);
        }
    }

    public static void removeCallbacks(Runnable runnable) {
        C25967a aVar;
        Handler a;
        if (runnable != null && (aVar = executor) != null && (a = aVar.mo92344a()) != null) {
            a.removeCallbacks(runnable);
        }
    }

    public static void executeDelayed(Runnable runnable, long j) {
        initIfNeed();
        executor.mo92346a(runnable, j);
    }
}
