package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "()V", "nextValue", "Ljava/lang/Object;", "state", "Lkotlin/collections/State;", "computeNext", "", "done", "hasNext", "", "next", "()Ljava/lang/Object;", "setNext", "value", "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.collections.b */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    private State f173074a = State.NotReady;

    /* renamed from: b */
    private T f173075b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo239005a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo239007b() {
        this.f173074a = State.Done;
    }

    /* renamed from: c */
    private final boolean m265696c() {
        this.f173074a = State.Failed;
        mo239005a();
        if (this.f173074a == State.Ready) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f173074a = State.NotReady;
            return this.f173075b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        boolean z;
        if (this.f173074a != State.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C69042c.f173076a[this.f173074a.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m265696c();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo239006a(T t) {
        this.f173075b = t;
        this.f173074a = State.Ready;
    }
}
