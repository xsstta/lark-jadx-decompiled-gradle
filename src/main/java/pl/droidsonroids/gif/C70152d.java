package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.d */
public final class C70152d extends ScheduledThreadPoolExecutor {

    /* access modifiers changed from: private */
    /* renamed from: pl.droidsonroids.gif.d$a */
    public static final class C70154a {

        /* renamed from: a */
        public static final C70152d f175270a = new C70152d();
    }

    /* renamed from: a */
    static C70152d m268945a() {
        return C70154a.f175270a;
    }

    private C70152d() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
