package com.bytedance.ee.bear.widget.statusbar;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

/* renamed from: com.bytedance.ee.bear.widget.statusbar.f */
class C11794f implements AbstractC11781a {
    C11794f() {
    }

    @Override // com.bytedance.ee.bear.widget.statusbar.AbstractC11781a
    /* renamed from: a */
    public void mo45058a(Window window, int i) {
        C11793e.m48877b(window, 67108864);
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        View findViewWithTag = viewGroup.findViewWithTag("ghStatusBarView");
        if (findViewWithTag == null) {
            findViewWithTag = new StatusBarView(window.getContext());
            findViewWithTag.setTag("ghStatusBarView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            viewGroup.addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(i);
        C11789c.m48868a(window, true);
    }
}
