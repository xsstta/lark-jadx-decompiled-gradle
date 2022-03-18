package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JR\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J4\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AlignCenterImageSpan;", "Landroid/text/style/ImageSpan;", "context", "Landroid/content/Context;", "iconId", "", "(Landroid/content/Context;I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.a */
public final class AlignCenterImageSpan extends ImageSpan {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignCenterImageSpan(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Drawable drawable = getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        Rect bounds = drawable.getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.ascent + ((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2);
            int i4 = (bounds.bottom - bounds.top) / 2;
            fontMetricsInt.ascent = i3 - i4;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = i3 + i4;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Drawable drawable = getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f, (float) (((i4 + fontMetricsInt.descent) - ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
