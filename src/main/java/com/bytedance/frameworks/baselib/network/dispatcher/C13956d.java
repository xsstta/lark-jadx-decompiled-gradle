package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d */
class C13956d implements WeakHandler.IHandler {

    /* renamed from: a */
    static C13956d f36479a = new C13956d();

    /* renamed from: g */
    private static AtomicInteger f36480g = new AtomicInteger();

    /* renamed from: b */
    private WeakHandler f36481b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c */
    private ThreadPoolExecutor f36482c;

    /* renamed from: d */
    private ThreadPoolExecutor f36483d;

    /* renamed from: e */
    private ThreadPoolExecutor f36484e;

    /* renamed from: f */
    private ThreadPoolExecutor f36485f;

    /* renamed from: c */
    private static int m56460c() {
        return f36480g.incrementAndGet();
    }

    /* renamed from: d */
    private C13962f m56462d() {
        return C13961e.m56471a();
    }

    private C13956d() {
    }

    /* renamed from: f */
    private synchronized ExecutorService m56464f() {
        if (this.f36485f == null) {
            ThreadPoolExecutor b = m56462d().mo51342b();
            this.f36485f = b;
            if (b == null) {
                this.f36485f = new ThreadPoolExecutor(1, 1, m56462d().mo51351k(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC13959b("NetLocal"));
            }
        }
        return this.f36485f;
    }

    /* renamed from: a */
    public synchronized ExecutorService mo51331a() {
        if (this.f36482c == null) {
            ThreadPoolExecutor a = m56462d().mo51340a();
            this.f36482c = a;
            if (a == null) {
                this.f36482c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, m56462d().mo51351k(), TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC13959b("NetImmediate"));
            }
        }
        return this.f36482c;
    }

    /* renamed from: e */
    private synchronized ExecutorService m56463e() {
        if (this.f36484e == null) {
            ThreadPoolExecutor d = m56462d().mo51344d();
            this.f36484e = d;
            if (d == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m56462d().mo51348h(), m56462d().mo51346f(), m56462d().mo51350j(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC13959b("NetDownload"));
                this.f36484e = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(C13961e.m56471a().mo51352l());
            }
        }
        return this.f36484e;
    }

    /* renamed from: b */
    public synchronized ExecutorService mo51333b() {
        if (this.f36483d == null) {
            ThreadPoolExecutor c = m56462d().mo51343c();
            this.f36483d = c;
            if (c == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m56462d().mo51347g(), m56462d().mo51345e(), m56462d().mo51349i(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC13959b("NetNormal"));
                this.f36483d = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(C13961e.m56471a().mo51352l());
            }
        }
        return this.f36483d;
    }

    /* renamed from: c */
    private AbstractRunnableC13958a m56461c(final AbstractRunnableC13954b bVar) {
        return new AbstractRunnableC13958a(bVar) {
            /* class com.bytedance.frameworks.baselib.network.dispatcher.C13956d.C139571 */

            public void run() {
                if (bVar.mo51325c()) {
                    return;
                }
                if (bVar.mo51318a() == IRequest.Priority.IMMEDIATE) {
                    C13956d.this.mo51331a().execute(bVar);
                } else {
                    C13956d.this.mo51333b().execute(bVar);
                }
            }

            /* renamed from: a */
            public int compareTo(AbstractRunnableC13958a aVar) {
                AbstractRunnableC13954b bVar = bVar;
                if (bVar != null) {
                    return bVar.compareTo(aVar.f36488c);
                }
                return 0;
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d$b */
    public static class ThreadFactoryC13959b implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f36490a = new AtomicInteger(1);

        /* renamed from: b */
        private String f36491b = "ApiExecutor";

        /* renamed from: a */
        public static Thread m56470a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        ThreadFactoryC13959b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f36491b = str;
            }
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m56470a(new Thread(runnable, this.f36491b + "#" + this.f36490a.getAndIncrement()) {
                /* class com.bytedance.frameworks.baselib.network.dispatcher.C13956d.ThreadFactoryC13959b.C139601 */

                public void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            });
            a.setDaemon(false);
            return a;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && (message.obj instanceof Runnable)) {
            try {
                int i = message.what;
                if (i == 0) {
                    mo51333b().execute((Runnable) message.obj);
                } else if (i == 1) {
                    mo51331a().execute((Runnable) message.obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51332a(AbstractRunnableC13954b bVar) {
        if (bVar != null && !bVar.mo51327e()) {
            bVar.mo51322b(m56460c());
            if (bVar.mo51318a() == IRequest.Priority.IMMEDIATE) {
                mo51331a().execute(bVar);
                return;
            }
            long f = (long) bVar.mo51328f();
            if (f > 0) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = bVar;
                this.f36481b.sendMessageDelayed(obtain, f);
                return;
            }
            m56463e().execute(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51334b(AbstractRunnableC13954b bVar) {
        if (bVar != null && !bVar.mo51327e()) {
            bVar.mo51322b(m56460c());
            if (bVar.mo51326d()) {
                m56464f().execute(m56461c(bVar));
            } else if (bVar.mo51318a() == IRequest.Priority.IMMEDIATE) {
                mo51331a().execute(bVar);
            } else {
                long f = (long) bVar.mo51328f();
                if (f > 0) {
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = bVar;
                    this.f36481b.sendMessageDelayed(obtain, f);
                    return;
                }
                mo51333b().execute(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d$a */
    public abstract class AbstractRunnableC13958a implements Comparable<AbstractRunnableC13958a>, Runnable {

        /* renamed from: c */
        public AbstractRunnableC13954b f36488c;

        public AbstractRunnableC13958a(AbstractRunnableC13954b bVar) {
            this.f36488c = bVar;
        }
    }
}
