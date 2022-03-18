package androidx.collection;

/* renamed from: androidx.collection.c */
public class C0516c<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1872a = new Object();

    /* renamed from: b */
    private boolean f1873b;

    /* renamed from: c */
    private long[] f1874c;

    /* renamed from: d */
    private Object[] f1875d;

    /* renamed from: e */
    private int f1876e;

    public C0516c() {
        this(10);
    }

    /* renamed from: b */
    public int mo2962b() {
        if (this.f1873b) {
            m2332e();
        }
        return this.f1876e;
    }

    /* renamed from: d */
    public void mo2971d() {
        int i = this.f1876e;
        Object[] objArr = this.f1875d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1876e = 0;
        this.f1873b = false;
    }

    /* renamed from: e */
    private void m2332e() {
        int i = this.f1876e;
        long[] jArr = this.f1874c;
        Object[] objArr = this.f1875d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1872a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1873b = false;
        this.f1876e = i2;
    }

    /* renamed from: a */
    public C0516c<E> clone() {
        try {
            C0516c<E> cVar = (C0516c) super.clone();
            cVar.f1874c = (long[]) this.f1874c.clone();
            cVar.f1875d = (Object[]) this.f1875d.clone();
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo2969c() {
        if (mo2962b() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (mo2962b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1876e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1876e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2963b(i));
            sb.append('=');
            E c = mo2967c(i);
            if (c != this) {
                sb.append((Object) c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public E mo2959a(long j) {
        return mo2960a(j, null);
    }

    /* renamed from: a */
    public void mo2961a(int i) {
        Object[] objArr = this.f1875d;
        Object obj = objArr[i];
        Object obj2 = f1872a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1873b = true;
        }
    }

    /* renamed from: c */
    public int mo2966c(long j) {
        if (this.f1873b) {
            m2332e();
        }
        return C0515b.m2328a(this.f1874c, this.f1876e, j);
    }

    /* renamed from: d */
    public boolean mo2972d(long j) {
        if (mo2966c(j) >= 0) {
            return true;
        }
        return false;
    }

    public C0516c(int i) {
        if (i == 0) {
            this.f1874c = C0515b.f1870b;
            this.f1875d = C0515b.f1871c;
            return;
        }
        int b = C0515b.m2330b(i);
        this.f1874c = new long[b];
        this.f1875d = new Object[b];
    }

    /* renamed from: b */
    public long mo2963b(int i) {
        if (this.f1873b) {
            m2332e();
        }
        return this.f1874c[i];
    }

    /* renamed from: c */
    public E mo2967c(int i) {
        if (this.f1873b) {
            m2332e();
        }
        return (E) this.f1875d[i];
    }

    /* renamed from: b */
    public void mo2964b(long j) {
        Object[] objArr;
        Object obj;
        int a = C0515b.m2328a(this.f1874c, this.f1876e, j);
        if (a >= 0 && (objArr = this.f1875d)[a] != (obj = f1872a)) {
            objArr[a] = obj;
            this.f1873b = true;
        }
    }

    /* renamed from: a */
    public E mo2960a(long j, E e) {
        int a = C0515b.m2328a(this.f1874c, this.f1876e, j);
        if (a >= 0) {
            Object[] objArr = this.f1875d;
            if (objArr[a] != f1872a) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo2965b(long j, E e) {
        int a = C0515b.m2328a(this.f1874c, this.f1876e, j);
        if (a >= 0) {
            this.f1875d[a] = e;
            return;
        }
        int i = ~a;
        int i2 = this.f1876e;
        if (i < i2) {
            Object[] objArr = this.f1875d;
            if (objArr[i] == f1872a) {
                this.f1874c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1873b && i2 >= this.f1874c.length) {
            m2332e();
            i = ~C0515b.m2328a(this.f1874c, this.f1876e, j);
        }
        int i3 = this.f1876e;
        if (i3 >= this.f1874c.length) {
            int b = C0515b.m2330b(i3 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.f1874c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1875d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1874c = jArr;
            this.f1875d = objArr2;
        }
        int i4 = this.f1876e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f1874c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f1875d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f1876e - i);
        }
        this.f1874c[i] = j;
        this.f1875d[i] = e;
        this.f1876e++;
    }

    /* renamed from: c */
    public void mo2968c(long j, E e) {
        int i = this.f1876e;
        if (i == 0 || j > this.f1874c[i - 1]) {
            if (this.f1873b && i >= this.f1874c.length) {
                m2332e();
            }
            int i2 = this.f1876e;
            if (i2 >= this.f1874c.length) {
                int b = C0515b.m2330b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.f1874c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1875d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1874c = jArr;
                this.f1875d = objArr;
            }
            this.f1874c[i2] = j;
            this.f1875d[i2] = e;
            this.f1876e = i2 + 1;
            return;
        }
        mo2965b(j, e);
    }
}
