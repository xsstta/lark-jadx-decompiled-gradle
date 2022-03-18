package com.ss.android.lark.calendar.impl.framework.viewmodel;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000eB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\rH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ObservableLive;", "T", "", "Lio/reactivex/Observable;", ShareHitPoint.f121868c, "owner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "(Lio/reactivex/Observable;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "LiveObserver", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ObservableLive<T> extends Observable<T> {

    /* renamed from: a */
    private final Observable<T> f83403a;

    /* renamed from: b */
    private final LifecycleOwner f83404b;

    /* renamed from: c */
    private final Lifecycle.State f83405c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u0005B%\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0017J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0004H\u0017R\u0016\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ObservableLive$LiveObserver;", "T", "", "Lio/reactivex/Observer;", "Lio/reactivex/disposables/Disposable;", "Landroidx/lifecycle/LifecycleEventObserver;", "downstream", "owner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "(Lio/reactivex/Observer;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "pendingRef", "Ljava/util/concurrent/atomic/AtomicReference;", "upstreamRef", "dispose", "", "isDisposed", "", "onComplete", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "onStateChanged", ShareHitPoint.f121868c, "event", "Landroidx/lifecycle/Lifecycle$Event;", "onSubscribe", C63690d.f160779a, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    private static final class LiveObserver<T> implements AbstractC1168n, Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        private final AtomicReference<Disposable> f83406a = new AtomicReference<>();

        /* renamed from: b */
        private AtomicReference<T> f83407b = new AtomicReference<>();

        /* renamed from: c */
        private final AbstractC69009q<? super T> f83408c;

        /* renamed from: d */
        private final LifecycleOwner f83409d;

        /* renamed from: e */
        private final Lifecycle.State f83410e;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f83406a.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!isDisposed()) {
                dispose();
                this.f83408c.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.f83406a);
            this.f83409d.getLifecycle().removeObserver(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            if (!isDisposed()) {
                dispose();
                this.f83408c.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            Intrinsics.checkParameterIsNotNull(t, "t");
            if (!isDisposed()) {
                Lifecycle lifecycle = this.f83409d.getLifecycle();
                Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
                if (lifecycle.getCurrentState().compareTo((Enum) this.f83410e) >= 0) {
                    this.f83408c.onNext(t);
                } else {
                    this.f83407b.set(t);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
            Lifecycle lifecycle = this.f83409d.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState().compareTo((Enum) Lifecycle.State.INITIALIZED) < 0) {
                disposable.dispose();
            } else if (DisposableHelper.setOnce(this.f83406a, disposable)) {
                this.f83408c.onSubscribe(this);
                if (!isDisposed()) {
                    this.f83409d.getLifecycle().addObserver(this);
                }
            }
        }

        @Override // androidx.lifecycle.AbstractC1168n
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            T andSet;
            Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    dispose();
                    return;
                }
                Lifecycle lifecycle = this.f83409d.getLifecycle();
                Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
                if (lifecycle.getCurrentState().compareTo((Enum) this.f83410e) >= 0 && (andSet = this.f83407b.getAndSet(null)) != null) {
                    onNext(andSet);
                }
            }
        }

        public LiveObserver(AbstractC69009q<? super T> qVar, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
            Intrinsics.checkParameterIsNotNull(qVar, "downstream");
            Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
            Intrinsics.checkParameterIsNotNull(state, "minActiveState");
            this.f83408c = qVar;
            this.f83409d = lifecycleOwner;
            this.f83410e = state;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "observer");
        this.f83403a.subscribe(new LiveObserver(qVar, this.f83404b, this.f83405c));
    }

    public ObservableLive(Observable<T> observable, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        Intrinsics.checkParameterIsNotNull(observable, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(state, "minActiveState");
        this.f83403a = observable;
        this.f83404b = lifecycleOwner;
        this.f83405c = state;
    }
}
