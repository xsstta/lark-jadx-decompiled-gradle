package com.ss.android.appcenter.common.util;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.appcenter.common.util.n */
public final class C28196n {

    /* renamed from: a */
    private static final SparseArray<SparseArray<ExecutorService>> f70693a = new SparseArray<>();

    /* renamed from: b */
    private static final Map<AbstractRunnableC28201b, ScheduledExecutorService> f70694b = new HashMap();

    /* renamed from: c */
    private static Executor f70695c;

    /* renamed from: d */
    private static final int f70696d = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static Executor m103269a() {
        if (f70695c == null) {
            f70695c = new Executor() {
                /* class com.ss.android.appcenter.common.util.C28196n.ExecutorC281993 */

                /* renamed from: a */
                private final Handler f70701a = new Handler(Looper.getMainLooper());

                public void execute(Runnable runnable) {
                    this.f70701a.post(runnable);
                }
            };
        }
        return f70695c;
    }

    /* renamed from: com.ss.android.appcenter.common.util.n$b */
    public static abstract class AbstractRunnableC28201b<T> implements Runnable {

        /* renamed from: a */
        private volatile int f70702a;

        /* renamed from: d */
        public boolean f70703d;

        /* renamed from: a */
        public abstract void mo98231a(T t);

        /* renamed from: a */
        public abstract void mo99127a(Throwable th);

        /* renamed from: b */
        public abstract T mo98233b() throws Throwable;

