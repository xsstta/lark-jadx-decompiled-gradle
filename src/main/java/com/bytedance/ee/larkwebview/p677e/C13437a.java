package com.bytedance.ee.larkwebview.p677e;

import android.webkit.RenderProcessGoneDetail;

/* renamed from: com.bytedance.ee.larkwebview.e.a */
public class C13437a extends RenderProcessGoneDetail {

    /* renamed from: a */
    private final boolean f35423a;

    /* renamed from: b */
    private final int f35424b;

    public boolean didCrash() {
        return this.f35423a;
    }

    public int rendererPriorityAtExit() {
        return this.f35424b;
    }

    public C13437a(boolean z, int i) {
        this.f35423a = z;
        this.f35424b = i;
    }
}
