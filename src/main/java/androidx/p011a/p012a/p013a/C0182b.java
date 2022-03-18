package androidx.p011a.p012a.p013a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.a.a.a.b */
public class C0182b extends AbstractC0184c {

    /* renamed from: a */
    private final Object f406a = new Object();

    /* renamed from: b */
    private final ExecutorService f407b = Executors.newFixedThreadPool(4, new ThreadFactory() {
        /* class androidx.p011a.p012a.p013a.C0182b.ThreadFactoryC01831 */

        /* renamed from: b */
        private final AtomicInteger f410b = new AtomicInteger(0);

        /* renamed from: a */
        public static Thread m594a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m594a(new Thread(runnable));
            a.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f410b.getAndIncrement())));
            return a;
        }
    });

    /* renamed from: c */
    private volatile Handler f408c;

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: c */
    public boolean mo550c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: a */
    public void mo548a(Runnable runnable) {
        this.f407b.execute(runnable);
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: b */
    public void mo549b(Runnable runnable) {
        if (this.f408c == null) {
            synchronized (this.f406a) {
                if (this.f408c == null) {
                    this.f408c = m590a(Looper.getMainLooper());
                }
            }
        }
        this.f408c.post(runnable);
    }

    /* renamed from: a */
    private static Handler m590a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
