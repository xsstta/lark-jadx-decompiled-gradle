package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.AbstractC69001a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.observable.d */
public final class C68795d<T> implements Iterable<T> {

    /* renamed from: a */
    final ObservableSource<T> f172488a;

    /* renamed from: b */
    final T f172489b;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    static final class C68796a<T> extends AbstractC69001a<T> {

        /* renamed from: a */
        volatile Object f172490a;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.d$a$a */
        public final class C68797a implements Iterator<T> {

            /* renamed from: b */
            private Object f172492b;

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }

            public boolean hasNext() {
                Object obj = C68796a.this.f172490a;
                this.f172492b = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                Object obj = null;
                try {
                    if (this.f172492b == null) {
                        Object obj2 = C68796a.this.f172490a;
                    }
                    if (NotificationLite.isComplete(this.f172492b)) {
                        throw new NoSuchElementException();
                    } else if (!NotificationLite.isError(this.f172492b)) {
                        T t = (T) NotificationLite.getValue(this.f172492b);
                        this.f172492b = obj;
                        return t;
                    } else {
                        throw C68981f.m265557a(NotificationLite.getError(this.f172492b));
                    }
                } finally {
                    this.f172492b = obj;
                }
            }

            C68797a() {
            }
        }

        /* renamed from: a */
        public C68796a<T>.C68797a mo238488a() {
            return new C68797a();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172490a = NotificationLite.complete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172490a = NotificationLite.error(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172490a = NotificationLite.next(t);
        }

        C68796a(T t) {
            this.f172490a = NotificationLite.next(t);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C68796a aVar = new C68796a(this.f172489b);
        this.f172488a.subscribe(aVar);
        return aVar.mo238488a();
    }

    public C68795d(ObservableSource<T> observableSource, T t) {
        this.f172488a = observableSource;
        this.f172489b = t;
    }
}
