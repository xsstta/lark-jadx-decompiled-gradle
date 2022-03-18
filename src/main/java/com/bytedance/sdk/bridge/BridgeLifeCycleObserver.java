package com.bytedance.sdk.bridge;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\r\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\nJ\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/sdk/bridge/BridgeLifeCycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "module", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Ljava/lang/Object;Landroid/arch/lifecycle/Lifecycle;)V", "onAny", "", "onDestory", "onDestory$bridge_release", "onPause", "onResume", "onStart", "onStop", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BridgeLifeCycleObserver implements LifecycleObserver {

    /* renamed from: a */
    private final Object f50397a;

    /* renamed from: b */
    private final Lifecycle f50398b;

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public final void onAny() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69515f();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69510a();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69513d();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory$bridge_release() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69514e();
        }
        BridgeRegistry.f50436a.mo69581c(this.f50397a, this.f50398b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69512c();
        }
        BridgeRegistry.f50436a.mo69576a(this.f50397a, this.f50398b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Object obj = this.f50397a;
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69511b();
        }
        BridgeRegistry.f50436a.mo69580b(this.f50397a, this.f50398b);
    }
}
