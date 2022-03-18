package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.lynx.tasm.behavior.shadow.text.b */
public class C26715b extends MetricAffectingSpan {

    /* renamed from: a */
    private final float f66134a;

    public void updateDrawState(TextPaint textPaint) {
        m96844a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m96844a(textPaint);
    }

    public C26715b(float f) {
        this.f66134a = f;
    }

    /* renamed from: a */
    private void m96844a(TextPaint textPaint) {
        if (!Float.isNaN(this.f66134a)) {
            textPaint.setLetterSpacing(this.f66134a / textPaint.getTextSize());
        }
    }
}
