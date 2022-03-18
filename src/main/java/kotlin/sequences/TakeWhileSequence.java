package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.t */
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* renamed from: a */
    public final Sequence<T> f173329a;

    /* renamed from: b */
    public final Function1<T, Boolean> f173330b;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<T> mo4717a() {
        return new C69310a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.t$a */
    public static final class C69310a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ TakeWhileSequence f173331a;

        /* renamed from: b */
        private final Iterator<T> f173332b;

        /* renamed from: c */
        private int f173333c = -1;

        /* renamed from: d */
        private T f173334d;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f173333c == -1) {
                m266158a();
            }
            if (this.f173333c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f173333c == -1) {
                m266158a();
            }
            if (this.f173333c != 0) {
                T t = this.f173334d;
                this.f173334d = null;
                this.f173333c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m266158a() {
            if (this.f173332b.hasNext()) {
                T next = this.f173332b.next();
                if (this.f173331a.f173330b.invoke(next).booleanValue()) {
                    this.f173333c = 1;
                    this.f173334d = next;
                    return;
                }
            }
            this.f173333c = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69310a(TakeWhileSequence tVar) {
            this.f173331a = tVar;
            this.f173332b = tVar.f173329a.mo4717a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public TakeWhileSequence(Sequence<? extends T> iVar, Function1<? super T, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        this.f173329a = iVar;
        this.f173330b = function1;
    }
}
