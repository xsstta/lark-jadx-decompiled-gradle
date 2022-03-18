package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C1442a;
import androidx.savedstate.SavedStateRegistryOwner;

/* access modifiers changed from: package-private */
public final class SavedStateHandleController implements AbstractC1168n {

    /* renamed from: a */
    private final String f4211a;

    /* renamed from: b */
    private boolean f4212b;

    /* renamed from: c */
    private final C1133ab f4213c;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C1126a implements C1442a.AbstractC1443a {
        C1126a() {
        }

        @Override // androidx.savedstate.C1442a.AbstractC1443a
        /* renamed from: a */
        public void mo5971a(SavedStateRegistryOwner savedStateRegistryOwner) {
            if (savedStateRegistryOwner instanceof ViewModelStoreOwner) {
                ak viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
                C1442a savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                for (String str : viewModelStore.mo6008a()) {
                    SavedStateHandleController.m5320a(viewModelStore.mo6007a(str), savedStateRegistry, savedStateRegistryOwner.getLifecycle());
                }
                if (!viewModelStore.mo6008a().isEmpty()) {
                    savedStateRegistry.mo7623a(C1126a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5969a() {
        return this.f4212b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1133ab mo5970b() {
        return this.f4213c;
    }

    SavedStateHandleController(String str, C1133ab abVar) {
        this.f4211a = str;
        this.f4213c = abVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f4212b = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    /* renamed from: b */
    private static void m5321b(final C1442a aVar, final Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            aVar.mo7623a(C1126a.class);
        } else {
            lifecycle.addObserver(new AbstractC1168n() {
                /* class androidx.lifecycle.SavedStateHandleController.C11251 */

                @Override // androidx.lifecycle.AbstractC1168n
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.removeObserver(this);
                        aVar.mo7623a(C1126a.class);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5968a(C1442a aVar, Lifecycle lifecycle) {
        if (!this.f4212b) {
            this.f4212b = true;
            lifecycle.addObserver(this);
            aVar.mo7624a(this.f4211a, this.f4213c.mo5989a());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: a */
    static void m5320a(AbstractC1142af afVar, C1442a aVar, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) afVar.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo5969a()) {
            savedStateHandleController.mo5968a(aVar, lifecycle);
            m5321b(aVar, lifecycle);
        }
    }

    /* renamed from: a */
    static SavedStateHandleController m5319a(C1442a aVar, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1133ab.m5340a(aVar.mo7620a(str), bundle));
        savedStateHandleController.mo5968a(aVar, lifecycle);
        m5321b(aVar, lifecycle);
        return savedStateHandleController;
    }
}
