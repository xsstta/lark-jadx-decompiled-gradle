package androidx.collection;

/* renamed from: androidx.collection.g */
public class C0525g<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1900a = new Object();

    /* renamed from: b */
    private boolean f1901b;

    /* renamed from: c */
    private int[] f1902c;

    /* renamed from: d */
    private Object[] f1903d;

    /* renamed from: e */
    private int f1904e;

    public C0525g() {
        this(10);
    }

    /* renamed from: b */
    public int mo3049b() {
        if (this.f1901b) {
            m2376d();
        }
        return this.f1904e;
    }

    /* renamed from: c */
    public void mo3052c() {
        int i = this.f1904e;
        Object[] objArr = this.f1903d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1904e = 0;
        this.f1901b = false;
    }

    /* renamed from: d */
    private void m2376d() {
        int i = this.f1904e;
        int[] iArr = this.f1902c;
        Object[] objArr = this.f1903d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1900a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1901b = false;
        this.f1904e = i2;
    }

    /* renamed from: a */
    public C0525g<E> clone() {
        try {
            C0525g<E> gVar = (C0525g) super.clone();
            gVar.f1902c = (int[]) this.f1902c.clone();
            gVar.f1903d = (Object[]) this.f1903d.clone();
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (mo3049b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1904e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1904e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3056d(i));
            sb.append('=');
            E e = mo3057e(i);
            if (e != this) {
                sb.append((Object) e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public E mo3047a(int i) {
        return mo3048a(i, null);
    }

    /* renamed from: c */
    public void mo3053c(int i) {
        Object[] objArr = this.f1903d;
        Object obj = objArr[i];
        Object obj2 = f1900a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1901b = true;
        }
    }

    /* renamed from: d */
    public int mo3056d(int i) {
        if (this.f1901b) {
            m2376d();
        }
        return this.f1902c[i];
    }

    /* renamed from: e */
    public E mo3057e(int i) {
        if (this.f1901b) {
            m2376d();
        }
        return (E) this.f1903d[i];
    }

    /* renamed from: f */
    public int mo3058f(int i) {
        if (this.f1901b) {
            m2376d();
        }
        return C0515b.m2327a(this.f1902c, this.f1904e, i);
    }

    public C0525g(int i) {
        if (i == 0) {
            this.f1902c = C0515b.f1869a;
            this.f1903d = C0515b.f1871c;
            return;
        }
        int a = C0515b.m2326a(i);
        this.f1902c = new int[a];
        this.f1903d = new Object[a];
    }

    /* renamed from: a */
    public int mo3045a(E e) {
        if (this.f1901b) {
            m2376d();
        }
        for (int i = 0; i < this.f1904e; i++) {
            if (this.f1903d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo3050b(int i) {
        Object[] objArr;
        Object obj;
        int a = C0515b.m2327a(this.f1902c, this.f1904e, i);
        if (a >= 0 && (objArr = this.f1903d)[a] != (obj = f1900a)) {
            objArr[a] = obj;
            this.f1901b = true;
        }
    }

    /* renamed from: a */
    public E mo3048a(int i, E e) {
        int a = C0515b.m2327a(this.f1902c, this.f1904e, i);
        if (a >= 0) {
            Object[] objArr = this.f1903d;
            if (objArr[a] != f1900a) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo3051b(int i, E e) {
        int a = C0515b.m2327a(this.f1902c, this.f1904e, i);
        if (a >= 0) {
            this.f1903d[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f1904e;
        if (i2 < i3) {
            Object[] objArr = this.f1903d;
            if (objArr[i2] == f1900a) {
                this.f1902c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f1901b && i3 >= this.f1902c.length) {
            m2376d();
            i2 = ~C0515b.m2327a(this.f1902c, this.f1904e, i);
        }
        int i4 = this.f1904e;
        if (i4 >= this.f1902c.length) {
            int a2 = C0515b.m2326a(i4 + 1);
            int[] iArr = new int[a2];
            Object[] objArr2 = new Object[a2];
            int[] iArr2 = this.f1902c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1903d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1902c = iArr;
            this.f1903d = objArr2;
        }
        int i5 = this.f1904e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f1902c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1903d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1904e - i2);
        }
        this.f1902c[i2] = i;
        this.f1903d[i2] = e;
        this.f1904e++;
    }

    /* renamed from: c */
    public void mo3054c(int i, E e) {
        int i2 = this.f1904e;
        if (i2 == 0 || i > this.f1902c[i2 - 1]) {
            if (this.f1901b && i2 >= this.f1902c.length) {
                m2376d();
            }
            int i3 = this.f1904e;
            if (i3 >= this.f1902c.length) {
                int a = C0515b.m2326a(i3 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.f1902c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1903d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1902c = iArr;
                this.f1903d = objArr;
            }
            this.f1902c[i3] = i;
            this.f1903d[i3] = e;
            this.f1904e = i3 + 1;
            return;
        }
        mo3051b(i, e);
    }
}
