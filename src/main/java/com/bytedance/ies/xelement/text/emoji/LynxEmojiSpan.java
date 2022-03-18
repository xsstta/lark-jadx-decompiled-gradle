package com.bytedance.ies.xelement.text.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJR\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0006\u0010#\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ies/xelement/text/emoji/LynxEmojiSpan;", "Landroid/text/style/ImageSpan;", "arg0", "Landroid/content/Context;", "arg1", "", "(Landroid/content/Context;I)V", "drawable", "Landroid/graphics/drawable/Drawable;", "length", "text", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/CharSequence;)V", "hasDrawn", "", "mLength", "Ljava/lang/Integer;", "mText", "translateX", "draw", "", "canvas", "Landroid/graphics/Canvas;", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "getText", "setTranslateX", "x-element-emoji_newelement"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xelement.text.emoji.d */
public final class LynxEmojiSpan extends ImageSpan {

    /* renamed from: a */
    private int f38517a;

    /* renamed from: b */
    private Integer f38518b;

    /* renamed from: c */
    private CharSequence f38519c;

    /* renamed from: d */
    private boolean f38520d;

    /* renamed from: a */
    public final CharSequence mo53620a() {
        CharSequence charSequence = this.f38519c;
        if (charSequence == null) {
            return "";
        }
        if (charSequence != null) {
            return charSequence;
        }
        Intrinsics.throwNpe();
        return charSequence;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxEmojiSpan(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f38518b = num;
        this.f38519c = charSequence;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Integer num = this.f38518b;
        if (num != null) {
            int i3 = i2 - i;
            if ((num == null || num.intValue() != i3) && this.f38520d) {
                return 0;
            }
        }
        Drawable drawable = getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i4 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i5 = (bounds.bottom - bounds.top) / 2;
            int i6 = i4 / 4;
            int i7 = i5 - i6;
            int i8 = -(i5 + i6);
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            fontMetricsInt.bottom = i7;
            fontMetricsInt.descent = i7;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Integer num = this.f38518b;
        if (num != null) {
            int i6 = i2 - i;
            if ((num == null || num.intValue() != i6) && this.f38520d) {
                this.f38520d = false;
                return;
            }
        }
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Intrinsics.checkExpressionValueIsNotNull(drawable, C63954b.f161494a);
        int i7 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f + ((float) this.f38517a), (float) i7);
        drawable.draw(canvas);
        canvas.restore();
        Integer num2 = this.f38518b;
        if (num2 != null) {
            int i8 = i2 - i;
            if (num2 == null || num2.intValue() != i8) {
                this.f38520d = true;
            }
        }
    }
}
