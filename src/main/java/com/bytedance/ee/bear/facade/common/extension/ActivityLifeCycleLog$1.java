package com.bytedance.ee.bear.facade.common.extension;

import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class ActivityLifeCycleLog$1 implements AbstractC1164j {

    /* renamed from: a */
    final /* synthetic */ C7702c f20812a;

    ActivityLifeCycleLog$1(C7702c cVar) {
        this.f20812a = cVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        String str = this.f20812a.f20818a;
        C13479a.m54764b(str, "onStateChanged:" + event);
    }
}
