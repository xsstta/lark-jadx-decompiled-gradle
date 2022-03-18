package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.lynx.tasm.behavior.shadow.text.a */
public class C26714a extends ReplacementSpan {

    /* renamed from: a */
    int f66132a;

    /* renamed from: b */
    private final int f66133b;

    public C26714a(int i) {
        this.f66133b = i;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt();
        int round = Math.round(paint.measureText(charSequence, i, i2));
        this.f66132a = round;
        return round;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i7 = this.f66133b;
        if (i7 == 0) {
            i6 = -Math.round(fontMetrics.top);
        } else if (i7 == 2) {
            i6 = i5 - Math.round(fontMetrics.leading);
        } else if (i7 == 1) {
            int round = (int) (((float) (Math.round(Math.abs(fontMetrics.ascent)) + i3)) + ((((float) (i5 - i3)) - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f));
            if (fontMetrics.leading == BitmapDescriptorFactory.HUE_RED) {
                i6 = (int) (((float) round) + ((fontMetrics.descent / 2.0f) - paint.getStrokeMiter()));
            } else {
                i6 = round;
            }
        } else {
            i6 = i4;
        }
        canvas.drawText(charSequence, i, i2, f, (float) i6, paint);
    }
}
