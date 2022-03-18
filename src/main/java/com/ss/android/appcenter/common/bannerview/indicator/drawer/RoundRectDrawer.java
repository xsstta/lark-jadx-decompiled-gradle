package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import android.graphics.Canvas;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/RoundRectDrawer;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/RectDrawer;", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "drawRoundRect", "", "canvas", "Landroid/graphics/Canvas;", "rx", "", "ry", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.h */
public final class RoundRectDrawer extends RectDrawer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundRectDrawer(IndicatorOptions bVar) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.RectDrawer
    /* renamed from: a */
    public void mo100222a(Canvas canvas, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        canvas.drawRoundRect(mo100223h(), f, f2, mo100209c());
    }
}
