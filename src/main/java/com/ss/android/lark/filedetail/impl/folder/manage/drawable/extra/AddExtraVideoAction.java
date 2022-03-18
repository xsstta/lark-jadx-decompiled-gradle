package com.ss.android.lark.filedetail.impl.folder.manage.drawable.extra;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.ExtraVideoProperty;
import com.ss.android.lark.widget.span.C59153c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J@\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/extra/AddExtraVideoAction;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/extra/IAddExtraVideoAction;", "()V", "drawPlayIcon", "", "canvas", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "viewRectF", "Landroid/graphics/RectF;", "videoParams", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/ExtraVideoProperty;", "playRect", "Landroid/graphics/Rect;", "drawVideoBg", "borderParams", "Lcom/ss/android/lark/widget/span/BorderProperty;", "videoBgRectF", "videoBgPaint", "Landroid/graphics/Paint;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.drawable.a.a */
public final class AddExtraVideoAction implements IAddExtraVideoAction {
    @Override // com.ss.android.lark.filedetail.impl.folder.manage.drawable.extra.IAddExtraVideoAction
    /* renamed from: a */
    public void mo139938a(Canvas canvas, Path path, RectF rectF, ExtraVideoProperty extraVideoProperty, Rect rect) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(path, "path");
        Intrinsics.checkParameterIsNotNull(rectF, "viewRectF");
        Intrinsics.checkParameterIsNotNull(extraVideoProperty, "videoParams");
        Intrinsics.checkParameterIsNotNull(rect, "playRect");
        if (extraVideoProperty.mo139944e() == 1) {
            float g = rectF.right - extraVideoProperty.mo139946g();
            float g2 = rectF.bottom - extraVideoProperty.mo139946g();
            rect.set((int) (g - extraVideoProperty.mo139945f()), (int) (g2 - extraVideoProperty.mo139945f()), (int) g, (int) g2);
        } else {
            float f = (float) 2;
            int width = (int) (rectF.width() / f);
            int height = (int) (rectF.height() / f);
            int f2 = (int) (extraVideoProperty.mo139945f() / f);
            rect.set(width - f2, height - f2, width + f2, height + f2);
        }
        extraVideoProperty.mo139947h().setBounds(rect);
        extraVideoProperty.mo139947h().draw(canvas);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.drawable.extra.IAddExtraVideoAction
    /* renamed from: a */
    public void mo139939a(Canvas canvas, Path path, RectF rectF, C59153c cVar, ExtraVideoProperty extraVideoProperty, RectF rectF2, Paint paint) {
        LinearGradient linearGradient;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(path, "path");
        Intrinsics.checkParameterIsNotNull(rectF, "viewRectF");
        Intrinsics.checkParameterIsNotNull(cVar, "borderParams");
        Intrinsics.checkParameterIsNotNull(extraVideoProperty, "videoParams");
        Intrinsics.checkParameterIsNotNull(rectF2, "videoBgRectF");
        Intrinsics.checkParameterIsNotNull(paint, "videoBgPaint");
        if (extraVideoProperty.mo139940a() != BitmapDescriptorFactory.HUE_RED) {
            rectF2.set(rectF.left, rectF.bottom - extraVideoProperty.mo139940a(), rectF.right, rectF.bottom);
            if (extraVideoProperty.mo139941b() == 1) {
                linearGradient = new LinearGradient(rectF2.left, rectF2.top, rectF2.left, rectF2.bottom, extraVideoProperty.mo139942c(), extraVideoProperty.mo139943d(), Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF.top, extraVideoProperty.mo139942c(), extraVideoProperty.mo139943d(), Shader.TileMode.CLAMP);
            }
            paint.setShader(linearGradient);
            path.reset();
            path.addRoundRect(rectF2, (float) cVar.mo201082c(), (float) cVar.mo201082c(), Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }
}
