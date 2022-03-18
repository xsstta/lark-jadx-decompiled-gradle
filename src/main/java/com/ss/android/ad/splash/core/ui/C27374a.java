package com.ss.android.ad.splash.core.ui;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.ss.android.ad.splash.core.ui.a */
public class C27374a extends MetricAffectingSpan {

    /* renamed from: a */
    private int f68369a;

    public C27374a(int i) {
        this.f68369a = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += this.f68369a;
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += this.f68369a;
    }
}
