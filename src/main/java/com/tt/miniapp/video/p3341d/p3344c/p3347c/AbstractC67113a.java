package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.c.a */
public abstract class AbstractC67113a {

    /* renamed from: a */
    protected View f169181a;

    /* renamed from: b */
    protected boolean f169182b;

    /* renamed from: c */
    protected boolean f169183c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo233344a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo233347b();

    /* renamed from: c */
    public void mo233349c() {
    }

    /* renamed from: d */
    private void mo233359d() {
        int i;
        View view = this.f169181a;
        if (!this.f169182b || !this.f169183c) {
            i = 4;
        } else {
            i = 0;
        }
        C67590h.m263079a(view, i);
    }

    /* renamed from: a */
    public void mo233346a(boolean z) {
        this.f169183c = z;
        mo233359d();
    }

    /* renamed from: b */
    public void mo233348b(boolean z) {
        this.f169182b = z;
        mo233359d();
    }

    /* renamed from: a */
    public void mo233345a(Context context, ViewGroup viewGroup) {
        if (context != null && viewGroup != null) {
            LayoutInflater.from(context).inflate(mo233344a(), viewGroup, true);
            this.f169181a = viewGroup.findViewById(mo233347b());
        }
    }
}