        public void run() {
            try {
                final T b = mo98233b();
                if (this.f70702a == 0) {
                    if (this.f70703d) {
                        C28196n.m103269a().execute(new Runnable() {
                            /* class com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b.RunnableC282021 */

                            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.appcenter.common.util.n$b */
                            /* JADX WARN: Multi-variable type inference failed */
                            public void run() {
                                AbstractRunnableC28201b.this.mo98231a(b);
                            }
                        });
                        return;
                    }
                    this.f70702a = 1;
                    C28196n.m103269a().execute(new Runnable() {
                        /* class com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b.RunnableC282032 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.appcenter.common.util.n$b */
                        /* JADX WARN: Multi-variable type inference failed */
                        public void run() {
                            AbstractRunnableC28201b.this.mo98231a(b);
                            C28196n.m103279c(AbstractRunnableC28201b.this);
                        }
                    });
                }
            } catch (Throwable th) {
                if (this.f70702a == 0) {
                    this.f70702a = 3;
                    C28196n.m103269a().execute(new Runnable() {
                        /* class com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b.RunnableC282043 */

                        public void run() {
                            AbstractRunnableC28201b.this.mo99127a(th);
                            C28196n.m103279c(AbstractRunnableC28201b.this);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.appcenter.common.util.n$a */
    public static abstract class AbstractC28200a<T> extends AbstractRunnableC28201b<T> {
        @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b
        /* renamed from: a */
        public void mo99127a(Throwable th) {
            Log.m165384e("ThreadUtils", "onFail: ", th);
        }
    }

    /* renamed from: a */
    private static ExecutorService m103270a(int i) {
        return m103271a(i, 5);
    }

    /* renamed from: b */
    public static <T> void m103278b(AbstractRunnableC28201b<T> bVar) {
        m103275a(m103270a(-8), bVar);
    }

    /* renamed from: a */
    public static <T> void m103272a(AbstractRunnableC28201b<T> bVar) {
        m103275a(m103270a(-4), bVar);
    }

    /* renamed from: c */
    public static synchronized void m103279c(AbstractRunnableC28201b bVar) {
        synchronized (C28196n.class) {
            Map<AbstractRunnableC28201b, ScheduledExecutorService> map = f70694b;
            ScheduledExecutorService scheduledExecutorService = map.get(bVar);
            if (scheduledExecutorService != null) {
                map.remove(bVar);
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.common.util.n$c */
    public static final class ThreadFactoryC28205c extends AtomicLong implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f70710a = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final String namePrefix;
        private final int priority;

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, this.namePrefix + getAndIncrement()) {
                /* class com.ss.android.appcenter.common.util.C28196n.ThreadFactoryC28205c.C282061 */

                public void run() {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        Log.m165384e("ThreadUtils", "Request threw uncaught throwable", th);
                    }
                }
            });
            if (new_insert_after_java_lang_Thread_by_knot.isDaemon()) {
                new_insert_after_java_lang_Thread_by_knot.setDaemon(false);
            }
            new_insert_after_java_lang_Thread_by_knot.setPriority(this.priority);
            return new_insert_after_java_lang_Thread_by_knot;
        }

        ThreadFactoryC28205c(String str, int i) {
            this.namePrefix = str + "-pool-" + f70710a.getAndIncrement() + "-thread-";
            this.priority = i;
        }
    }

    /* renamed from: d */
    private static synchronized ScheduledExecutorService m103280d(AbstractRunnableC28201b bVar) {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (C28196n.class) {
            Map<AbstractRunnableC28201b, ScheduledExecutorService> map = f70694b;
            scheduledExecutorService = map.get(bVar);
            if (scheduledExecutorService == null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC28205c("scheduled", 10));
                map.put(bVar, scheduledExecutorService);
            }
        }
        return scheduledExecutorService;
    }

    /* renamed from: a */
    public static void m103274a(Runnable runnable) {
        m103269a().execute(runnable);
    }

    /* renamed from: a */
    private static synchronized ExecutorService m103271a(int i, int i2) {
        ExecutorService executorService;
        synchronized (C28196n.class) {
            SparseArray<SparseArray<ExecutorService>> sparseArray = f70693a;
            SparseArray<ExecutorService> sparseArray2 = sparseArray.get(i);
            if (sparseArray2 == null) {
                SparseArray<ExecutorService> sparseArray3 = new SparseArray<>();
                executorService = m103277b(i, i2);
                sparseArray3.put(i2, executorService);
                sparseArray.put(i, sparseArray3);
            } else {
                executorService = sparseArray2.get(i2);
                if (executorService == null) {
                    executorService = m103277b(i, i2);
                    sparseArray2.put(i2, executorService);
                }
            }
        }
        return executorService;
    }

    /* renamed from: b */
    private static ExecutorService m103277b(int i, int i2) {
        if (i == -8) {
            int i3 = f70696d;
            return new ThreadPoolExecutor(i3 + 1, (i3 * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue((int) SmActions.ACTION_ONTHECALL_EXIT), new ThreadFactoryC28205c("cpu", i2));
        } else if (i == -4) {
            int i4 = f70696d;
            return new ThreadPoolExecutor((i4 * 2) + 1, (i4 * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue((int) SmActions.ACTION_ONTHECALL_EXIT), new ThreadFactoryC28205c("io", i2));
        } else if (i == -2) {
            return Executors.newCachedThreadPool(new ThreadFactoryC28205c("cached", i2));
        } else {
            if (i == -1) {
                return Executors.newSingleThreadExecutor(new ThreadFactoryC28205c("single", i2));
            }
            return Executors.newFixedThreadPool(i, new ThreadFactoryC28205c("fixed(" + i + ")", i2));
        }
    }

    /* renamed from: a */
    private static <T> void m103275a(ExecutorService executorService, AbstractRunnableC28201b<T> bVar) {
        m103276a(executorService, bVar, 0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static <T> void m103273a(AbstractRunnableC28201b<T> bVar, long j, TimeUnit timeUnit) {
        m103276a(m103270a(-1), bVar, j, timeUnit);
    }

    /* renamed from: a */
    private static <T> void m103276a(final ExecutorService executorService, final AbstractRunnableC28201b<T> bVar, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            m103280d(bVar).execute(new Runnable() {
                /* class com.ss.android.appcenter.common.util.C28196n.RunnableC281971 */

                public void run() {
                    executorService.execute(bVar);
                }
            });
        } else {
            m103280d(bVar).schedule(new Runnable() {
                /* class com.ss.android.appcenter.common.util.C28196n.RunnableC281982 */

                public void run() {
                    executorService.execute(bVar);
                }
            }, j, timeUnit);
        }
    }
}
