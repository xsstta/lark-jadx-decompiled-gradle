package com.google.android.material.p981b;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: com.google.android.material.b.a */
public class C22141a {
    /* renamed from: a */
    public static int m79796a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
