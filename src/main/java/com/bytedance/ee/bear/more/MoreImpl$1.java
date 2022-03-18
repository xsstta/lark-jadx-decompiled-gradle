package com.bytedance.ee.bear.more;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

class MoreImpl$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ FragmentActivity f27495a;

    /* renamed from: b */
    final /* synthetic */ C10203c f27496b;

    MoreImpl$1(C10203c cVar, FragmentActivity fragmentActivity) {
        this.f27496b = cVar;
        this.f27495a = fragmentActivity;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f27496b.f27538a = null;
            this.f27495a.getLifecycle().removeObserver(this);
        }
    }
}
