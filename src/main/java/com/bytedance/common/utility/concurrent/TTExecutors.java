package com.bytedance.common.utility.concurrent;

import android.os.Process;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TTExecutors {
    public static final int AVAILABLEPROCESSORS;
    public static final int CORE_POOL_SIZE_CPU;
    public static final int CORE_POOL_SIZE_NORMAL;
    public static final int CPU_COUNT;
    public static final int MAXIMUM_POOL_SIZE_CPU;
    public static final int MAXIMUM_POOL_SIZE_NORMAL;
    private static final BackgroundThreadFactory S_BACKGROUND_THREAD_FACTORY;
    private static final DefaultThreadFactory S_CPU_THREAD_FACTORY;
    private static final DefaultThreadFactory S_DEFAULT_THREAD_FACTORY;
    private static final DefaultThreadFactory S_DOWNLOAD_THREAD_FACTORY;
    private static final RejectedExecutionHandler S_HANDLER;
    private static final BlockingQueue<Runnable> S_POOLWORK_QUEUE;
    private static final BlockingQueue<Runnable> S_POOLWORK_QUEUE_CPU;
    private static final BlockingQueue<Runnable> S_POOLWORK_QUEUE_DOWNLOAD;
    private static final DefaultThreadFactory S_SCHEDULED_THREAD_FACTORY;
    private static final DefaultThreadFactory S_SERIAL_THREAD_FACTORY;
    private static ExecutorService sBackgroundThreadPool;
    private static ExecutorService sCPUThreadPool;
    private static ExecutorService sIOThreadPool;
    private static ExecutorService sNormalThreadPool;
    private static ScheduledExecutorService sScheduledThreadPool;
    private static ExecutorService sSerialThreadPool;

    public static ExecutorService getIOThreadPool() {
        return sIOThreadPool;
    }

    public static ExecutorService getNormalExecutor() {
        return sNormalThreadPool;
    }

    public static ScheduledExecutorService getScheduledThreadPool() {
        return sScheduledThreadPool;
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        AVAILABLEPROCESSORS = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        CORE_POOL_SIZE_NORMAL = max;
        int i = (max * 2) + 1;
        MAXIMUM_POOL_SIZE_NORMAL = i;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 3));
        CORE_POOL_SIZE_CPU = max2;
        int i2 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE_CPU = i2;
        DefaultThreadFactory defaultThreadFactory = new DefaultThreadFactory("TTDefaultExecutors");
        S_DEFAULT_THREAD_FACTORY = defaultThreadFactory;
        DefaultThreadFactory defaultThreadFactory2 = new DefaultThreadFactory("TTCpuExecutors");
        S_CPU_THREAD_FACTORY = defaultThreadFactory2;
        DefaultThreadFactory defaultThreadFactory3 = new DefaultThreadFactory("TTScheduledExecutors");
        S_SCHEDULED_THREAD_FACTORY = defaultThreadFactory3;
        DefaultThreadFactory defaultThreadFactory4 = new DefaultThreadFactory("TTDownLoadExecutors");
        S_DOWNLOAD_THREAD_FACTORY = defaultThreadFactory4;
        DefaultThreadFactory defaultThreadFactory5 = new DefaultThreadFactory("TTSerialExecutors");
        S_SERIAL_THREAD_FACTORY = defaultThreadFactory5;
        BackgroundThreadFactory backgroundThreadFactory = new BackgroundThreadFactory("TTBackgroundExecutors");
        S_BACKGROUND_THREAD_FACTORY = backgroundThreadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        S_POOLWORK_QUEUE = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        S_POOLWORK_QUEUE_CPU = linkedBlockingQueue2;
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        S_POOLWORK_QUEUE_DOWNLOAD = linkedBlockingQueue3;
        RejectedExecutionHandlerC36321 r25 = new RejectedExecutionHandler() {
            /* class com.bytedance.common.utility.concurrent.TTExecutors.RejectedExecutionHandlerC36321 */

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        S_HANDLER = r25;
        TTThreadPoolExecutor tTThreadPoolExecutor = new TTThreadPoolExecutor(max, i, 30, TimeUnit.SECONDS, linkedBlockingQueue, defaultThreadFactory, r25);
        sNormalThreadPool = tTThreadPoolExecutor;
        tTThreadPoolExecutor.allowCoreThreadTimeOut(true);
        TTThreadPoolExecutor tTThreadPoolExecutor2 = new TTThreadPoolExecutor(max2, i2, 30, TimeUnit.SECONDS, linkedBlockingQueue2, defaultThreadFactory2, r25);
        sCPUThreadPool = tTThreadPoolExecutor2;
        tTThreadPoolExecutor2.allowCoreThreadTimeOut(true);
        sScheduledThreadPool = Executors.newScheduledThreadPool(3, defaultThreadFactory3);
        TTThreadPoolExecutor tTThreadPoolExecutor3 = new TTThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS, linkedBlockingQueue3, defaultThreadFactory4, r25);
        sIOThreadPool = tTThreadPoolExecutor3;
        tTThreadPoolExecutor3.allowCoreThreadTimeOut(true);
        TTThreadPoolExecutor tTThreadPoolExecutor4 = new TTThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), defaultThreadFactory5);
        sSerialThreadPool = tTThreadPoolExecutor4;
        tTThreadPoolExecutor4.allowCoreThreadTimeOut(true);
        TTThreadPoolExecutor tTThreadPoolExecutor5 = new TTThreadPoolExecutor(0, 3, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), backgroundThreadFactory);
        sBackgroundThreadPool = tTThreadPoolExecutor5;
        tTThreadPoolExecutor5.allowCoreThreadTimeOut(true);
    }

    private static class BackgroundThreadFactory implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private final ThreadGroup group;
        private final String namePrefix;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.group;
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(threadGroup, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0) {
                /* class com.bytedance.common.utility.concurrent.TTExecutors.BackgroundThreadFactory.C36331 */

                public void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            });
            if (new_insert_after_java_lang_Thread_by_knot.isDaemon()) {
                new_insert_after_java_lang_Thread_by_knot.setDaemon(false);
            }
            return new_insert_after_java_lang_Thread_by_knot;
        }

        BackgroundThreadFactory(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.group = threadGroup;
            this.namePrefix = str + "-" + POOL_NUMBER.getAndIncrement() + "-Thread-";
        }
    }

    private static class DefaultThreadFactory implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private final ThreadGroup threadGroup;
        private final String threadNamePre;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup2 = this.threadGroup;
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(threadGroup2, runnable, this.threadNamePre + this.threadNumber.getAndIncrement(), 0));
            if (new_insert_after_java_lang_Thread_by_knot.isDaemon()) {
                new_insert_after_java_lang_Thread_by_knot.setDaemon(false);
            }
            if (new_insert_after_java_lang_Thread_by_knot.getPriority() != 5) {
                new_insert_after_java_lang_Thread_by_knot.setPriority(5);
            }
            return new_insert_after_java_lang_Thread_by_knot;
        }

        DefaultThreadFactory(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                this.threadGroup = securityManager.getThreadGroup();
            } else {
                this.threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.threadNamePre = str + "-" + POOL_NUMBER.getAndIncrement() + "-Thread-";
        }
    }
}
