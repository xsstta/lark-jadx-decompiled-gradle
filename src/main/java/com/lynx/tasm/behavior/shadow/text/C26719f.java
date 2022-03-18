package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.lynx.tasm.behavior.shadow.text.f */
public class C26719f extends MetricAffectingSpan {

    /* renamed from: a */
    private Typeface f66138a;

    public void updateMeasureState(TextPaint textPaint) {
    }

    public C26719f(Typeface typeface) {
        this.f66138a = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.f66138a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
