package com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview;

import android.os.Build;
import android.view.View;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.a */
class C7367a {
    /* renamed from: b */
    private static void m29414b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m29413a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            m29414b(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
