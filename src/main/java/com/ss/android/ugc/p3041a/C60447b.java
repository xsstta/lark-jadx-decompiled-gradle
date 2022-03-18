package com.ss.android.ugc.p3041a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.a.b */
public class C60447b {

    /* renamed from: b */
    public static int f151032b = 10;

    /* renamed from: g */
    private static final Lock f151033g = new ReentrantLock();

    /* renamed from: i */
    private static volatile C60447b f151034i;

    /* renamed from: a */
    public C60450c f151035a;

    /* renamed from: c */
    private double f151036c = -1.0d;

    /* renamed from: d */
    private double f151037d = -1.0d;

    /* renamed from: e */
    private Queue<C60450c> f151038e = new ArrayBlockingQueue(f151032b);

    /* renamed from: f */
    private C60450c[] f151039f = new C60450c[f151032b];

    /* renamed from: h */
    private final List<AbstractC60448a> f151040h = new ArrayList();

    /* renamed from: j */
    private AbstractC60449b f151041j;

    /* renamed from: k */
    private AbstractC60449b f151042k;

    /* renamed from: com.ss.android.ugc.a.b$a */
    public interface AbstractC60448a {
        /* renamed from: a */
        void mo206939a();
    }

    /* renamed from: com.ss.android.ugc.a.b$b */
    public interface AbstractC60449b {
        /* renamed from: a */
        double mo206934a(Queue<C60450c> queue, C60450c[] cVarArr);
    }

    /* renamed from: a */
    public static C60447b m234869a() {
        if (f151034i == null) {
            synchronized (C60447b.class) {
                if (f151034i == null) {
                    f151034i = new C60447b();
                }
            }
        }
        return f151034i;
    }

    public C60447b() {
        C60446a aVar = new C60446a();
        this.f151042k = aVar;
        this.f151041j = aVar;
    }

    /* renamed from: c */
    public void mo206938c() {
        this.f151036c = -1.0d;
        synchronized (this.f151040h) {
            for (AbstractC60448a aVar : this.f151040h) {
                aVar.mo206939a();
            }
        }
    }

    /* renamed from: b */
    public double mo206937b() {
        AbstractC60449b bVar;
        double d = this.f151036c;
        if (d == -1.0d) {
            Lock lock = f151033g;
            lock.lock();
            try {
                double d2 = this.f151036c;
                if (d2 == -1.0d) {
                    d2 = this.f151041j.mo206934a(this.f151038e, this.f151039f);
                    if (d2 == -1.0d && (bVar = this.f151042k) != this.f151041j) {
                        d2 = bVar.mo206934a(this.f151038e, this.f151039f);
                    }
                    this.f151036c = d2;
                }
                lock.unlock();
                d = d2;
            } catch (Throwable th) {
                f151033g.unlock();
                throw th;
            }
        }
        if (d > 0.001d) {
            return d;
        }
        double d3 = this.f151037d;
        return d3 > 0.001d ? d3 : d;
    }

    /* renamed from: a */
    public void mo206936a(double d, double d2, long j) {
        Lock lock = f151033g;
        lock.lock();
        try {
            C60450c cVar = this.f151035a;
            if (cVar != null) {
                cVar.mo206941a(d);
                cVar.mo206943b(d2);
                cVar.mo206942a(j);
                cVar.mo206944b(SystemClock.elapsedRealtime());
            } else {
                cVar = new C60450c(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!this.f151038e.offer(cVar)) {
                this.f151035a = this.f151038e.poll();
                this.f151038e.offer(cVar);
            }
            mo206938c();
            lock.unlock();
        } catch (Throwable th) {
            mo206938c();
            f151033g.unlock();
            throw th;
        }
    }
}
