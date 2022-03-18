package com.ss.android.appcenter.business.tab.business.view.itemmenu.hollow;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.larksuite.component.ignition.widget.squircle.C24333a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/hollow/SquircleShape;", "Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/hollow/Shape;", "radius", "", "(I)V", "path", "Landroid/graphics/Path;", "drawShape", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "info", "Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/hollow/HollowInfo;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.b.f */
public final class SquircleShape implements AbstractC27920e {

    /* renamed from: a */
    private final Path f69813a = new Path();

    /* renamed from: b */
    private final int f69814b;

    public SquircleShape(int i) {
        this.f69814b = i;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.AbstractC27920e
    /* renamed from: a */
    public void mo99527a(Canvas canvas, Paint paint, C27917b bVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Intrinsics.checkParameterIsNotNull(bVar, "info");
        this.f69813a.rewind();
        Path path = this.f69813a;
        Rect rect = bVar.f69801b;
        Intrinsics.checkExpressionValueIsNotNull(rect, "info.targetBound");
        C24333a.m88828a(path, rect, this.f69814b);
        canvas.drawPath(this.f69813a, paint);
    }
}
