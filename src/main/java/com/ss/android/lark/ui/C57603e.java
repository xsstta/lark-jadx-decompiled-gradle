package com.ss.android.lark.ui;

import android.content.Context;

/* renamed from: com.ss.android.lark.ui.e */
public class C57603e {

    /* renamed from: a */
    private Context f141972a;

    /* renamed from: b */
    private CommonLoadingView f141973b;

    /* renamed from: c */
    private void m223647c() {
        if (this.f141973b == null) {
            this.f141973b = new CommonLoadingView(this.f141972a);
        }
    }

    /* renamed from: a */
    public void mo195582a() {
        m223647c();
        this.f141973b.mo195419a();
    }

    /* renamed from: b */
    public void mo195584b() {
        CommonLoadingView commonLoadingView = this.f141973b;
        if (commonLoadingView != null) {
            commonLoadingView.mo195422b();
            this.f141973b = null;
        }
    }

    public C57603e(Context context) {
        this.f141972a = context;
        if (context == null) {
            throw new IllegalArgumentException("context should not be null");
        }
    }

    /* renamed from: a */
    public void mo195583a(boolean z, String str) {
        m223647c();
        this.f141973b.mo195421a(z, str);
    }
}
