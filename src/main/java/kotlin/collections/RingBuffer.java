package kotlin.collections;

import com.ss.android.vesdk.C64034n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", C64034n.f161683a, "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.collections.al */
public final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* renamed from: b */
    public final int f173066b;

    /* renamed from: c */
    public int f173067c;

    /* renamed from: d */
    public int f173068d;

    /* renamed from: e */
    public final Object[] f173069e;

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int mo109135b() {
        return this.f173068d;
    }

    @Override // kotlin.collections.AbstractList, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C69040a(this);
    }

    /* renamed from: a */
    public final boolean mo239002a() {
        if (size() == this.f173066b) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.collections.al<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "count", "", "index", "computeNext", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.collections.al$a */
    public static final class C69040a extends AbstractIterator<T> {

        /* renamed from: a */
        final /* synthetic */ RingBuffer f173070a;

        /* renamed from: b */
        private int f173071b;

        /* renamed from: c */
        private int f173072c;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.al$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // kotlin.collections.AbstractIterator
        /* renamed from: a */
        public void mo239005a() {
            if (this.f173071b == 0) {
                mo239007b();
                return;
            }
            mo239006a(this.f173070a.f173069e[this.f173072c]);
            this.f173072c = (this.f173072c + 1) % this.f173070a.f173066b;
            this.f173071b--;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69040a(RingBuffer alVar) {
            this.f173070a = alVar;
            this.f173071b = alVar.size();
            this.f173072c = alVar.f173067c;
        }
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        AbstractList.f173077a.mo239023a(i, size());
        return (T) this.f173069e[(this.f173067c + i) % this.f173066b];
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.al<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final RingBuffer<T> mo239000a(int i) {
        Object[] objArr;
        int i2 = this.f173066b;
        int coerceAtMost = RangesKt.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        if (this.f173067c == 0) {
            objArr = Arrays.copyOf(this.f173069e, coerceAtMost);
            Intrinsics.checkExpressionValueIsNotNull(objArr, "java.util.Arrays.copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer<>(objArr, size());
    }

    /* renamed from: a */
    public final void mo239001a(T t) {
        if (!mo239002a()) {
            this.f173069e[(this.f173067c + size()) % this.f173066b] = t;
            this.f173068d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: b */
    public final void mo239003b(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f173067c;
                int i3 = this.f173066b;
                int i4 = (i2 + i) % i3;
                if (i2 > i4) {
                    C69043h.m265719a(this.f173069e, (Object) null, i2, i3);
                    C69043h.m265719a(this.f173069e, (Object) null, 0, i4);
                } else {
                    C69043h.m265719a(this.f173069e, (Object) null, i2, i4);
                }
                this.f173067c = i4;
                this.f173068d = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: T[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            Intrinsics.checkExpressionValueIsNotNull(tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f173067c;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f173066b) {
            tArr[i3] = this.f173069e[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.f173069e[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public RingBuffer(Object[] objArr, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(objArr, "buffer");
        this.f173069e = objArr;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > objArr.length ? false : z2) {
                this.f173066b = objArr.length;
                this.f173068d = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }
}
