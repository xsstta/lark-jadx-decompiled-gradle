package bolts;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.a */
final class C1660a {

    /* renamed from: a */
    static final int f5673a;

    /* renamed from: b */
    static final int f5674b;

    /* renamed from: c */
    private static final C1660a f5675c = new C1660a();

    /* renamed from: e */
    private static final int f5676e;

    /* renamed from: d */
    private final Executor f5677d = new ExecutorC1662a();

    /* renamed from: bolts.a$a */
    private static class ExecutorC1662a implements Executor {
        private ExecutorC1662a() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: b */
    public static Executor m7398b() {
        return f5675c.f5677d;
    }

    private C1660a() {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5676e = availableProcessors;
        f5673a = availableProcessors + 1;
        f5674b = (availableProcessors * 2) + 1;
    }

    /* renamed from: a */
    public static ExecutorService m7396a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f5673a, f5674b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m7397a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    public static void m7397a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }
}
