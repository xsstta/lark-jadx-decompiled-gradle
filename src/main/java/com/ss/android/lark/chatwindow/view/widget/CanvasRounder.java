package com.ss.android.lark.chatwindow.view.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0011J\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/widget/CanvasRounder;", "", "cornerRadius", "", "(F)V", "value", "setCornerRadius", "path", "Landroid/graphics/Path;", "rectF", "Landroid/graphics/RectF;", "resetPath", "", "round", "canvas", "Landroid/graphics/Canvas;", "drawFunction", "Lkotlin/Function1;", "updateSize", "currentWidth", "", "currentHeight", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.widget.a */
final class CanvasRounder {

    /* renamed from: a */
    private final Path f91337a = new Path();

    /* renamed from: b */
    private RectF f91338b = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: c */
    private float f91339c;

    /* renamed from: a */
    private final void m138053a() {
        this.f91337a.reset();
        Path path = this.f91337a;
        RectF rectF = this.f91338b;
        float f = this.f91339c;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.f91337a.close();
    }

    public CanvasRounder(float f) {
        this.f91339c = f;
    }

    /* renamed from: a */
    public final void mo130041a(int i, int i2) {
        this.f91338b = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        m138053a();
    }

    /* renamed from: a */
    public final void mo130042a(Canvas canvas, Function1<? super Canvas, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(function1, "drawFunction");
        int save = canvas.save();
        canvas.clipPath(this.f91337a);
        function1.invoke(canvas);
        canvas.restoreToCount(save);
    }
}
