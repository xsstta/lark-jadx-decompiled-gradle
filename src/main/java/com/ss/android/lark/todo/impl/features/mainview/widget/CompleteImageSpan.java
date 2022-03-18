package com.ss.android.lark.todo.impl.features.mainview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JR\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/CompleteImageSpan;", "Landroid/text/style/ImageSpan;", "context", "Landroid/content/Context;", "drawableRes", "", "(Landroid/content/Context;I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.a */
public final class CompleteImageSpan extends ImageSpan {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompleteImageSpan(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Intrinsics.checkExpressionValueIsNotNull(fontMetricsInt, "paint.fontMetricsInt");
        Drawable drawable = getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        canvas.save();
        canvas.translate(f + ((float) 2), (float) ((((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)) + 2));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
