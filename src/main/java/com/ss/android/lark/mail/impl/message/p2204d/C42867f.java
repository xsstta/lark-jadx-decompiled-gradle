package com.ss.android.lark.mail.impl.message.p2204d;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.ss.android.lark.mail.impl.message.d.f */
public class C42867f extends MetricAffectingSpan {

    /* renamed from: a */
    private final Typeface f109166a;

    public C42867f(Typeface typeface) {
        this.f109166a = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        m170768a(textPaint, this.f109166a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m170768a(textPaint, this.f109166a);
    }

    /* renamed from: a */
    private static void m170768a(Paint paint, Typeface typeface) {
        paint.setTypeface(typeface);
    }
}
