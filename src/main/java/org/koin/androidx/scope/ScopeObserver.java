package org.koin.androidx.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Metadata;
import org.koin.core.Koin;
import org.koin.core.KoinComponent;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lorg/koin/androidx/scope/ScopeObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lorg/koin/core/KoinComponent;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "target", "", "scope", "Lorg/koin/core/scope/Scope;", "(Landroidx/lifecycle/Lifecycle$Event;Ljava/lang/Object;Lorg/koin/core/scope/Scope;)V", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "getScope", "()Lorg/koin/core/scope/Scope;", "getTarget", "()Ljava/lang/Object;", "onDestroy", "", "onStop", "koin-androidx-scope_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ScopeObserver implements LifecycleObserver, KoinComponent {

    /* renamed from: a */
    private final Lifecycle.Event f175001a;

    /* renamed from: b */
    private final Object f175002b;

    /* renamed from: c */
    private final Scope f175003c;

    @Override // org.koin.core.KoinComponent
    /* renamed from: a */
    public Koin mo246610a() {
        return KoinComponent.C70037a.m268649a(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.f175001a == Lifecycle.Event.ON_DESTROY) {
            Logger b = this.f175003c.mo246705f().mo246617b();
            b.mo246689a(this.f175002b + " received ON_DESTROY");
            this.f175003c.mo246700b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.f175001a == Lifecycle.Event.ON_STOP) {
            Logger b = this.f175003c.mo246705f().mo246617b();
            b.mo246689a(this.f175002b + " received ON_STOP");
            this.f175003c.mo246700b();
        }
    }
}
