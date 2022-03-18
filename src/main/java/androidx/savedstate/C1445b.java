package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.savedstate.b */
public final class C1445b {

    /* renamed from: a */
    private final SavedStateRegistryOwner f5072a;

    /* renamed from: b */
    private final C1442a f5073b = new C1442a();

    /* renamed from: a */
    public C1442a mo7625a() {
        return this.f5073b;
    }

    /* renamed from: a */
    public static C1445b m6595a(SavedStateRegistryOwner savedStateRegistryOwner) {
        return new C1445b(savedStateRegistryOwner);
    }

    /* renamed from: b */
    public void mo7627b(Bundle bundle) {
        this.f5073b.mo7621a(bundle);
    }

    private C1445b(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f5072a = savedStateRegistryOwner;
    }

    /* renamed from: a */
    public void mo7626a(Bundle bundle) {
        Lifecycle lifecycle = this.f5072a.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED) {
            lifecycle.addObserver(new Recreator(this.f5072a));
            this.f5073b.mo7622a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
