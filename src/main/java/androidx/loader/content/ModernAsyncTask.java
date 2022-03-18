package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f4315a;

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f4316b;

    /* renamed from: c */
    public static final Executor f4317c;

    /* renamed from: f */
    private static HandlerC1193b f4318f;

    /* renamed from: g */
    private static volatile Executor f4319g;

    /* renamed from: d */
    final AtomicBoolean f4320d = new AtomicBoolean();

    /* renamed from: e */
    final AtomicBoolean f4321e = new AtomicBoolean();

    /* renamed from: h */
    private final AbstractCallableC1194c<Params, Result> f4322h;

    /* renamed from: i */
    private final FutureTask<Result> f4323i;

    /* renamed from: j */
    private volatile Status f4324j = Status.PENDING;

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo6079a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6080a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6081a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6083b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6085b(Progress... progressArr) {
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    private static abstract class AbstractCallableC1194c<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f4331b;

        AbstractCallableC1194c() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    public static class HandlerC1193b extends Handler {
        HandlerC1193b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C1192a aVar = (C1192a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.f4329a.mo6089e(aVar.f4330b[0]);
            } else if (i == 2) {
                aVar.f4329a.mo6085b((Object[]) aVar.f4330b);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo6087c() {
        return this.f4320d.get();
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$4 */
    static /* synthetic */ class C11914 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4328a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.loader.content.ModernAsyncTask.C11914.f4328a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.loader.content.ModernAsyncTask.C11914.f4328a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.C11914.<clinit>():void");
        }
    }

    /* renamed from: d */
    private static Handler m5454d() {
        HandlerC1193b bVar;
        synchronized (ModernAsyncTask.class) {
            if (f4318f == null) {
                f4318f = new HandlerC1193b();
            }
            bVar = f4318f;
        }
        return bVar;
    }

    static {
        ThreadFactoryC11881 r7 = new ThreadFactory() {
            /* class androidx.loader.content.ModernAsyncTask.ThreadFactoryC11881 */

            /* renamed from: a */
            private final AtomicInteger f4325a = new AtomicInteger(1);

            /* renamed from: a */
            public static Thread m5467a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return m5467a(new Thread(runnable, "ModernAsyncTask #" + this.f4325a.getAndIncrement()));
            }
        };
        f4315a = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f4316b = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, (int) SmActions.ACTION_ONTHECALL_EXIT, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        f4317c = threadPoolExecutor;
        f4319g = threadPoolExecutor;
    }

    ModernAsyncTask() {
        C11892 r0 = new AbstractCallableC1194c<Params, Result>() {
            /* class androidx.loader.content.ModernAsyncTask.C11892 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: androidx.loader.content.ModernAsyncTask */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                ModernAsyncTask.this.f4321e.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) ModernAsyncTask.this.mo6079a(this.f4331b);
                    Binder.flushPendingCommands();
                    ModernAsyncTask.this.mo6088d(result);
                    return result;
                } catch (Throwable th) {
                    ModernAsyncTask.this.mo6088d(result);
                    throw th;
                }
            }
        };
        this.f4322h = r0;
        this.f4323i = new FutureTask<Result>(r0) {
            /* class androidx.loader.content.ModernAsyncTask.C11903 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: androidx.loader.content.ModernAsyncTask */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            public void done() {
                try {
                    ModernAsyncTask.this.mo6086c(get());
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (CancellationException unused) {
                    ModernAsyncTask.this.mo6086c(null);
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6084b(Result result) {
        mo6083b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6086c(Result result) {
        if (!this.f4321e.get()) {
            mo6088d(result);
        }
    }

    /* renamed from: a */
    public final boolean mo6082a(boolean z) {
        this.f4320d.set(true);
        return this.f4323i.cancel(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6089e(Result result) {
        if (mo6087c()) {
            mo6084b(result);
        } else {
            mo6081a(result);
        }
        this.f4324j = Status.FINISHED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Result mo6088d(Result result) {
        m5454d().obtainMessage(1, new C1192a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class C1192a<Data> {

        /* renamed from: a */
        final ModernAsyncTask f4329a;

        /* renamed from: b */
        final Data[] f4330b;

        C1192a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f4329a = modernAsyncTask;
            this.f4330b = dataArr;
        }
    }

    /* renamed from: a */
    public final ModernAsyncTask<Params, Progress, Result> mo6078a(Executor executor, Params... paramsArr) {
        if (this.f4324j != Status.PENDING) {
            int i = C11914.f4328a[this.f4324j.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f4324j = Status.RUNNING;
            mo6080a();
            this.f4322h.f4331b = paramsArr;
            executor.execute(this.f4323i);
            return this;
        }
    }
}
