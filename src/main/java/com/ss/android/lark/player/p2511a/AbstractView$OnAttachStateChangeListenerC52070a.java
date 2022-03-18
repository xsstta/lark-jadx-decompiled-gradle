package com.ss.android.lark.player.p2511a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.ss.android.lark.player.a.a */
public abstract class AbstractView$OnAttachStateChangeListenerC52070a extends AbstractC52071b implements View.OnAttachStateChangeListener, AbstractC52084f {

    /* renamed from: a */
    private View f129222a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo127009a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo127043b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo178432h() {
    }

    /* renamed from: i */
    public int mo178433i() {
        return 0;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52084f
    /* renamed from: g */
    public final View mo178431g() {
        return this.f129222a;
    }

    /* renamed from: e */
    public final void mo178429e() {
        mo178440d(-66015, null);
    }

    /* renamed from: f */
    public final void mo178430f() {
        mo178440d(-66016, null);
    }

    public final void onViewAttachedToWindow(View view) {
        mo127043b();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo178432h();
    }

    /* renamed from: a */
    public final void mo178424a(Bundle bundle) {
        mo178440d(-66001, bundle);
    }

    /* renamed from: b */
    public final void mo178425b(int i) {
        this.f129222a.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo178427c(Bundle bundle) {
        mo178440d(-66005, bundle);
    }

    /* renamed from: d */
    public final void mo178428d(Bundle bundle) {
        mo178440d(-66007, bundle);
    }

    public AbstractView$OnAttachStateChangeListenerC52070a(Context context) {
        super(context);
        View a = mo127009a(context);
        this.f129222a = a;
        a.addOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void mo178426b(Bundle bundle) {
        mo178440d(-66003, bundle);
    }
}
