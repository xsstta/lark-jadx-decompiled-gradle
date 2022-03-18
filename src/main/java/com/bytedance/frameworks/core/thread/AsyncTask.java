package com.bytedance.frameworks.core.thread;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.bytedance.frameworks.core.thread.TTPriority;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    public static final Executor f37035a;

    /* renamed from: d */
    private static final BlockingQueue<Runnable> f37036d = new PriorityBlockingQueue();

    /* renamed from: e */
    private static volatile Executor f37037e;

    /* renamed from: f */
    private static HandlerC14099b f37038f;

    /* renamed from: b */
    public final C14105b<Result> f37039b;

    /* renamed from: c */
    public final AtomicBoolean f37040c = new AtomicBoolean();

    /* renamed from: g */
    private final AbstractCallableC14103d<Params, Result> f37041g;

    /* renamed from: h */
    private volatile Status f37042h = Status.PENDING;

    /* renamed from: i */
    private final AtomicBoolean f37043i = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo51827a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51828a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51831b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo51833c(Result result) {
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$d */
    private static abstract class AbstractCallableC14103d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f37057b;

        private AbstractCallableC14103d() {
        }

        /* synthetic */ AbstractCallableC14103d(C140951 r1) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$b */
    public static class HandlerC14099b extends Handler {
        public HandlerC14099b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C14098a aVar = (C14098a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.f37047a.mo51835e(aVar.f37048b[0]);
            } else if (i == 2) {
                aVar.f37047a.mo51831b((Object[]) aVar.f37048b);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo51832b() {
        return this.f37043i.get();
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$1 */
    class C140951 extends AbstractCallableC14103d<Params, Result> {

        /* renamed from: a */
        final /* synthetic */ AsyncTask f37044a;

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bytedance.frameworks.core.thread.AsyncTask */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.frameworks.core.thread.AsyncTask */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            this.f37044a.f37040c.set(true);
            Process.setThreadPriority(10);
            Object a = this.f37044a.mo51827a(this.f37057b);
            Binder.flushPendingCommands();
            return (Result) this.f37044a.mo51830b(a);
        }
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$c */
    private static class ExecutorC14100c implements Executor {

        /* renamed from: a */
        final PriorityBlockingQueue<AbstractRunnableC14106c> f37049a;

        /* renamed from: b */
        final PriorityBlockingQueue<AbstractRunnableC14106c> f37050b;

        /* renamed from: c */
        AbstractRunnableC14106c f37051c;

        /* renamed from: d */
        AbstractRunnableC14106c f37052d;

        private ExecutorC14100c() {
            this.f37049a = new PriorityBlockingQueue<>();
            this.f37050b = new PriorityBlockingQueue<>();
        }

        /* synthetic */ ExecutorC14100c(C140951 r1) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo51840a(TTPriority.ThreadType threadType) {
            if (threadType != null) {
                if (threadType.getValue() == TTPriority.ThreadType.API.getValue()) {
                    AbstractRunnableC14106c poll = this.f37050b.poll();
                    this.f37052d = poll;
                    if (poll != null) {
                        C14104a.m57077a().mo51846a(this.f37052d);
                    }
                }
            }
            AbstractRunnableC14106c poll2 = this.f37049a.poll();
            this.f37051c = poll2;
            if (poll2 != null) {
                C14104a.m57077a().mo51847b(this.f37051c);
            }
        }

        public synchronized void execute(final Runnable runnable) {
            TTPriority.Priority priority = TTPriority.Priority.NORMAL;
            TTPriority.ThreadType threadType = TTPriority.ThreadType.DEFAULT;
            if (runnable != null && (runnable instanceof C14105b)) {
                priority = ((C14105b) runnable).mo51849a();
                threadType = ((C14105b) runnable).mo51850b();
            }
            if (threadType == null || threadType.getValue() != TTPriority.ThreadType.API.getValue()) {
                this.f37049a.offer(new AbstractRunnableC14106c(priority) {
                    /* class com.bytedance.frameworks.core.thread.AsyncTask.ExecutorC14100c.C141022 */

                    public void run() {
                        try {
                            runnable.run();
                        } finally {
                            ExecutorC14100c.this.mo51840a(TTPriority.ThreadType.DEFAULT);
                        }
                    }
                });
                if (this.f37051c == null) {
                    mo51840a(TTPriority.ThreadType.DEFAULT);
                }
            } else {
                this.f37050b.offer(new AbstractRunnableC14106c(priority) {
                    /* class com.bytedance.frameworks.core.thread.AsyncTask.ExecutorC14100c.C141011 */

                    public void run() {
                        try {
                            runnable.run();
                        } finally {
                            ExecutorC14100c.this.mo51840a(TTPriority.ThreadType.API);
                        }
                    }
                });
                if (this.f37052d == null) {
                    mo51840a(TTPriority.ThreadType.API);
                }
            }
        }
    }

    static {
        ExecutorC14100c cVar = new ExecutorC14100c(null);
        f37035a = cVar;
        f37037e = cVar;
    }

    /* renamed from: c */
    private static Handler m57066c() {
        HandlerC14099b bVar;
        synchronized (AsyncTask.class) {
            if (f37038f == null) {
                f37038f = new HandlerC14099b();
            }
            bVar = f37038f;
        }
        return bVar;
    }

    public AsyncTask() {
        C140962 r0 = new AbstractCallableC14103d<Params, Result>() {
            /* class com.bytedance.frameworks.core.thread.AsyncTask.C140962 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bytedance.frameworks.core.thread.AsyncTask */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.frameworks.core.thread.AsyncTask */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                AsyncTask.this.f37040c.set(true);
                Process.setThreadPriority(10);
                Object a = AsyncTask.this.mo51827a(this.f37057b);
                Binder.flushPendingCommands();
                return (Result) AsyncTask.this.mo51830b(a);
            }
        };
        this.f37041g = r0;
        this.f37039b = new C14105b<Result>(r0, TTPriority.Priority.NORMAL, TTPriority.ThreadType.DEFAULT) {
            /* class com.bytedance.frameworks.core.thread.AsyncTask.C140973 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.frameworks.core.thread.AsyncTask */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            public void done() {
                try {
                    AsyncTask.this.mo51829a(get());
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (CancellationException unused) {
                    AsyncTask.this.mo51829a((Object) null);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo51834d(Result result) {
        mo51828a();
    }

    /* renamed from: a */
    public void mo51829a(Result result) {
        if (!this.f37040c.get()) {
            mo51830b(result);
        }
    }

    /* renamed from: b */
    public Result mo51830b(Result result) {
        m57066c().obtainMessage(1, new C14098a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: e */
    public void mo51835e(Result result) {
        if (mo51832b()) {
            mo51834d(result);
        } else {
            mo51833c(result);
        }
        this.f37042h = Status.FINISHED;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$a */
    public static class C14098a<Data> {

        /* renamed from: a */
        final AsyncTask f37047a;

        /* renamed from: b */
        final Data[] f37048b;

        C14098a(AsyncTask asyncTask, Data... dataArr) {
            this.f37047a = asyncTask;
            this.f37048b = dataArr;
        }
    }
}
