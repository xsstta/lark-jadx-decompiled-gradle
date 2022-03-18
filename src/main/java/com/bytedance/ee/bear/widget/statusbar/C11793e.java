package com.bytedance.ee.bear.widget.statusbar;

import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.bytedance.ee.bear.widget.statusbar.e */
class C11793e {
    /* renamed from: a */
    private static int m48874a(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: a */
    private static int m48873a(int i, int i2) {
        return m48874a(i, i2, i2);
    }

    /* renamed from: b */
    private static int m48876b(int i, int i2) {
        return m48874a(i, 0, i2);
    }

    /* renamed from: c */
    static void m48878c(Window window, int i) {
        if (window != null && window.getStatusBarColor() != i) {
            window.setStatusBarColor(i);
        }
    }

    /* renamed from: a */
    static void m48875a(Window window, int i) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (m48876b(attributes.flags, i) != attributes.flags) {
                window.clearFlags(i);
            }
        }
    }

    /* renamed from: b */
    static void m48877b(Window window, int i) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (m48873a(attributes.flags, i) != attributes.flags) {
                window.addFlags(i);
            }
        }
    }
}
