package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/ArrayQueue;", "T", "", "()V", "elements", "", "[Ljava/lang/Object;", "head", "", "isEmpty", "", "()Z", "tail", "addLast", "", "element", "(Ljava/lang/Object;)V", "clear", "ensureCapacity", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.a */
public class ArrayQueue<T> {

    /* renamed from: a */
    private Object[] f173802a = new Object[16];

    /* renamed from: b */
    private int f173803b;

    /* renamed from: c */
    private int f173804c;

    /* renamed from: a */
    public final boolean mo242960a() {
        if (this.f173803b == this.f173804c) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m266948c() {
        Object[] objArr = this.f173802a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        C69043h.m265728a(objArr, objArr2, 0, this.f173803b, 0, 10, (Object) null);
        Object[] objArr3 = this.f173802a;
        int length2 = objArr3.length;
        int i = this.f173803b;
        C69043h.m265728a(objArr3, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f173802a = objArr2;
        this.f173803b = 0;
        this.f173804c = length;
    }

    /* renamed from: b */
    public final T mo242961b() {
        int i = this.f173803b;
        if (i == this.f173804c) {
            return null;
        }
        Object[] objArr = this.f173802a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f173803b = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo242959a(T t) {
        Object[] objArr = this.f173802a;
        int i = this.f173804c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f173804c = length;
        if (length == this.f173803b) {
            m266948c();
        }
    }
}
