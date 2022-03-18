package kotlin.sequences;

import com.ss.android.vesdk.C64034n;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", C64034n.f161683a, "iterator", "", "take", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.s */
public final class TakeSequence<T> implements DropTakeSequence<T>, Sequence<T> {

    /* renamed from: a */
    public final Sequence<T> f173324a;

    /* renamed from: b */
    public final int f173325b;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<T> mo4717a() {
        return new C69309a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.s$a */
    public static final class C69309a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ TakeSequence f173326a;

        /* renamed from: b */
        private int f173327b;

        /* renamed from: c */
        private final Iterator<T> f173328c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f173327b <= 0 || !this.f173328c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f173327b;
            if (i != 0) {
                this.f173327b = i - 1;
                return this.f173328c.next();
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69309a(TakeSequence sVar) {
            this.f173326a = sVar;
            this.f173327b = sVar.f173325b;
            this.f173328c = sVar.f173324a.mo4717a();
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: a */
    public Sequence<T> mo242503a(int i) {
        int i2 = this.f173325b;
        if (i >= i2) {
            return C69294l.m266114a();
        }
        return new SubSequence(this.f173324a, i, i2);
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: b */
    public Sequence<T> mo242504b(int i) {
        if (i >= this.f173325b) {
            return this;
        }
        return new TakeSequence(this.f173324a, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(Sequence<? extends T> iVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        this.f173324a = iVar;
        this.f173325b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }
}
