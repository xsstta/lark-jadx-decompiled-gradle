package com.larksuite.component.universe_design.button;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007JP\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J2\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006 "}, d2 = {"Lcom/larksuite/component/universe_design/button/DrawableSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "paddingStart", "", "paddingEnd", "(Landroid/graphics/drawable/Drawable;II)V", "getPaddingEnd", "()I", "setPaddingEnd", "(I)V", "getPaddingStart", "setPaddingStart", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.button.b */
public final class DrawableSpan extends ImageSpan {

    /* renamed from: a */
    private int f63103a;

    /* renamed from: b */
    private int f63104b;

    /* renamed from: a */
    public final void mo90328a(int i) {
        this.f63103a = i;
    }

    /* renamed from: b */
    public final void mo90329b(int i) {
        this.f63104b = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawableSpan(Drawable drawable, int i, int i2) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f63103a = i;
        this.f63104b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrawableSpan(Drawable drawable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Drawable drawable = getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        Rect bounds = drawable.getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int max = Math.max(i3, bounds.bottom - bounds.top);
            int i4 = fontMetricsInt2.top + (i3 / 2);
            int i5 = max / 2;
            fontMetricsInt.ascent = i4 - i5;
            fontMetricsInt.descent = i4 + i5;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
        return bounds.width() + this.f63103a + this.f63104b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        int height = ((i4 + fontMetricsInt.descent) - ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2)) - (drawable.getBounds().height() / 2);
        int i6 = this.f63103a;
        if (i6 != 0) {
            canvas.translate(f + ((float) i6), (float) height);
        } else {
            canvas.translate(f, (float) height);
        }
        drawable.draw(canvas);
        canvas.restore();
    }
}
