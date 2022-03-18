package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bolts.b */
final class C1663b {

    /* renamed from: a */
    private static final C1663b f5678a = new C1663b();

    /* renamed from: b */
    private final ExecutorService f5679b;

    /* renamed from: c */
    private final ScheduledExecutorService f5680c;

    /* renamed from: d */
    private final Executor f5681d;

    /* renamed from: a */
    public static ExecutorService m7399a() {
        return f5678a.f5679b;
    }

    /* renamed from: b */
    static ScheduledExecutorService m7400b() {
        return f5678a.f5680c;
    }

    /* renamed from: c */
    static Executor m7401c() {
        return f5678a.f5681d;
    }

    /* renamed from: bolts.b$a */
    private static class ExecutorC1665a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f5682a;

        private ExecutorC1665a() {
            this.f5682a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m7403a() {
            Integer num = this.f5682a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f5682a.set(Integer.valueOf(intValue));
            return intValue;
        }

        /* renamed from: b */
        private int m7404b() {
            Integer num = this.f5682a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f5682a.remove();
            } else {
                this.f5682a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m7403a() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m7404b();
                    throw th;
                }
            } else {
                C1663b.m7399a().execute(runnable);
            }
            m7404b();
        }
    }

    /* renamed from: d */
    private static boolean m7402d() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private C1663b() {
        ExecutorService executorService;
        if (!m7402d()) {
            executorService = Executors.newCachedThreadPool();
        } else {
            executorService = C1660a.m7396a();
        }
        this.f5679b = executorService;
        this.f5680c = Executors.newSingleThreadScheduledExecutor();
        this.f5681d = new ExecutorC1665a();
    }
}
