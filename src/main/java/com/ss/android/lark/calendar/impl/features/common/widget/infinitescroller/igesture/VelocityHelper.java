package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/VelocityHelper;", "", "()V", "INFLEXION", "", "MILLISECONDS_PER_INCH", "SCROLL_FRICTION", "calculateDistanceByVelocity", "", "", "context", "Landroid/content/Context;", "velocityX", "velocityY", "(Landroid/content/Context;FF)[Ljava/lang/Integer;", "calculateTimeForDeceleration", "dx", "calculateXDistanceByVelocity", "calculateYDistanceByVelocity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.e */
public final class VelocityHelper {

    /* renamed from: a */
    public static final VelocityHelper f79013a = new VelocityHelper();

    private VelocityHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m116741a(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return m116743a(context, f, BitmapDescriptorFactory.HUE_RED)[0].intValue();
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m116744b(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return m116743a(context, BitmapDescriptorFactory.HUE_RED, f)[1].intValue();
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m116742a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) Math.ceil(((double) ((int) Math.ceil((double) (((float) Math.abs(i)) * (60.0f / ((float) resources.getDisplayMetrics().densityDpi)))))) / 0.6d);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Integer[] m116743a(Context context, float f, float f2) {
        float f3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        float hypot = (float) Math.hypot((double) f, (double) f2);
        float f4 = 1.0f;
        int i = (hypot > BitmapDescriptorFactory.HUE_RED ? 1 : (hypot == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i == 0) {
            f3 = 1.0f;
        } else {
            f3 = f / hypot;
        }
        if (i != 0) {
            f4 = f2 / hypot;
        }
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        float f5 = resources.getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        double log = (double) ((float) (Math.log(0.78d) / Math.log(0.9d)));
        double exp = ((double) 0.015f) * ((double) f5) * Math.exp((log / (log - 1.0d)) * Math.log((double) ((Math.abs(hypot) * 0.35f) / (f5 * 0.015f))));
        return new Integer[]{Integer.valueOf((int) Math.rint(((double) f3) * exp)), Integer.valueOf((int) Math.rint(exp * ((double) f4)))};
    }
}
