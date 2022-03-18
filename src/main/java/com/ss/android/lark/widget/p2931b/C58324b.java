package com.ss.android.lark.widget.p2931b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.lark.widget.b.b */
public class C58324b extends ReplacementSpan {

    /* renamed from: a */
    protected Paint f143498a = new Paint();

    /* renamed from: b */
    protected Drawable f143499b;

    /* renamed from: c */
    private float f143500c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Rect mo197531a() {
        return this.f143499b.getBounds();
    }

    public C58324b(Drawable drawable) {
        this.f143499b = drawable;
    }

    /* renamed from: a */
    private void m226146a(Paint.FontMetricsInt fontMetricsInt, Paint paint) {
        this.f143498a.set(paint);
        if (fontMetricsInt != null) {
            this.f143498a.getFontMetricsInt(fontMetricsInt);
            Rect a = mo197531a();
            int i = fontMetricsInt.descent - fontMetricsInt.ascent;
            int i2 = ((int) this.f143500c) / 2;
            fontMetricsInt.ascent = Math.min(fontMetricsInt.top, fontMetricsInt.top + ((i - a.bottom) / 2)) - i2;
            fontMetricsInt.descent = Math.max(fontMetricsInt.bottom, fontMetricsInt.bottom + ((a.bottom - i) / 2)) + i2;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m226146a(fontMetricsInt, paint);
        return mo197531a().right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) (((i5 - this.f143499b.getBounds().bottom) + i3) / 2));
        this.f143499b.draw(canvas);
        canvas.restore();
    }
}
