package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.g */
public final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a */
    public final Function0<T> f173301a;

    /* renamed from: b */
    public final Function1<T, T> f173302b;

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<T> mo4717a() {
        return new C69292a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.g$a */
    public static final class C69292a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ GeneratorSequence f173303a;

        /* renamed from: b */
        private T f173304b;

        /* renamed from: c */
        private int f173305c = -2;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f173305c < 0) {
                m266105a();
            }
            if (this.f173305c == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m266105a() {
            T t;
            int i;
            if (this.f173305c == -2) {
                t = this.f173303a.f173301a.invoke();
            } else {
                Function1<T, T> function1 = this.f173303a.f173302b;
                T t2 = this.f173304b;
                if (t2 == null) {
                    Intrinsics.throwNpe();
                }
                t = function1.invoke(t2);
            }
            this.f173304b = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f173305c = i;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f173305c < 0) {
                m266105a();
            }
            if (this.f173305c != 0) {
                T t = this.f173304b;
                if (t != null) {
                    this.f173305c = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69292a(GeneratorSequence gVar) {
            this.f173303a = gVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "getInitialValue");
        Intrinsics.checkParameterIsNotNull(function1, "getNextValue");
        this.f173301a = function0;
        this.f173302b = function1;
    }
}
