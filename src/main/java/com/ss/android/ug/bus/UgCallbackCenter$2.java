package com.ss.android.ug.bus;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ug.bus.C60443c;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class UgCallbackCenter$2 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ ConcurrentHashMap f151020a;

    /* renamed from: b */
    final /* synthetic */ C60443c.AbstractC60445a f151021b;

    /* renamed from: c */
    final /* synthetic */ Type f151022c;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f151020a.remove(this.f151021b);
        if (this.f151020a.isEmpty()) {
            C60443c.f151026a.remove(this.f151022c);
        }
    }

    UgCallbackCenter$2(ConcurrentHashMap concurrentHashMap, C60443c.AbstractC60445a aVar, Type type) {
        this.f151020a = concurrentHashMap;
        this.f151021b = aVar;
        this.f151022c = type;
    }
}
