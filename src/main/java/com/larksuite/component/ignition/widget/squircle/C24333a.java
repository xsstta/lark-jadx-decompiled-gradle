package com.larksuite.component.ignition.widget.squircle;

import android.graphics.Path;
import android.graphics.Rect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"addSquirclePath", "", "Landroid/graphics/Path;", "bounds", "Landroid/graphics/Rect;", "radius", "", "ignition-widget-squircle_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.squircle.a */
public final class C24333a {
    /* renamed from: a */
    public static final void m88828a(Path path, Rect rect, int i) {
        Intrinsics.checkParameterIsNotNull(path, "$this$addSquirclePath");
        Intrinsics.checkParameterIsNotNull(rect, "bounds");
        float f = (float) i;
        float f2 = f * 0.29289323f;
        float f3 = f2 * ((float) 2);
        float f4 = f * 1.057191f;
        float f5 = f * 2.0f;
        float width = (float) rect.width();
        float height = (float) rect.height();
        path.offset(-((float) rect.left), -((float) rect.top));
        path.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
        path.cubicTo(BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, f3, f2, f2);
        path.cubicTo(f3, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED);
        float f6 = width - f5;
        path.lineTo(f6, BitmapDescriptorFactory.HUE_RED);
        float f7 = width - f4;
        float f8 = width - f3;
        float f9 = width - f2;
        path.cubicTo(f7, BitmapDescriptorFactory.HUE_RED, f8, BitmapDescriptorFactory.HUE_RED, f9, f2);
        path.cubicTo(width, f3, width, f4, width, f5);
        float f10 = height - f5;
        path.lineTo(width, f10);
        float f11 = height - f4;
        float f12 = height - f3;
        float f13 = height - f2;
        path.cubicTo(width, f11, width, f12, f9, f13);
        path.cubicTo(f8, height, f7, height, f6, height);
        path.lineTo(f5, height);
        path.cubicTo(f4, height, f3, height, f2, f13);
        path.cubicTo(BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f10);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, f5);
        path.close();
        path.offset((float) rect.left, (float) rect.top);
    }
}
