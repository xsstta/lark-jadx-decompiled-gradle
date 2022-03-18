package com.ss.android.lark.utils.rxjava;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.log.Log;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.utils.rxjava.c */
public class C57865c {

    /* renamed from: com.ss.android.lark.utils.rxjava.c$b */
    public interface AbstractC57871b<T> {
        void consume(T t);
    }

    /* renamed from: com.ss.android.lark.utils.rxjava.c$d */
    public interface AbstractC57873d<T> {
        T produce();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.utils.rxjava.c$a */
    public class C57870a {

        /* renamed from: a */
        private T f142496a;

        /* renamed from: a */
        public T mo196216a() {
            return this.f142496a;
        }

        public C57870a(T t) {
            this.f142496a = t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.utils.rxjava.c$c */
    public static class C57872c implements AbstractC57871b<Throwable> {
        C57872c() {
        }

        /* renamed from: a */
        public void consume(Throwable th) {
            if (th != null) {
                Log.m165384e("RxScheduledExecutor", th.getMessage(), th);
            }
        }
    }

    /* renamed from: com.ss.android.lark.utils.rxjava.c$f */
    public static class C57875f<P extends Fragment, T> extends AbstractC57874e<P, T> {
        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57874e
        /* renamed from: a */
        public boolean mo196219a() {
            Fragment fragment;
            if (this.f142497a == null || (fragment = (Fragment) this.f142497a.get()) == null || !fragment.isAdded()) {
                return false;
            }
            return true;
        }

        public C57875f(P p) {
            super(p);
        }
    }

    /* renamed from: com.ss.android.lark.utils.rxjava.c$e */
    public static abstract class AbstractC57874e<P, T> implements AbstractC57871b<T> {

        /* renamed from: a */
        protected WeakReference<P> f142497a;

        /* renamed from: a */
        public void mo196218a(T t) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo196219a();

        public AbstractC57874e(P p) {
            this.f142497a = new WeakReference<>(p);
        }

        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
        public void consume(T t) {
            if (mo196219a()) {
                mo196218a(t);
            }
        }
    }

    /* renamed from: a */
    public static void m224576a(final Runnable runnable) {
        m224574a(new AbstractC57873d<Object>() {
            /* class com.ss.android.lark.utils.rxjava.C57865c.C578694 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public Object produce() {
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                return true;
            }
        }, null);
    }

    /* renamed from: a */
    public static <T> Disposable m224574a(AbstractC57873d<T> dVar, AbstractC57871b<T> bVar) {
        return m224575a(dVar, bVar, new C57872c());
    }

    /* renamed from: a */
    public static <T> Disposable m224575a(final AbstractC57873d<T> dVar, final AbstractC57871b<T> bVar, final AbstractC57871b<Throwable> bVar2) {
        return C68296b.create(new ObservableOnSubscribe<C57870a>() {
            /* class com.ss.android.lark.utils.rxjava.C57865c.C578683 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<C57870a> observableEmitter) throws Exception {
                Object obj;
                AbstractC57873d dVar = dVar;
                if (dVar != null) {
                    obj = dVar.produce();
                } else {
                    obj = null;
                }
                observableEmitter.onNext(new C57870a(obj));
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C57870a>() {
            /* class com.ss.android.lark.utils.rxjava.C57865c.C578661 */

            /* renamed from: a */
            public void accept(C57870a aVar) throws Exception {
                AbstractC57871b bVar = bVar;
                if (bVar != null) {
                    bVar.consume(aVar.mo196216a());
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.utils.rxjava.C57865c.C578672 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AbstractC57871b bVar = bVar2;
                if (bVar != null) {
                    bVar.consume(th);
                }
            }
        });
    }
}
