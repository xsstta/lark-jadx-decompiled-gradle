package com.larksuite.component.universe_design.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/universe_design/util/UDDimenUtils;", "", "()V", "dp2px", "", "context", "Landroid/content/Context;", "dp", "", "getDimension", "dimenRes", "getDimensionPixel", "px2dp", "pxValue", "px2sp", "sp2px", "sp", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.f */
public final class UDDimenUtils {

    /* renamed from: a */
    public static final UDDimenUtils f63887a = new UDDimenUtils();

    private UDDimenUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m93308a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return m93307a(context, (float) i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m93310b(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return m93309b(context, (float) i);
    }

    @JvmStatic
    /* renamed from: c */
    public static final float m93311c(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getDimension(i);
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m93313d(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getDimensionPixelSize(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m93307a(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m93309b(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) ((f / resources.getDisplayMetrics().density) + 0.5f);
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m93312c(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }
}
