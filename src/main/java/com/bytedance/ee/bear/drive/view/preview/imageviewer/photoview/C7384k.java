package com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview;

import android.widget.ImageView;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.k */
class C7384k {
    /* renamed from: a */
    static int m29474a(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: a */
    static boolean m29475a(ImageView imageView) {
        if (imageView.getDrawable() != null) {
            return true;
        }
        return false;
    }
}
