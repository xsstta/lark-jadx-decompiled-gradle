package com.ss.android.lark.widget.linked_emojicon.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f144411a;

    public void updateDrawState(TextPaint textPaint) {
        m227009a(textPaint, this.f144411a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m227009a(textPaint, this.f144411a);
    }

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f144411a = typeface;
    }

    /* renamed from: a */
    private static void m227009a(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int i2 = i & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
