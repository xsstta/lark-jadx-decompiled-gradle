package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class SingleGeneratedAdapterObserver implements AbstractC1168n {

    /* renamed from: a */
    private final AbstractC1163i f4216a;

    SingleGeneratedAdapterObserver(AbstractC1163i iVar) {
        this.f4216a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f4216a.mo6036a(lifecycleOwner, event, false, null);
        this.f4216a.mo6036a(lifecycleOwner, event, true, null);
    }
}
