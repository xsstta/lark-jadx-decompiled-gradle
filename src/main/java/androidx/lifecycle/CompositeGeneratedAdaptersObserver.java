package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements AbstractC1168n {

    /* renamed from: a */
    private final AbstractC1163i[] f4175a;

    CompositeGeneratedAdaptersObserver(AbstractC1163i[] iVarArr) {
        this.f4175a = iVarArr;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C1176v vVar = new C1176v();
        for (AbstractC1163i iVar : this.f4175a) {
            iVar.mo6036a(lifecycleOwner, event, false, vVar);
        }
        for (AbstractC1163i iVar2 : this.f4175a) {
            iVar2.mo6036a(lifecycleOwner, event, true, vVar);
        }
    }
}
