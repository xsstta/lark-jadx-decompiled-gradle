package kotlinx.coroutines.internal;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000602j\u0002`3B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b \u0010\u0012J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0010¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'R \u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0013\u0010*\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u00100\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198F@BX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010#¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "<init>", "()V", "node", "", "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", "", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "predicate", "removeFirstIf", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", AbstractC60044a.f149675a, "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "value", "getSize", "()I", "setSize", "size", "kotlinx-coroutines-core", "", "Lkotlinx/coroutines/internal/SynchronizedObject;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.ag */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private volatile int _size;

    /* renamed from: a */
    private T[] f173814a;

    /* renamed from: a */
    public final int mo242967a() {
        return this._size;
    }

    /* renamed from: b */
    public final boolean mo242971b() {
        if (mo242967a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final T mo242972c() {
        T e;
        synchronized (this) {
            e = mo242974e();
        }
        return e;
    }

    /* renamed from: e */
    public final T mo242974e() {
        T[] tArr = this.f173814a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: d */
    public final T mo242973d() {
        T t;
        synchronized (this) {
            if (mo242967a() > 0) {
                t = mo242968a(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: f */
    private final T[] m266985f() {
        T[] tArr = this.f173814a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f173814a = tArr2;
            return tArr2;
        } else if (mo242967a() < tArr.length) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, mo242967a() * 2);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) copyOf);
            this.f173814a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: b */
    private final void m266982b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m266983c(int i) {
        while (i > 0) {
            T[] tArr = this.f173814a;
            if (tArr == null) {
                Intrinsics.throwNpe();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                Intrinsics.throwNpe();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                Intrinsics.throwNpe();
            }
            if (comparable.compareTo(t2) > 0) {
                m266981a(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo242969a(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo242717b() == null) {
                z = false;
            } else {
                int c = t.mo242718c();
                if (ak.m266269a()) {
                    if (c >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo242968a(c);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo242970b(T t) {
        boolean z;
        if (ak.m266269a()) {
            if (t.mo242717b() == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t.mo242715a(this);
        T[] f = m266985f();
        int a = mo242967a();
        m266982b(a + 1);
        f[a] = t;
        t.mo242714a(a);
        m266983c(a);
    }

    /* renamed from: d */
    private final void m266984d(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo242967a()) {
                T[] tArr = this.f173814a;
                if (tArr == null) {
                    Intrinsics.throwNpe();
                }
                int i3 = i2 + 1;
                if (i3 < mo242967a()) {
                    T t = tArr[i3];
                    if (t == null) {
                        Intrinsics.throwNpe();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    Intrinsics.throwNpe();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    Intrinsics.throwNpe();
                }
                if (comparable2.compareTo(t4) > 0) {
                    m266981a(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final T mo242968a(int i) {
        boolean z;
        boolean z2 = false;
        if (ak.m266269a()) {
            if (mo242967a() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f173814a;
        if (tArr == null) {
            Intrinsics.throwNpe();
        }
        m266982b(mo242967a() - 1);
        if (i < mo242967a()) {
            m266981a(i, mo242967a());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                Object[] objArr = tArr[i];
                if (objArr == 0) {
                    Intrinsics.throwNpe();
                }
                Comparable comparable = (Comparable) objArr;
                Object[] objArr2 = tArr[i2];
                if (objArr2 == 0) {
                    Intrinsics.throwNpe();
                }
                if (comparable.compareTo(objArr2) < 0) {
                    m266981a(i, i2);
                    m266983c(i2);
                }
            }
            m266984d(i);
        }
        T t = tArr[mo242967a()];
        if (t == null) {
            Intrinsics.throwNpe();
        }
        if (ak.m266269a()) {
            if (t.mo242717b() == this) {
                z2 = true;
            }
            if (!z2) {
                throw new AssertionError();
            }
        }
        t.mo242715a(null);
        t.mo242714a(-1);
        tArr[mo242967a()] = null;
        return t;
    }

    /* renamed from: a */
    private final void m266981a(int i, int i2) {
        T[] tArr = this.f173814a;
        if (tArr == null) {
            Intrinsics.throwNpe();
        }
        T t = tArr[i2];
        if (t == null) {
            Intrinsics.throwNpe();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            Intrinsics.throwNpe();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo242714a(i);
        t2.mo242714a(i2);
    }
}
