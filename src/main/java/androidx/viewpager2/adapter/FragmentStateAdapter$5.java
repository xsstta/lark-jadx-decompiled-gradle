package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class FragmentStateAdapter$5 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ Handler f5535a;

    /* renamed from: b */
    final /* synthetic */ Runnable f5536b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1583a f5537c;

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f5535a.removeCallbacks(this.f5536b);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    FragmentStateAdapter$5(AbstractC1583a aVar, Handler handler, Runnable runnable) {
        this.f5537c = aVar;
        this.f5535a = handler;
        this.f5536b = runnable;
    }
}
