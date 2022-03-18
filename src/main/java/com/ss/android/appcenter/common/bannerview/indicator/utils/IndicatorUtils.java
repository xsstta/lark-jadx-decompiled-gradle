package com.ss.android.appcenter.common.bannerview.indicator.utils;

import android.content.res.Resources;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/utils/IndicatorUtils;", "", "()V", "dp2px", "", "dpValue", "", "getCoordinateX", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "maxDiameter", "index", "getCoordinateY", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.c.a */
public final class IndicatorUtils {

    /* renamed from: a */
    public static final IndicatorUtils f70529a = new IndicatorUtils();

    /* renamed from: b */
    public final float mo100272b(float f) {
        return f / ((float) 2);
    }

    private IndicatorUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m103048a(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) ((f * system.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public final float mo100271a(IndicatorOptions bVar, float f, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
        return (f / ((float) 2)) + ((bVar.mo100247i() + bVar.mo100243g()) * ((float) i));
    }
}
