package io.reactivex.internal.queue;

import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.util.C68986j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.internal.queue.b */
public final class C68926b<T> implements AbstractC68372i<T> {

    /* renamed from: a */
    static final int f172858a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f172859j = new Object();

    /* renamed from: b */
    final AtomicLong f172860b = new AtomicLong();

    /* renamed from: c */
    int f172861c;

    /* renamed from: d */
    long f172862d;

    /* renamed from: e */
    final int f172863e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f172864f;

    /* renamed from: g */
    final int f172865g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f172866h;

    /* renamed from: i */
    final AtomicLong f172867i = new AtomicLong();

    /* renamed from: b */
    private static int m265482b(int i) {
        return i;
    }

    /* renamed from: a */
    public boolean mo238627a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f172864f;
        long c = m265486c();
        int i = this.f172863e;
        long j = 2 + c;
        if (m265483b(atomicReferenceArray, m265473a(j, i)) == null) {
            int a = m265473a(c, i);
            m265478a(atomicReferenceArray, a + 1, t2);
            m265478a(atomicReferenceArray, a, t);
            m265477a(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f172864f = atomicReferenceArray2;
        int a2 = m265473a(c, i);
        m265478a(atomicReferenceArray2, a2 + 1, t2);
        m265478a(atomicReferenceArray2, a2, t);
        m265480a(atomicReferenceArray, atomicReferenceArray2);
        m265478a(atomicReferenceArray, a2, f172859j);
        m265477a(j);
        return true;
    }

    /* renamed from: c */
    private long m265486c() {
        return this.f172860b.get();
    }

    /* renamed from: d */
    private long m265487d() {
        return this.f172867i.get();
    }

    /* renamed from: e */
    private long m265488e() {
        return this.f172860b.get();
    }

    /* renamed from: f */
    private long m265489f() {
        return this.f172867i.get();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        if (m265486c() == m265487d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int mo238628b() {
        long d = m265487d();
        while (true) {
            long c = m265486c();
            long d2 = m265487d();
            if (d == d2) {
                return (int) (c - d2);
            }
            d = d2;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68372i, io.reactivex.internal.p3460b.AbstractC68373j
    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f172866h;
        long f = m265489f();
        int i = this.f172865g;
        int a = m265473a(f, i);
        T t = (T) m265483b(atomicReferenceArray, a);
        if (t == f172859j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m265478a(atomicReferenceArray, a, (Object) null);
            m265485b(f + 1);
            return t;
        } else if (z) {
            return m265474a(m265475a(atomicReferenceArray, i + 1), f, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public T mo238626a() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f172866h;
        long f = m265489f();
        int i = this.f172865g;
        T t = (T) m265483b(atomicReferenceArray, m265473a(f, i));
        if (t == f172859j) {
            return m265484b(m265475a(atomicReferenceArray, i + 1), f, i);
        }
        return t;
    }

    /* renamed from: b */
    private void m265485b(long j) {
        this.f172867i.lazySet(j);
    }

    public C68926b(int i) {
        int a = C68986j.m265580a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f172864f = atomicReferenceArray;
        this.f172863e = i2;
        m265476a(a);
        this.f172866h = atomicReferenceArray;
        this.f172865g = i2;
        this.f172862d = (long) (i2 - 1);
        m265477a(0L);
    }

    /* renamed from: a */
    private void m265476a(int i) {
        this.f172861c = Math.min(i / 4, f172858a);
    }

    /* renamed from: a */
    private void m265477a(long j) {
        this.f172860b.lazySet(j);
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f172864f;
        long e = m265488e();
        int i = this.f172863e;
        int a = m265473a(e, i);
        if (e < this.f172862d) {
            return m265481a(atomicReferenceArray, t, e, a);
        }
        long j = ((long) this.f172861c) + e;
        if (m265483b(atomicReferenceArray, m265473a(j, i)) == null) {
            this.f172862d = j - 1;
            return m265481a(atomicReferenceArray, t, e, a);
        } else if (m265483b(atomicReferenceArray, m265473a(1 + e, i)) == null) {
            return m265481a(atomicReferenceArray, t, e, a);
        } else {
            m265479a(atomicReferenceArray, e, a, t, (long) i);
            return true;
        }
    }

    /* renamed from: a */
    private static int m265473a(long j, int i) {
        return m265482b(((int) j) & i);
    }

    /* renamed from: b */
    private static <E> Object m265483b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m265475a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m265482b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m265483b(atomicReferenceArray, b);
        m265478a(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: a */
    private void m265480a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m265478a(atomicReferenceArray, m265482b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: a */
    private static void m265478a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: b */
    private T m265484b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f172866h = atomicReferenceArray;
        return (T) m265483b(atomicReferenceArray, m265473a(j, i));
    }

    /* renamed from: a */
    private T m265474a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f172866h = atomicReferenceArray;
        int a = m265473a(j, i);
        T t = (T) m265483b(atomicReferenceArray, a);
        if (t != null) {
            m265478a(atomicReferenceArray, a, (Object) null);
            m265485b(j + 1);
        }
        return t;
    }

    /* renamed from: a */
    private boolean m265481a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m265478a(atomicReferenceArray, i, t);
        m265477a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m265479a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f172864f = atomicReferenceArray2;
        this.f172862d = (j2 + j) - 1;
        m265478a(atomicReferenceArray2, i, t);
        m265480a(atomicReferenceArray, atomicReferenceArray2);
        m265478a(atomicReferenceArray, i, f172859j);
        m265477a(j + 1);
    }
}
