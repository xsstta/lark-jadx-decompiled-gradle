package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.core.provider.b */
public class C0814b {

    /* renamed from: a */
    private final Object f3244a = new Object();

    /* renamed from: b */
    private HandlerThread f3245b;

    /* renamed from: c */
    private Handler f3246c;

    /* renamed from: d */
    private int f3247d;

    /* renamed from: e */
    private Handler.Callback f3248e = new Handler.Callback() {
        /* class androidx.core.provider.C0814b.C08151 */

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0814b.this.mo4425a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0814b.this.mo4426a((Runnable) message.obj);
                return true;
            }
        }
    };

    /* renamed from: f */
    private final int f3249f;

    /* renamed from: g */
    private final int f3250g;

    /* renamed from: h */
    private final String f3251h;

    /* renamed from: androidx.core.provider.b$a */
    public interface AbstractC0819a<T> {
        /* renamed from: a */
        void mo4406a(T t);
    }

    /* renamed from: a */
    public static HandlerThread m3926a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4425a() {
        synchronized (this.f3244a) {
            if (!this.f3246c.hasMessages(1)) {
                this.f3245b.quit();
                this.f3245b = null;
                this.f3246c = null;
            }
        }
    }

    /* renamed from: b */
    private void m3927b(Runnable runnable) {
        synchronized (this.f3244a) {
            if (this.f3245b == null) {
                HandlerThread a = m3926a(this.f3251h, this.f3250g);
                this.f3245b = a;
                a.start();
                this.f3246c = new Handler(this.f3245b.getLooper(), this.f3248e);
                this.f3247d++;
            }
            this.f3246c.removeMessages(0);
            Handler handler = this.f3246c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4426a(Runnable runnable) {
        runnable.run();
        synchronized (this.f3244a) {
            this.f3246c.removeMessages(0);
            Handler handler = this.f3246c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f3249f);
        }
    }

    /* renamed from: a */
    public <T> void mo4427a(final Callable<T> callable, final AbstractC0819a<T> aVar) {
        final Handler handler = new Handler();
        m3927b(new Runnable() {
            /* class androidx.core.provider.C0814b.RunnableC08162 */

            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    /* class androidx.core.provider.C0814b.RunnableC08162.RunnableC08171 */

                    public void run() {
                        aVar.mo4406a(obj);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public <T> T mo4424a(final Callable<T> callable, int i) throws InterruptedException {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m3927b(new Runnable() {
            /* class androidx.core.provider.C0814b.RunnableC08183 */

            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    public C0814b(String str, int i, int i2) {
        this.f3251h = str;
        this.f3250g = i;
        this.f3249f = i2;
        this.f3247d = 0;
    }
}
