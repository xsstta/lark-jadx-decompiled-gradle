package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BetterImageSpan extends ReplacementSpan {

    /* renamed from: a */
    private int f51807a;

    /* renamed from: b */
    private int f51808b;

    /* renamed from: c */
    private Rect f51809c;

    /* renamed from: d */
    private final int f51810d;

    /* renamed from: e */
    private final Paint.FontMetricsInt f51811e;

    /* renamed from: f */
    private final Drawable f51812f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetterImageSpanAlignment {
    }

    /* renamed from: a */
    public void mo72179a() {
        Rect bounds = this.f51812f.getBounds();
        this.f51809c = bounds;
        this.f51807a = bounds.width();
        this.f51808b = this.f51809c.height();
    }

    /* renamed from: a */
    private int m77092a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f51810d;
        if (i == 0) {
            return fontMetricsInt.descent - this.f51808b;
        }
        if (i != 2) {
            return -this.f51808b;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f51808b) / 2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        mo72179a();
        if (fontMetricsInt == null) {
            return this.f51807a;
        }
        int a = m77092a(fontMetricsInt);
        int i3 = this.f51808b + a;
        if (a < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = a;
        }
        if (a < fontMetricsInt.top) {
            fontMetricsInt.top = a;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.f51807a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.f51811e);
        int a = i4 + m77092a(this.f51811e);
        canvas.translate(f, (float) a);
        this.f51812f.draw(canvas);
        canvas.translate(-f, (float) (-a));
    }
}
