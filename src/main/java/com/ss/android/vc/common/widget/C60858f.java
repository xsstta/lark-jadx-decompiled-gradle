package com.ss.android.vc.common.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.vc.common.widget.f */
public class C60858f extends ReplacementSpan {

    /* renamed from: a */
    private int f152355a;

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public C60858f(int i) {
        this.f152355a = i;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.f152355a;
    }
}
