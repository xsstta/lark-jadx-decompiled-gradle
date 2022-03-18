package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import android.graphics.Canvas;
import com.ss.android.appcenter.common.bannerview.indicator.drawer.BaseDrawer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH&J\u001c\u0010\u000e\u001a\u00060\u000fR\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/IDrawer;", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "left", "", "top", "right", "bottom", "onMeasure", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer$MeasureResult;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;", "widthMeasureSpec", "heightMeasureSpec", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.f */
public interface IDrawer {
    /* renamed from: a */
    BaseDrawer.MeasureResult mo100207a(int i, int i2);

    /* renamed from: a */
    void mo100217a(Canvas canvas);
}
