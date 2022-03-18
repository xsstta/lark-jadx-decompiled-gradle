package com.larksuite.framework.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class AndroidThrottle<T> {

    /* renamed from: a */
    public final byte[] f64776a;

    /* renamed from: b */
    public final AbstractC26232d<T> f64777b;

    /* renamed from: c */
    public final AbstractC26233e<T> f64778c;

    /* renamed from: d */
    public long f64779d;

    /* renamed from: e */
    public AtomicBoolean f64780e;

    /* renamed from: f */
    private final Handler f64781f;

    /* renamed from: g */
    private final long f64782g;

    /* renamed from: h */
    private final int f64783h;

    /* renamed from: i */
    private volatile Runnable f64784i;

    public @interface DelayStrategy {
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$d */
    public interface AbstractC26232d<T> {
        /* renamed from: a */
        void mo93316a(T t);

        /* renamed from: b */
        void mo93317b();

        /* renamed from: c */
        int mo93318c();

        /* renamed from: d */
        Collection<T> mo93319d();
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$e */
    public interface AbstractC26233e<T> {
        void execute(Collection<T> collection);
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$c */
    private static class C26231c<T> implements AbstractC26232d<T> {

        /* renamed from: a */
        T f64792a;

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: c */
        public int mo93318c() {
            if (this.f64792a != null) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        public List<T> mo93319d() {
            ArrayList arrayList = new ArrayList();
            T t = this.f64792a;
            if (t != null) {
                arrayList.add(t);
            }
            return arrayList;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: b */
        public synchronized void mo93317b() {
            this.f64792a = null;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
        /* renamed from: a */
        public void mo93316a(T t) {
            this.f64792a = t;
        }
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$f */
    private static class RunnableC26234f implements Runnable {

        /* renamed from: a */
        private WeakReference<AndroidThrottle> f64793a;

        public void run() {
            Collection<T> d;
            AndroidThrottle androidThrottle = this.f64793a.get();
            if (androidThrottle != null) {
                androidThrottle.f64780e.set(false);
                androidThrottle.f64779d = SystemClock.elapsedRealtime();
                synchronized (androidThrottle.f64776a) {
                    d = androidThrottle.f64777b.mo93319d();
                }
                if (d != null && !d.isEmpty()) {
                    androidThrottle.f64778c.execute(d);
                }
            }
        }

        private RunnableC26234f(AndroidThrottle androidThrottle) {
            this.f64793a = new WeakReference<>(androidThrottle);
        }
    }

    /* renamed from: a */
    public void mo93302a() {
        if (this.f64784i != null) {
            this.f64781f.removeCallbacks(this.f64784i);
        }
        synchronized (this.f64776a) {
            this.f64777b.mo93317b();
        }
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$a */
    public static class C26229a<T> {

        /* renamed from: a */
        public Handler f64787a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public long f64788b = 500;

        /* renamed from: c */
        public int f64789c = 1;

        /* renamed from: d */
        public AbstractC26232d<T> f64790d = new C26231c();

        /* renamed from: e */
        public AbstractC26233e<T> f64791e;

        /* renamed from: a */
        public AndroidThrottle<T> mo93313a() {
            return new AndroidThrottle<>(this);
        }

        /* renamed from: a */
        public C26229a<T> mo93308a(int i) {
            this.f64789c = i;
            return this;
        }

        /* renamed from: a */
        public C26229a<T> mo93309a(long j) {
            this.f64788b = j;
            return this;
        }

        /* renamed from: a */
        public C26229a<T> mo93310a(Handler handler) {
            this.f64787a = handler;
            return this;
        }

        /* renamed from: a */
        public C26229a<T> mo93311a(AbstractC26232d<T> dVar) {
            this.f64790d = dVar;
            return this;
        }

        /* renamed from: a */
        public C26229a<T> mo93312a(AbstractC26233e<T> eVar) {
            this.f64791e = eVar;
            return this;
        }
    }

    /* renamed from: a */
    public void mo93303a(T t) {
        if (t != null) {
            mo93304a((Collection) Collections.singletonList(t));
        }
    }

    /* renamed from: b */
    public void mo93305b(final T t) {
        this.f64781f.post(new Runnable() {
            /* class com.larksuite.framework.utils.AndroidThrottle.RunnableC262281 */

            public void run() {
                AndroidThrottle.this.f64778c.execute(Collections.singletonList(t));
            }
        });
    }

    /* renamed from: com.larksuite.framework.utils.AndroidThrottle$b */
    public static class C26230b implements AbstractC26233e<Runnable> {
        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
        public void execute(Collection<Runnable> collection) {
            for (Runnable runnable : collection) {
                runnable.run();
            }
        }
    }

    private AndroidThrottle(C26229a aVar) {
        this.f64776a = new byte[0];
        this.f64780e = new AtomicBoolean(false);
        this.f64784i = new RunnableC26234f();
        Handler handler = aVar.f64787a;
        this.f64781f = handler;
        this.f64782g = aVar.f64788b;
        this.f64783h = aVar.f64789c;
        AbstractC26232d<T> dVar = aVar.f64790d;
        this.f64777b = dVar;
        AbstractC26233e<T> eVar = aVar.f64791e;
        this.f64778c = eVar;
        m94855a(handler, "handler");
        m94855a(dVar, "taskBuffer");
        m94855a(eVar, "taskExecutor");
    }

    /* renamed from: c */
    public void mo93306c(T t) {
        if (t != null) {
            synchronized (this.f64776a) {
                this.f64777b.mo93316a(t);
            }
            if (this.f64780e.get()) {
                this.f64781f.removeCallbacks(this.f64784i);
            }
            this.f64780e.set(true);
            this.f64781f.post(this.f64784i);
        }
    }

    /* renamed from: a */
    private long m94854a(int i) {
        double d;
        double d2;
        int i2 = this.f64783h;
        if (i2 == 1) {
            return this.f64782g;
        }
        if (i2 == 2) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f64779d;
            long j = this.f64782g;
            if (elapsedRealtime < j) {
                return j - elapsedRealtime;
            }
        } else if (i2 == 4) {
            float elapsedRealtime2 = (float) ((((double) i) * 1.0d) / (((double) (SystemClock.elapsedRealtime() - this.f64779d)) / 1000.0d));
            if (elapsedRealtime2 > 10.0f) {
                d = (double) this.f64782g;
                d2 = 0.3d;
            } else if (elapsedRealtime2 > 20.0f) {
                d = (double) this.f64782g;
                d2 = 0.6d;
            } else if (elapsedRealtime2 > 40.0f) {
                return this.f64782g;
            }
            return (long) (d * d2);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo93304a(Collection<T> collection) {
        int c;
        if (!(collection == null || collection.isEmpty())) {
            synchronized (this.f64776a) {
                for (T t : collection) {
                    this.f64777b.mo93316a(t);
                }
                c = this.f64777b.mo93318c();
            }
            if (this.f64780e.compareAndSet(false, true)) {
                this.f64781f.postDelayed(this.f64784i, m94854a(c));
            }
        }
    }

    /* renamed from: a */
    private void m94855a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str + " cannot empty");
        }
    }
}
