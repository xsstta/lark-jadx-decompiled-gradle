package p001a.p002a.p003a.p005b.p006a;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.common.util.Logger;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.a.a.b.a.b */
public class C0017b {
    /* renamed from: a */
    public static ExecutorService m27a(int i, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0018a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: a.a.a.b.a.b$a */
    private static class ThreadFactoryC0018a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f30a = new AtomicInteger(1);

        /* renamed from: b */
        public final String f31b;

        public ThreadFactoryC0018a(String str) {
            this.f31b = str + "-thread-";
        }

        /* renamed from: a */
        public static Thread m28a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f31b + this.f30a.getAndIncrement());
            m28a(thread).setUncaughtExceptionHandler(new C0019a());
            return thread;
        }

        /* renamed from: a.a.a.b.a.b$a$a */
        class C0019a implements Thread.UncaughtExceptionHandler {
            public C0019a() {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                Logger.println(6, "ExecutorsManager", thread.getName() + " : " + th.getMessage());
            }
        }
    }
}
