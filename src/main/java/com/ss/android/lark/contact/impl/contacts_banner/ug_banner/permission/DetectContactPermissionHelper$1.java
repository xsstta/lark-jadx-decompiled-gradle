package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/* access modifiers changed from: package-private */
public class DetectContactPermissionHelper$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ Context f91829a;

    /* renamed from: b */
    final /* synthetic */ View$OnAttachStateChangeListenerC35527c f91830b;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.f91830b.mo130969a(this.f91829a)) {
            this.f91830b.mo130963a();
            if (this.f91830b.f91833c != null) {
                this.f91830b.f91833c.getLifecycle().removeObserver(this);
            }
            this.f91830b.mo130970b();
        }
    }

    DetectContactPermissionHelper$1(View$OnAttachStateChangeListenerC35527c cVar, Context context) {
        this.f91830b = cVar;
        this.f91829a = context;
    }
}
