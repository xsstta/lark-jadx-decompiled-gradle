package io.reactivex.internal.queue;

import io.reactivex.internal.p3460b.AbstractC68372i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.queue.a */
public final class C68924a<T> implements AbstractC68372i<T> {

    /* renamed from: a */
    private final AtomicReference<C68925a<T>> f172856a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C68925a<T>> f172857b = new AtomicReference<>();

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.queue.a$a */
    public static final class C68925a<E> extends AtomicReference<C68925a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        C68925a() {
        }

        public E lpValue() {
            return this.value;
        }

        public C68925a<E> lvNext() {
            return (C68925a) get();
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue(null);
            return lpValue;
        }

        public void soNext(C68925a<E> aVar) {
            lazySet(aVar);
        }

        public void spValue(E e) {
            this.value = e;
        }

        C68925a(E e) {
            spValue(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C68925a<T> mo238616a() {
        return this.f172856a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C68925a<T> mo238618b() {
        return this.f172857b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C68925a<T> mo238620c() {
        return this.f172857b.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.queue.C68924a.clear():void");
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        if (mo238618b() == mo238616a()) {
            return true;
        }
        return false;
    }

    public C68924a() {
        C68925a<T> aVar = new C68925a<>();
        mo238619b(aVar);
        mo238617a(aVar);
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68372i, io.reactivex.internal.p3460b.AbstractC68373j
    public T poll() {
        C68925a<T> lvNext;
        C68925a<T> c = mo238620c();
        C68925a<T> lvNext2 = c.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            mo238619b(lvNext2);
            return andNullValue;
        } else if (c == mo238616a()) {
            return null;
        } else {
            do {
                lvNext = c.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            mo238619b(lvNext);
            return andNullValue2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238619b(C68925a<T> aVar) {
        this.f172857b.lazySet(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C68925a<T> mo238617a(C68925a<T> aVar) {
        return this.f172856a.getAndSet(aVar);
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        C68925a<T> aVar = new C68925a<>(t);
        mo238617a(aVar).soNext(aVar);
        return true;
    }
}
