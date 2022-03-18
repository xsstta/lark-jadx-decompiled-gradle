package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.e */
public final class FilteringSequence<T> implements Sequence<T> {

    /* renamed from: a */
    public final Sequence<T> f173288a;

    /* renamed from: b */
    public final boolean f173289b;

    /* renamed from: c */
    public final Function1<T, Boolean> f173290c;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<T> mo4717a() {
        return new C69290a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.e$a */
    public static final class C69290a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ FilteringSequence f173291a;

        /* renamed from: b */
        private final Iterator<T> f173292b;

        /* renamed from: c */
        private int f173293c = -1;

        /* renamed from: d */
        private T f173294d;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f173293c == -1) {
                m266101a();
            }
            if (this.f173293c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f173293c == -1) {
                m266101a();
            }
            if (this.f173293c != 0) {
                T t = this.f173294d;
                this.f173294d = null;
                this.f173293c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m266101a() {
            while (this.f173292b.hasNext()) {
                T next = this.f173292b.next();
                if (this.f173291a.f173290c.invoke(next).booleanValue() == this.f173291a.f173289b) {
                    this.f173294d = next;
                    this.f173293c = 1;
                    return;
                }
            }
            this.f173293c = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69290a(FilteringSequence eVar) {
            this.f173291a = eVar;
            this.f173292b = eVar.f173288a.mo4717a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilteringSequence(Sequence<? extends T> iVar, boolean z, Function1<? super T, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        this.f173288a = iVar;
        this.f173289b = z;
        this.f173290c = function1;
    }
}
