package io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.i */
public final class C68985i<T> {

    /* renamed from: a */
    final float f172985a;

    /* renamed from: b */
    int f172986b;

    /* renamed from: c */
    int f172987c;

    /* renamed from: d */
    int f172988d;

    /* renamed from: e */
    T[] f172989e;

    /* renamed from: a */
    static int m265573a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: b */
    public Object[] mo238768b() {
        return this.f172989e;
    }

    /* renamed from: c */
    public int mo238769c() {
        return this.f172987c;
    }

    public C68985i() {
        this(16, 0.75f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238764a() {
        T[] tArr = this.f172989e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f172987c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m265573a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f172986b = i2;
                this.f172988d = (int) (((float) i) * this.f172985a);
                this.f172989e = tArr2;
                return;
            }
        }
    }

    public C68985i(int i) {
        this(i, 0.75f);
    }

    /* renamed from: b */
    public boolean mo238767b(T t) {
        T t2;
        T[] tArr = this.f172989e;
        int i = this.f172986b;
        int a = m265573a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo238765a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo238765a(a, tArr, i);
    }

    /* renamed from: a */
    public boolean mo238766a(T t) {
        T t2;
        T[] tArr = this.f172989e;
        int i = this.f172986b;
        int a = m265573a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f172987c + 1;
        this.f172987c = i2;
        if (i2 >= this.f172988d) {
            mo238764a();
        }
        return true;
    }

    public C68985i(int i, float f) {
        this.f172985a = f;
        int a = C68986j.m265580a(i);
        this.f172986b = a - 1;
        this.f172988d = (int) (f * ((float) a));
        this.f172989e = (T[]) new Object[a];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo238765a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f172987c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m265573a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
