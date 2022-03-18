package com.google.android.play.core.splitcompat;

import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.d */
public final class ThreadFactoryC22665d implements ThreadFactory {
    ThreadFactoryC22665d() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
