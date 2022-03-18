package com.bytedance.ug.sdk.share.impl.network.p930b;

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

/* renamed from: com.bytedance.ug.sdk.share.impl.network.b.a */
public class C20865a {

    /* renamed from: a */
    public static final int f51046a;

    /* renamed from: b */
    public static final int f51047b;

    /* renamed from: c */
    public static final int f51048c;

    /* renamed from: d */
    public static final int f51049d;

    /* renamed from: e */
    public static final int f51050e;

    /* renamed from: f */
    public static final int f51051f;

    /* renamed from: g */
    private static ExecutorService f51052g;

    /* renamed from: h */
    private static ExecutorService f51053h;

    /* renamed from: i */
    private static ExecutorService f51054i;

    /* renamed from: j */
    private static ScheduledExecutorService f51055j;

    /* renamed from: k */
    private static final ThreadFactoryC20867a f51056k;

    /* renamed from: l */
    private static final ThreadFactoryC20867a f51057l;

    /* renamed from: m */
    private static final ThreadFactoryC20867a f51058m;

    /* renamed from: n */
    private static final ThreadFactoryC20867a f51059n;

    /* renamed from: o */
    private static final BlockingQueue<Runnable> f51060o;

    /* renamed from: p */
    private static final BlockingQueue<Runnable> f51061p;

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f51062q;

    /* renamed from: r */
    private static final RejectedExecutionHandler f51063r;

    /* renamed from: a */
    public static ExecutorService m75928a() {
        return f51052g;
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f51046a = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f51047b = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f51048c = max;
        int i = (max * 2) + 1;
        f51049d = i;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 3));
        f51050e = max2;
        int i2 = (availableProcessors * 2) + 1;
        f51051f = i2;
        ThreadFactoryC20867a aVar = new ThreadFactoryC20867a("TTDefaultExecutors");
        f51056k = aVar;
        ThreadFactoryC20867a aVar2 = new ThreadFactoryC20867a("TTCpuExecutors");
        f51057l = aVar2;
        ThreadFactoryC20867a aVar3 = new ThreadFactoryC20867a("TTScheduledExecutors");
        f51058m = aVar3;
        ThreadFactoryC20867a aVar4 = new ThreadFactoryC20867a("TTDownLoadExecutors");
        f51059n = aVar4;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f51060o = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        f51061p = linkedBlockingQueue2;
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        f51062q = linkedBlockingQueue3;
        RejectedExecutionHandlerC208661 r25 = new RejectedExecutionHandler() {
            /* class com.bytedance.ug.sdk.share.impl.network.p930b.C20865a.RejectedExecutionHandlerC208661 */

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        f51063r = r25;
        C20868b bVar = new C20868b(max, i, 30, TimeUnit.SECONDS, linkedBlockingQueue, aVar, r25);
        f51052g = bVar;
        bVar.allowCoreThreadTimeOut(true);
        C20868b bVar2 = new C20868b(max2, i2, 30, TimeUnit.SECONDS, linkedBlockingQueue2, aVar2, r25);
        f51053h = bVar2;
        bVar2.allowCoreThreadTimeOut(true);
        f51055j = Executors.newScheduledThreadPool(3, aVar3);
        C20868b bVar3 = new C20868b(2, 2, 30, TimeUnit.SECONDS, linkedBlockingQueue3, aVar4, r25);
        f51054i = bVar3;
        bVar3.allowCoreThreadTimeOut(true);
    }

    /* renamed from: com.bytedance.ug.sdk.share.impl.network.b.a$a */
    private static class ThreadFactoryC20867a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f51064a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f51065b;

        /* renamed from: c */
        private final AtomicInteger f51066c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f51067d;

        /* renamed from: a */
        public static Thread m75929a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f51065b;
            Thread a = m75929a(new Thread(threadGroup, runnable, this.f51067d + this.f51066c.getAndIncrement(), 0));
            if (a.isDaemon()) {
                a.setDaemon(false);
            }
            if (a.getPriority() != 5) {
                a.setPriority(5);
            }
            return a;
        }

        ThreadFactoryC20867a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f51065b = threadGroup;
            this.f51067d = str + "-" + f51064a.getAndIncrement() + "-Thread-";
        }
    }
}
