package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.p3453a.C68264a;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class AndroidSchedulers {
    private static final Scheduler MAIN_THREAD = C68264a.m265002a(new Callable<Scheduler>() {
        /* class io.reactivex.android.schedulers.AndroidSchedulers.CallableC682651 */

        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C68266a.f171557a;
        }
    });

    /* access modifiers changed from: private */
    /* renamed from: io.reactivex.android.schedulers.AndroidSchedulers$a */
    public static final class C68266a {

        /* renamed from: a */
        static final Scheduler f171557a = new C68267a(new Handler(Looper.getMainLooper()));
    }

    public static Scheduler mainThread() {
        return C68264a.m265000a(MAIN_THREAD);
    }

    private AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        Objects.requireNonNull(looper, "looper == null");
        return new C68267a(new Handler(looper));
    }
}
