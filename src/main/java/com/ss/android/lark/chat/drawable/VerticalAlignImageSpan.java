package com.ss.android.lark.chat.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/drawable/VerticalAlignImageSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.b.c */
public final class VerticalAlignImageSpan extends ImageSpan {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalAlignImageSpan(Drawable drawable) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Drawable drawable = getDrawable();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = (float) i4;
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        canvas.save();
        canvas.translate(f, (float) ((int) (((((fontMetrics.ascent + f2) + f2) + fontMetrics.descent) / 2.0f) - ((float) ((drawable.getBounds().bottom + drawable.getBounds().top) / 2)))));
        drawable.draw(canvas);
        canvas.restore();
    }
}
