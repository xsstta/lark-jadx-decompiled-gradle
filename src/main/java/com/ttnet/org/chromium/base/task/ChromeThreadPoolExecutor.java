package com.ttnet.org.chromium.base.task;

import android.os.Process;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.task.AsyncTask;
import com.ttnet.org.chromium.base.task.ChromeThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class ChromeThreadPoolExecutor extends ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int MAXIMUM_POOL_SIZE;
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new ArrayBlockingQueue(SmActions.ACTION_ONTHECALL_EXIT);
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        /* class com.ttnet.org.chromium.base.task.ChromeThreadPoolExecutor.ThreadFactoryC680001 */
        private final AtomicInteger mCount = new AtomicInteger(1);

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        static /* synthetic */ void lambda$newThread$0(Runnable runnable) {
            Process.setThreadPriority(10);
            runnable.run();
        }

        public Thread newThread(Runnable runnable) {
            $$Lambda$ChromeThreadPoolExecutor$1$A4vkadjqQHzMu9Shf3jtyUOIoXw r1 = new Runnable(runnable) {
                /* class com.ttnet.org.chromium.base.task.$$Lambda$ChromeThreadPoolExecutor$1$A4vkadjqQHzMu9Shf3jtyUOIoXw */
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    ChromeThreadPoolExecutor.ThreadFactoryC680001.lambda$newThread$0(this.f$0);
                }
            };
            return new_insert_after_java_lang_Thread_by_knot(new Thread(r1, "CrAsyncTask #" + this.mCount.getAndIncrement()));
        }
    };

    ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    private Map<String, Integer> getNumberOfClassNameOccurrencesInQueue() {
        int i;
        HashMap hashMap = new HashMap();
        for (Runnable runnable : (Runnable[]) getQueue().toArray(new Runnable[0])) {
            String className = getClassName(runnable);
            if (hashMap.containsKey(className)) {
                i = ((Integer) hashMap.get(className)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(className, Integer.valueOf(i + 1));
        }
        return hashMap;
    }

    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            Map<String, Integer> numberOfClassNameOccurrencesInQueue = getNumberOfClassNameOccurrencesInQueue();
            throw new RejectedExecutionException("Prominent classes in AsyncTask: " + findClassNamesWithTooManyRunnables(numberOfClassNameOccurrencesInQueue), e);
        }
    }

    private String findClassNamesWithTooManyRunnables(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb.append(entry.getKey());
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    private static String getClassName(Runnable runnable) {
        Class cls;
        Class cls2 = runnable.getClass();
        if (cls2 == AsyncTask.NamedFutureTask.class) {
            try {
                cls = ((AsyncTask.NamedFutureTask) runnable).getBlamedClass();
            } catch (NoSuchFieldException e) {
                if (BuildConfig.DCHECK_IS_ON) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e2) {
                if (BuildConfig.DCHECK_IS_ON) {
                    throw new RuntimeException(e2);
                }
            }
        } else {
            if (cls2.getEnclosingClass() == android.os.AsyncTask.class) {
                Field declaredField = cls2.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
            return cls2.getName();
        }
        cls2 = cls;
        return cls2.getName();
    }

    ChromeThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}
