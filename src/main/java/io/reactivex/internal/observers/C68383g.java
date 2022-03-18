package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.observers.g */
public final class C68383g<T> implements Disposable, AbstractC69009q<T> {

    /* renamed from: a */
    final AbstractC69009q<? super T> f171696a;

    /* renamed from: b */
    final Consumer<? super Disposable> f171697b;

    /* renamed from: c */
    final AbstractC68309a f171698c;

    /* renamed from: d */
    Disposable f171699d;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f171699d.isDisposed();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (this.f171699d != DisposableHelper.DISPOSED) {
            this.f171699d = DisposableHelper.DISPOSED;
            this.f171696a.onComplete();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f171699d;
        if (disposable != DisposableHelper.DISPOSED) {
            this.f171699d = DisposableHelper.DISPOSED;
            try {
                this.f171698c.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        this.f171696a.onNext(t);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (this.f171699d != DisposableHelper.DISPOSED) {
            this.f171699d = DisposableHelper.DISPOSED;
            this.f171696a.onError(th);
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        try {
            this.f171697b.accept(disposable);
            if (DisposableHelper.validate(this.f171699d, disposable)) {
                this.f171699d = disposable;
                this.f171696a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C68306a.m265071b(th);
            disposable.dispose();
            this.f171699d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f171696a);
        }
    }

    public C68383g(AbstractC69009q<? super T> qVar, Consumer<? super Disposable> consumer, AbstractC68309a aVar) {
        this.f171696a = qVar;
        this.f171697b = consumer;
        this.f171698c = aVar;
    }
}
