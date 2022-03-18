package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.sequences.j */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    /* renamed from: a */
    private int f173312a;

    /* renamed from: b */
    private T f173313b;

    /* renamed from: c */
    private Iterator<? extends T> f173314c;

    /* renamed from: d */
    private Continuation<? super Unit> f173315d;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    /* renamed from: a */
    private final T m266108a() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private final Throwable m266109b() {
        int i = this.f173312a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f173312a);
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f173312a;
        if (i == 0 || i == 1) {
            return m266108a();
        }
        if (i == 2) {
            this.f173312a = 1;
            Iterator<? extends T> it = this.f173314c;
            if (it == null) {
                Intrinsics.throwNpe();
            }
            return (T) it.next();
        } else if (i == 3) {
            this.f173312a = 0;
            T t = this.f173313b;
            this.f173313b = null;
            return t;
        } else {
            throw m266109b();
        }
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f173312a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f173314c;
                    if (it == null) {
                        Intrinsics.throwNpe();
                    }
                    if (it.hasNext()) {
                        this.f173312a = 2;
                        return true;
                    }
                    this.f173314c = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m266109b();
                }
            }
            this.f173312a = 5;
            Continuation<? super Unit> cVar = this.f173315d;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            this.f173315d = null;
            Unit unit = Unit.INSTANCE;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(unit));
        }
    }

    /* renamed from: a */
    public final void mo242523a(Continuation<? super Unit> cVar) {
        this.f173315d = cVar;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        C69097g.m265891a(obj);
        this.f173312a = 4;
    }

    @Override // kotlin.sequences.SequenceScope
    /* renamed from: a */
    public Object mo242522a(T t, Continuation<? super Unit> cVar) {
        this.f173313b = t;
        this.f173312a = 3;
        this.f173315d = cVar;
        Object a = C69086a.m265828a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
