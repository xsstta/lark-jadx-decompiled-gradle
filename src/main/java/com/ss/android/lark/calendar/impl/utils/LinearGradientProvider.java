package com.ss.android.lark.calendar.impl.utils;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/LinearGradientProvider;", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "Landroid/graphics/Shader;", "Lcom/ss/android/lark/calendar/impl/utils/ShaderProvider;", "colors", "", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "positions", "", "model", "Landroid/graphics/Shader$TileMode;", "([ILandroid/graphics/drawable/GradientDrawable$Orientation;[FLandroid/graphics/Shader$TileMode;)V", "invoke", "r", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.w */
public final class LinearGradientProvider implements Function1<Rect, Shader> {

    /* renamed from: a */
    private final int[] f83816a;

    /* renamed from: b */
    private final GradientDrawable.Orientation f83817b;

    /* renamed from: c */
    private final float[] f83818c;

    /* renamed from: d */
    private final Shader.TileMode f83819d;

    /* renamed from: a */
    public Shader invoke(Rect rect) {
        RectF rectF;
        Intrinsics.checkParameterIsNotNull(rect, "r");
        switch (C32672x.f83820a[this.f83817b.ordinal()]) {
            case 1:
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, (float) rect.top, BitmapDescriptorFactory.HUE_RED, (float) rect.bottom);
                break;
            case 2:
                rectF = new RectF((float) rect.right, (float) rect.top, (float) rect.left, (float) rect.bottom);
                break;
            case 3:
                rectF = new RectF((float) rect.right, BitmapDescriptorFactory.HUE_RED, (float) rect.left, BitmapDescriptorFactory.HUE_RED);
                break;
            case 4:
                rectF = new RectF((float) rect.right, (float) rect.bottom, (float) rect.left, (float) rect.top);
                break;
            case 5:
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, (float) rect.bottom, BitmapDescriptorFactory.HUE_RED, (float) rect.top);
                break;
            case 6:
                rectF = new RectF((float) rect.left, (float) rect.bottom, (float) rect.right, (float) rect.top);
                break;
            case 7:
                rectF = new RectF((float) rect.left, BitmapDescriptorFactory.HUE_RED, (float) rect.right, BitmapDescriptorFactory.HUE_RED);
                break;
            case 8:
                rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f83816a, this.f83818c, this.f83819d);
    }

    public LinearGradientProvider(int[] iArr, GradientDrawable.Orientation orientation, float[] fArr, Shader.TileMode tileMode) {
        Intrinsics.checkParameterIsNotNull(iArr, "colors");
        Intrinsics.checkParameterIsNotNull(orientation, "orientation");
        Intrinsics.checkParameterIsNotNull(tileMode, "model");
        this.f83816a = iArr;
        this.f83817b = orientation;
        this.f83818c = fArr;
        this.f83819d = tileMode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinearGradientProvider(int[] iArr, GradientDrawable.Orientation orientation, float[] fArr, Shader.TileMode tileMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, (i & 2) != 0 ? GradientDrawable.Orientation.TOP_BOTTOM : orientation, (i & 4) != 0 ? null : fArr, (i & 8) != 0 ? Shader.TileMode.CLAMP : tileMode);
    }
}
