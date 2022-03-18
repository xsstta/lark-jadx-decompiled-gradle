package com.ss.android.lark.calendar.impl.features.common.widget.infinitepager;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.a */
public class C31217a {

    /* renamed from: a */
    private FrameLayout f78948a;

    /* renamed from: b */
    private View f78949b;

    /* renamed from: a */
    public View mo113211a() {
        return this.f78948a;
    }

    /* renamed from: b */
    public View mo113213b() {
        return this.f78949b;
    }

    /* renamed from: c */
    public void mo113214c() {
        this.f78948a.removeAllViews();
    }

    /* renamed from: a */
    public void mo113212a(View view) {
        this.f78949b = view;
        this.f78948a.addView(view);
    }

    public C31217a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f78948a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
