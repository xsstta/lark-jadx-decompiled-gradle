package com.ss.android.lark.passport.infra.util.collection;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.util.collection.a */
public class C49176a<C, T, A> implements Cloneable {

    /* renamed from: a */
    private List<C> f123460a = new ArrayList();

    /* renamed from: b */
    private long f123461b = 0;

    /* renamed from: c */
    private long[] f123462c;

    /* renamed from: d */
    private int f123463d;

    /* renamed from: e */
    private final AbstractC49177a<C, T, A> f123464e;

    /* renamed from: com.ss.android.lark.passport.infra.util.collection.a$a */
    public static abstract class AbstractC49177a<C, T, A> {
        /* renamed from: a */
        public abstract void mo171677a(C c, T t, int i, A a);
    }

    /* renamed from: a */
    public synchronized C49176a<C, T, A> clone() {
        C49176a<C, T, A> aVar;
        CloneNotSupportedException e;
        try {
            aVar = (C49176a) super.clone();
            try {
                aVar.f123461b = 0;
                aVar.f123462c = null;
                aVar.f123463d = 0;
                aVar.f123460a = new ArrayList();
                int size = this.f123460a.size();
                for (int i = 0; i < size; i++) {
                    if (!m193898a(i)) {
                        aVar.f123460a.add(this.f123460a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return aVar;
            }
        } catch (CloneNotSupportedException e3) {
            aVar = null;
            e = e3;
            e.printStackTrace();
            return aVar;
        }
        return aVar;
    }

    public C49176a(AbstractC49177a<C, T, A> aVar) {
        this.f123464e = aVar;
    }

    /* renamed from: b */
    private void m193899b(int i) {
        if (i < 64) {
            this.f123461b = (1 << i) | this.f123461b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f123462c;
        if (jArr == null) {
            this.f123462c = new long[(this.f123460a.size() / 64)];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[(this.f123460a.size() / 64)];
            long[] jArr3 = this.f123462c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f123462c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f123462c;
        jArr4[i2] = j | jArr4[i2];
    }

    /* renamed from: b */
    public synchronized void mo171675b(C c) {
        if (this.f123463d == 0) {
            this.f123460a.remove(c);
        } else {
            int lastIndexOf = this.f123460a.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                m193899b(lastIndexOf);
            }
        }
    }

    /* renamed from: a */
    private boolean m193898a(int i) {
        int i2;
        if (i >= 64) {
            long[] jArr = this.f123462c;
            if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
                return false;
            }
            if (((1 << (i % 64)) & jArr[i2]) != 0) {
                return true;
            }
            return false;
        } else if (((1 << i) & this.f123461b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void mo171673a(C c) {
        if (c != null) {
            int lastIndexOf = this.f123460a.lastIndexOf(c);
            if (lastIndexOf < 0 || m193898a(lastIndexOf)) {
                this.f123460a.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: a */
    private void m193895a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f123460a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: b */
    private void m193900b(T t, int i, A a) {
        m193897a(t, i, a, 0, Math.min(64, this.f123460a.size()), this.f123461b);
    }

    /* renamed from: c */
    private void m193901c(T t, int i, A a) {
        int i2;
        int size = this.f123460a.size();
        long[] jArr = this.f123462c;
        if (jArr == null) {
            i2 = -1;
        } else {
            i2 = jArr.length - 1;
        }
        m193896a(t, i, a, i2);
        m193897a(t, i, a, (i2 + 2) * 64, size, 0);
    }

    /* renamed from: a */
    public synchronized void mo171674a(T t, int i, A a) {
        this.f123463d++;
        m193901c(t, i, a);
        int i2 = this.f123463d - 1;
        this.f123463d = i2;
        if (i2 == 0) {
            long[] jArr = this.f123462c;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.f123462c[length];
                    if (j != 0) {
                        m193895a((length + 1) * 64, j);
                        this.f123462c[length] = 0;
                    }
                }
            }
            long j2 = this.f123461b;
            if (j2 != 0) {
                m193895a(0, j2);
                this.f123461b = 0;
            }
        }
    }

    /* renamed from: a */
    private void m193896a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m193900b(t, i, a);
            return;
        }
        long j = this.f123462c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f123460a.size(), i3 + 64);
        m193896a(t, i, a, i2 - 1);
        m193897a(t, i, a, i3, min, j);
    }

    /* renamed from: a */
    private void m193897a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f123464e.mo171677a(this.f123460a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
