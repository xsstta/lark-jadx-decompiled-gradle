package androidx.viewpager2.adapter;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.adapter.AbstractC1583a;

/* access modifiers changed from: package-private */
public class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ AbstractC1583a.C1588b f5538a;

    FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(AbstractC1583a.C1588b bVar) {
        this.f5538a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f5538a.mo8262a(false);
    }
}
