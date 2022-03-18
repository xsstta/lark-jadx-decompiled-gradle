package com.larksuite.framework.thread;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.thread.n */
public class C26155n extends ThreadPoolExecutor implements AbstractC26160p {

    /* renamed from: a */
    private static Handler f64598a;

    /* renamed from: d */
    private static volatile Field f64599d;

    /* renamed from: e */
    protected static RejectedExecutionHandlerC26158a f64600e = new RejectedExecutionHandlerC26158a();

    /* renamed from: b */
    private HashMap<String, Long> f64601b = new HashMap<>();

    /* renamed from: c */
    private boolean f64602c = false;

    /* renamed from: f */
    protected final String f64603f;

    /* renamed from: g */
    protected String f64604g;

    /* renamed from: d */
    public static HandlerThread m94646d(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.thread.n$a */
    public static class RejectedExecutionHandlerC26158a implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC26158a() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Runnable runnable2;
            if (threadPoolExecutor instanceof C26155n) {
                if (runnable instanceof RunnableC26148j) {
                    runnable2 = ((RunnableC26148j) runnable).f64581b;
                } else {
                    runnable2 = runnable;
                }
                m94656a(C26152l.m94640c(runnable2), ((C26155n) threadPoolExecutor).f64604g);
            }
            C26155n.m94645a(runnable);
        }

        /* renamed from: a */
        private void m94656a(String str, String str2) {
            Log.m165397w("CoreThreadPool", str + " rejected , pool: " + str2);
            if (CoreThreadPool.needMonitorTask()) {
                C26149k.m94631a().mo93081a(C26149k.m94631a().mo93077a(str, str2));
            }
        }
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public HashMap<String, Long> mo93051b() {
        return this.f64601b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo93087d() {
        return this.f64604g;
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public String mo93047a() {
        return mo93087d();
    }

    /* renamed from: c */
    public int mo93086c() {
        return getQueue().size();
    }

    public void shutdown() {
        if (!"default".equals(this.f64603f)) {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("default".equals(this.f64603f)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    /* renamed from: e */
    private static void m94647e() {
        if (f64598a == null) {
            synchronized (C26155n.class) {
                if (f64598a == null) {
                    HandlerThread d = m94646d("core-reject");
                    d.start();
                    f64598a = new HandlerC26164r(d.getLooper(), "core-reject");
                }
            }
        }
    }

    /* renamed from: f */
    private void m94648f() {
        try {
            if (f64599d == null) {
                synchronized (C26155n.class) {
                    if (f64599d == null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            f64599d = Thread.class.getDeclaredField("threadLocals");
                        } else {
                            f64599d = Thread.class.getDeclaredField("localValues");
                        }
                        f64599d.setAccessible(true);
                    }
                }
            }
            f64599d.set(Thread.currentThread(), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return m94644a(runnable, null);
    }

    /* renamed from: a */
    public static void m94645a(Runnable runnable) {
        if (f64598a == null) {
            m94647e();
        }
        Handler handler = f64598a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public void mo93052b(String str) {
        if (this.f64602c) {
            synchronized (this.f64601b) {
                this.f64601b.remove(str);
            }
        }
    }

    public void execute(Runnable runnable) {
        if (!(runnable instanceof FutureTask) && !(runnable instanceof RunnableC26148j)) {
            runnable = new RunnableC26148j(runnable, this);
        }
        super.execute(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Callable<T> callable) {
        final CallableC26139d dVar = new CallableC26139d(callable, this);
        return new FutureC26166t(super.submit(new Callable<T>() {
            /* class com.larksuite.framework.thread.C26155n.CallableC261572 */

            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                try {
                    return (T) dVar.call();
                } catch (Exception e) {
                    Log.m165383e("CoreThreadPool", "calltask exception, task name: " + callable.getClass());
                    C26137b.m94599a().mo93038a(e);
                    throw e;
                }
            }
        }));
    }

    @Override // com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public void mo93049a(String str) {
        if (this.f64602c) {
            synchronized (this.f64601b) {
                this.f64601b.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo93085b(boolean z) {
        this.f64602c = z;
        if (!z) {
            synchronized (this.f64601b) {
                this.f64601b.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() != null) {
                m94648f();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return m94644a(runnable, t);
    }

    /* renamed from: a */
    private <T> Future<T> m94644a(final Runnable runnable, T t) {
        final RunnableC26148j jVar = new RunnableC26148j(runnable, this);
        return new FutureC26166t(super.submit(new Runnable() {
            /* class com.larksuite.framework.thread.C26155n.RunnableC261561 */

            public void run() {
                try {
                    jVar.run();
                } catch (Exception e) {
                    Log.m165383e("CoreThreadPool", "task exception, task name: " + runnable.getClass());
                    C26137b.m94599a().mo93038a(e);
                    throw e;
                }
            }
        }, t));
    }

    public C26155n(String str, int i, int i2, long j, BlockingQueue<Runnable> blockingQueue, ThreadFactoryC26153m mVar) {
        super(i, i2, j, TimeUnit.SECONDS, blockingQueue, mVar);
        setRejectedExecutionHandler(f64600e);
        this.f64603f = str;
        this.f64604g = str + "-ThreadExecutor";
    }
}
