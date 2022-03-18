package com.ss.android.lark.calendar.impl.framework.viewmodel;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.C69003c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f0\u0007R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0014J\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u00020\t2\u0010\u0010\n\u001a\f0\u0007R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010H\u0014R\u001e\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0007R\b\u0012\u0004\u0012\u00028\u00000\u00000\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent;", "V", "", "Lio/reactivex/Observable;", "()V", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent$ObserverDisposable;", "add", "", "observer", "emit", "v", "(Ljava/lang/Object;)V", "remove", "subscribeActual", "Lio/reactivex/Observer;", "ObserverDisposable", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class RxEvent<V> extends Observable<V> {

    /* renamed from: a */
    private final CopyOnWriteArrayList<RxEvent<V>.ObserverDisposable> f83411a = new CopyOnWriteArrayList<>();

    /* access modifiers changed from: protected */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent$ObserverDisposable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/reactivex/disposables/Disposable;", "downstream", "Lio/reactivex/Observer;", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent;Lio/reactivex/Observer;)V", "dispose", "", "isDisposed", "", "onNext", "v", "(Ljava/lang/Object;)V", "onSubscribe", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public final class ObserverDisposable extends AtomicBoolean implements Disposable {
        private final AbstractC69009q<? super V> downstream;
        final /* synthetic */ RxEvent this$0;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.this$0.mo118783b(this);
            }
        }

        public final void onSubscribe() {
            this.downstream.onSubscribe(this);
        }

        public final void onNext(V v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            this.downstream.onNext(v);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ObserverDisposable(RxEvent rxEvent, AbstractC69009q<? super V> qVar) {
            super(false);
            Intrinsics.checkParameterIsNotNull(qVar, "downstream");
            this.this$0 = rxEvent;
            this.downstream = qVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo118781a(RxEvent<V>.ObserverDisposable observerDisposable) {
        Intrinsics.checkParameterIsNotNull(observerDisposable, "observer");
        this.f83411a.add(observerDisposable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo118783b(RxEvent<V>.ObserverDisposable observerDisposable) {
        Intrinsics.checkParameterIsNotNull(observerDisposable, "observer");
        this.f83411a.remove(observerDisposable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo118782a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "v");
        Iterator<T> it = this.f83411a.iterator();
        while (it.hasNext()) {
            it.next().onNext(v);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super V> qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "observer");
        ObserverDisposable observerDisposable = new ObserverDisposable(this, new C69003c(qVar));
        observerDisposable.onSubscribe();
        if (!observerDisposable.isDisposed()) {
            mo118781a((RxEvent<V>.ObserverDisposable) observerDisposable);
        }
    }
}
