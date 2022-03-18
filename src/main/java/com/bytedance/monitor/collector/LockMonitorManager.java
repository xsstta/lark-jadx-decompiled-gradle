package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Process;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class LockMonitorManager {
    private static C20119a[] buffer = new C20119a[100];
    private static int bufferSize = 100;
    public static volatile String lastJavaStack;
    public static volatile boolean openFetchStack;
    private static int position;
    private static ExecutorService sLockHandler = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.ThreadFactoryC201151 */

        /* renamed from: a */
        public static Thread m73440a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m73440a(new Thread(runnable));
            a.setName("lock_handler_time");
            return a;
        }
    });
    public static BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    private static ExecutorService sStackFetcher = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.ThreadFactoryC201162 */

        /* renamed from: a */
        public static Thread m73441a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m73441a(new Thread(runnable));
            Process.setThreadPriority(-20);
            a.setName("lock_stack_fetch");
            return a;
        }
    });

    private static void nativeGetJavaStack() {
        if (openFetchStack) {
            sStackFetcher.execute(new Runnable() {
                /* class com.bytedance.monitor.collector.LockMonitorManager.RunnableC201184 */

                public void run() {
                    try {
                        String a = C20163o.m73582a(Looper.getMainLooper().getThread().getStackTrace());
                        synchronized (LockMonitorManager.sStackBlockingQueue) {
                            if (LockMonitorManager.sStackBlockingQueue.size() != 0) {
                                LockMonitorManager.sStackBlockingQueue.clear();
                            }
                            LockMonitorManager.sStackBlockingQueue.put(a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public static List<String> dumpLockInfo() {
        C20119a aVar;
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (true) {
            int i2 = bufferSize;
            if (i >= i2 || (aVar = buffer[(((position + i2) - i) - 1) % i2]) == null) {
                return linkedList;
            }
            linkedList.add(aVar.f49103a + "&#&" + aVar.f49104b + "&#&" + aVar.f49106d + "&#&" + aVar.f49105c + "&#&");
            i++;
        }
        return linkedList;
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (!z) {
            lastJavaStack = null;
        }
    }

    private static void nativePut(final String str) {
        sLockHandler.execute(new Runnable() {
            /* class com.bytedance.monitor.collector.LockMonitorManager.RunnableC201173 */

            public void run() {
                try {
                    C20119a.m73442a(str);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void put(C20119a aVar) {
        if (aVar != null) {
            C20119a[] aVarArr = buffer;
            int i = position;
            aVarArr[i] = aVar;
            position = (i + 1) % bufferSize;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.monitor.collector.LockMonitorManager$a */
    public static class C20119a {

        /* renamed from: a */
        public long f49103a;

        /* renamed from: b */
        public long f49104b;

        /* renamed from: c */
        public String f49105c;

        /* renamed from: d */
        public String f49106d;

        /* renamed from: a */
        static void m73442a(String str) {
            String poll;
            if (str != null && !str.isEmpty()) {
                try {
                    String[] split = str.split("&#&");
                    if (split.length == 3) {
                        if (LockMonitorManager.openFetchStack) {
                            synchronized (LockMonitorManager.sStackBlockingQueue) {
                                poll = LockMonitorManager.sStackBlockingQueue.poll(200, TimeUnit.MILLISECONDS);
                                if (poll != null || LockMonitorManager.lastJavaStack == null) {
                                    LockMonitorManager.lastJavaStack = poll;
                                } else {
                                    poll = LockMonitorManager.lastJavaStack;
                                }
                                if (!LockMonitorManager.sStackBlockingQueue.isEmpty()) {
                                    LockMonitorManager.sStackBlockingQueue.clear();
                                }
                            }
                            if (poll != null) {
                                C3047b.m12756a().mo12886a(new Runnable(new C20119a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], poll)) {
                                    /* class com.bytedance.monitor.collector.LockMonitorManager.C20119a.RunnableC201201 */

                                    /* renamed from: a */
                                    final /* synthetic */ C20119a f49107a;

                                    public void run() {
                                        LockMonitorManager.put(this.f49107a);
                                    }

                                    {
                                        this.f49107a = r1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        C3047b.m12756a().mo12886a(new Runnable(new C20119a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], "")) {
                            /* class com.bytedance.monitor.collector.LockMonitorManager.C20119a.RunnableC201212 */

                            /* renamed from: a */
                            final /* synthetic */ C20119a f49108a;

                            public void run() {
                                LockMonitorManager.put(this.f49108a);
                            }

                            {
                                this.f49108a = r1;
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }

        private C20119a(long j, long j2, String str, String str2) {
            this.f49103a = j;
            this.f49104b = j2;
            this.f49105c = str2;
            this.f49106d = str;
        }
    }
}
