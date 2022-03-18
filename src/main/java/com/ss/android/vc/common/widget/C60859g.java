package com.ss.android.vc.common.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.vc.common.widget.g */
public class C60859g extends ReplacementSpan {

    /* renamed from: a */
    private int f152356a;

    /* renamed from: b */
    private final int f152357b;

    /* renamed from: c */
    private final int f152358c;

    /* renamed from: d */
    private int f152359d = 8;

    /* renamed from: e */
    private RectF f152360e = new RectF();

    /* renamed from: f */
    private TextPaint f152361f;

    /* renamed from: g */
    private Paint f152362g;

    /* renamed from: a */
    private float m236555a(CharSequence charSequence, int i, int i2) {
        return this.f152361f.measureText(charSequence, i, i2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round(m236555a(charSequence, i, i2)) + (this.f152357b * 2);
    }

    public C60859g(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f152356a = i2;
        this.f152357b = i5;
        this.f152358c = i6;
        this.f152359d = i7;
        TextPaint textPaint = new TextPaint(1);
        this.f152361f = textPaint;
        textPaint.setTextSize((float) i4);
        this.f152361f.setColor(i3);
        this.f152361f.setFakeBoldText(true);
        Paint paint = new Paint(1);
        this.f152362g = paint;
        paint.setColor(i);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i4) + fontMetrics.ascent + (((fontMetrics.descent - fontMetrics.ascent) - ((float) this.f152356a)) / 2.0f);
        this.f152360e.set(f, f2, m236555a(charSequence, i, i2) + f + ((float) (this.f152357b * 2)), ((float) this.f152356a) + f2);
        RectF rectF = this.f152360e;
        int i6 = this.f152359d;
        canvas.drawRoundRect(rectF, (float) i6, (float) i6, this.f152362g);
        canvas.drawText(charSequence, i, i2, f + ((float) this.f152357b), (f2 + ((float) this.f152358c)) - this.f152361f.ascent(), this.f152361f);
    }
}
