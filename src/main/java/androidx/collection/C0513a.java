package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.a */
public final class C0513a<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f1858c = new int[0];

    /* renamed from: d */
    private static final Object[] f1859d = new Object[0];

    /* renamed from: e */
    private static Object[] f1860e;

    /* renamed from: f */
    private static int f1861f;

    /* renamed from: g */
    private static Object[] f1862g;

    /* renamed from: h */
    private static int f1863h;

    /* renamed from: a */
    Object[] f1864a;

    /* renamed from: b */
    int f1865b;

    /* renamed from: i */
    private int[] f1866i;

    /* renamed from: j */
    private AbstractC0519f<E, E> f1867j;

    public int size() {
        return this.f1865b;
    }

    public C0513a() {
        this(0);
    }

    public boolean isEmpty() {
        if (this.f1865b <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private AbstractC0519f<E, E> m2311b() {
        if (this.f1867j == null) {
            this.f1867j = new AbstractC0519f<E, E>() {
                /* class androidx.collection.C0513a.C05141 */

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public int mo2899a() {
                    return C0513a.this.f1865b;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: c */
                public void mo2907c() {
                    C0513a.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: b */
                public Map<E, E> mo2906b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: b */
                public int mo2905b(Object obj) {
                    return C0513a.this.mo2938a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public int mo2900a(Object obj) {
                    return C0513a.this.mo2938a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public void mo2903a(int i) {
                    C0513a.this.mo2943c(i);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public Object mo2901a(int i, int i2) {
                    return C0513a.this.f1864a[i];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public E mo2902a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public void mo2904a(E e, E e2) {
                    C0513a.this.add(e);
                }
            };
        }
        return this.f1867j;
    }

    public int hashCode() {
        int[] iArr = this.f1866i;
        int i = this.f1865b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return m2311b().mo2986e().iterator();
    }

    public Object[] toArray() {
        int i = this.f1865b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1864a, 0, objArr, 0, i);
        return objArr;
    }

    public void clear() {
        int i = this.f1865b;
        if (i != 0) {
            m2310a(this.f1866i, this.f1864a, i);
            this.f1866i = f1858c;
            this.f1864a = f1859d;
            this.f1865b = 0;
        }
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1865b * 14);
        sb.append('{');
        for (int i = 0; i < this.f1865b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E b = mo2942b(i);
            if (b != this) {
                sb.append((Object) b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private int m2308a() {
        int i = this.f1865b;
        if (i == 0) {
            return -1;
        }
        int a = C0515b.m2327a(this.f1866i, i, 0);
        if (a < 0 || this.f1864a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1866i[i2] == 0) {
            if (this.f1864a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1866i[i3] == 0) {
            if (this.f1864a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: b */
    public E mo2942b(int i) {
        return (E) this.f1864a[i];
    }

    /* renamed from: a */
    public int mo2938a(Object obj) {
        if (obj == null) {
            return m2308a();
        }
        return m2309a(obj, obj.hashCode());
    }

    public boolean contains(Object obj) {
        if (mo2938a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        int a = mo2938a(obj);
        if (a < 0) {
            return false;
        }
        mo2943c(a);
        return true;
    }

    public C0513a(int i) {
        if (i == 0) {
            this.f1866i = f1858c;
            this.f1864a = f1859d;
        } else {
            m2312d(i);
        }
        this.f1865b = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.collection.a<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        mo2939a(this.f1865b + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1865b - 1; i >= 0; i--) {
            if (!collection.contains(this.f1864a[i])) {
                mo2943c(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo2939a(int i) {
        int[] iArr = this.f1866i;
        if (iArr.length < i) {
            Object[] objArr = this.f1864a;
            m2312d(i);
            int i2 = this.f1865b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1866i, 0, i2);
                System.arraycopy(objArr, 0, this.f1864a, 0, this.f1865b);
            }
            m2310a(iArr, objArr, this.f1865b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1865b; i++) {
                try {
                    if (!set.contains(mo2942b(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1865b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1865b));
        }
        System.arraycopy(this.f1864a, 0, tArr, 0, this.f1865b);
        int length = tArr.length;
        int i = this.f1865b;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: d */
    private void m2312d(int i) {
        if (i == 8) {
            synchronized (C0513a.class) {
                Object[] objArr = f1862g;
                if (objArr != null) {
                    this.f1864a = objArr;
                    f1862g = (Object[]) objArr[0];
                    this.f1866i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1863h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0513a.class) {
                Object[] objArr2 = f1860e;
                if (objArr2 != null) {
                    this.f1864a = objArr2;
                    f1860e = (Object[]) objArr2[0];
                    this.f1866i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1861f--;
                    return;
                }
            }
        }
        this.f1866i = new int[i];
        this.f1864a = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m2308a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m2309a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f1865b;
        int[] iArr = this.f1866i;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1864a;
            m2312d(i5);
            int[] iArr2 = this.f1866i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1864a, 0, objArr.length);
            }
            m2310a(iArr, objArr, this.f1865b);
        }
        int i6 = this.f1865b;
        if (i3 < i6) {
            int[] iArr3 = this.f1866i;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1864a;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1865b - i3);
        }
        this.f1866i[i3] = i;
        this.f1864a[i3] = e;
        this.f1865b++;
        return true;
    }

    /* renamed from: c */
    public E mo2943c(int i) {
        Object[] objArr = this.f1864a;
        E e = (E) objArr[i];
        int i2 = this.f1865b;
        if (i2 <= 1) {
            m2310a(this.f1866i, objArr, i2);
            this.f1866i = f1858c;
            this.f1864a = f1859d;
            this.f1865b = 0;
        } else {
            int[] iArr = this.f1866i;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f1865b = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.f1864a;
                    System.arraycopy(objArr2, i5, objArr2, i, this.f1865b - i);
                }
                this.f1864a[this.f1865b] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m2312d(i3);
                this.f1865b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1866i, 0, i);
                    System.arraycopy(objArr, 0, this.f1864a, 0, i);
                }
                int i6 = this.f1865b;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f1866i, i, i6 - i);
                    System.arraycopy(objArr, i7, this.f1864a, i, this.f1865b - i);
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private int m2309a(Object obj, int i) {
        int i2 = this.f1865b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0515b.m2327a(this.f1866i, i2, i);
        if (a < 0 || obj.equals(this.f1864a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1866i[i3] == i) {
            if (obj.equals(this.f1864a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1866i[i4] == i) {
            if (obj.equals(this.f1864a[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private static void m2310a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0513a.class) {
                if (f1863h < 10) {
                    objArr[0] = f1862g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1862g = objArr;
                    f1863h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0513a.class) {
                if (f1861f < 10) {
                    objArr[0] = f1860e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1860e = objArr;
                    f1861f++;
                }
            }
        }
    }
}
