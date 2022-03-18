package com.bytedance.ee.bear.document.toolbar.editpanels;

import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class EditPanelsManager$1 implements AbstractC1164j {

    /* renamed from: a */
    final /* synthetic */ AbstractC6214a f17295a;

    /* renamed from: b */
    final /* synthetic */ C6215b f17296b;

    EditPanelsManager$1(C6215b bVar, AbstractC6214a aVar) {
        this.f17296b = bVar;
        this.f17295a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.f17296b.updateActivePanel(this.f17295a, false);
        }
    }
}
