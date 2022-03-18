package com.bytedance.common.utility.concurrent;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPlus implements Runnable {
    protected static final AtomicInteger S_COUNT = new AtomicInteger();
    private static ExecutorService mCachedExecutor = TTExecutors.getNormalExecutor();
    private static ExecutorService mFixedExecutor = TTExecutors.getNormalExecutor();
    private final boolean mBackground;
    private Runnable runnable;

    public static void shutdown() {
    }

    public ThreadPlus() {
        this(false);
    }

    public void run() {
        Runnable runnable2 = this.runnable;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void start() {
        Runnable runnable2;
        if (Logger.debug()) {
            runnable2 = new Runnable() {
                /* class com.bytedance.common.utility.concurrent.ThreadPlus.RunnableC36341 */

                public void run() {
                    Logger.m15167d("ThreadPlus", "thread count: " + ThreadPlus.S_COUNT.incrementAndGet());
                    try {
                        ThreadPlus.this.run();
                    } catch (Exception e) {
                        Logger.m15182w("ThreadPlus", "Thread crashed!", e);
                    }
                    Logger.m15167d("ThreadPlus", "thread count: " + ThreadPlus.S_COUNT.decrementAndGet());
                }
            };
        } else {
            runnable2 = this;
        }
        if (this.mBackground) {
            mFixedExecutor.submit(runnable2);
        } else {
            mCachedExecutor.submit(runnable2);
        }
    }

    public static void setExecutorService(ExecutorService executorService) {
        mCachedExecutor = executorService;
        mFixedExecutor = executorService;
    }

    public static void submitRunnable(Runnable runnable2) {
        if (runnable2 != null) {
            mCachedExecutor.submit(runnable2);
        }
    }

    public ThreadPlus(String str) {
        this(false);
    }

    public ThreadPlus(boolean z) {
        this.mBackground = z;
    }

    public ThreadPlus(Runnable runnable2, String str, boolean z) {
        this.runnable = runnable2;
        this.mBackground = z;
    }
}
