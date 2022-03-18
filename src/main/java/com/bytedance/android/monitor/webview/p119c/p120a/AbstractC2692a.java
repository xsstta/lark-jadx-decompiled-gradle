package com.bytedance.android.monitor.webview.p119c.p120a;

import com.bytedance.android.monitor.p104a.AbstractC2630b;

/* renamed from: com.bytedance.android.monitor.webview.c.a.a */
public abstract class AbstractC2692a extends AbstractC2630b {

    /* renamed from: b */
    private boolean f8552b;

    /* renamed from: b */
    public abstract void mo11602b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11604d() {
        this.f8552b = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11605e() {
        this.f8552b = false;
    }

    /* renamed from: c */
    public final boolean mo11603c() {
        return this.f8552b;
    }

    public AbstractC2692a(String str) {
        super(str);
    }
}
