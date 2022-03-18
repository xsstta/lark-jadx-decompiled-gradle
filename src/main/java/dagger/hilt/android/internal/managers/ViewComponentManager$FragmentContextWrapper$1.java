package dagger.hilt.android.internal.managers;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.android.internal.managers.C68162k;

/* access modifiers changed from: package-private */
public class ViewComponentManager$FragmentContextWrapper$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ C68162k.C68163a f171380a;

    ViewComponentManager$FragmentContextWrapper$1(C68162k.C68163a aVar) {
        this.f171380a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f171380a.f171402a = null;
            this.f171380a.f171403b = null;
            this.f171380a.f171404c = null;
        }
    }
}
