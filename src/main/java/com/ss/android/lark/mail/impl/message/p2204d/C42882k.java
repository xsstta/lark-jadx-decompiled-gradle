package com.ss.android.lark.mail.impl.message.p2204d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mail.impl.message.d.k */
public class C42882k extends ReplacementSpan {

    /* renamed from: a */
    private int f109211a;

    /* renamed from: b */
    private int f109212b;

    /* renamed from: c */
    private int f109213c;

    /* renamed from: d */
    private int f109214d;

    /* renamed from: e */
    private int f109215e;

    /* renamed from: f */
    private int f109216f;

    public C42882k(int i, int i2, int i3, int i4, int i5) {
        this.f109213c = i;
        this.f109212b = i2;
        this.f109214d = i3;
        this.f109215e = i4;
        this.f109216f = i5;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f109211a = (int) (paint.measureText(charSequence, i, i2) + ((float) (this.f109214d * 2)));
        if (fontMetricsInt != null) {
            Log.m165389i("RadiusBgSPpan", ((Object) charSequence) + " RadiusBgSPpan fontMetricsInt.ascent:" + fontMetricsInt.ascent + "  fontMetricsInt.top:" + fontMetricsInt.top + " fontMetricsInt.descent:" + fontMetricsInt.descent + "  fontMetricsInt.bottom:" + fontMetricsInt.bottom);
        }
        return this.f109211a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getColor();
        paint.setColor(this.f109212b);
        paint.setAntiAlias(true);
        paint.setTextSize((float) this.f109215e);
        Log.m165389i("RadiusBgSPpan", ((Object) charSequence) + " RadiusBgSPpan paint.ascent():" + paint.ascent() + "  paint.descent():" + paint.descent() + " y:" + i4);
        float f2 = ((float) ((i5 - i3) - this.f109216f)) / 2.0f;
        RectF rectF = new RectF(f, ((float) i3) + f2, ((float) this.f109211a) + f, ((float) i5) - f2);
        int i6 = this.f109214d;
        canvas.drawRoundRect(rectF, (float) i6, (float) i6, paint);
        paint.setColor(this.f109213c);
        canvas.drawText(charSequence, i, i2, f + ((float) this.f109214d), ((float) i4) - ((((((float) (i4 * 2)) + paint.descent()) + paint.ascent()) - ((float) (i5 + i3))) / 2.0f), paint);
    }
}
