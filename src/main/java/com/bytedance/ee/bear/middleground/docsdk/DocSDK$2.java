package com.bytedance.ee.bear.middleground.docsdk;

import android.webkit.WebView;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.middleground.docsdk.C9307b;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class DocSDK$2 implements AbstractC1164j {

    /* renamed from: a */
    final /* synthetic */ C9307b f25023a;

    DocSDK$2(C9307b bVar) {
        this.f25023a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC4931i b;
        WebView b2;
        C13479a.m54764b("DocSDK", "ownerActivity LifecycleOwner: " + lifecycleOwner + ", event: " + event);
        int i = C9307b.C93081.f25042a[event.ordinal()];
        if (i == 2) {
            C9307b.f25033g.remove(this.f25023a.f25040f);
        } else if (i == 3 && (b = this.f25023a.f25036b.mo19448b()) != null && (b2 = b.mo19435b()) != null) {
            b2.resumeTimers();
        }
    }
}
