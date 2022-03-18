package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import android.graphics.Canvas;
import com.ss.android.appcenter.common.bannerview.indicator.drawer.BaseDrawer;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J0\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0014R\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/DrawerProxy;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/IDrawer;", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "mIDrawer", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "left", "", "top", "right", "bottom", "onMeasure", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer$MeasureResult;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;", "widthMeasureSpec", "heightMeasureSpec", "setIndicatorOptions", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.e */
public final class DrawerProxy implements IDrawer {

    /* renamed from: a */
    private IDrawer f70510a;

    /* renamed from: a */
    public void mo100221a(boolean z, int i, int i2, int i3, int i4) {
    }

    public DrawerProxy(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
        m102996b(bVar);
    }

    /* renamed from: b */
    private final void m102996b(IndicatorOptions bVar) {
        this.f70510a = DrawerFactory.f70509a.mo100219a(bVar);
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.IDrawer
    /* renamed from: a */
    public void mo100217a(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        IDrawer fVar = this.f70510a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIDrawer");
        }
        fVar.mo100217a(canvas);
    }

    /* renamed from: a */
    public final void mo100220a(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
        m102996b(bVar);
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.IDrawer
    /* renamed from: a */
    public BaseDrawer.MeasureResult mo100207a(int i, int i2) {
        IDrawer fVar = this.f70510a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIDrawer");
        }
        return fVar.mo100207a(i, i2);
    }
}
