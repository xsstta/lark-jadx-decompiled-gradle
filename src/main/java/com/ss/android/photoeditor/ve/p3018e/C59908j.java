package com.ss.android.photoeditor.ve.p3018e;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"rotatePoint", "Landroid/graphics/PointF;", "p", "centerX", "", "centerY", "angle", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.j */
public final class C59908j {
    /* renamed from: a */
    public static final PointF m232491a(PointF pointF, float f, float f2, float f3) {
        Intrinsics.checkParameterIsNotNull(pointF, "p");
        double d = (double) f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        return new PointF((((pointF.x - f) * cos) + f) - ((pointF.y - f2) * sin), f2 + ((pointF.y - f2) * cos) + ((pointF.x - f) * sin));
    }
}
