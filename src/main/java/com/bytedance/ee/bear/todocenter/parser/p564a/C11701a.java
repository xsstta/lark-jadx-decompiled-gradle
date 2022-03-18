package com.bytedance.ee.bear.todocenter.parser.p564a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;

/* renamed from: com.bytedance.ee.bear.todocenter.parser.a.a */
public class C11701a extends ImageSpan {

    /* renamed from: a */
    private final int f31487a;

    /* renamed from: a */
    private static Drawable m48534a(Context context, int i, int i2, int i3) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, i2, i2);
        C0774a.m3766a(mutate, i3);
        return mutate;
    }

    public C11701a(Context context, int i, int i2, int i3, int i4) {
        super(m48534a(context, i, i2, i4), 1);
        this.f31487a = i3;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.f31487a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = (((float) (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent)) / 2.0f) - (((float) drawable.getBounds().bottom) / 2.0f);
        canvas.save();
        canvas.translate(f + (((float) this.f31487a) / 2.0f), f2);
        drawable.draw(canvas);
        canvas.restore();
    }
}
