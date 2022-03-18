package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* renamed from: com.google.android.material.transition.platform.h */
public final class C22555h extends PathMotion {
    /* renamed from: a */
    private static PointF m81851a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF a = m81851a(f, f2, f3, f4);
        path.quadTo(a.x, a.y, f3, f4);
        return path;
    }
}
