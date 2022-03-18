package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.PathMotion;

/* renamed from: com.google.android.material.transition.h */
public final class C22526h extends PathMotion {
    /* renamed from: b */
    private static PointF m81762b(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo7802a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF b = m81762b(f, f2, f3, f4);
        path.quadTo(b.x, b.y, f3, f4);
        return path;
    }
}
