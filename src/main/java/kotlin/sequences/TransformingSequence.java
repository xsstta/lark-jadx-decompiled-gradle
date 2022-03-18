package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.u */
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a */
    public final Sequence<T> f173335a;

    /* renamed from: b */
    public final Function1<T, R> f173336b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.u$a */
    public static final class C69311a implements Iterator<R>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ TransformingSequence f173337a;

        /* renamed from: b */
        private final Iterator<T> f173338b;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f173338b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return this.f173337a.f173336b.invoke(this.f173338b.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69311a(TransformingSequence uVar) {
            this.f173337a = uVar;
            this.f173338b = uVar.f173335a.mo4717a();
        }
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<R> mo4717a() {
        return new C69311a(this);
    }

    /* renamed from: a */
    public final <E> Sequence<E> mo242539a(Function1<? super R, ? extends Iterator<? extends E>> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "iterator");
        return new FlatteningSequence(this.f173335a, this.f173336b, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(Sequence<? extends T> iVar, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        Intrinsics.checkParameterIsNotNull(function1, "transformer");
        this.f173335a = iVar;
        this.f173336b = function1;
    }
}
