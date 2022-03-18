package com.bytedance.ee.bear.bizwidget.banner.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class BannerLifecycleObserverAdapter implements LifecycleObserver {

    /* renamed from: a */
    private final AbstractC4876a f14352a;

    /* renamed from: b */
    private final LifecycleOwner f14353b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f14352a.mo19066d(this.f14353b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        this.f14352a.mo19060b(this.f14353b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.f14352a.mo19063c(this.f14353b);
    }

    public BannerLifecycleObserverAdapter(LifecycleOwner lifecycleOwner, AbstractC4876a aVar) {
        this.f14353b = lifecycleOwner;
        this.f14352a = aVar;
    }
}
