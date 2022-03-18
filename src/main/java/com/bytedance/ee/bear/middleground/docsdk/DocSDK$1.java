package com.bytedance.ee.bear.middleground.docsdk;

import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.middleground.docsdk.C9307b;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class DocSDK$1 implements AbstractC1164j {

    /* renamed from: a */
    final /* synthetic */ C9307b f25021a;

    /* renamed from: b */
    private C4949j f25022b;

    DocSDK$1(C9307b bVar) {
        this.f25021a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C13479a.m54764b("DocSDK", "LifecycleOwner: " + lifecycleOwner + ", event: " + event);
        int i = C9307b.C93081.f25042a[event.ordinal()];
        if (i == 1) {
            C4949j a = C4949j.m20465a();
            this.f25022b = a;
            C9307b bVar = this.f25021a;
            bVar.f25036b = (C4933k) a.mo19576a(bVar.f25038d, this.f25021a.f25039e);
            this.f25022b.mo19579a(this.f25021a.f25039e, this.f25021a.f25037c);
        } else if (i == 2) {
            this.f25021a.f25035a.getLifecycle().removeObserver(this);
            this.f25022b.mo19582b(this.f25021a.f25039e, this.f25021a.f25037c);
            this.f25022b.mo19577a(this.f25021a.f25039e);
        }
    }
}
