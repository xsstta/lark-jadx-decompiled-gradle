package androidx.navigation.fragment;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

class DialogFragmentNavigator$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ C1252a f4510a;

    DialogFragmentNavigator$1(C1252a aVar) {
        this.f4510a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) lifecycleOwner;
            if (!bVar.J_().isShowing()) {
                NavHostFragment.m5682a(bVar).mo6337b();
            }
        }
    }
}
