package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.reactivex.internal.operators.observable.b */
public final class C68696b<T> implements Iterable<T> {

    /* renamed from: a */
    final ObservableSource<? extends T> f172251a;

    /* renamed from: b */
    final int f172252b;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    static final class C68697a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T>, Iterator<T> {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        Throwable error;
        final Lock lock;
        final C68926b<T> queue;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        public boolean hasNext() {
            while (true) {
                boolean z = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw C68981f.m265557a(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                try {
                    C68978c.m265550a();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty()) {
                        try {
                            this.condition.await();
                        } finally {
                            this.lock.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw C68981f.m265557a(e);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.queue.offer(t);
            signalConsumer();
        }

        C68697a(int i) {
            this.queue = new C68926b<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C68697a aVar = new C68697a(this.f172252b);
        this.f172251a.subscribe(aVar);
        return aVar;
    }

    public C68696b(ObservableSource<? extends T> observableSource, int i) {
        this.f172251a = observableSource;
        this.f172252b = i;
    }
}
