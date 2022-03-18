package io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.e */
public final class C68381e<T> extends AbstractC68379c<T> {
    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        this.f171688a = t;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        this.f171688a = null;
        this.f171689b = th;
        countDown();
    }
}
