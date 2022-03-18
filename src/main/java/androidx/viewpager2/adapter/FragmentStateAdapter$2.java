package androidx.viewpager2.adapter;

import androidx.core.view.ViewCompat;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class FragmentStateAdapter$2 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ C1591b f5533a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1583a f5534b;

    FragmentStateAdapter$2(AbstractC1583a aVar, C1591b bVar) {
        this.f5534b = aVar;
        this.f5533a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!this.f5534b.mo8255b()) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            if (ViewCompat.m4015I(this.f5533a.mo8266a())) {
                this.f5534b.mo8254b(this.f5533a);
            }
        }
    }
}
