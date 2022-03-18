package com.bytedance.ee.lark.infra.foundation.schedulers;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.optrace.p2413c.p2414a.RunnableC48935b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Schedulers {
    static final int CPU = Runtime.getRuntime().availableProcessors();
    static final SchedulerCreator justCreator = new JustSchedulerCreator();
    static Handler mainHandler = new Handler(mainLooper);
    static Looper mainLooper = Looper.getMainLooper();
    static final SchedulerCreator netCreator = AsyncSchedulerInit.onNetScheduler(new NetSchedulerCreator());
    static final SchedulerCreator shortIoCreator = AsyncSchedulerInit.onDBScheduler(new ShortIOSchedulerCreator());
    static final SchedulerCreator uiCreator = new UISchedulerCreator();

    static final class JustHolder {
        static final Scheduler DEFAULT = new JustScheduler();

        JustHolder() {
        }
    }

    static class JustScheduler implements Scheduler {
        JustScheduler() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler
        public void execute(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static class JustSchedulerCreator implements SchedulerCreator {
        JustSchedulerCreator() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.SchedulerCreator
        public Scheduler create() {
            return JustHolder.DEFAULT;
        }
    }

    static final class NetHolder {
        static final Scheduler DEFAULT = new NetScheduler();

        NetHolder() {
        }
    }

    static class NetSchedulerCreator implements SchedulerCreator {
        NetSchedulerCreator() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.SchedulerCreator
        public Scheduler create() {
            return NetHolder.DEFAULT;
        }
    }

    static final class ShortIOHolder {
        static final Scheduler DEFAULT = new ShortIOScheduler();

        ShortIOHolder() {
        }
    }

    static class ShortIOSchedulerCreator implements SchedulerCreator {
        ShortIOSchedulerCreator() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.SchedulerCreator
        public Scheduler create() {
            return ShortIOHolder.DEFAULT;
        }
    }

    static final class UIHolder {
        static final Scheduler DEFAULT = new UIScheduler();

        UIHolder() {
        }
    }

    static class UIScheduler implements Scheduler {
        UIScheduler() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler
        public void execute(Runnable runnable) {
            if (runnable != null) {
                if (Schedulers.isUIThread()) {
                    runnable.run();
                    return;
                }
                Schedulers.mainHandler.post(new RunnableC48935b(runnable));
            }
        }
    }

    static class UISchedulerCreator implements SchedulerCreator {
        UISchedulerCreator() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.SchedulerCreator
        public Scheduler create() {
            return UIHolder.DEFAULT;
        }
    }

    public static Scheduler current() {
        return justCreator.create();
    }

    public static Scheduler longIO() {
        return netCreator.create();
    }

    public static Scheduler shortIO() {
        return shortIoCreator.create();
    }

    public static Scheduler ui() {
        return uiCreator.create();
    }

    static boolean isUIThread() {
        if (Looper.myLooper() == mainLooper) {
            return true;
        }
        return false;
    }

    static class ShortIOScheduler implements Scheduler {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(2, 4, 1, TimeUnit.MINUTES, new LinkedBlockingDeque(), new ThreadFactory() {
            /* class com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers.ShortIOScheduler.ThreadFactoryC127811 */
            private final AtomicInteger mCount = new AtomicInteger(1);

            public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, "StorageDBScheduler #" + this.mCount.getAndIncrement()));
            }
        });

        ShortIOScheduler() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler
        public void execute(Runnable runnable) {
            this.threadPoolExecutor.execute(new RunnableC48935b(runnable));
        }
    }

    static class NetScheduler implements Scheduler {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor((Schedulers.CPU * 2) + 1, (Schedulers.CPU * 4) + 1, 0, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() {
            /* class com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers.NetScheduler.ThreadFactoryC127801 */
            private final AtomicInteger mCount = new AtomicInteger(1);

            public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, "StorageNetScheduler #" + this.mCount.getAndIncrement()));
            }
        });

        NetScheduler() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler
        public void execute(Runnable runnable) {
            this.threadPoolExecutor.execute(new RunnableC48935b(runnable));
        }
    }
}
