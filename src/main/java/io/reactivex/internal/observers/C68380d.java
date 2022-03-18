package io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.d */
public final class C68380d<T> extends AbstractC68379c<T> {
    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (this.f171688a == null) {
            this.f171689b = th;
        }
        countDown();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (this.f171688a == null) {
            this.f171688a = t;
            this.f171690c.dispose();
            countDown();
        }
    }
}
