package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.a.g */
public final class C68403g extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC68293e f171724a;

    /* renamed from: b */
    final Consumer<? super Disposable> f171725b;

    /* renamed from: c */
    final Consumer<? super Throwable> f171726c;

    /* renamed from: d */
    final AbstractC68309a f171727d;

    /* renamed from: e */
    final AbstractC68309a f171728e;

    /* renamed from: f */
    final AbstractC68309a f171729f;

    /* renamed from: g */
    final AbstractC68309a f171730g;

    /* renamed from: io.reactivex.internal.operators.a.g$a */
    final class C68404a implements AbstractC68273c, Disposable {

        /* renamed from: a */
        final AbstractC68273c f171731a;

        /* renamed from: b */
        Disposable f171732b;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171732b.isDisposed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238140a() {
            try {
                C68403g.this.f171729f.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                C68403g.this.f171730g.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
            this.f171732b.dispose();
        }

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            if (this.f171732b != DisposableHelper.DISPOSED) {
                try {
                    C68403g.this.f171727d.run();
                    C68403g.this.f171728e.run();
                    this.f171731a.onComplete();
                    mo238140a();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171731a.onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            if (this.f171732b == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            try {
                C68403g.this.f171726c.accept(th);
                C68403g.this.f171728e.run();
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                th = new CompositeException(th, th2);
            }
            this.f171731a.onError(th);
            mo238140a();
        }

        @Override // io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            try {
                C68403g.this.f171725b.accept(disposable);
                if (DisposableHelper.validate(this.f171732b, disposable)) {
                    this.f171732b = disposable;
                    this.f171731a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                disposable.dispose();
                this.f171732b = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.f171731a);
            }
        }

        C68404a(AbstractC68273c cVar) {
            this.f171731a = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        this.f171724a.mo237885a(new C68404a(cVar));
    }

    public C68403g(AbstractC68293e eVar, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2, AbstractC68309a aVar3, AbstractC68309a aVar4) {
        this.f171724a = eVar;
        this.f171725b = consumer;
        this.f171726c = consumer2;
        this.f171727d = aVar;
        this.f171728e = aVar2;
        this.f171729f = aVar3;
        this.f171730g = aVar4;
    }
}
