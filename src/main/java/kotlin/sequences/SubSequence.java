package kotlin.sequences;

import com.ss.android.vesdk.C64034n;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", C64034n.f161683a, "iterator", "", "take", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.r */
public final class SubSequence<T> implements DropTakeSequence<T>, Sequence<T> {

    /* renamed from: a */
    public final Sequence<T> f173318a;

    /* renamed from: b */
    public final int f173319b;

    /* renamed from: c */
    public final int f173320c;

    /* renamed from: b */
    private final int m266149b() {
        return this.f173320c - this.f173319b;
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<T> mo4717a() {
        return new C69308a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.r$a */
    public static final class C69308a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ SubSequence f173321a;

        /* renamed from: b */
        private final Iterator<T> f173322b;

        /* renamed from: c */
        private int f173323c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: a */
        private final void m266153a() {
            while (this.f173323c < this.f173321a.f173319b && this.f173322b.hasNext()) {
                this.f173322b.next();
                this.f173323c++;
            }
        }

        public boolean hasNext() {
            m266153a();
            if (this.f173323c >= this.f173321a.f173320c || !this.f173322b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            m266153a();
            if (this.f173323c < this.f173321a.f173320c) {
                this.f173323c++;
                return this.f173322b.next();
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69308a(SubSequence rVar) {
            this.f173321a = rVar;
            this.f173322b = rVar.f173318a.mo4717a();
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: a */
    public Sequence<T> mo242503a(int i) {
        if (i >= m266149b()) {
            return C69294l.m266114a();
        }
        return new SubSequence(this.f173318a, this.f173319b + i, this.f173320c);
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: b */
    public Sequence<T> mo242504b(int i) {
        if (i >= m266149b()) {
            return this;
        }
        Sequence<T> iVar = this.f173318a;
        int i2 = this.f173319b;
        return new SubSequence(iVar, i2, i + i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(Sequence<? extends T> iVar, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        this.f173318a = iVar;
        this.f173319b = i;
        this.f173320c = i2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(i2 < i ? false : z3)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }
}
