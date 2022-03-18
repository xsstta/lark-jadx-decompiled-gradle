package com.bytedance.ee.bear.widget.statusbar;

import android.view.View;
import android.view.Window;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.widget.statusbar.h */
class C11796h implements AbstractC11781a {
    C11796h() {
    }

    @Override // com.bytedance.ee.bear.widget.statusbar.AbstractC11781a
    /* renamed from: a */
    public void mo45058a(Window window, int i) {
        C11793e.m48875a(window, 67108864);
        C11793e.m48877b(window, Integer.MIN_VALUE);
        C11793e.m48878c(window, i);
        try {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null && findViewById.getForeground() != null) {
                findViewById.setForeground(null);
            }
        } catch (Throwable th) {
            C13479a.m54761a("StatusBarMImpl", th);
        }
    }
}
