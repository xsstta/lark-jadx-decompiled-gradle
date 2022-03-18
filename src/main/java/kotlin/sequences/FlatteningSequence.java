package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.f */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a */
    public final Sequence<T> f173295a;

    /* renamed from: b */
    public final Function1<T, R> f173296b;

    /* renamed from: c */
    public final Function1<R, Iterator<E>> f173297c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.f$a */
    public static final class C69291a implements Iterator<E>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ FlatteningSequence f173298a;

        /* renamed from: b */
        private final Iterator<T> f173299b;

        /* renamed from: c */
        private Iterator<? extends E> f173300c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return m266103a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (m266103a()) {
                Iterator<? extends E> it = this.f173300c;
                if (it == null) {
                    Intrinsics.throwNpe();
                }
                return (E) it.next();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final boolean m266103a() {
            Iterator<? extends E> it = this.f173300c;
            if (it != null && !it.hasNext()) {
                this.f173300c = null;
            }
            while (true) {
                if (this.f173300c == null) {
                    if (this.f173299b.hasNext()) {
                        Iterator<E> invoke = this.f173298a.f173297c.invoke(this.f173298a.f173296b.invoke(this.f173299b.next()));
                        if (invoke.hasNext()) {
                            this.f173300c = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69291a(FlatteningSequence fVar) {
            this.f173298a = fVar;
            this.f173299b = fVar.f173295a.mo4717a();
        }
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<E> mo4717a() {
        return new C69291a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(Sequence<? extends T> iVar, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function12) {
        Intrinsics.checkParameterIsNotNull(iVar, "sequence");
        Intrinsics.checkParameterIsNotNull(function1, "transformer");
        Intrinsics.checkParameterIsNotNull(function12, "iterator");
        this.f173295a = iVar;
        this.f173296b = function1;
        this.f173297c = function12;
    }
}
