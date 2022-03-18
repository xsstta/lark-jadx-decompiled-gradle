package androidx.navigation;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class NavController$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ C1259g f4467a;

    NavController$1(C1259g gVar) {
        this.f4467a = gVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (this.f4467a.f4528a != null) {
            for (C1250f fVar : this.f4467a.f4529b) {
                fVar.mo6301a(event);
            }
        }
    }
}
