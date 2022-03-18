package androidx.savedstate;

import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class SavedStateRegistry$1 implements AbstractC1164j {

    /* renamed from: a */
    final /* synthetic */ C1442a f5066a;

    SavedStateRegistry$1(C1442a aVar) {
        this.f5066a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f5066a.f5067a = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this.f5066a.f5067a = false;
        }
    }
}
