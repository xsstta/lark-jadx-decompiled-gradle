package io.reactivex.internal.disposables;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.internal.p3460b.AbstractC68368e;

public enum EmptyDisposable implements AbstractC68368e<Object> {
    INSTANCE,
    NEVER;

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public Object poll() throws Exception {
        return null;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68369f
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(AbstractC68273c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void complete(AbstractC68989k<?> kVar) {
        kVar.onSubscribe(INSTANCE);
        kVar.onComplete();
    }

    public static void complete(AbstractC69009q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onComplete();
    }

    public static void error(Throwable th, AbstractC68273c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, AbstractC68989k<?> kVar) {
        kVar.onSubscribe(INSTANCE);
        kVar.onError(th);
    }

    public static void error(Throwable th, AbstractC69009q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onError(th);
    }

    public static void error(Throwable th, AbstractC69012t<?> tVar) {
        tVar.onSubscribe(INSTANCE);
        tVar.onError(th);
    }
}
