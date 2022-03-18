package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "transform", "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.h */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a */
    public final Sequence<T1> f173306a;

    /* renamed from: b */
    public final Sequence<T2> f173307b;

    /* renamed from: c */
    public final Function2<T1, T2, V> f173308c;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<V> mo4717a() {
        return new C69293a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.h$a */
    public static final class C69293a implements Iterator<V>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ MergingSequence f173309a;

        /* renamed from: b */
        private final Iterator<T1> f173310b;

        /* renamed from: c */
        private final Iterator<T2> f173311c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (!this.f173310b.hasNext() || !this.f173311c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f173309a.f173308c.invoke(this.f173310b.next(), this.f173311c.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69293a(MergingSequence hVar) {
            this.f173309a = hVar;
            this.f173310b = hVar.f173306a.mo4717a();
            this.f173311c = hVar.f173307b.mo4717a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T1> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.sequences.i<? extends T2> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.k<? super T1, ? super T2, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(Sequence<? extends T1> iVar, Sequence<? extends T2> iVar2, Function2<? super T1, ? super T2, ? extends V> kVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "sequence1");
        Intrinsics.checkParameterIsNotNull(iVar2, "sequence2");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        this.f173306a = iVar;
        this.f173307b = iVar2;
        this.f173308c = kVar;
    }
}
